/*
 * Decompiled with CFR 0.1.1 (FabricMC 57d88659).
 */
package net.kas.wanilla.block.templates;

import net.kas.wanilla.block.ModBlocks;
import net.kas.wanilla.block.util.ModTags;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Map;

public class GlowFireBlock extends AbstractFireBlock {

    private static final Map<Direction, BooleanProperty> DIRECTION_PROPERTIES = ConnectingBlock.FACING_PROPERTIES.entrySet().stream().filter(entry -> entry.getKey() != Direction.DOWN).collect(Util.toMap());
    public GlowFireBlock(Settings settings) {
        super(settings, 0);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (this.canPlaceAt(state, world, pos)) {
            return this.getDefaultState();
        }
        return Blocks.AIR.getDefaultState();
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return GlowFireBlock.isGlowBase(world.getBlockState(pos.down()));
    }

    public static boolean isGlowBase(BlockState state) {
        return state.isIn(ModTags.Blocks.GLOW_FIRE_BASE_BLOCKS);
    }

    @Override
    protected boolean isFlammable(BlockState state) {
        return true;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return GlowFireBlock.getState(ctx.getWorld(), ctx.getBlockPos());
    }

    public static BlockState getState(BlockView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        if (GlowFireBlock.isGlowBase(blockState)) {
            return ModBlocks.GLOW_FIRE.getDefaultState();
        }
        return ((GlowFireBlock)Blocks.FIRE).getStateForPositionS(world, pos);
    }

    protected BlockState getStateForPositionS(BlockView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        if (this.isFlammable(blockState) || blockState.isSideSolidFullSquare(world, blockPos, Direction.UP)) {
            return this.getDefaultState();
        }
        BlockState blockState2 = this.getDefaultState();
        for (Direction direction : Direction.values()) {
            BooleanProperty booleanProperty = DIRECTION_PROPERTIES.get(direction);
            if (booleanProperty == null) continue;
            blockState2 = (BlockState)blockState2.with(booleanProperty, this.isFlammable(world.getBlockState(pos.offset(direction))));
        }
        return blockState2;
    }
}

