package net.kas.wanilla.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WoodBlocks {


    /*
    ALIGNED PLANKS
     */
    public static final Block ALIGNED_OAK_PLANKS = registerBlock("aligned_oak_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);

    public static final Block ALIGNED_SPRUCE_PLANKS = registerBlock("aligned_spruce_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);

    public static final Block ALIGNED_BIRCH_PLANKS = registerBlock("aligned_birch_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);

    public static final Block ALIGNED_JUNGLE_PLANKS = registerBlock("aligned_jungle_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);

    public static final Block ALIGNED_ACACIA_PLANKS = registerBlock("aligned_acacia_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);

    public static final Block ALIGNED_DARK_OAK_PLANKS = registerBlock("aligned_dark_oak_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);

    public static final Block ALIGNED_MANGROVE_PLANKS = registerBlock("aligned_mangrove_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);

    /*
    public static final Block HORIZONTAL_BAMBOO_PLANKS = registerBlock("horizontal_bamboo_planks",
            new Block(FabricBlockSettings.copy(Blocks.BAMBOO_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);
     */

    public static final Block ALIGNED_CRIMSON_PLANKS = registerBlock("aligned_crimson_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);

    public static final Block ALIGNED_WARPED_PLANKS = registerBlock("aligned_warped_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);


    /*
    MOSAIC PLANKS
     */
    public static final Block MOSAIC_OAK_PLANKS = registerBlock("mosaic_oak_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_OAK_PLANK_STAIRS = registerBlock("mosaic_oak_plank_stairs",
                new StairsBlock(MOSAIC_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_OAK_PLANKS)),
                ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_OAK_PLANK_SLAB = registerBlock("mosaic_oak_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool()),
                ModItemGroup.WOODSTUFF);

    public static final Block MOSAIC_SPRUCE_PLANKS = registerBlock("mosaic_spruce_planks",
            new Block(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_SPRUCE_PLANK_STAIRS = registerBlock("mosaic_spruce_plank_stairs",
                new StairsBlock(MOSAIC_SPRUCE_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_SPRUCE_PLANKS)),
                ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_SPRUCE_PLANK_SLAB = registerBlock("mosaic_spruce_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).requiresTool()),
                ModItemGroup.WOODSTUFF);

    public static final Block MOSAIC_BIRCH_PLANKS = registerBlock("mosaic_birch_planks",
            new Block(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_BIRCH_PLANK_STAIRS = registerBlock("mosaic_birch_plank_stairs",
                new StairsBlock(MOSAIC_BIRCH_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_BIRCH_PLANKS)),
                ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_BIRCH_PLANK_SLAB = registerBlock("mosaic_birch_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).requiresTool()),
                ModItemGroup.WOODSTUFF);

    public static final Block MOSAIC_JUNGLE_PLANKS = registerBlock("mosaic_jungle_planks",
            new Block(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_JUNGLE_PLANK_STAIRS = registerBlock("mosaic_jungle_plank_stairs",
                new StairsBlock(MOSAIC_JUNGLE_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_JUNGLE_PLANKS)),
                ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_JUNGLE_PLANK_SLAB = registerBlock("mosaic_jungle_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).requiresTool()),
                ModItemGroup.WOODSTUFF);

    public static final Block MOSAIC_ACACIA_PLANKS = registerBlock("mosaic_acacia_planks",
            new Block(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_ACACIA_PLANK_STAIRS = registerBlock("mosaic_acacia_plank_stairs",
                new StairsBlock(MOSAIC_ACACIA_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_ACACIA_PLANKS)),
                ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_ACACIA_PLANK_SLAB = registerBlock("mosaic_acacia_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).requiresTool()),
                ModItemGroup.WOODSTUFF);

    public static final Block MOSAIC_DARK_OAK_PLANKS = registerBlock("mosaic_dark_oak_planks",
            new Block(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_DARK_OAK_PLANK_STAIRS = registerBlock("mosaic_dark_oak_plank_stairs",
                new StairsBlock(MOSAIC_DARK_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_DARK_OAK_PLANKS)),
                ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_DARK_OAK_PLANK_SLAB = registerBlock("mosaic_dark_oak_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).requiresTool()),
                ModItemGroup.WOODSTUFF);

    public static final Block MOSAIC_MANGROVE_PLANKS = registerBlock("mosaic_mangrove_planks",
            new Block(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_MANGROVE_PLANK_STAIRS = registerBlock("mosaic_mangrove_plank_stairs",
                new StairsBlock(MOSAIC_MANGROVE_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_MANGROVE_PLANKS)),
                ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_MANGROVE_PLANK_SLAB = registerBlock("mosaic_mangrove_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS).requiresTool()),
                ModItemGroup.WOODSTUFF);

    public static final Block MOSAIC_CRIMSON_PLANKS = registerBlock("mosaic_crimson_planks",
            new Block(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_CRIMSON_PLANK_STAIRS = registerBlock("mosaic_crimson_plank_stairs",
                new StairsBlock(MOSAIC_CRIMSON_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_CRIMSON_PLANKS)),
                ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_CRIMSON_PLANK_SLAB = registerBlock("mosaic_crimson_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS).requiresTool()),
                ModItemGroup.WOODSTUFF);

    public static final Block MOSAIC_WARPED_PLANKS = registerBlock("mosaic_warped_planks",
            new Block(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_WARPED_PLANK_STAIRS = registerBlock("mosaic_warped_plank_stairs",
                new StairsBlock(MOSAIC_WARPED_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_WARPED_PLANKS)),
                ModItemGroup.WOODSTUFF);
        public static final Block MOSAIC_WARPED_PLANK_SLAB = registerBlock("mosaic_warped_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).requiresTool()),
                ModItemGroup.WOODSTUFF);

    //-------------------------------------------------------------------------------------------------------------------

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Wanilla.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Wanilla.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }
}
