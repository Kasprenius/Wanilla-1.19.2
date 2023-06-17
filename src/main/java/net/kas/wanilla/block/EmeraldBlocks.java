package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.minecraft.block.*;

public class EmeraldBlocks {

    public static final Block EMERALD_STAIRS = Wanilla.registerBlock("emerald_stairs",
            new StairsBlock(Blocks.EMERALD_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()));
    public static final Block EMERALD_SLAB = Wanilla.registerBlock("emerald_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()));
    public static final Block EMERALD_WALL = Wanilla.registerBlock("emerald_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()));

    public static final Block RAW_EMERALD_BLOCK = Wanilla.registerBlock("raw_emerald_block",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()));
            public static final Block RAW_EMERALD_STAIRS = Wanilla.registerBlock("raw_emerald_stairs",
                    new StairsBlock(RAW_EMERALD_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()));
            public static final Block RAW_EMERALD_SLAB = Wanilla.registerBlock("raw_emerald_slab",
                    new SlabBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()));
            public static final Block RAW_EMERALD_WALL = Wanilla.registerBlock("raw_emerald_wall",
                    new WallBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()));

    public static final Block CUT_EMERALD = Wanilla.registerBlock("cut_emerald",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()));
            public static final Block CUT_EMERALD_STAIRS = Wanilla.registerBlock("cut_emerald_stairs",
                    new StairsBlock(CUT_EMERALD.getDefaultState(), FabricBlockSettings.copy(CUT_EMERALD).requiresTool()));
            public static final Block CUT_EMERALD_SLAB = Wanilla.registerBlock("cut_emerald_slab",
                    new SlabBlock(FabricBlockSettings.copy(CUT_EMERALD).requiresTool()));
            public static final Block CUT_EMERALD_WALL = Wanilla.registerBlock("cut_emerald_wall",
                    new WallBlock(FabricBlockSettings.copy(CUT_EMERALD).requiresTool()));

    public static final Block EMERALD_PILLAR = Wanilla.registerBlock("emerald_pillar",
            new PillarBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()));

    public static final Block BEVELED_EMERALD = Wanilla.registerBlock("beveled_emerald",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()));
    public static final Block EMERALD_TILE = Wanilla.registerBlock("emerald_tile",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()));


    //-------------------------------------------------------------------------------------------------------------------
    

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }
}
