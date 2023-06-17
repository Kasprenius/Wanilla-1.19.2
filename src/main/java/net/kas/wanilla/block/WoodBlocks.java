package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.AlignedSlabBlock;
import net.kas.wanilla.block.templates.AlignedStairsBlock;
import net.kas.wanilla.item.ModItemGroup;
import net.minecraft.block.*;

public class WoodBlocks {


    /*
    ALIGNED PLANKS
     */
    public static final Block ALIGNED_OAK_PLANKS = Wanilla.registerBlock("aligned_oak_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool()));
            public static final Block ALIGNED_OAK_PLANK_STAIRS = Wanilla.registerBlock("aligned_oak_plank_stairs",
                    new AlignedStairsBlock(ALIGNED_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copy(ALIGNED_OAK_PLANKS)));
            public static final Block ALIGNED_OAK_PLANK_SLAB = Wanilla.registerBlock("aligned_oak_plank_slab",
                    new AlignedSlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block ALIGNED_SPRUCE_PLANKS = Wanilla.registerBlock("aligned_spruce_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).requiresTool()));
            public static final Block ALIGNED_SPRUCE_PLANK_STAIRS = Wanilla.registerBlock("aligned_spruce_plank_stairs",
                    new AlignedStairsBlock(ALIGNED_SPRUCE_PLANKS.getDefaultState(), FabricBlockSettings.copy(ALIGNED_SPRUCE_PLANKS)));
            public static final Block ALIGNED_SPRUCE_PLANK_SLAB = Wanilla.registerBlock("aligned_spruce_plank_slab",
                    new AlignedSlabBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).requiresTool()));

    public static final Block ALIGNED_BIRCH_PLANKS = Wanilla.registerBlock("aligned_birch_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).requiresTool()));
            public static final Block ALIGNED_BIRCH_PLANK_STAIRS = Wanilla.registerBlock("aligned_birch_plank_stairs",
                    new AlignedStairsBlock(ALIGNED_BIRCH_PLANKS.getDefaultState(), FabricBlockSettings.copy(ALIGNED_BIRCH_PLANKS)));
            public static final Block ALIGNED_BIRCH_PLANK_SLAB = Wanilla.registerBlock("aligned_birch_plank_slab",
                    new AlignedSlabBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).requiresTool()));

