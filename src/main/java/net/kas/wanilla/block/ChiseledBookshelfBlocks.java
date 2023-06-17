package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChiseledBookshelfBlock;

public class ChiseledBookshelfBlocks {

    public static final Block SPRUCE_CHISELED_BOOKSHELF = Wanilla.registerBlock("spruce_chiseled_bookshelf",
            new ChiseledBookshelfBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_BOOKSHELF).strength(1.5F)));
    public static final Block BIRCH_CHISELED_BOOKSHELF = Wanilla.registerBlock("birch_chiseled_bookshelf",
            new ChiseledBookshelfBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_BOOKSHELF).strength(1.5F)));
    public static final Block JUNGLE_CHISELED_BOOKSHELF = Wanilla.registerBlock("jungle_chiseled_bookshelf",
            new ChiseledBookshelfBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_BOOKSHELF).strength(1.5F)));
    public static final Block ACACIA_CHISELED_BOOKSHELF = Wanilla.registerBlock("acacia_chiseled_bookshelf",
            new ChiseledBookshelfBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_BOOKSHELF).strength(1.5F)));
    public static final Block DARK_OAK_CHISELED_BOOKSHELF = Wanilla.registerBlock("dark_oak_chiseled_bookshelf",
            new ChiseledBookshelfBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_BOOKSHELF).strength(1.5F)));
    public static final Block MANGROVE_CHISELED_BOOKSHELF = Wanilla.registerBlock("mangrove_chiseled_bookshelf",
            new ChiseledBookshelfBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_BOOKSHELF).strength(1.5F)));
    public static final Block CHERRY_CHISELED_BOOKSHELF = Wanilla.registerBlock("cherry_chiseled_bookshelf",
            new ChiseledBookshelfBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_BOOKSHELF).strength(1.5F)));
    public static final Block BAMBOO_CHISELED_BOOKSHELF = Wanilla.registerBlock("bamboo_chiseled_bookshelf",
            new ChiseledBookshelfBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_BOOKSHELF).strength(1.5F)));
    public static final Block CRIMSON_CHISELED_BOOKSHELF = Wanilla.registerBlock("crimson_chiseled_bookshelf",
            new ChiseledBookshelfBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_BOOKSHELF).strength(1.5F)));
    public static final Block WARPED_CHISELED_BOOKSHELF = Wanilla.registerBlock("warped_chiseled_bookshelf",
            new ChiseledBookshelfBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_BOOKSHELF).strength(1.5F)));

    public static final Block GOLD_CHISELED_BOOKSHELF = Wanilla.registerBlock("gold_chiseled_bookshelf",
            new ChiseledBookshelfBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(3.0f, 6.0f)));


    //-------------------------------------------------------------------------------------------------------------------

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering EndlightBlocks for " + Wanilla.MOD_ID);
    }
}
