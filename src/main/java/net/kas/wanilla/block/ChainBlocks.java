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
            new ChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(3.0f, 6.0f).requiresTool()),
            ModItemGroup.WANILLA);  //G
    public static final Block BIG_GOLD_CHAIN = registerBlock("big_gold_chain",
            new BigChain(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f).requiresTool()),
            ModItemGroup.WANILLA);  //G
    public static final Block WRAPPED_GOLD_CHAINS = registerBlock("wrapped_gold_chains",
            new WrappedGoldChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(3.0f, 6.0f).requiresTool(), ChainBlocks.GOLD_CHAIN),
            ModItemGroup.WANILLA);  //G


    public static final Block BIG_BLAST_IRON_CHAIN = registerBlock("big_blast_iron_chain",
            new BigChain(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(25.0F, 600.0F).requiresTool()),
            ModItemGroup.WANILLA);  //G
    public static final Block WRAPPED_BLAST_IRON_CHAINS = registerBlock("wrapped_blast_iron_chains",
            new WrappedChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(25.0F, 600.0F).requiresTool(), Blocks.CHAIN),
            ModItemGroup.WANILLA); //G


    public static final Block IRON_CHAIN = registerBlock("iron_chain",
            new ChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).requiresTool()),
            ModItemGroup.WANILLA);  //G
    public static final Block BIG_IRON_CHAIN = registerBlock("big_iron_chain",
            new BigChain(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()),
            ModItemGroup.WANILLA);  //G
    /*
    public static final Block WRAPPED_IRON_CHAINS = registerBlock("wrapped_iron_chains",
            new WrappedGoldChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN), ChainBlocks.IRON_CHAIN),
            ModItemGroup.WANILLA);

     */


    public static final Block NETHERITE_CHAIN = registerBlock("netherite_chain",
            new ChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(50.0F, 1200.0F).requiresTool()),
            ModItemGroup.WANILLA);  //G
    public static final Block BIG_NETHERITE_CHAIN = registerBlock("big_netherite_chain",
            new BigChain(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).strength(50.0F, 1200.0F).requiresTool()),
            ModItemGroup.WANILLA);  //G
    /*
    public static final Block WRAPPED_NETHERITE_CHAINS = registerBlock("wrapped_netherite_chains",
            new WrappedGoldChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN), ChainBlocks.NETHERITE_CHAIN),
            ModItemGroup.WANILLA);

     */



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
