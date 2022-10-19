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
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class GlassBlocks {

    public static final Block GLASS_WALL = registerBlock("glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block BLACK_STAINED_GLASS_WALL = registerBlock("black_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block BLUE_STAINED_GLASS_WALL = registerBlock("blue_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block BROWN_STAINED_GLASS_WALL = registerBlock("brown_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block CYAN_STAINED_GLASS_WALL = registerBlock("cyan_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block GRAY_STAINED_GLASS_WALL = registerBlock("gray_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block GREEN_STAINED_GLASS_WALL = registerBlock("green_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block LIGHT_BLUE_STAINED_GLASS_WALL = registerBlock("light_blue_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block LIGHT_GRAY_STAINED_GLASS_WALL = registerBlock("light_gray_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block LIME_STAINED_GLASS_WALL = registerBlock("lime_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block MAGENTA_STAINED_GLASS_WALL = registerBlock("magenta_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block ORANGE_STAINED_GLASS_WALL = registerBlock("orange_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block PINK_STAINED_GLASS_WALL = registerBlock("pink_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block PURPLE_STAINED_GLASS_WALL = registerBlock("purple_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block RED_STAINED_GLASS_WALL = registerBlock("red_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block WHITE_STAINED_GLASS_WALL = registerBlock("white_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
            ModItemGroup.WANILLA);

    public static final Block YELLOW_STAINED_GLASS_WALL = registerBlock("yellow_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)),
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
