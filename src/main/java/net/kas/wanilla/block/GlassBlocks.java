package net.kas.wanilla.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.GlowGlassSlabBlock;
import net.kas.wanilla.block.templates.StainedGlassSlabBlock;
import net.kas.wanilla.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class GlassBlocks {
    public static final Block FRAMED_GLASS = registerBlock("framed_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);

    public static final Block FRAMED_BLACK_STAINED_GLASS = registerBlock("framed_black_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_BLACK_STAINED_GLASS_SLAB = registerBlock("framed_black_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_BLACK_STAINED_GLASS_PANE = registerBlock("framed_black_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_BLACK_STAINED_GLASS_FLOOR = registerBlock("framed_black_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block FRAMED_BLUE_STAINED_GLASS = registerBlock("framed_blue_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_BLUE_STAINED_GLASS_SLAB = registerBlock("framed_blue_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_BLUE_STAINED_GLASS_PANE = registerBlock("framed_blue_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_BLUE_STAINED_GLASS_FLOOR = registerBlock("framed_blue_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block FRAMED_BROWN_STAINED_GLASS = registerBlock("framed_brown_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_BROWN_STAINED_GLASS_SLAB = registerBlock("framed_brown_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_BROWN_STAINED_GLASS_PANE = registerBlock("framed_brown_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_BROWN_STAINED_GLASS_FLOOR = registerBlock("framed_brown_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block FRAMED_CYAN_STAINED_GLASS = registerBlock("framed_cyan_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_CYAN_STAINED_GLASS_SLAB = registerBlock("framed_cyan_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_CYAN_STAINED_GLASS_PANE = registerBlock("framed_cyan_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_CYAN_STAINED_GLASS_FLOOR = registerBlock("framed_cyan_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block FRAMED_GRAY_STAINED_GLASS = registerBlock("framed_gray_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_GRAY_STAINED_GLASS_PANE = registerBlock("framed_gray_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_GRAY_STAINED_GLASS_FLOOR = registerBlock("framed_gray_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block FRAMED_GREEN_STAINED_GLASS = registerBlock("framed_green_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_GREEN_STAINED_GLASS_PANE = registerBlock("framed_green_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_GREEN_STAINED_GLASS_FLOOR = registerBlock("framed_green_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block FRAMED_LIGHT_BLUE_STAINED_GLASS = registerBlock("framed_light_blue_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("framed_light_blue_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_LIGHT_BLUE_STAINED_GLASS_FLOOR = registerBlock("framed_light_blue_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block FRAMED_LIGHT_GRAY_STAINED_GLASS = registerBlock("framed_light_gray_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlock("framed_light_gray_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_LIGHT_GRAY_STAINED_GLASS_FLOOR = registerBlock("framed_light_gray_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block FRAMED_LIME_STAINED_GLASS = registerBlock("framed_lime_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_LIME_STAINED_GLASS_PANE = registerBlock("framed_lime_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_LIME_STAINED_GLASS_FLOOR = registerBlock("framed_lime_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block FRAMED_MAGENTA_STAINED_GLASS = registerBlock("framed_magenta_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_MAGENTA_STAINED_GLASS_PANE = registerBlock("framed_magenta_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_MAGENTA_STAINED_GLASS_FLOOR = registerBlock("framed_magenta_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block FRAMED_ORANGE_STAINED_GLASS = registerBlock("framed_orange_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_ORANGE_STAINED_GLASS_PANE = registerBlock("framed_orange_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_ORANGE_STAINED_GLASS_FLOOR = registerBlock("framed_orange_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block FRAMED_PINK_STAINED_GLASS = registerBlock("framed_pink_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_PINK_STAINED_GLASS_PANE = registerBlock("framed_pink_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_PINK_STAINED_GLASS_FLOOR = registerBlock("framed_pink_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block FRAMED_PURPLE_STAINED_GLASS = registerBlock("framed_purple_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_PURPLE_STAINED_GLASS_PANE = registerBlock("framed_purple_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_PURPLE_STAINED_GLASS_FLOOR = registerBlock("framed_purple_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block FRAMED_RED_STAINED_GLASS = registerBlock("framed_red_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_RED_STAINED_GLASS_PANE = registerBlock("framed_red_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_RED_STAINED_GLASS_FLOOR = registerBlock("framed_red_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block FRAMED_WHITE_STAINED_GLASS = registerBlock("framed_white_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_WHITE_STAINED_GLASS_PANE = registerBlock("framed_white_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_WHITE_STAINED_GLASS_FLOOR = registerBlock("framed_white_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block FRAMED_YELLOW_STAINED_GLASS = registerBlock("framed_yellow_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS).strength(2.0F, 12.0F)),
            ModItemGroup.WANILLA);
            public static final Block FRAMED_YELLOW_STAINED_GLASS_PANE = registerBlock("framed_yellow_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
            public static final Block FRAMED_YELLOW_STAINED_GLASS_FLOOR = registerBlock("framed_yellow_stained_glass_floor",
                    new CarpetBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS_PANE).strength(2.0F, 12.0F)),
                    ModItemGroup.WANILLA);
    public static final Block GILDED_CYAN_STAINED_GLASS = registerBlock("gilded_cyan_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)),
            ModItemGroup.WANILLA);
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
