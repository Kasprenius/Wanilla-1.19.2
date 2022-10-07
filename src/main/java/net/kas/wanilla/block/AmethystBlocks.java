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

public class AmethystBlocks {


    public static final Block AMETHYST_FENCE = registerBlock("amethyst_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL, MapColor.PURPLE).strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block AMETHYST_WALL = registerBlock("amethyst_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL, MapColor.PURPLE).strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL, MapColor.PURPLE).strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.METAL, MapColor.PURPLE).strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()),
            ModItemGroup.WANILLA);

    public static final Block AMETHYST_PILLAR = registerBlock("amethyst_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.METAL, MapColor.PURPLE).strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()),
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
