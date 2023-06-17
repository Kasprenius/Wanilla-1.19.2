package net.kas.wanilla.block.templates;

import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class AlignedSlabBlock  extends Block implements Waterloggable {
        public static final EnumProperty<SlabType> TYPE;
        public static final BooleanProperty WATERLOGGED;
        protected static final VoxelShape BOTTOM_SHAPE;
        protected static final VoxelShape TOP_SHAPE;
        public static final EnumProperty<Direction.Axis> AXIS;

        public AlignedSlabBlock(AbstractBlock.Settings settings) {
            super(settings);
            this.setDefaultState((BlockState)((BlockState)this.getDefaultState().with(TYPE, SlabType.BOTTOM)).with(WATERLOGGED, false).with(AXIS, Direction.Axis.Y));
        }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return changeRotation(state, rotation);
    }

    public static BlockState changeRotation(BlockState state, BlockRotation rotation) {
        switch (rotation) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch ((Direction.Axis)state.get(AXIS)) {
                    case X:
                        return (BlockState)state.with(AXIS, Direction.Axis.Z);
                    case Z:
                        return (BlockState)state.with(AXIS, Direction.Axis.X);
                    default:
                        return state;
                }
            default:
                return state;
        }
    }

        public boolean hasSidedTransparency(BlockState state) {
            return state.get(TYPE) != SlabType.DOUBLE;
        }

        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(new Property[]{TYPE, WATERLOGGED});
            builder.add(new Property[]{AXIS});
        }

        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            SlabType slabType = (SlabType)state.get(TYPE);
            switch (slabType) {
                case DOUBLE:
                    return VoxelShapes.fullCube();
                case TOP:
                    return TOP_SHAPE;
                default:
                    return BOTTOM_SHAPE;
            }
        }

        @Nullable
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            BlockPos blockPos = ctx.getBlockPos();
            BlockState blockState = ctx.getWorld().getBlockState(blockPos);
            if (blockState.isOf(this)) {
                return (BlockState)((BlockState)blockState.with(TYPE, SlabType.DOUBLE)).with(WATERLOGGED, false).with(AXIS, ctx.getSide().getAxis());
            } else {
                FluidState fluidState = ctx.getWorld().getFluidState(blockPos);
                BlockState blockState2 = (BlockState)((BlockState)this.getDefaultState().with(TYPE, SlabType.BOTTOM)).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER).with(AXIS, ctx.getSide().getAxis());
                Direction direction = ctx.getSide();
                return direction != Direction.DOWN && (direction == Direction.UP || !(ctx.getHitPos().y - (double)blockPos.getY() > 0.5)) ? blockState2 : (BlockState)blockState2.with(TYPE, SlabType.TOP).with(AXIS, ctx.getSide().getAxis());
            }
        }

        public boolean canReplace(BlockState state, ItemPlacementContext context) {
            ItemStack itemStack = context.getStack();
            SlabType slabType = (SlabType)state.get(TYPE);
            if (slabType != SlabType.DOUBLE && itemStack.isOf(this.asItem())) {
                if (context.canReplaceExisting()) {
                    boolean bl = context.getHitPos().y - (double)context.getBlockPos().getY() > 0.5;
                    Direction direction = context.getSide();
                    if (slabType == SlabType.BOTTOM) {
                        return direction == Direction.UP || bl && direction.getAxis().isHorizontal();
                    } else {
                        return direction == Direction.DOWN || !bl && direction.getAxis().isHorizontal();
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }

        public FluidState getFluidState(BlockState state) {
            return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
        }

    public boolean canFillWithFluidThis(BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        return fluid == Fluids.WATER;
    }

    public boolean tryFillWithFluidThis(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        if (!(Boolean)state.get(Properties.WATERLOGGED) && fluidState.getFluid() == Fluids.WATER) {
            if (!world.isClient()) {
                world.setBlockState(pos, (BlockState)state.with(Properties.WATERLOGGED, true), 3);
                world.scheduleFluidTick(pos, fluidState.getFluid(), fluidState.getFluid().getTickRate(world));
            }

            return true;
        } else {
            return false;
        }
    }
        public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
            return state.get(TYPE) != SlabType.DOUBLE ? tryFillWithFluidThis(world, pos, state, fluidState) : false;
        }

        public boolean canFillWithFluid(BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
            return state.get(TYPE) != SlabType.DOUBLE ? canFillWithFluidThis(world, pos, state, fluid) : false;
        }

        public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
            if ((Boolean)state.get(WATERLOGGED)) {
                world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
            }

            return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
        }

        public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
            switch (type) {
                case LAND:
                    return false;
                case WATER:
                    return world.getFluidState(pos).isIn(FluidTags.WATER);
                case AIR:
                    return false;
                default:
                    return false;
            }
        }

        static {
            TYPE = Properties.SLAB_TYPE;
            WATERLOGGED = Properties.WATERLOGGED;
            BOTTOM_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
            TOP_SHAPE = Block.createCuboidShape(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);
            AXIS = Properties.AXIS;
        }
    }
