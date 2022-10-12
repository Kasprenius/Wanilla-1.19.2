package net.kas.wanilla.block.templates;

import net.kas.wanilla.block.entities.GlowCampfireBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class GlowCampfireBlock extends CampfireBlock {
    public GlowCampfireBlock(boolean emitsParticles, int fireDamage, Settings settings) {
        super(emitsParticles, fireDamage, settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new GlowCampfireBlockEntity(pos, state);
    }
}
