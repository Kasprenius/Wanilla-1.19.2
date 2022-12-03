package net.kas.wanilla.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.BigChain;
import net.kas.wanilla.block.templates.WrappedChainBlock;
import net.kas.wanilla.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlastIronBlocks {


    public static final Block BLAST_IRON_BLOCK = registerBlock("blast_iron_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(25.0F, 600.0F).requiresTool()),
            ModItemGroup.SHINYSTUFF);
            public static final Block BLAST_IRON_SLAB = registerBlock("blast_iron_slab",
                    new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(25.0F, 600.0F).requiresTool()),
                    ModItemGroup.SHINYSTUFF);
    public static final Block CUT_BLAST_IRON = registerBlock("cut_blast_iron",
            new Block(FabricBlockSettings.of(Material.METAL).strength(25.0F, 600.0F).requiresTool()),
            ModItemGroup.SHINYSTUFF);
    public static final Block BLAST_IRON_BARS = registerBlock("blast_iron_bars",
            new PaneBlock(FabricBlockSettings.of(Material.METAL).strength(25.0F, 600.0F).requiresTool()),
            ModItemGroup.SHINYSTUFF);

    public static final Block WRAPPED_BLAST_IRON_CHAINS = registerBlock("wrapped_blast_iron_chains",
            new WrappedChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(25.0F, 600.0F).requiresTool(), Blocks.CHAIN),
            ModItemGroup.SHINYSTUFF); //G
    public static final Block BIG_BLAST_IRON_CHAIN = registerBlock("big_blast_iron_chain",
            new BigChain(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(25.0F, 600.0F).requiresTool()),
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
