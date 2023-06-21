package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.EndRodBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class EndRods {

    //----------------------------------ANCIENT GREEN-----------------------------------------------------------------------------
    public static final Block ANCIENT_GREEN_END_ROD = Wanilla.registerBlock("ancient_green_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));

    //----------------------------------------------------------------------------------------------------------------------------

    public static final Block WHITE_END_ROD = Wanilla.registerBlock("white_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    public static final Block LIGHT_GRAY_END_ROD = Wanilla.registerBlock("light_gray_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    public static final Block GRAY_END_ROD = Wanilla.registerBlock("gray_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    public static final Block BLACK_END_ROD = Wanilla.registerBlock("black_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    public static final Block BROWN_END_ROD = Wanilla.registerBlock("brown_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    public static final Block RED_END_ROD = Wanilla.registerBlock("red_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    public static final Block ORANGE_END_ROD = Wanilla.registerBlock("orange_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    public static final Block YELLOW_END_ROD = Wanilla.registerBlock("yellow_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    public static final Block LIME_END_ROD = Wanilla.registerBlock("lime_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    public static final Block GREEN_END_ROD = Wanilla.registerBlock("green_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    public static final Block CYAN_END_ROD = Wanilla.registerBlock("cyan_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    public static final Block LIGHT_BLUE_END_ROD = Wanilla.registerBlock("light_blue_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    public static final Block BLUE_END_ROD = Wanilla.registerBlock("blue_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    public static final Block PURPLE_END_ROD = Wanilla.registerBlock("purple_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    public static final Block MAGENTA_END_ROD = Wanilla.registerBlock("magenta_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    public static final Block PINK_END_ROD = Wanilla.registerBlock("pink_end_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD)));
    
    
    

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
