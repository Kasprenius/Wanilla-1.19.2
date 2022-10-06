/*
 * Decompiled with CFR 0.1.1 (FabricMC 57d88659).
 */
package net.kas.wanilla.block;

import net.kas.wanilla.registry.ModTags;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class GlowFireBlock extends AbstractFireBlock {
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
        return state.isIn(ModTags.GLOW_FIRE_BASE_BLOCKS);
    }

    @Override
    protected boolean isFlammable(BlockState state) {
        return true;
    }
}

