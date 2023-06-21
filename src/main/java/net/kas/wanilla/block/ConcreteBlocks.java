package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ConcreteBlocks {

    //----------------------------------ANCIENT GREEN-----------------------------------------------------------------------------

    public static final Block ANCIENT_GREEN_CONCRETE_POWDER = Wanilla.registerBlock("ancient_green_concrete_powder",
            new Block(FabricBlockSettings.copy(Blocks.GREEN_CONCRETE_POWDER))
    );
    public static final Block ANCIENT_GREEN_CONCRETE = Wanilla.registerBlock("ancient_green_concrete",
            new Block(FabricBlockSettings.copy(Blocks.GREEN_CONCRETE).requiresTool())
    );
            public static final Block ANCIENT_GREEN_CONCRETE_STAIRS = Wanilla.registerBlock("ancient_green_concrete_stairs",
                    new StairsBlock(ConcreteBlocks.ANCIENT_GREEN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(ConcreteBlocks.ANCIENT_GREEN_CONCRETE).requiresTool())
            );
            public static final Block ANCIENT_GREEN_CONCRETE_SLAB = Wanilla.registerBlock("ancient_green_concrete_slab",
                    new SlabBlock(FabricBlockSettings.copy(ConcreteBlocks.ANCIENT_GREEN_CONCRETE).requiresTool())
            );
            public static final Block ANCIENT_GREEN_CONCRETE_WALL = Wanilla.registerBlock("ancient_green_concrete_wall",
                    new WallBlock(AbstractBlock.Settings.copy(ConcreteBlocks.ANCIENT_GREEN_CONCRETE))
            );
    //----------------------------------------------------------------------------------------------------------------------------

    public static final Block WHITE_CONCRETE_STAIRS = Wanilla.registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE).requiresTool())
            );
    public static final Block WHITE_CONCRETE_SLAB = Wanilla.registerBlock("white_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE).requiresTool())
            );
    public static final Block WHITE_CONCRETE_WALL = Wanilla.registerBlock("white_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE))
            );
    
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = Wanilla.registerBlock("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.LIGHT_GRAY_CONCRETE).requiresTool())
            );
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = Wanilla.registerBlock("light_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_CONCRETE).requiresTool())
            );
    public static final Block LIGHT_GRAY_CONCRETE_WALL = Wanilla.registerBlock("light_gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE))
            );
    
    public static final Block GRAY_CONCRETE_STAIRS = Wanilla.registerBlock("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.GRAY_CONCRETE).requiresTool())
            );
    public static final Block GRAY_CONCRETE_SLAB = Wanilla.registerBlock("gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.GRAY_CONCRETE).requiresTool())
            );
    public static final Block GRAY_CONCRETE_WALL = Wanilla.registerBlock("gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE))
            );

    public static final Block BLACK_CONCRETE_STAIRS = Wanilla.registerBlock("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.BLACK_CONCRETE).requiresTool())
            );
    public static final Block BLACK_CONCRETE_SLAB = Wanilla.registerBlock("black_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE).requiresTool())
            );
    public static final Block BLACK_CONCRETE_WALL = Wanilla.registerBlock("black_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE))
            );

    public static final Block BROWN_CONCRETE_STAIRS = Wanilla.registerBlock("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.BROWN_CONCRETE).requiresTool())
            );
    public static final Block BROWN_CONCRETE_SLAB = Wanilla.registerBlock("brown_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.BROWN_CONCRETE).requiresTool())
            );
    public static final Block BROWN_CONCRETE_WALL = Wanilla.registerBlock("brown_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE))
            );

    public static final Block RED_CONCRETE_STAIRS = Wanilla.registerBlock("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.RED_CONCRETE).requiresTool())
            );
    public static final Block RED_CONCRETE_SLAB = Wanilla.registerBlock("red_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.RED_CONCRETE).requiresTool())
            );
    public static final Block RED_CONCRETE_WALL = Wanilla.registerBlock("red_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE))
            );

    public static final Block ORANGE_CONCRETE_STAIRS = Wanilla.registerBlock("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.ORANGE_CONCRETE).requiresTool())
            );
    public static final Block ORANGE_CONCRETE_SLAB = Wanilla.registerBlock("orange_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.ORANGE_CONCRETE).requiresTool())
            );
    public static final Block ORANGE_CONCRETE_WALL = Wanilla.registerBlock("orange_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE))
            );

    public static final Block YELLOW_CONCRETE_STAIRS = Wanilla.registerBlock("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.YELLOW_CONCRETE).requiresTool())
            );
    public static final Block YELLOW_CONCRETE_SLAB = Wanilla.registerBlock("yellow_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.YELLOW_CONCRETE).requiresTool())
            );
    public static final Block YELLOW_CONCRETE_WALL = Wanilla.registerBlock("yellow_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE))
            );

    public static final Block LIME_CONCRETE_STAIRS = Wanilla.registerBlock("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.LIME_CONCRETE).requiresTool())
            );
    public static final Block LIME_CONCRETE_SLAB = Wanilla.registerBlock("lime_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.LIME_CONCRETE).requiresTool())
            );
    public static final Block LIME_CONCRETE_WALL = Wanilla.registerBlock("lime_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE))
            );

    public static final Block GREEN_CONCRETE_STAIRS = Wanilla.registerBlock("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.GREEN_CONCRETE).requiresTool())
            );
    public static final Block GREEN_CONCRETE_SLAB = Wanilla.registerBlock("green_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.GREEN_CONCRETE).requiresTool())
            );
    public static final Block GREEN_CONCRETE_WALL = Wanilla.registerBlock("green_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE))
            );

    public static final Block CYAN_CONCRETE_STAIRS = Wanilla.registerBlock("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.CYAN_CONCRETE).requiresTool())
            );
    public static final Block CYAN_CONCRETE_SLAB = Wanilla.registerBlock("cyan_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.CYAN_CONCRETE).requiresTool())
            );
    public static final Block CYAN_CONCRETE_WALL = Wanilla.registerBlock("cyan_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE))
            );

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = Wanilla.registerBlock("light_blue_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.LIGHT_BLUE_CONCRETE).requiresTool())
            );
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = Wanilla.registerBlock("light_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_CONCRETE).requiresTool())
            );
    public static final Block LIGHT_BLUE_CONCRETE_WALL = Wanilla.registerBlock("light_blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE))
            );

    public static final Block BLUE_CONCRETE_STAIRS = Wanilla.registerBlock("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.BLUE_CONCRETE).requiresTool())
            );
    public static final Block BLUE_CONCRETE_SLAB = Wanilla.registerBlock("blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.BLUE_CONCRETE).requiresTool())
            );
    public static final Block BLUE_CONCRETE_WALL = Wanilla.registerBlock("blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE))
            );

    public static final Block PURPLE_CONCRETE_STAIRS = Wanilla.registerBlock("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.PURPLE_CONCRETE).requiresTool())
            );
    public static final Block PURPLE_CONCRETE_SLAB = Wanilla.registerBlock("purple_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.PURPLE_CONCRETE).requiresTool())
            );
    public static final Block PURPLE_CONCRETE_WALL = Wanilla.registerBlock("purple_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE))
            );

    public static final Block MAGENTA_CONCRETE_STAIRS = Wanilla.registerBlock("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.MAGENTA_CONCRETE).requiresTool())
            );
    public static final Block MAGENTA_CONCRETE_SLAB = Wanilla.registerBlock("magenta_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.MAGENTA_CONCRETE).requiresTool())
            );
    public static final Block MAGENTA_CONCRETE_WALL = Wanilla.registerBlock("magenta_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE))
            );

    public static final Block PINK_CONCRETE_STAIRS = Wanilla.registerBlock("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.PINK_CONCRETE).requiresTool())
            );
    public static final Block PINK_CONCRETE_SLAB = Wanilla.registerBlock("pink_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.PINK_CONCRETE).requiresTool())
            );
    public static final Block PINK_CONCRETE_WALL = Wanilla.registerBlock("pink_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE))
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
