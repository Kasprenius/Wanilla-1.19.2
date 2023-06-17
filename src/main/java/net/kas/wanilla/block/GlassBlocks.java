package net.kas.wanilla.block;

import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.FloorBlock;
import net.kas.wanilla.block.templates.FramedGlassSlabBlock;
import net.kas.wanilla.block.templates.FramedGlassStairsBlock;
import net.kas.wanilla.block.templates.StainedGlassSlabBlock;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class GlassBlocks {
    public static final Block FRAMED_GLASS = Wanilla.registerBlock("framed_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_GLASS_STAIRS = Wanilla.registerBlock("framed_glass_stairs",
                    new FramedGlassStairsBlock(AbstractBlock.Settings.copy(FRAMED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_GLASS_SLAB = Wanilla.registerBlock("framed_glass_slab",
                    new FramedGlassSlabBlock(AbstractBlock.Settings.copy(FRAMED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_GLASS_PANE = Wanilla.registerBlock("framed_glass_pane",
                    new PaneBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_GLASS_FLOOR = Wanilla.registerBlock("framed_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE).strength(2.0F, 12.0F))
                    );
    public static final Block FRAMED_WHITE_STAINED_GLASS = Wanilla.registerBlock("framed_white_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_WHITE_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_white_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(FRAMED_WHITE_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_WHITE_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_white_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_WHITE_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_white_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );

    public static final Block FRAMED_LIGHT_GRAY_STAINED_GLASS = Wanilla.registerBlock("framed_light_gray_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_LIGHT_GRAY_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_light_gray_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(FRAMED_LIGHT_GRAY_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_LIGHT_GRAY_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_light_gray_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_LIGHT_GRAY_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_light_gray_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );

    public static final Block FRAMED_GRAY_STAINED_GLASS = Wanilla.registerBlock("framed_gray_stained_glass",
            new StainedGlassBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_GRAY_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_gray_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(FRAMED_GRAY_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_GRAY_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_gray_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_GRAY_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_gray_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );

    public static final Block FRAMED_BLACK_STAINED_GLASS = Wanilla.registerBlock("framed_black_stained_glass",
            new StainedGlassBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_BLACK_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_black_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(FRAMED_BLACK_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_BLACK_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_black_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_BLACK_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_black_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );

    public static final Block FRAMED_BROWN_STAINED_GLASS = Wanilla.registerBlock("framed_brown_stained_glass",
            new StainedGlassBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_BROWN_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_brown_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(FRAMED_BROWN_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_BROWN_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_brown_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_BROWN_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_brown_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );

    public static final Block FRAMED_RED_STAINED_GLASS = Wanilla.registerBlock("framed_red_stained_glass",
            new StainedGlassBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_RED_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_red_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.RED, AbstractBlock.Settings.copy(FRAMED_RED_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_RED_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_red_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_RED_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_red_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );

    public static final Block FRAMED_ORANGE_STAINED_GLASS = Wanilla.registerBlock("framed_orange_stained_glass",
            new StainedGlassBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_ORANGE_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_orange_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(FRAMED_ORANGE_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_ORANGE_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_orange_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_ORANGE_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_orange_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );

    public static final Block FRAMED_YELLOW_STAINED_GLASS = Wanilla.registerBlock("framed_yellow_stained_glass",
            new StainedGlassBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_YELLOW_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_yellow_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(FRAMED_YELLOW_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_YELLOW_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_yellow_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_YELLOW_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_yellow_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );

    public static final Block FRAMED_LIME_STAINED_GLASS = Wanilla.registerBlock("framed_lime_stained_glass",
            new StainedGlassBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_LIME_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_lime_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.LIME, AbstractBlock.Settings.copy(FRAMED_LIME_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_LIME_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_lime_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_LIME_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_lime_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );

    public static final Block FRAMED_GREEN_STAINED_GLASS = Wanilla.registerBlock("framed_green_stained_glass",
            new StainedGlassBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_GREEN_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_green_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(FRAMED_GREEN_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_GREEN_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_green_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_GREEN_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_green_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );

    public static final Block FRAMED_CYAN_STAINED_GLASS = Wanilla.registerBlock("framed_cyan_stained_glass",
            new StainedGlassBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_CYAN_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_cyan_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(FRAMED_CYAN_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_CYAN_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_cyan_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_CYAN_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_cyan_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );

    public static final Block FRAMED_LIGHT_BLUE_STAINED_GLASS = Wanilla.registerBlock("framed_light_blue_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_LIGHT_BLUE_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_light_blue_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(FRAMED_LIGHT_BLUE_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_LIGHT_BLUE_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_light_blue_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_LIGHT_BLUE_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_light_blue_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );

    public static final Block FRAMED_BLUE_STAINED_GLASS = Wanilla.registerBlock("framed_blue_stained_glass",
            new StainedGlassBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_BLUE_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_blue_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(FRAMED_BLUE_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_BLUE_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_blue_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_BLUE_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_blue_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );

    public static final Block FRAMED_PURPLE_STAINED_GLASS = Wanilla.registerBlock("framed_purple_stained_glass",
            new StainedGlassBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_PURPLE_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_purple_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(FRAMED_PURPLE_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_PURPLE_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_purple_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_PURPLE_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_purple_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );

    public static final Block FRAMED_MAGENTA_STAINED_GLASS = Wanilla.registerBlock("framed_magenta_stained_glass",
            new StainedGlassBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_MAGENTA_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_magenta_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(FRAMED_MAGENTA_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_MAGENTA_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_magenta_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_MAGENTA_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_magenta_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );

    public static final Block FRAMED_PINK_STAINED_GLASS = Wanilla.registerBlock("framed_pink_stained_glass",
            new StainedGlassBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS).strength(2.0F, 12.0F))
            );
            public static final Block FRAMED_PINK_STAINED_GLASS_SLAB = Wanilla.registerBlock("framed_pink_stained_glass_slab",
                    new StainedGlassSlabBlock(DyeColor.PINK, AbstractBlock.Settings.copy(FRAMED_PINK_STAINED_GLASS).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_PINK_STAINED_GLASS_PANE = Wanilla.registerBlock("framed_pink_stained_glass_pane",
                    new StainedGlassPaneBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );
            public static final Block FRAMED_PINK_STAINED_GLASS_FLOOR = Wanilla.registerBlock("framed_pink_stained_glass_floor",
                    new FloorBlock(AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS_PANE).strength(2.0F, 12.0F))
                    );



    public static final Block GILDED_CYAN_STAINED_GLASS = Wanilla.registerBlock("gilded_cyan_stained_glass",
            new GlassBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS))
            );

    public static final Block GLASS_FLOOR = Wanilla.registerBlock("glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block GLASS_WALL = Wanilla.registerBlock("glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block WHITE_STAINED_GLASS_FLOOR = Wanilla.registerBlock("white_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block WHITE_STAINED_GLASS_WALL = Wanilla.registerBlock("white_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block LIGHT_GRAY_STAINED_GLASS_FLOOR = Wanilla.registerBlock("light_gray_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block LIGHT_GRAY_STAINED_GLASS_WALL = Wanilla.registerBlock("light_gray_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block GRAY_STAINED_GLASS_FLOOR = Wanilla.registerBlock("gray_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block GRAY_STAINED_GLASS_WALL = Wanilla.registerBlock("gray_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block BLACK_STAINED_GLASS_FLOOR = Wanilla.registerBlock("black_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block BLACK_STAINED_GLASS_WALL = Wanilla.registerBlock("black_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block BROWN_STAINED_GLASS_FLOOR = Wanilla.registerBlock("brown_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block BROWN_STAINED_GLASS_WALL = Wanilla.registerBlock("brown_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block RED_STAINED_GLASS_FLOOR = Wanilla.registerBlock("red_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block RED_STAINED_GLASS_WALL = Wanilla.registerBlock("red_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block ORANGE_STAINED_GLASS_FLOOR = Wanilla.registerBlock("orange_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block ORANGE_STAINED_GLASS_WALL = Wanilla.registerBlock("orange_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block YELLOW_STAINED_GLASS_FLOOR = Wanilla.registerBlock("yellow_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block YELLOW_STAINED_GLASS_WALL = Wanilla.registerBlock("yellow_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block LIME_STAINED_GLASS_FLOOR = Wanilla.registerBlock("lime_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block LIME_STAINED_GLASS_WALL = Wanilla.registerBlock("lime_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block GREEN_STAINED_GLASS_FLOOR = Wanilla.registerBlock("green_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block GREEN_STAINED_GLASS_WALL = Wanilla.registerBlock("green_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block CYAN_STAINED_GLASS_FLOOR = Wanilla.registerBlock("cyan_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block CYAN_STAINED_GLASS_WALL = Wanilla.registerBlock("cyan_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block LIGHT_BLUE_STAINED_GLASS_FLOOR = Wanilla.registerBlock("light_blue_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block LIGHT_BLUE_STAINED_GLASS_WALL = Wanilla.registerBlock("light_blue_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block BLUE_STAINED_GLASS_FLOOR = Wanilla.registerBlock("blue_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block BLUE_STAINED_GLASS_WALL = Wanilla.registerBlock("blue_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block PURPLE_STAINED_GLASS_FLOOR = Wanilla.registerBlock("purple_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block PURPLE_STAINED_GLASS_WALL = Wanilla.registerBlock("purple_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block MAGENTA_STAINED_GLASS_FLOOR = Wanilla.registerBlock("magenta_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block MAGENTA_STAINED_GLASS_WALL = Wanilla.registerBlock("magenta_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );
    public static final Block PINK_STAINED_GLASS_FLOOR = Wanilla.registerBlock("pink_stained_glass_floor",
            new FloorBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))
            );
    public static final Block PINK_STAINED_GLASS_WALL = Wanilla.registerBlock("pink_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLASS))
            );

    

    

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
