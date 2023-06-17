package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.BigChain;
import net.kas.wanilla.block.templates.GoldDoorBlock;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class GoldBlocks {

    public static final Block GOLD_STAIRS = Wanilla.registerBlock("gold_stairs",
            new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));  //G
    public static final Block GOLD_SLAB = Wanilla.registerBlock("gold_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));  //G
    public static final Block GOLD_WALL = Wanilla.registerBlock("gold_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));  //G
    public static final Block GOLD_FENCE = Wanilla.registerBlock("gold_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));  //G

    public static final Block CUT_GOLD = Wanilla.registerBlock("cut_gold",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));  //G
    public static final Block CUT_GOLD_STAIRS = Wanilla.registerBlock("cut_gold_stairs",
            new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));  //G
    public static final Block CUT_GOLD_SLAB = Wanilla.registerBlock("cut_gold_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));  //G
    public static final Block CUT_GOLD_WALL = Wanilla.registerBlock("cut_gold_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));  //G

    public static final Block GOLD_BRICKS = Wanilla.registerBlock("gold_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));
            public static final Block GOLD_BRICK_SLAB = Wanilla.registerBlock("gold_brick_slab",
                    new SlabBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));
            public static final Block GOLD_BRICK_WALL = Wanilla.registerBlock("gold_brick_wall",
                    new WallBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));

    public static final Block GOLD_PILLAR = Wanilla.registerBlock("gold_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));
    public static final Block BEVELED_GOLD = Wanilla.registerBlock("beveled_gold",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));
    public static final Block GOLD_TILE = Wanilla.registerBlock("gold_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));


    public static final Block GOLD_BARS = Wanilla.registerBlock("gold_bars",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));  //G
    public static final Block GOLD_DOOR = Wanilla.registerBlock("gold_door",
            new GoldDoorBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool().sounds(BlockSoundGroup.METAL).nonOpaque(),
                    SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN));

/*
    public static final Block WRAPPED_GOLD_CHAINS = Wanilla.registerBlock("wrapped_gold_chains",
            new WrappedGoldChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(3.0f, 6.0f).requiresTool(), GoldBlocks.GOLD_CHAIN),
            ModItemGroup.SHINYSTUFF);  //G

 */
    public static final Block GOLD_CHAIN = Wanilla.registerBlock("gold_chain",
            new ChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(3.0f, 6.0f).requiresTool()));  //G
    public static final Block BIG_GOLD_CHAIN = Wanilla.registerBlock("big_gold_chain",
            new BigChain(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()));  //G


    //-------------------------------------------------------------------------------------------------------------------

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering GoldBlocks for " + Wanilla.MOD_ID);
    }
}
