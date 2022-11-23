package net.kas.wanilla.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.HedgeBlock;
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

public class Hedges {

    public static final Block OAK_HEDGE = registerBlock("oak_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)),
            ModItemGroup.WOODSTUFF);
    public static final Block SPRUCE_HEDGE = registerBlock("spruce_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.SPRUCE_LEAVES)),
            ModItemGroup.WOODSTUFF);
    public static final Block BIRCH_HEDGE = registerBlock("birch_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.BIRCH_LEAVES)),
            ModItemGroup.WOODSTUFF);
    public static final Block JUNGLE_HEDGE = registerBlock("jungle_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.JUNGLE_LEAVES)),
            ModItemGroup.WOODSTUFF);
    public static final Block ACACIA_HEDGE = registerBlock("acacia_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.ACACIA_LEAVES)),
            ModItemGroup.WOODSTUFF);
    public static final Block DARK_OAK_HEDGE = registerBlock("dark_oak_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_LEAVES)),
            ModItemGroup.WOODSTUFF);
    public static final Block MANGROVE_HEDGE = registerBlock("mangrove_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.MANGROVE_LEAVES)),
            ModItemGroup.WOODSTUFF);
    public static final Block AZALEA_HEDGE = registerBlock("azalea_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.AZALEA_LEAVES)),
            ModItemGroup.WOODSTUFF);
    public static final Block FLOWERING_AZALEA_HEDGE = registerBlock("flowering_azalea_hedge",
            new HedgeBlock(FabricBlockSettings.copy(Blocks.FLOWERING_AZALEA_LEAVES)),
            ModItemGroup.WOODSTUFF);



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
