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

public class StoneBlocks {

    /*
    POLISHED STONE
     */
    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            new Block(FabricBlockSettings.copy(Blocks.STONE).requiresTool()),
            ModItemGroup.STONESTUFF);
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            new StairsBlock(StoneBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copy(StoneBlocks.POLISHED_STONE).requiresTool()),
            ModItemGroup.STONESTUFF);
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            new SlabBlock(FabricBlockSettings.copy(StoneBlocks.POLISHED_STONE).requiresTool()),
            ModItemGroup.STONESTUFF);

    public static final Block STONE_PILLAR = registerBlock("stone_pillar",
            new PillarBlock(FabricBlockSettings.copy(StoneBlocks.POLISHED_STONE).requiresTool()),
            ModItemGroup.STONESTUFF);

    /*
    SANDSTONE BRICKS
     */
    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool()),
            ModItemGroup.STONESTUFF);
    public static final Block SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            new StairsBlock(StoneBlocks.SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(StoneBlocks.SANDSTONE_BRICKS).requiresTool()),
            ModItemGroup.STONESTUFF);
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(StoneBlocks.SANDSTONE_BRICKS).requiresTool()),
            ModItemGroup.STONESTUFF);
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copy(SANDSTONE_BRICKS).requiresTool()),
            ModItemGroup.STONESTUFF);
    /*
    POLISHED SANDSTONE
     */
    public static final Block POLISHED_SANDSTONE = registerBlock("polished_sandstone",
            new Block(FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool()),
            ModItemGroup.STONESTUFF);
    public static final Block POLISHED_SANDSTONE_STAIRS = registerBlock("polished_sandstone_stairs",
            new StairsBlock(StoneBlocks.POLISHED_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(StoneBlocks.POLISHED_SANDSTONE).requiresTool()),
            ModItemGroup.STONESTUFF);
    public static final Block POLISHED_SANDSTONE_SLAB = registerBlock("polished_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copy(StoneBlocks.POLISHED_SANDSTONE).requiresTool()),
            ModItemGroup.STONESTUFF);

    public static final Block SANDSTONE_PILLAR = registerBlock("sandstone_pillar",
            new PillarBlock(FabricBlockSettings.copy(StoneBlocks.POLISHED_SANDSTONE).requiresTool()),
            ModItemGroup.STONESTUFF);


    /*
    CALCITE BRICKS
     */
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()),
            ModItemGroup.STONESTUFF);
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            new StairsBlock(StoneBlocks.CALCITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(StoneBlocks.CALCITE_BRICKS).requiresTool()),
            ModItemGroup.STONESTUFF);
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(StoneBlocks.CALCITE_BRICKS).requiresTool()),
            ModItemGroup.STONESTUFF);
    /*
    POLISHED CALCITE
     */
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            new Block(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()),
            ModItemGroup.STONESTUFF);
    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            new StairsBlock(StoneBlocks.POLISHED_CALCITE.getDefaultState(), FabricBlockSettings.copy(StoneBlocks.POLISHED_CALCITE).requiresTool()),
            ModItemGroup.STONESTUFF);
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            new SlabBlock(FabricBlockSettings.copy(StoneBlocks.POLISHED_CALCITE).requiresTool()),
            ModItemGroup.STONESTUFF);

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
