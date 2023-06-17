package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.BigChain;
import net.minecraft.block.*;

public class IronBlocks {

    public static final Block IRON_STAIRS = Wanilla.registerBlock("iron_stairs",
            new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));
    public static final Block IRON_SLAB = Wanilla.registerBlock("iron_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));
    public static final Block IRON_WALL = Wanilla.registerBlock("iron_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));

    public static final Block CUT_IRON = Wanilla.registerBlock("cut_iron",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));
            public static final Block CUT_IRON_STAIRS = Wanilla.registerBlock("cut_iron_stairs",
                    new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));
            public static final Block CUT_IRON_SLAB = Wanilla.registerBlock("cut_iron_slab",
                    new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));
            public static final Block CUT_IRON_WALL = Wanilla.registerBlock("cut_iron_wall",
                    new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));

    public static final Block BEVELED_IRON = Wanilla.registerBlock("beveled_iron",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));
    public static final Block IRON_PILLAR = Wanilla.registerBlock("iron_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));
    public static final Block IRON_TILE = Wanilla.registerBlock("iron_tile",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK).requiresTool()));
    public static final Block IRON_FENCE = Wanilla.registerBlock("iron_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));
    /*
    public static final Block WRAPPED_IRON_CHAINS = Wanilla.registerBlock("wrapped_iron_chains",
            new WrappedIronChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN), IronBlocks.IRON_CHAIN),
            ModItemGroup.SHINYSTUFF);

     */
    public static final Block IRON_CHAIN = Wanilla.registerBlock("iron_chain",
            new ChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).requiresTool()));
    public static final Block BIG_IRON_CHAIN = Wanilla.registerBlock("big_iron_chain",
            new BigChain(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));




    //-------------------------------------------------------------------------------------------------------------------
    

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }
}
