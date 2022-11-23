package net.kas.wanilla.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EmeraldBlocks {

    public static final Block EMERALD_STAIRS = registerBlock("emerald_stairs",
            new StairsBlock(Blocks.EMERALD_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()),
            ModItemGroup.SHINYSTUFF);
    public static final Block EMERALD_SLAB = registerBlock("emerald_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()),
            ModItemGroup.SHINYSTUFF);

    public static final Block RAW_EMERALD_BLOCK = registerBlock("raw_emerald_block",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()),
            ModItemGroup.SHINYSTUFF);

    public static final Block CUT_EMERALD = registerBlock("cut_emerald",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()),
            ModItemGroup.SHINYSTUFF);  //G

    public static final Block EMERALD_PILLAR = registerBlock("emerald_pillar",
            new PillarBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()),
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
