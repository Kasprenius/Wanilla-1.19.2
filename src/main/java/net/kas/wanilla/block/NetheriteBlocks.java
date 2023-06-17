package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.BigChain;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

public class NetheriteBlocks {

    public static final Block NETHERITE_STAIRS = Wanilla.registerBlock("netherite_stairs",
            new StairsBlock(Blocks.NETHERITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool()));
    public static final Block NETHERITE_SLAB = Wanilla.registerBlock("netherite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool()));
    public static final Block NETHERITE_WALL = Wanilla.registerBlock("netherite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool()));

    public static final Block RAW_NETHERITE_BLOCK = Wanilla.registerBlock("raw_netherite_block",
            new Block(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).requiresTool()));
            public static final Block RAW_NETHERITE_STAIRS = Wanilla.registerBlock("raw_netherite_stairs",
                    new StairsBlock(RAW_NETHERITE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).requiresTool()));
            public static final Block RAW_NETHERITE_SLAB = Wanilla.registerBlock("raw_netherite_slab",
                    new SlabBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).requiresTool()));
            public static final Block RAW_NETHERITE_WALL = Wanilla.registerBlock("raw_netherite_wall",
                    new WallBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).requiresTool()));

    public static final Block BEVELED_NETHERITE = Wanilla.registerBlock("beveled_netherite",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool()));

    public static final Block NETHERITE_TILE = Wanilla.registerBlock("netherite_tile",
            new Block(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).requiresTool()));
    public static final Block NETHERITE_BARS = Wanilla.registerBlock("netherite_bars",
            new PaneBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).strength(50.0F, 1200.0F).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    /*
        public static final Block WRAPPED_NETHERITE_CHAINS = Wanilla.registerBlock("wrapped_netherite_chains",
                new WrappedGoldChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN), NetheriteBlocks.NETHERITE_CHAIN),
                ModItemGroup.SHINYSTUFF);
    */
    public static final Block NETHERITE_CHAIN = Wanilla.registerBlock("netherite_chain",
            new ChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(50.0F, 1200.0F).requiresTool()));  //G
    public static final Block BIG_NETHERITE_CHAIN = Wanilla.registerBlock("big_netherite_chain",
            new BigChain(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).strength(50.0F, 1200.0F).requiresTool()));  //G



    //-------------------------------------------------------------------------------------------------------------------
    

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }
}
