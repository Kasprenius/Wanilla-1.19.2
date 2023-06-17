package net.kas.wanilla.mixin;

import com.google.common.collect.Lists;
import net.kas.wanilla.block.MiscStuff;
import net.kas.wanilla.block.templates.BlastrodBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.PistonBlock;
import net.minecraft.block.piston.PistonHandler;
import net.minecraft.util.Pair;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Mixin(PistonHandler.class)
public abstract class PistonHandlerOverwrite {

    @Shadow
    private World world;

    @Shadow
    private BlockPos posFrom;

    @Shadow
    private BlockPos posTo;

    @Shadow
    private Direction motionDirection;

    @Shadow
    private List<BlockPos> movedBlocks;

    @Shadow
    private List<BlockPos> brokenBlocks;

    private final List<BlockPos> blastedBlocks = Lists.newArrayList();

    @Shadow
    private Direction pistonDirection;

    @Invoker("isBlockSticky")
    private static boolean invokeIsBlockSticky(BlockState state) {
        throw new AssertionError();
    }

    @Invoker("isAdjacentBlockStuck")
    private static boolean invokeIsAdjacentBlockStuck(BlockState state, BlockState adjacentState) {
        throw new AssertionError();
    }

    @Overwrite
    public boolean calculatePush() {
        this.movedBlocks.clear();
        this.brokenBlocks.clear();
        this.blastedBlocks.clear();

        BlockState blockState;
        boolean result = true;

        // Breadth-first search
        Queue<Pair<BlockPos, Direction>> queue = new LinkedList<>();
        Pair<BlockPos, Direction> item = new Pair<>(this.posTo, this.pistonDirection);
        queue.offer(item);
        while (!queue.isEmpty()) {
            item = queue.poll();
            blockState = this.world.getBlockState(item.getLeft());

            if (blockState.isAir() || this.posFrom.equals(item.getLeft())
                    || this.movedBlocks.contains(item.getLeft())) {
                continue;

            } else if (canMove(item.getLeft(), blockState, item.getRight())) {
                if (this.movedBlocks.size() + 1 > 12) {
                    result = false;
                    break;
                } else {
                    this.movedBlocks.add(item.getLeft());
                    switchCases(queue, item.getLeft(), blockState, item.getRight());
                }

            } else if (canBreak(item.getLeft(), blockState, item.getRight())) {
                this.brokenBlocks.add(item.getLeft());

            } else if (this.motionDirection == item.getRight()) {
                result = false;
                break;
            }
        }

        this.blastedBlocks.removeAll(this.movedBlocks);
        this.brokenBlocks.addAll(this.blastedBlocks);

        return result;
    }

    private boolean canBreak(BlockPos blockPos, BlockState blockState, Direction motionSource) {
        return PistonBlock.isMovable(blockState, this.world, blockPos, this.motionDirection, true,
                motionSource);
    }

    private boolean canMove(BlockPos blockPos, BlockState blockState, Direction motionSource) {
        return PistonBlock.isMovable(blockState, this.world, blockPos, this.motionDirection, false,
                motionSource);
    }

    private void switchCases(Queue<Pair<BlockPos, Direction>> queue, BlockPos blockPos,
                             BlockState blockState, Direction motionSource) {

        if (caseSticky(queue, blockPos, blockState))
            return;

        if (caseBlast(blockPos, blockState, motionSource))
            return;

        if (caseDefault(queue, blockPos, blockState))
            return;
    }

    private boolean caseSticky(Queue<Pair<BlockPos, Direction>> queue, BlockPos blockPos,
                               BlockState blockState) {
        if (invokeIsBlockSticky(blockState)) {
            BlockPos targetPos;
            BlockState targetState;
            for (Direction direction : Direction.values()) {
                targetPos = blockPos.offset(direction);
                if (direction != this.motionDirection) {
                    targetState = this.world.getBlockState(targetPos);
                    if (invokeIsAdjacentBlockStuck(blockState, targetState)) {
                        queue.offer(new Pair<>(targetPos, direction));
                    }
                } else {
                    queue.offer(new Pair<>(targetPos, direction));
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean caseBlast(BlockPos blockPos, BlockState blockState, Direction motionSource) {
        if (blockState.isOf(MiscStuff.BLASTROD)) {
            BlockPos targetPos;
            BlockState targetState;
            if (blockState.get(BlastrodBlock.FACING) == this.motionDirection) {
                targetPos = blockPos.offset(this.motionDirection);
                targetState = this.world.getBlockState(targetPos);
                if (PistonBlock.isMovable(targetState, this.world, targetPos, this.motionDirection,
                        true, motionSource)) {
                    if (!targetState.isAir() && !targetState.isLiquid()
                            && !this.blastedBlocks.contains(targetPos)) {
                        this.blastedBlocks.add(targetPos);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private boolean caseDefault(Queue<Pair<BlockPos, Direction>> queue, BlockPos blockPos,
                                BlockState blockState) {
        queue.offer(new Pair<>(blockPos.offset(this.motionDirection), this.motionDirection));
        return true;
    }

}
