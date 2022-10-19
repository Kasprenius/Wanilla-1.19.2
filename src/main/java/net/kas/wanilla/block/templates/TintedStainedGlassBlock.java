package net.kas.wanilla.block.templates;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Stainable;
import net.minecraft.block.TintedGlassBlock;
import net.minecraft.util.DyeColor;

public class TintedStainedGlassBlock extends TintedGlassBlock implements Stainable {
    private final DyeColor color;

    public TintedStainedGlassBlock(DyeColor color, AbstractBlock.Settings settings) {
        super(settings);
        this.color = color;
    }

    public DyeColor getColor() {
        return this.color;
    }
}
