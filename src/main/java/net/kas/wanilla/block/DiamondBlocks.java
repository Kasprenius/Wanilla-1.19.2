package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.minecraft.block.*;

public class DiamondBlocks {

    public static final Block DIAMOND_STAIRS = Wanilla.registerBlock("diamond_stairs",
            new StairsBlock(Blocks.DIAMOND_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));
    public static final Block DIAMOND_SLAB = Wanilla.registerBlock("diamond_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));
    public static final Block DIAMOND_WALL = Wanilla.registerBlock("diamond_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));

    public static final Block RAW_DIAMOND_BLOCK = Wanilla.registerBlock("raw_diamond_block",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));
            public static final Block RAW_DIAMOND_STAIRS = Wanilla.registerBlock("raw_diamond_stairs",
                    new StairsBlock(RAW_DIAMOND_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));
            public static final Block RAW_DIAMOND_SLAB = Wanilla.registerBlock("raw_diamond_slab",
                    new SlabBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));
            public static final Block RAW_DIAMOND_WALL = Wanilla.registerBlock("raw_diamond_wall",
                    new WallBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));
    public static final Block DIAMOND_BRICKS = Wanilla.registerBlock("diamond_bricks",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));
            public static final Block DIAMOND_BRICK_SLAB = Wanilla.registerBlock("diamond_brick_slab",
                    new SlabBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));
            public static final Block DIAMOND_BRICK_WALL = Wanilla.registerBlock("diamond_brick_wall",
                    new WallBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));

    public static final Block DIAMOND_PILLAR = Wanilla.registerBlock("diamond_pillar",
            new PillarBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));

    public static final Block BEVELED_DIAMOND = Wanilla.registerBlock("beveled_diamond",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));
    public static final Block DIAMOND_TILE = Wanilla.registerBlock("diamond_tile",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));

    //-------------------------------------------------------------------------------------------------------------------
    

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }
}
