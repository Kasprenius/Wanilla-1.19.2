package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.materials.ModDyeColors;
import net.kas.wanilla.block.templates.BlastrodBlock;
import net.kas.wanilla.block.templates.CustomFurnaceBlock;
import net.kas.wanilla.block.templates.InfusionTableBlock;
import net.minecraft.block.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.DyeColor;

import java.util.function.ToIntFunction;

public class MiscStuff {

    public static final Block BLASTROD = Wanilla.registerBlock("blast_rod",
            new BlastrodBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f)));
    public static final Block DEEPSLATE_FURNACE = Wanilla.registerBlock("deepslate_furnace",
            new CustomFurnaceBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).luminance(createLightLevelFromLitBlockState(13))));

    public static final Block INFUSION_TABLE = Wanilla.registerBlock("infusion_table",
            new InfusionTableBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).strength(4.0f).luminance(13)));

    public static final Block ANCIENT_GREEN_CANDLE = Wanilla.registerBlock("ancient_green_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CANDLE)));


    public static final Block ANCIENT_GREEN_CANDLE_CAKE = Wanilla.registerBlock("ancient_green_candle_cake",
            new CandleCakeBlock(ANCIENT_GREEN_CANDLE, FabricBlockSettings.copyOf(Blocks.GREEN_CANDLE_CAKE)));

    public static final Block ANCIENT_GREEN_TERRACOTTA = Wanilla.registerBlock("ancient_green_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));


    //-------------------------------------------------------------------------------------------------------------------


    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }

    private static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int litLevel) {
        return (state) -> {
            return (Boolean)state.get(Properties.LIT) ? litLevel : 0;
        };
    }
}
