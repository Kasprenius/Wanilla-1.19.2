package net.kas.wanilla.block.templates;

import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.util.ModIntProperty;
import net.kas.wanilla.block.util.ModProperties;
import net.kas.wanilla.block.util.ModTags;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.tag.ItemTags;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;

import static net.minecraft.block.PillarBlock.changeRotation;

public class WrappedChainBlock extends PillarBlock {
    public static ModIntProperty RUNS;
    protected static VoxelShape[] RUNS_TO_SHAPE_X;
    protected static VoxelShape[] RUNS_TO_SHAPE_Y;
    protected static VoxelShape[] RUNS_TO_SHAPE_Z;
    protected static Block PER_CHAIN;
    public static final EnumProperty<Direction.Axis> AXIS;

    public WrappedChainBlock(AbstractBlock.Settings settings, Block chain) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(RUNS, 8).with(AXIS, Direction.Axis.Y));
        PER_CHAIN = chain;
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return changeRotation(state, rotation);
    }
    public static BlockState changeRotation(BlockState state, BlockRotation rotation) {
        return switch (rotation) {
            case COUNTERCLOCKWISE_90, CLOCKWISE_90 -> switch ((Direction.Axis) state.get(AXIS)) {
                case X -> (BlockState) state.with(AXIS, Direction.Axis.Z);
                case Z -> (BlockState) state.with(AXIS, Direction.Axis.X);
                default -> state;
            };
            default -> state;
        };
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch(state.get(AXIS)) {
            case X:
            default:
                return RUNS_TO_SHAPE_X[(Integer)state.get(RUNS)];
            case Z:
                return RUNS_TO_SHAPE_Z[(Integer)state.get(RUNS)];
            case Y:
                return RUNS_TO_SHAPE_Y[(Integer)state.get(RUNS)];
        }
    }

    //Place chain on block, up to max state of 9
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        Item item = itemStack.getItem();
            if (matchBlock(player, hand) && (Integer) state.get(RUNS) < 8) {
                Block block = Block.getBlockFromItem(item);
                if (block instanceof ChainBlock) {
                    if (!player.isCreative()) {
                        itemStack.decrement(1);
                    }
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_CHAIN_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    int i = (Integer) state.get(RUNS);
                    if (i < 8) {
                        world.setBlockState(pos, (BlockState) state.with(RUNS, i + 1), 3);
                        world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
                        player.incrementStat(Stats.USED.getOrCreateStat(item));
                    }
                    return ActionResult.SUCCESS;
                }
            }

        if (world.isClient) {
            if (tryGrab(world, pos, state, player).isAccepted()) {
                return ActionResult.SUCCESS;
            }

            if (itemStack.isEmpty()) {
                return ActionResult.CONSUME;
            }
        }
        return tryGrab(world, pos, state, player);
    }

    //Grab chain off of block, until 0 then break
    protected static ActionResult tryGrab(WorldAccess world, BlockPos pos, BlockState state, PlayerEntity player) {
        int i = (Integer)state.get(RUNS);
        ItemStack itemStack = new ItemStack(PER_CHAIN, 1);
        world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_CHAIN_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
        world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
            if (i > 0) {
                world.setBlockState(pos, (BlockState)state.with(RUNS, i - 1), 3);
            } else {
                world.removeBlock(pos, false);
                world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, pos);
            }
        player.getInventory().offerOrDrop(itemStack);
        return ActionResult.SUCCESS;
    }

    public boolean matchBlock (PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        Item item = itemStack.getItem();
        if (item == PER_CHAIN.asItem()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(RUNS);
        builder.add(AXIS);
    }
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(AXIS, ctx.getSide().getAxis());
    }
    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    static {
        AXIS = Properties.AXIS;
        RUNS = ModProperties.RUNS;

        RUNS_TO_SHAPE_X = new VoxelShape[]{
                Block.createCuboidShape(0.0, 5.0, 5.0, 16.0, 11.0, 11.0),       //1
                Block.createCuboidShape(0.0, 4.0, 4.0, 16.0, 12.0, 12.0),       //2
                Block.createCuboidShape(0.0, 3.0, 3.0, 16.0, 13.0, 13.0),       //3
                Block.createCuboidShape(0.0, 2.0, 2.0, 16.0, 14.0, 14.0),       //4
                Block.createCuboidShape(0.0, 2.0, 2.0, 16.0, 14.0, 14.0),       //5
                Block.createCuboidShape(0.0, 1.0, 1.0, 16.0, 15.0, 15.0),       //6
                Block.createCuboidShape(0.0, 1.0, 1.0, 16.0, 15.0, 15.0),       //7
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0),       //8
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)};      //9
        RUNS_TO_SHAPE_Y = new VoxelShape[]{
                Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 16.0, 11.0),       //1
                Block.createCuboidShape(4.0, 0.0, 4.0, 12.0, 16.0, 12.0),       //2
                Block.createCuboidShape(3.0, 0.0, 3.0, 13.0, 16.0, 13.0),       //3
                Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 16.0, 14.0),       //4
                Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 16.0, 14.0),       //5
                Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0),       //6
                Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0),       //7
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0),       //8
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)};      //9
        RUNS_TO_SHAPE_Z = new VoxelShape[]{
                Block.createCuboidShape(5.0, 5.0, 0.0, 11.0, 11.0, 16.0),       //1
                Block.createCuboidShape(4.0, 4.0, 0.0, 12.0, 12.0, 16.0),       //2
                Block.createCuboidShape(3.0, 3.0, 0.0, 13.0, 13.0, 16.0),       //3
                Block.createCuboidShape(2.0, 2.0, 0.0, 14.0, 14.0, 16.0),       //4
                Block.createCuboidShape(2.0, 2.0, 0.0, 14.0, 14.0, 16.0),       //5
                Block.createCuboidShape(1.0, 1.0, 0.0, 15.0, 15.0, 16.0),       //6
                Block.createCuboidShape(1.0, 1.0, 0.0, 15.0, 15.0, 16.0),       //7
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0),       //8
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)};      //9
    }
}
