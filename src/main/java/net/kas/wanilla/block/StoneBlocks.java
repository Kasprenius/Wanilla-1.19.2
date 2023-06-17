package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.minecraft.block.*;

public class StoneBlocks {

    /*
    POLISHED STONE
     */
    public static final Block POLISHED_STONE = Wanilla.registerBlock("polished_stone",
            new Block(FabricBlockSettings.copy(Blocks.STONE).requiresTool()));
            public static final Block POLISHED_STONE_STAIRS = Wanilla.registerBlock("polished_stone_stairs",
                    new StairsBlock(StoneBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copy(StoneBlocks.POLISHED_STONE).requiresTool()));
            public static final Block POLISHED_STONE_SLAB = Wanilla.registerBlock("polished_stone_slab",
                    new SlabBlock(FabricBlockSettings.copy(StoneBlocks.POLISHED_STONE).requiresTool()));
            public static final Block POLISHED_STONE_WALL = Wanilla.registerBlock("polished_stone_wall",
                    new WallBlock(FabricBlockSettings.copy(StoneBlocks.POLISHED_STONE).requiresTool()));

    /*
    CUT STONE
    */
    public static final Block CUT_STONE = Wanilla.registerBlock("cut_stone",
            new Block(FabricBlockSettings.copy(StoneBlocks.POLISHED_STONE).requiresTool()));
            public static final Block CUT_STONE_STAIRS = Wanilla.registerBlock("cut_stone_stairs",
                    new StairsBlock(CUT_STONE.getDefaultState(), FabricBlockSettings.copy(StoneBlocks.POLISHED_STONE).requiresTool()));
            public static final Block CUT_STONE_SLAB = Wanilla.registerBlock("cut_stone_slab",
                    new SlabBlock(FabricBlockSettings.copy(StoneBlocks.POLISHED_STONE).requiresTool()));
            public static final Block CUT_STONE_WALL = Wanilla.registerBlock("cut_stone_wall",
                    new WallBlock(FabricBlockSettings.copy(StoneBlocks.POLISHED_STONE).requiresTool()));

    public static final Block STONE_PILLAR = Wanilla.registerBlock("stone_pillar",
            new PillarBlock(FabricBlockSettings.copy(StoneBlocks.POLISHED_STONE).requiresTool()));

    /*
    SANDSTONE BRICKS
     */
    public static final Block SANDSTONE_BRICKS = Wanilla.registerBlock("sandstone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool()));
            public static final Block SANDSTONE_BRICK_STAIRS = Wanilla.registerBlock("sandstone_brick_stairs",
                    new StairsBlock(StoneBlocks.SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(StoneBlocks.SANDSTONE_BRICKS).requiresTool()));
            public static final Block SANDSTONE_BRICK_SLAB = Wanilla.registerBlock("sandstone_brick_slab",
                    new SlabBlock(FabricBlockSettings.copy(StoneBlocks.SANDSTONE_BRICKS).requiresTool()));
            public static final Block SANDSTONE_BRICK_WALL = Wanilla.registerBlock("sandstone_brick_wall",
                    new WallBlock(FabricBlockSettings.copy(SANDSTONE_BRICKS).requiresTool()));
    /*
    POLISHED SANDSTONE
     */
    public static final Block POLISHED_SANDSTONE = Wanilla.registerBlock("polished_sandstone",
            new Block(FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool()));
            public static final Block POLISHED_SANDSTONE_STAIRS = Wanilla.registerBlock("polished_sandstone_stairs",
                    new StairsBlock(StoneBlocks.POLISHED_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(StoneBlocks.POLISHED_SANDSTONE).requiresTool()));
            public static final Block POLISHED_SANDSTONE_SLAB = Wanilla.registerBlock("polished_sandstone_slab",
                    new SlabBlock(FabricBlockSettings.copy(StoneBlocks.POLISHED_SANDSTONE).requiresTool()));
            public static final Block POLISHED_SANDSTONE_WALL = Wanilla.registerBlock("polished_sandstone_wall",
                    new WallBlock(FabricBlockSettings.copy(StoneBlocks.POLISHED_SANDSTONE).requiresTool()));

    public static final Block SANDSTONE_PILLAR = Wanilla.registerBlock("sandstone_pillar",
            new PillarBlock(FabricBlockSettings.copy(StoneBlocks.POLISHED_SANDSTONE).requiresTool()));

    /*
        CALCITE
    */
    public static final Block CALCITE_STAIRS = Wanilla.registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));
    public static final Block CALCITE_SLAB = Wanilla.registerBlock("calcite_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));
    public static final Block CALCITE_WALL = Wanilla.registerBlock("calcite_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));

    /*
        POLISHED CALCITE
         */
    public static final Block POLISHED_CALCITE = Wanilla.registerBlock("polished_calcite",
            new Block(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));
            public static final Block POLISHED_CALCITE_STAIRS = Wanilla.registerBlock("polished_calcite_stairs",
                    new StairsBlock(StoneBlocks.POLISHED_CALCITE.getDefaultState(), FabricBlockSettings.copy(StoneBlocks.POLISHED_CALCITE).requiresTool()));
            public static final Block POLISHED_CALCITE_SLAB = Wanilla.registerBlock("polished_calcite_slab",
                    new SlabBlock(FabricBlockSettings.copy(StoneBlocks.POLISHED_CALCITE).requiresTool()));
            public static final Block POLISHED_CALCITE_WALL = Wanilla.registerBlock("polished_calcite_wall",
                    new WallBlock(FabricBlockSettings.copy(StoneBlocks.POLISHED_CALCITE).requiresTool()));
    /*
    CALCITE BRICKS
     */
    public static final Block CALCITE_BRICKS = Wanilla.registerBlock("calcite_bricks",
            new Block(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));
            public static final Block CALCITE_BRICK_STAIRS = Wanilla.registerBlock("calcite_brick_stairs",
                    new StairsBlock(StoneBlocks.CALCITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(StoneBlocks.CALCITE_BRICKS).requiresTool()));
            public static final Block CALCITE_BRICK_SLAB = Wanilla.registerBlock("calcite_brick_slab",
                    new SlabBlock(FabricBlockSettings.copy(StoneBlocks.CALCITE_BRICKS).requiresTool()));
            public static final Block CALCITE_BRICK_WALL = Wanilla.registerBlock("calcite_brick_wall",
                    new WallBlock(FabricBlockSettings.copy(StoneBlocks.CALCITE_BRICKS).requiresTool()));


    //-------------------------------------------------------------------------------------------------------------------
    

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }
}
