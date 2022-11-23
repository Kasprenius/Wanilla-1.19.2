package net.kas.wanilla.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DiamondBlocks {

    public static final Block DIAMOND_STAIRS = registerBlock("diamond_stairs",
            new StairsBlock(Blocks.DIAMOND_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()),
            ModItemGroup.SHINYSTUFF);
    public static final Block DIAMOND_SLAB = registerBlock("diamond_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()),
            ModItemGroup.SHINYSTUFF);

    public static final Block RAW_DIAMOND_BLOCK = registerBlock("raw_diamond_block",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()),
            ModItemGroup.SHINYSTUFF);

    public static final Block BEVELED_DIAMOND = registerBlock("beveled_diamond",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()),
            ModItemGroup.SHINYSTUFF);

    public static final Block DIAMOND_PILLAR = registerBlock("diamond_pillar",
            new PillarBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()),
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
