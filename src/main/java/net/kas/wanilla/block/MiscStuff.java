package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.BlastrodBlock;
import net.kas.wanilla.block.templates.CustomFurnaceBlock;
import net.kas.wanilla.block.templates.InfusionTableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.property.Properties;

import java.util.function.ToIntFunction;

public class MiscStuff {

    public static final Block BLASTROD = Wanilla.registerBlock("blast_rod",
            new BlastrodBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f)));
    public static final Block DEEPSLATE_FURNACE = Wanilla.registerBlock("deepslate_furnace",
            new CustomFurnaceBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).luminance(createLightLevelFromLitBlockState(13))));

    public static final Block INFUSION_TABLE = Wanilla.registerBlock("infusion_table",
            new InfusionTableBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).strength(4.0f).luminance(13)));


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
