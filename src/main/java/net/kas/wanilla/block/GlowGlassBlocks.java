package net.kas.wanilla.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.GlowGlassSlabBlock;
import net.kas.wanilla.block.templates.GlowGlassStairsBlock;
import net.kas.wanilla.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class GlowGlassBlocks {

    public static final Block GLOW_GLASS = registerBlock("glow_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).luminance(10)),
            ModItemGroup.WANILLA);
    public static final Block GLOW_GLASS_PANE = registerBlock("glow_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS).luminance(10)),
            ModItemGroup.WANILLA);
    public static final Block GLOW_GLASS_STAIRS = registerBlock("glow_glass_stairs",
            new GlowGlassStairsBlock(FabricBlockSettings.of(Material.GLASS)
                    .luminance(10)
                    .strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque()
                    .allowsSpawning(GlowGlassBlocks::never)
                    .solidBlock(GlowGlassBlocks::never)
                    .suffocates(GlowGlassBlocks::never)
                    .blockVision(GlowGlassBlocks::never)),
            ModItemGroup.WANILLA);
    public static final Block GLOW_GLASS_SLAB = registerBlock("glow_glass_slab",
            new GlowGlassSlabBlock(FabricBlockSettings.of(Material.GLASS)
                    .luminance(10)
                    .strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque()
                    .allowsSpawning(GlowGlassBlocks::never)
                    .solidBlock(GlowGlassBlocks::never).
                    suffocates(GlowGlassBlocks::never)
                    .blockVision(GlowGlassBlocks::never)),
            ModItemGroup.WANILLA);
    public static final Block GLOW_GLASS_WALL = registerBlock("glow_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(GLOW_GLASS)),
            ModItemGroup.WANILLA);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Wanilla.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Wanilla.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

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
