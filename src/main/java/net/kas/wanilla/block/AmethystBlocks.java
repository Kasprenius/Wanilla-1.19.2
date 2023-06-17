package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.FlushPressurePlateBlock;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class AmethystBlocks {

    public static final Block AMETHYST_STAIRS = Wanilla.registerBlock("amethyst_stairs",
            new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE).strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block AMETHYST_SLAB = Wanilla.registerBlock("amethyst_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE).strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block AMETHYST_WALL = Wanilla.registerBlock("amethyst_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE).strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));

    public static final Block MELTED_AMETHYST = Wanilla.registerBlock("melted_amethyst",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE).strength(3.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));  //G
    public static final Block POLISHED_AMETHYST = Wanilla.registerBlock("polished_amethyst",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE).strength(3.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
            public static final Block POLISHED_AMETHYST_STAIRS = Wanilla.registerBlock("polished_amethyst_stairs",
                    new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE).strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
            public static final Block POLISHED_AMETHYST_SLAB = Wanilla.registerBlock("polished_amethyst_slab",
                    new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE).strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
            public static final Block POLISHED_AMETHYST_WALL = Wanilla.registerBlock("polished_amethyst_wall",
                    new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE).strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));

    public static final Block AMETHYST_BRICKS = Wanilla.registerBlock("amethyst_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE).strength(3.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));  //G
            public static final Block AMETHYST_BRICKS_STAIRS = Wanilla.registerBlock("amethyst_brick_stairs",
                    new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(AMETHYST_BRICKS).strength(3.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));  //G
            public static final Block AMETHYST_BRICK_SLAB = Wanilla.registerBlock("amethyst_brick_slab",
                    new SlabBlock(FabricBlockSettings.copyOf(AMETHYST_BRICKS).strength(3.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));  //G
            public static final Block AMETHYST_BRICK_WALL = Wanilla.registerBlock("amethyst_brick_wall",
                    new WallBlock(FabricBlockSettings.copyOf(AMETHYST_BRICKS).strength(3.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));  //G

    public static final Block AMETHYST_PILLAR = Wanilla.registerBlock("amethyst_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE).strength(3.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));

    public static final Block CHISELED_AMETHYST = Wanilla.registerBlock("chiseled_amethyst",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE).strength(3.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block CARVED_AMETHYST = Wanilla.registerBlock("carved_amethyst",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE).strength(3.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block AMETHYST_TILE = Wanilla.registerBlock("amethyst_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE).strength(3.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));

        public static final Block FLUSH_AMETHYST_TILE_PRESSURE_PLATE = Wanilla.registerBlock("flush_amethyst_tile_pressure_plate",
            new FlushPressurePlateBlock(FlushPressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE)
                    .noCollision().strength(3.0f)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK),
                    SoundEvents.BLOCK_METAL_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_METAL_PRESSURE_PLATE_CLICK_ON));




    //-------------------------------------------------------------------------------------------------------------------
    

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }
}
