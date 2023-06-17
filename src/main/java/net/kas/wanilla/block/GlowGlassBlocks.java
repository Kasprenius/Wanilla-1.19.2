package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.FloorBlock;
import net.kas.wanilla.block.templates.GlowGlassSlabBlock;
import net.kas.wanilla.block.templates.GlowGlassStairsBlock;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class GlowGlassBlocks {

    public static final Block GLOW_GLASS = Wanilla.registerBlock("glow_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).luminance(10)));
    public static final Block GLOW_GLASS_STAIRS = Wanilla.registerBlock("glow_glass_stairs",
            new GlowGlassStairsBlock(FabricBlockSettings.copyOf(Blocks.GLASS)
                    .luminance(10)
                    .strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque()
                    .allowsSpawning(GlowGlassBlocks::never)
                    .solidBlock(GlowGlassBlocks::never)
                    .suffocates(GlowGlassBlocks::never)
                    .blockVision(GlowGlassBlocks::never)));
    public static final Block GLOW_GLASS_SLAB = Wanilla.registerBlock("glow_glass_slab",
            new GlowGlassSlabBlock(FabricBlockSettings.copyOf(Blocks.GLASS)
                    .luminance(10)
                    .strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque()
                    .allowsSpawning(GlowGlassBlocks::never)
                    .solidBlock(GlowGlassBlocks::never).
                    suffocates(GlowGlassBlocks::never)
                    .blockVision(GlowGlassBlocks::never)));
    public static final Block GLOW_GLASS_PANE = Wanilla.registerBlock("glow_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS).luminance(10)));
    public static final Block GLOW_GLASS_FLOOR = Wanilla.registerBlock("glow_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE)
                .strength(2.0F, 12.0F)
                .luminance((state) -> {
                    return 10;
                })));
    public static final Block GLOW_GLASS_WALL = Wanilla.registerBlock("glow_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(GLOW_GLASS)));



    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering Glow Glass for " + Wanilla.MOD_ID);
    }

    // Copies of the Blocks.never() methods because the originals are not
    // accessible from here.

    private static Boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos, EntityType<?> entityType) {
        return false;
    }

    private static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos) {
        return false;
    }
}
