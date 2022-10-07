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

public class ReinforcedDeepslate {

    public static final Block REINFORCED_DEEPSLATE = registerBlock("reinforced_deepslate",
            new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE).strength(50.0f, 1200.0f).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block REINFORCED_DEEPSLATE_SLAB = registerBlock("reinforced_deepslate_slab",
            new SlabBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE).strength(50.0f, 1200.0f).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block REINFORCED_DEEPSLATE_STAIRS = registerBlock("reinforced_deepslate_stairs",
            new StairsBlock(REINFORCED_DEEPSLATE.getDefaultState(), AbstractBlock.Settings.of(Material.STONE, MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE).strength(50.0f, 1200.0f).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block REINFORCED_DEEPSLATE_PILLAR = registerBlock("reinforced_deepslate_pillar",
            new PillarBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE).strength(50.0f, 1200.0f).requiresTool()),
            ModItemGroup.WANILLA);



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Wanilla.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Wanilla.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering fixed Reinforced Deepslate for " + Wanilla.MOD_ID);
    }
}