    public static final Block ALIGNED_JUNGLE_PLANKS = Wanilla.registerBlock("aligned_jungle_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).requiresTool()));
            public static final Block ALIGNED_JUNGLE_PLANK_STAIRS = Wanilla.registerBlock("aligned_jungle_plank_stairs",
                    new AlignedStairsBlock(ALIGNED_JUNGLE_PLANKS.getDefaultState(), FabricBlockSettings.copy(ALIGNED_JUNGLE_PLANKS)));
            public static final Block ALIGNED_JUNGLE_PLANK_SLAB = Wanilla.registerBlock("aligned_jungle_plank_slab",
                    new AlignedSlabBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).requiresTool()));

    public static final Block ALIGNED_ACACIA_PLANKS = Wanilla.registerBlock("aligned_acacia_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).requiresTool()));
            public static final Block ALIGNED_ACACIA_PLANK_STAIRS = Wanilla.registerBlock("aligned_acacia_plank_stairs",
                    new AlignedStairsBlock(ALIGNED_ACACIA_PLANKS.getDefaultState(), FabricBlockSettings.copy(ALIGNED_ACACIA_PLANKS)));
            public static final Block ALIGNED_ACACIA_PLANK_SLAB = Wanilla.registerBlock("aligned_acacia_plank_slab",
                    new AlignedSlabBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).requiresTool()));

    public static final Block ALIGNED_DARK_OAK_PLANKS = Wanilla.registerBlock("aligned_dark_oak_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).requiresTool()));
            public static final Block ALIGNED_DARK_OAK_PLANK_STAIRS = Wanilla.registerBlock("aligned_dark_oak_plank_stairs",
                    new AlignedStairsBlock(ALIGNED_DARK_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copy(ALIGNED_DARK_OAK_PLANKS)));
            public static final Block ALIGNED_DARK_OAK_PLANK_SLAB = Wanilla.registerBlock("aligned_dark_oak_plank_slab",
                    new AlignedSlabBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).requiresTool()));

    public static final Block ALIGNED_MANGROVE_PLANKS = Wanilla.registerBlock("aligned_mangrove_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS).requiresTool()));
            public static final Block ALIGNED_MANGROVE_PLANK_STAIRS = Wanilla.registerBlock("aligned_mangrove_plank_stairs",
                    new AlignedStairsBlock(ALIGNED_MANGROVE_PLANKS.getDefaultState(), FabricBlockSettings.copy(ALIGNED_MANGROVE_PLANKS)));
            public static final Block ALIGNED_MANGROVE_PLANK_SLAB = Wanilla.registerBlock("aligned_mangrove_plank_slab",
                    new AlignedSlabBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS).requiresTool()));

    public static final Block ALIGNED_CHERRY_PLANKS = Wanilla.registerBlock("aligned_cherry_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS).requiresTool()));
            public static final Block ALIGNED_CHERRY_PLANK_STAIRS = Wanilla.registerBlock("aligned_cherry_plank_stairs",
                    new AlignedStairsBlock(ALIGNED_CHERRY_PLANKS.getDefaultState(), FabricBlockSettings.copy(ALIGNED_CHERRY_PLANKS)));
            public static final Block ALIGNED_CHERRY_PLANK_SLAB = Wanilla.registerBlock("aligned_cherry_plank_slab",
                    new AlignedSlabBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS).requiresTool()));

    /*
    public static final Block HORIZONTAL_BAMBOO_PLANKS = Wanilla.registerBlock("horizontal_bamboo_planks",
            new Block(FabricBlockSettings.copy(Blocks.BAMBOO_PLANKS).requiresTool()),
            ModItemGroup.WOODSTUFF);
     */
            public static final Block ALIGNED_BAMBOO_PLANK_STAIRS = Wanilla.registerBlock("aligned_bamboo_plank_stairs",
                    new AlignedStairsBlock(Blocks.STRIPPED_BAMBOO_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.STRIPPED_BAMBOO_BLOCK)));
            public static final Block ALIGNED_BAMBOO_PLANK_SLAB = Wanilla.registerBlock("aligned_bamboo_plank_slab",
                    new AlignedSlabBlock(FabricBlockSettings.copy(Blocks.BAMBOO_PLANKS).requiresTool()));

    public static final Block ALIGNED_CRIMSON_PLANKS = Wanilla.registerBlock("aligned_crimson_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS).requiresTool()));
            public static final Block ALIGNED_CRIMSON_PLANK_STAIRS = Wanilla.registerBlock("aligned_crimson_plank_stairs",
                    new AlignedStairsBlock(ALIGNED_CRIMSON_PLANKS.getDefaultState(), FabricBlockSettings.copy(ALIGNED_CRIMSON_PLANKS)));
            public static final Block ALIGNED_CRIMSON_PLANK_SLAB = Wanilla.registerBlock("aligned_crimson_plank_slab",
                    new AlignedSlabBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS).requiresTool()));

    public static final Block ALIGNED_WARPED_PLANKS = Wanilla.registerBlock("aligned_warped_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).requiresTool()));
            public static final Block ALIGNED_WARPED_PLANK_STAIRS = Wanilla.registerBlock("aligned_warped_plank_stairs",
                    new AlignedStairsBlock(ALIGNED_WARPED_PLANKS.getDefaultState(), FabricBlockSettings.copy(ALIGNED_WARPED_PLANKS)));
            public static final Block ALIGNED_WARPED_PLANK_SLAB = Wanilla.registerBlock("aligned_warped_plank_slab",
                    new AlignedSlabBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).requiresTool()));


    /*
    MOSAIC PLANKS
     */
    public static final Block MOSAIC_OAK_PLANKS = Wanilla.registerBlock("mosaic_oak_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool()));
        public static final Block MOSAIC_OAK_PLANK_STAIRS = Wanilla.registerBlock("mosaic_oak_plank_stairs",
                new StairsBlock(MOSAIC_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_OAK_PLANKS)));
        public static final Block MOSAIC_OAK_PLANK_SLAB = Wanilla.registerBlock("mosaic_oak_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block MOSAIC_SPRUCE_PLANKS = Wanilla.registerBlock("mosaic_spruce_planks",
            new Block(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).requiresTool()));
        public static final Block MOSAIC_SPRUCE_PLANK_STAIRS = Wanilla.registerBlock("mosaic_spruce_plank_stairs",
                new StairsBlock(MOSAIC_SPRUCE_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_SPRUCE_PLANKS)));
        public static final Block MOSAIC_SPRUCE_PLANK_SLAB = Wanilla.registerBlock("mosaic_spruce_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).requiresTool()));

    public static final Block MOSAIC_BIRCH_PLANKS = Wanilla.registerBlock("mosaic_birch_planks",
            new Block(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).requiresTool()));
        public static final Block MOSAIC_BIRCH_PLANK_STAIRS = Wanilla.registerBlock("mosaic_birch_plank_stairs",
                new StairsBlock(MOSAIC_BIRCH_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_BIRCH_PLANKS)));
        public static final Block MOSAIC_BIRCH_PLANK_SLAB = Wanilla.registerBlock("mosaic_birch_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).requiresTool()));

    public static final Block MOSAIC_JUNGLE_PLANKS = Wanilla.registerBlock("mosaic_jungle_planks",
            new Block(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).requiresTool()));
        public static final Block MOSAIC_JUNGLE_PLANK_STAIRS = Wanilla.registerBlock("mosaic_jungle_plank_stairs",
                new StairsBlock(MOSAIC_JUNGLE_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_JUNGLE_PLANKS)));
        public static final Block MOSAIC_JUNGLE_PLANK_SLAB = Wanilla.registerBlock("mosaic_jungle_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).requiresTool()));

    public static final Block MOSAIC_ACACIA_PLANKS = Wanilla.registerBlock("mosaic_acacia_planks",
            new Block(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).requiresTool()));
        public static final Block MOSAIC_ACACIA_PLANK_STAIRS = Wanilla.registerBlock("mosaic_acacia_plank_stairs",
                new StairsBlock(MOSAIC_ACACIA_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_ACACIA_PLANKS)));
        public static final Block MOSAIC_ACACIA_PLANK_SLAB = Wanilla.registerBlock("mosaic_acacia_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).requiresTool()));

    public static final Block MOSAIC_DARK_OAK_PLANKS = Wanilla.registerBlock("mosaic_dark_oak_planks",
            new Block(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).requiresTool()));
        public static final Block MOSAIC_DARK_OAK_PLANK_STAIRS = Wanilla.registerBlock("mosaic_dark_oak_plank_stairs",
                new StairsBlock(MOSAIC_DARK_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_DARK_OAK_PLANKS)));
        public static final Block MOSAIC_DARK_OAK_PLANK_SLAB = Wanilla.registerBlock("mosaic_dark_oak_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).requiresTool()));

    public static final Block MOSAIC_MANGROVE_PLANKS = Wanilla.registerBlock("mosaic_mangrove_planks",
            new Block(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS).requiresTool()));
        public static final Block MOSAIC_MANGROVE_PLANK_STAIRS = Wanilla.registerBlock("mosaic_mangrove_plank_stairs",
                new StairsBlock(MOSAIC_MANGROVE_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_MANGROVE_PLANKS)));
        public static final Block MOSAIC_MANGROVE_PLANK_SLAB = Wanilla.registerBlock("mosaic_mangrove_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS).requiresTool()));

    public static final Block MOSAIC_CHERRY_PLANKS = Wanilla.registerBlock("mosaic_cherry_planks",
            new Block(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS).requiresTool()));
    public static final Block MOSAIC_CHERRY_PLANK_STAIRS = Wanilla.registerBlock("mosaic_cherry_plank_stairs",
            new StairsBlock(MOSAIC_CHERRY_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_CHERRY_PLANKS)));
    public static final Block MOSAIC_CHERRY_PLANK_SLAB = Wanilla.registerBlock("mosaic_cherry_plank_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS).requiresTool()));

    public static final Block MOSAIC_CRIMSON_PLANKS = Wanilla.registerBlock("mosaic_crimson_planks",
            new Block(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS).requiresTool()));
        public static final Block MOSAIC_CRIMSON_PLANK_STAIRS = Wanilla.registerBlock("mosaic_crimson_plank_stairs",
                new StairsBlock(MOSAIC_CRIMSON_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_CRIMSON_PLANKS)));
        public static final Block MOSAIC_CRIMSON_PLANK_SLAB = Wanilla.registerBlock("mosaic_crimson_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS).requiresTool()));

    public static final Block MOSAIC_WARPED_PLANKS = Wanilla.registerBlock("mosaic_warped_planks",
            new Block(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).requiresTool()));
        public static final Block MOSAIC_WARPED_PLANK_STAIRS = Wanilla.registerBlock("mosaic_warped_plank_stairs",
                new StairsBlock(MOSAIC_WARPED_PLANKS.getDefaultState(), FabricBlockSettings.copy(MOSAIC_WARPED_PLANKS)));
        public static final Block MOSAIC_WARPED_PLANK_SLAB = Wanilla.registerBlock("mosaic_warped_plank_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).requiresTool()));

    //-------------------------------------------------------------------------------------------------------------------
    

    public static void registerBlocks() {

        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }
}
