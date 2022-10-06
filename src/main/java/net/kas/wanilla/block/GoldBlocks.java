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

public class GoldBlocks {


    public static final Block GOLD_FENCE = registerBlock("gold_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)),
            ModItemGroup.WANILLA);
    public static final Block GOLD_WALL = registerBlock("gold_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)),
            ModItemGroup.WANILLA);
    public static final Block GOLD_SLAB = registerBlock("gold_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)),
            ModItemGroup.WANILLA);
    public static final Block GOLD_STAIRS = registerBlock("gold_stairs",
            new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)),
            ModItemGroup.WANILLA);

    public static final Block CUT_GOLD = registerBlock("cut_gold",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)),
            ModItemGroup.WANILLA);
    public static final Block CUT_GOLD_WALL = registerBlock("cut_gold_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)),
            ModItemGroup.WANILLA);
    public static final Block CUT_GOLD_SLAB = registerBlock("cut_gold_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)),
            ModItemGroup.WANILLA);
    public static final Block CUT_GOLD_STAIRS = registerBlock("cut_gold_stairs",
            new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)),
            ModItemGroup.WANILLA);

    public static final Block GOLD_PILLAR = registerBlock("gold_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)),
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
