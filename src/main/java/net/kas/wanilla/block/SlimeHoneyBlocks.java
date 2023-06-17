package net.kas.wanilla.block;

import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.ColoredHoneyBlock;
import net.kas.wanilla.block.templates.ColoredSlimeBlock;
import net.minecraft.block.Block;
import net.minecraft.util.DyeColor;

public class SlimeHoneyBlocks {
    
    public static final Block WHITE_SLIME_BLOCK = Wanilla.registerBlock("white_slime_block",
            new ColoredSlimeBlock(DyeColor.WHITE));
    public static final Block LIGHT_GRAY_SLIME_BLOCK = Wanilla.registerBlock("light_gray_slime_block",
            new ColoredSlimeBlock(DyeColor.LIGHT_GRAY));
    public static final Block GRAY_SLIME_BLOCK = Wanilla.registerBlock("gray_slime_block",
            new ColoredSlimeBlock(DyeColor.GRAY));
    public static final Block BLACK_SLIME_BLOCK = Wanilla.registerBlock("black_slime_block",
            new ColoredSlimeBlock(DyeColor.BLACK));
    public static final Block BROWN_SLIME_BLOCK = Wanilla.registerBlock("brown_slime_block",
            new ColoredSlimeBlock(DyeColor.BROWN));
    public static final Block RED_SLIME_BLOCK = Wanilla.registerBlock("red_slime_block",
            new ColoredSlimeBlock(DyeColor.RED));
    public static final Block ORANGE_SLIME_BLOCK = Wanilla.registerBlock("orange_slime_block",
            new ColoredSlimeBlock(DyeColor.ORANGE));
    public static final Block YELLOW_SLIME_BLOCK = Wanilla.registerBlock("yellow_slime_block",
            new ColoredSlimeBlock(DyeColor.YELLOW));
    public static final Block LIME_SLIME_BLOCK = Wanilla.registerBlock("lime_slime_block",
            new ColoredSlimeBlock(DyeColor.LIME));
    public static final Block GREEN_SLIME_BLOCK = Wanilla.registerBlock("green_slime_block",
            new ColoredSlimeBlock(DyeColor.GREEN));
    public static final Block CYAN_SLIME_BLOCK = Wanilla.registerBlock("cyan_slime_block",
            new ColoredSlimeBlock(DyeColor.CYAN));
    public static final Block LIGHT_BLUE_SLIME_BLOCK = Wanilla.registerBlock("light_blue_slime_block",
            new ColoredSlimeBlock(DyeColor.LIGHT_BLUE));
    public static final Block BLUE_SLIME_BLOCK = Wanilla.registerBlock("blue_slime_block",
            new ColoredSlimeBlock(DyeColor.BLUE));
    public static final Block PURPLE_SLIME_BLOCK = Wanilla.registerBlock("purple_slime_block",
            new ColoredSlimeBlock(DyeColor.PURPLE));
    public static final Block MAGENTA_SLIME_BLOCK = Wanilla.registerBlock("magenta_slime_block",
            new ColoredSlimeBlock(DyeColor.MAGENTA));
    public static final Block PINK_SLIME_BLOCK = Wanilla.registerBlock("pink_slime_block",
            new ColoredSlimeBlock(DyeColor.PINK));

    public static final Block WHITE_HONEY_BLOCK = Wanilla.registerBlock("white_honey_block",
            new ColoredHoneyBlock(DyeColor.WHITE));
    public static final Block LIGHT_GRAY_HONEY_BLOCK = Wanilla.registerBlock("light_gray_honey_block",
            new ColoredHoneyBlock(DyeColor.LIGHT_GRAY));
    public static final Block GRAY_HONEY_BLOCK = Wanilla.registerBlock("gray_honey_block",
            new ColoredHoneyBlock(DyeColor.GRAY));
    public static final Block BLACK_HONEY_BLOCK = Wanilla.registerBlock("black_honey_block",
            new ColoredHoneyBlock(DyeColor.BLACK));
    public static final Block BROWN_HONEY_BLOCK = Wanilla.registerBlock("brown_honey_block",
            new ColoredHoneyBlock(DyeColor.BROWN));
    public static final Block RED_HONEY_BLOCK = Wanilla.registerBlock("red_honey_block",
            new ColoredHoneyBlock(DyeColor.RED));
    public static final Block ORANGE_HONEY_BLOCK = Wanilla.registerBlock("orange_honey_block",
            new ColoredHoneyBlock(DyeColor.ORANGE));
    public static final Block YELLOW_HONEY_BLOCK = Wanilla.registerBlock("yellow_honey_block",
            new ColoredHoneyBlock(DyeColor.YELLOW));
    public static final Block LIME_HONEY_BLOCK = Wanilla.registerBlock("lime_honey_block",
            new ColoredHoneyBlock(DyeColor.LIME));
    public static final Block GREEN_HONEY_BLOCK = Wanilla.registerBlock("green_honey_block",
            new ColoredHoneyBlock(DyeColor.GREEN));
    public static final Block CYAN_HONEY_BLOCK = Wanilla.registerBlock("cyan_honey_block",
            new ColoredHoneyBlock(DyeColor.CYAN));
    public static final Block LIGHT_BLUE_HONEY_BLOCK = Wanilla.registerBlock("light_blue_honey_block",
            new ColoredHoneyBlock(DyeColor.LIGHT_BLUE));
    public static final Block BLUE_HONEY_BLOCK = Wanilla.registerBlock("blue_honey_block",
            new ColoredHoneyBlock(DyeColor.BLUE));
    public static final Block PURPLE_HONEY_BLOCK = Wanilla.registerBlock("purple_honey_block",
            new ColoredHoneyBlock(DyeColor.PURPLE));
    public static final Block MAGENTA_HONEY_BLOCK = Wanilla.registerBlock("magenta_honey_block",
            new ColoredHoneyBlock(DyeColor.MAGENTA));
    public static final Block PINK_HONEY_BLOCK = Wanilla.registerBlock("pink_honey_block",
            new ColoredHoneyBlock(DyeColor.PINK));


    //-------------------------------------------------------------------------------------------------------------------


    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }

    public static boolean isColoredSlime(Block block) {
        return block instanceof ColoredSlimeBlock;
    }

    public static boolean isColoredHoney(Block block) {
        return block instanceof ColoredHoneyBlock;
    }
}
