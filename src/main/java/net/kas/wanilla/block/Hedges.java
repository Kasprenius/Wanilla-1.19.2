package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.HedgeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class Hedges {

    public static final Block OAK_HEDGE = Wanilla.registerBlock("oak_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block SPRUCE_HEDGE = Wanilla.registerBlock("spruce_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.SPRUCE_LEAVES)));
    public static final Block BIRCH_HEDGE = Wanilla.registerBlock("birch_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.BIRCH_LEAVES)));
    public static final Block JUNGLE_HEDGE = Wanilla.registerBlock("jungle_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.JUNGLE_LEAVES)));
    public static final Block ACACIA_HEDGE = Wanilla.registerBlock("acacia_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.ACACIA_LEAVES)));
    public static final Block DARK_OAK_HEDGE = Wanilla.registerBlock("dark_oak_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_LEAVES)));
    public static final Block MANGROVE_HEDGE = Wanilla.registerBlock("mangrove_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.MANGROVE_LEAVES)));
    public static final Block CHERRY_HEDGE = Wanilla.registerBlock("cherry_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.CHERRY_LEAVES)));
    public static final Block AZALEA_HEDGE = Wanilla.registerBlock("azalea_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.AZALEA_LEAVES)));
    public static final Block FLOWERING_AZALEA_HEDGE = Wanilla.registerBlock("flowering_azalea_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.FLOWERING_AZALEA_LEAVES)));
    

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering Hedges for " + Wanilla.MOD_ID);
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
