package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.minecraft.block.*;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class RubyBlocks {


    public static final Block DEEPSLATE_RUBY_ORE = Wanilla.registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_EMERALD_ORE).requiresTool(),
                    UniformIntProvider.create(3, 7)));
    public static final Block RAW_RUBY_BLOCK = Wanilla.registerBlock("raw_ruby_block",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool().mapColor(MapColor.RED)));
            public static final Block RAW_RUBY_STAIRS = Wanilla.registerBlock("raw_ruby_stairs",
                    new StairsBlock(RAW_RUBY_BLOCK.getDefaultState(), FabricBlockSettings.copy(RAW_RUBY_BLOCK).requiresTool()));
            public static final Block RAW_RUBY_SLAB = Wanilla.registerBlock("raw_ruby_slab",
                    new SlabBlock(FabricBlockSettings.copy(RAW_RUBY_BLOCK).requiresTool()));
            public static final Block RAW_RUBY_WALL = Wanilla.registerBlock("raw_ruby_wall",
                    new WallBlock(FabricBlockSettings.copy(RAW_RUBY_BLOCK).requiresTool()));
    public static final Block RUBY_BLOCK = Wanilla.registerBlock("ruby_block",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool().mapColor(MapColor.RED)));
            public static final Block RUBY_STAIRS = Wanilla.registerBlock("ruby_stairs",
                    new StairsBlock(RUBY_BLOCK.getDefaultState(), FabricBlockSettings.copy(RUBY_BLOCK).requiresTool()));
            public static final Block RUBY_SLAB = Wanilla.registerBlock("ruby_slab",
                    new SlabBlock(FabricBlockSettings.copy(RUBY_BLOCK).requiresTool()));
            public static final Block RUBY_WALL = Wanilla.registerBlock("ruby_wall",
                    new WallBlock(FabricBlockSettings.copy(RUBY_BLOCK).requiresTool()));

    public static final Block CUT_RUBY = Wanilla.registerBlock("cut_ruby",
            new Block(FabricBlockSettings.copy(RUBY_BLOCK).requiresTool()));
            public static final Block CUT_RUBY_STAIRS = Wanilla.registerBlock("cut_ruby_stairs",
                    new StairsBlock(CUT_RUBY.getDefaultState(), FabricBlockSettings.copy(CUT_RUBY).requiresTool()));
            public static final Block CUT_RUBY_SLAB = Wanilla.registerBlock("cut_ruby_slab",
                    new SlabBlock(FabricBlockSettings.copy(CUT_RUBY).requiresTool()));
            public static final Block CUT_RUBY_WALL = Wanilla.registerBlock("cut_ruby_wall",
                    new WallBlock(FabricBlockSettings.copy(CUT_RUBY).requiresTool()));

    public static final Block BEVELED_RUBY = Wanilla.registerBlock("beveled_ruby",
            new Block(FabricBlockSettings.copy(RUBY_BLOCK).requiresTool()));
    public static final Block RUBY_PILLAR = Wanilla.registerBlock("ruby_pillar",
            new PillarBlock(FabricBlockSettings.copy(RUBY_BLOCK).requiresTool()));
    public static final Block RUBY_TILE = Wanilla.registerBlock("ruby_tile",
            new Block(FabricBlockSettings.copy(RUBY_BLOCK).requiresTool()));




    //-------------------------------------------------------------------------------------------------------------------
    

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }
}
