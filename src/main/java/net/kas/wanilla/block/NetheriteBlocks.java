package net.kas.wanilla.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.BigChain;
import net.kas.wanilla.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NetheriteBlocks {


    public static final Block NETHERITE_BARS = registerBlock("netherite_bars",
            new PaneBlock(FabricBlockSettings.of(Material.METAL, MapColor.BLACK).strength(50.0F, 1200.0F).requiresTool().sounds(BlockSoundGroup.NETHERITE)),
            ModItemGroup.SHINYSTUFF);

    /*
        public static final Block WRAPPED_NETHERITE_CHAINS = registerBlock("wrapped_netherite_chains",
                new WrappedGoldChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN), NetheriteBlocks.NETHERITE_CHAIN),
                ModItemGroup.SHINYSTUFF);
    */
    public static final Block NETHERITE_CHAIN = registerBlock("netherite_chain",
            new ChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(50.0F, 1200.0F).requiresTool()),
            ModItemGroup.SHINYSTUFF);  //G
    public static final Block BIG_NETHERITE_CHAIN = registerBlock("big_netherite_chain",
            new BigChain(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).strength(50.0F, 1200.0F).requiresTool()),
            ModItemGroup.SHINYSTUFF);  //G



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
