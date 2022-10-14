package net.kas.wanilla.block;

import com.sun.net.httpserver.Filter;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.*;
import net.kas.wanilla.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ChainBlocks {


    public static final Block GOLD_CHAIN = registerBlock("gold_chain",
            new ChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN)),
            ModItemGroup.WANILLA);
    public static final Block BIG_GOLD_CHAIN = registerBlock("big_gold_chain",
            new BigChain(FabricBlockSettings.copyOf(ChainBlocks.GOLD_CHAIN)),
            ModItemGroup.WANILLA);
    public static final Block LARGE_GOLD_CHAIN = registerBlock("large_gold_chain",
            new LargeChain(FabricBlockSettings.copyOf(ChainBlocks.GOLD_CHAIN)),
            ModItemGroup.WANILLA);
    public static final Block WRAPPED_GOLD_CHAINS = registerBlock("wrapped_gold_chains",
            new WrappedGoldChainBlock(FabricBlockSettings.copyOf(ChainBlocks.GOLD_CHAIN), ChainBlocks.GOLD_CHAIN),
            ModItemGroup.WANILLA);
    public static final Block GOLD_ANCHOR = registerBlock("gold_anchor",
            new DoubleBlock(FabricBlockSettings.copyOf(Blocks.CHAIN)),
            ModItemGroup.WANILLA);
    public static final Block GOLD_HOOK = registerBlock("gold_hook",
            new HookBlock(FabricBlockSettings.copyOf(Blocks.CHAIN)),
            ModItemGroup.WANILLA);

    public static final Block LARGE_CHAIN = registerBlock("large_chain",
            new LargeChain(FabricBlockSettings.copyOf(Blocks.CHAIN)),
            ModItemGroup.WANILLA);
    public static final Block BIG_CHAIN = registerBlock("big_chain",
            new BigChain(FabricBlockSettings.copyOf(Blocks.CHAIN)),
            ModItemGroup.WANILLA);
    public static final Block ANCHOR = registerBlock("anchor",
            new DoubleBlock(FabricBlockSettings.copyOf(Blocks.CHAIN)),
            ModItemGroup.WANILLA);
    public static final Block HOOK = registerBlock("hook",
            new HookBlock(FabricBlockSettings.copyOf(Blocks.CHAIN)),
            ModItemGroup.WANILLA);

    public static final Block WRAPPED_CHAINS = registerBlock("wrapped_chains",
            new WrappedChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN), Blocks.CHAIN),
            ModItemGroup.WANILLA);



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
