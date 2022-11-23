package net.kas.wanilla.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class EndRods {

    public static final Block BLACK_END_ROD = registerBlock("black_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
            ModItemGroup.WANILLA);

    public static final Block BLUE_END_ROD = registerBlock("blue_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
            ModItemGroup.WANILLA);

    public static final Block BROWN_END_ROD = registerBlock("brown_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
            ModItemGroup.WANILLA);

    public static final Block CYAN_END_ROD = registerBlock("cyan_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
            ModItemGroup.WANILLA);

    public static final Block GRAY_END_ROD = registerBlock("gray_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
            ModItemGroup.WANILLA);

    public static final Block GREEN_END_ROD = registerBlock("green_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
            ModItemGroup.WANILLA);

    public static final Block LIGHT_BLUE_END_ROD = registerBlock("light_blue_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
            ModItemGroup.WANILLA);

    public static final Block LIGHT_GRAY_END_ROD = registerBlock("light_gray_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
            ModItemGroup.WANILLA);

    public static final Block LIME_END_ROD = registerBlock("lime_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
            ModItemGroup.WANILLA);

    public static final Block MAGENTA_END_ROD = registerBlock("magenta_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
            ModItemGroup.WANILLA);

    public static final Block ORANGE_END_ROD = registerBlock("orange_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
            ModItemGroup.WANILLA);

    public static final Block PINK_END_ROD = registerBlock("pink_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
            ModItemGroup.WANILLA);

    public static final Block PURPLE_END_ROD = registerBlock("purple_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
            ModItemGroup.WANILLA);

    public static final Block RED_END_ROD = registerBlock("red_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
            ModItemGroup.WANILLA);

    public static final Block WHITE_END_ROD = registerBlock("white_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
            ModItemGroup.WANILLA);

    public static final Block YELLOW_END_ROD = registerBlock("yellow_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)),
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
        Wanilla.LOGGER.debug("Registering Glass for " + Wanilla.MOD_ID);
    }

    // Copies of the Blocks.never() methods because the originals are not
    // accessible from here.

    private static Boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos, EntityType<?> entityType) {
        return false;
    }

    private static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos) {
        return false;
    }
}
