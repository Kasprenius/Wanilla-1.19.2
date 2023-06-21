package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.EndLightBlock;
import net.kas.wanilla.block.templates.VoidLightBlock;
import net.minecraft.block.*;

public class EndlightBlocks {

    public static final Block ENDLIGHT = Wanilla.registerBlock("endlight",
            new EndLightBlock(AbstractBlock.Settings.create()
                    .notSolid()
                    .dynamicBounds()
                    .strength(-1.0F, 3600000.8F)
                    .luminance((state) -> {
                        return 15;
                    }).noBlockBreakParticles()
                    .dropsNothing()
                    .mapColor(MapColor.WHITE)));
    public static final Block VOIDLIGHT = Wanilla.registerBlock("voidlight",
            new VoidLightBlock(FabricBlockSettings.copyOf(ENDLIGHT)
                    .blockVision((blockState, world, pos) -> true)
                    .mapColor(MapColor.BLACK)));

    public static final Block CONDENSED_ENDLIGHT = Wanilla.registerBlock("condensed_endlight",
            new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .strength(0.25F)
                    .luminance((state) -> {
                        return 15;
                    })
                    .mapColor(MapColor.WHITE)));
    public static final Block CONDENSED_VOIDLIGHT = Wanilla.registerBlock("condensed_voidlight",
            new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .strength(0.25F)
                    .luminance((state) -> {
                        return 15;
                    })
                    .mapColor(MapColor.BLACK)));

    //----------------------------------ANCIENT GREEN-----------------------------------------------------------------------------
    public static final Block ANCIENT_GREEN_CONDENSED_ENDLIGHT = Wanilla.registerBlock("ancient_green_condensed_endlight",
            new Block(FabricBlockSettings.copyOf(CONDENSED_ENDLIGHT)
                    .mapColor(MapColor.GREEN)));
    //----------------------------------------------------------------------------------------------------------------------------
    public static final Block LIGHT_GRAY_CONDENSED_ENDLIGHT = Wanilla.registerBlock("light_gray_condensed_endlight",
            new Block(FabricBlockSettings.copyOf(CONDENSED_ENDLIGHT)
                    .mapColor(MapColor.LIGHT_GRAY)));
    public static final Block GRAY_CONDENSED_ENDLIGHT = Wanilla.registerBlock("gray_condensed_endlight",
            new Block(FabricBlockSettings.copyOf(CONDENSED_ENDLIGHT)
                    .mapColor(MapColor.GRAY)));
    public static final Block BROWN_CONDENSED_ENDLIGHT = Wanilla.registerBlock("brown_condensed_endlight",
            new Block(FabricBlockSettings.copyOf(CONDENSED_ENDLIGHT)
                    .mapColor(MapColor.BROWN)));
    public static final Block RED_CONDENSED_ENDLIGHT = Wanilla.registerBlock("red_condensed_endlight",
            new Block(FabricBlockSettings.copyOf(CONDENSED_ENDLIGHT)
                    .mapColor(MapColor.RED)));
    public static final Block ORANGE_CONDENSED_ENDLIGHT = Wanilla.registerBlock("orange_condensed_endlight",
            new Block(FabricBlockSettings.copyOf(CONDENSED_ENDLIGHT)
                    .mapColor(MapColor.ORANGE)));
    public static final Block YELLOW_CONDENSED_ENDLIGHT = Wanilla.registerBlock("yellow_condensed_endlight",
            new Block(FabricBlockSettings.copyOf(CONDENSED_ENDLIGHT)
                    .mapColor(MapColor.YELLOW)));
    public static final Block LIME_CONDENSED_ENDLIGHT = Wanilla.registerBlock("lime_condensed_endlight",
            new Block(FabricBlockSettings.copyOf(CONDENSED_ENDLIGHT)
                    .mapColor(MapColor.LIME)));
    public static final Block GREEN_CONDENSED_ENDLIGHT = Wanilla.registerBlock("green_condensed_endlight",
            new Block(FabricBlockSettings.copyOf(CONDENSED_ENDLIGHT)
                    .mapColor(MapColor.GREEN)));
    public static final Block CYAN_CONDENSED_ENDLIGHT = Wanilla.registerBlock("cyan_condensed_endlight",
            new Block(FabricBlockSettings.copyOf(CONDENSED_ENDLIGHT)
                    .mapColor(MapColor.CYAN)));
    public static final Block LIGHT_BLUE_CONDENSED_ENDLIGHT = Wanilla.registerBlock("light_blue_condensed_endlight",
            new Block(FabricBlockSettings.copyOf(CONDENSED_ENDLIGHT)
                    .mapColor(MapColor.LIGHT_BLUE)));
    public static final Block BLUE_CONDENSED_ENDLIGHT = Wanilla.registerBlock("blue_condensed_endlight",
            new Block(FabricBlockSettings.copyOf(CONDENSED_ENDLIGHT)
                    .mapColor(MapColor.BLUE)));
    public static final Block PURPLE_CONDENSED_ENDLIGHT = Wanilla.registerBlock("purple_condensed_endlight",
            new Block(FabricBlockSettings.copyOf(CONDENSED_ENDLIGHT)
                    .mapColor(MapColor.PURPLE)));
    public static final Block MAGENTA_CONDENSED_ENDLIGHT = Wanilla.registerBlock("magenta_condensed_endlight",
            new Block(FabricBlockSettings.copyOf(CONDENSED_ENDLIGHT)
                    .mapColor(MapColor.MAGENTA)));
    public static final Block PINK_CONDENSED_ENDLIGHT = Wanilla.registerBlock("pink_condensed_endlight",
            new Block(FabricBlockSettings.copyOf(CONDENSED_ENDLIGHT)
                    .mapColor(MapColor.PINK)));

    public static final Block ENDLIGHT_LANTERN = Wanilla.registerBlock("endlight_lantern",
            new LanternBlock(FabricBlockSettings.copy(Blocks.LANTERN).requiresTool()));

    //-------------------------------------------------------------------------------------------------------------------

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering EndlightBlocks for " + Wanilla.MOD_ID);
    }
}
