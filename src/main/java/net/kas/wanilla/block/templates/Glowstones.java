package net.kas.wanilla.block.templates;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CandleBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

import java.util.Collections;
import java.util.function.ToIntFunction;

public class Glowstones extends CandleBlock {
    public static final ToIntFunction<BlockState> STATE_TO_LUMINANCE;
    private static final VoxelShape ONE_GLOWSTONE_SHAPE;
    private static final VoxelShape TWO_GLOWSTONE_SHAPE;
    private static final VoxelShape THREE_GLOWSTONE_SHAPE;
    private static final VoxelShape FOUR_GLOWSTONE_SHAPE;


    public Glowstones(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(CANDLES, 1)).with(LIT, true)).with(WATERLOGGED, false));
    }

    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        if (!(Boolean)state.get(WATERLOGGED) && fluidState.getFluid() == Fluids.WATER) {
            BlockState blockState = (BlockState)state.with(WATERLOGGED, true);
            world.setBlockState(pos, blockState, 3);

            world.scheduleFluidTick(pos, fluidState.getFluid(), fluidState.getFluid().getTickRate(world));
            return true;
        } else {
            return false;
        }
    }
    @Override
    protected Iterable<Vec3d> getParticleOffsets(BlockState state) {
        return Collections.emptyList();
    }
    @Override
    public boolean hasRandomTicks(BlockState state) {
        return false;
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch ((Integer)state.get(CANDLES)) {
            case 1:
            default:
                return ONE_GLOWSTONE_SHAPE;
            case 2:
                return TWO_GLOWSTONE_SHAPE;
            case 3:
                return THREE_GLOWSTONE_SHAPE;
            case 4:
                return FOUR_GLOWSTONE_SHAPE;
        }
    }

    static {
        STATE_TO_LUMINANCE = (state) -> (Boolean)state.get(LIT) ? 3 * (Integer)state.get(CANDLES) + 3 : 0;
        ONE_GLOWSTONE_SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 2.0, 14.0);
        TWO_GLOWSTONE_SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
        THREE_GLOWSTONE_SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
        FOUR_GLOWSTONE_SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
    }

}
