package net.kas.wanilla.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.*;
import net.kas.wanilla.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class IronBlocks {

    public static final Block IRON_SLAB = registerBlock("iron_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()),
            ModItemGroup.SHINYSTUFF);  //G

    public static final Block IRON_PILLAR = registerBlock("iron_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()),
            ModItemGroup.SHINYSTUFF);

    public static final Block WRAPPED_IRON_CHAINS = registerBlock("wrapped_iron_chains",
            new WrappedIronChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN), IronBlocks.IRON_CHAIN),
            ModItemGroup.SHINYSTUFF);
    public static final Block IRON_CHAIN = registerBlock("iron_chain",
            new ChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).requiresTool()),
            ModItemGroup.SHINYSTUFF);
    public static final Block BIG_IRON_CHAIN = registerBlock("big_iron_chain",
            new BigChain(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()),
            ModItemGroup.SHINYSTUFF);




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
