package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.GlowdustBlock;
import net.kas.wanilla.block.templates.Glowstones;
import net.kas.wanilla.registry.IEBlockSoundGroups;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;

import java.util.function.ToIntFunction;

public class GlowBlocks {


    /*
    Glowdust Set
     */
    public static final Block GLOWDUST_SAND = Wanilla.registerBlock("glowdust_sand",
            new SandBlock(0xFFC267, FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK).mapColor(MapColor.PALE_YELLOW).strength(0.2F, 0.2F).luminance(4).sounds(BlockSoundGroup.SAND)));
    public static final Block GLOWDUST = Wanilla.registerBlock("glowdust",
            new GlowdustBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK).mapColor(MapColor.PALE_YELLOW).strength(0.2F, 0.2F).sounds(BlockSoundGroup.SAND)));
    
    
            public static final Block GLOWSTONE_SLAB = Wanilla.registerBlock("glowstone_slab",
                    new SlabBlock(FabricBlockSettings.copyOf(Blocks.GLASS).strength(0.3F).sounds(BlockSoundGroup.GLASS).luminance(15)));
            public static final Block GLOWSTONE_STAIRS = Wanilla.registerBlock("glowstone_stairs",
                    new StairsBlock(GLOWSTONE_SLAB.getDefaultState(), FabricBlockSettings.copy(GLOWSTONE_SLAB)));
            public static final Block GLOWSTONE_WALL = Wanilla.registerBlock("glowstone_wall",
                    new WallBlock(FabricBlockSettings.copy(GLOWSTONE_SLAB)));
    public static final Block POLISHED_GLOWSTONE = Wanilla.registerBlock("polished_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLASS).strength(1.5F, 6.0F).sounds(BlockSoundGroup.GLASS).requiresTool().luminance(15)));
            public static final Block POLISHED_GLOWSTONE_SLAB = Wanilla.registerBlock("polished_glowstone_slab",
                    new SlabBlock(FabricBlockSettings.copy(POLISHED_GLOWSTONE).requiresTool()));
            public static final Block POLISHED_GLOWSTONE_STAIRS = Wanilla.registerBlock("polished_glowstone_stairs",
                    new StairsBlock(POLISHED_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(POLISHED_GLOWSTONE).requiresTool()));
            public static final Block POLISHED_GLOWSTONE_WALL = Wanilla.registerBlock("polished_glowstone_wall",
                    new WallBlock(FabricBlockSettings.copy(POLISHED_GLOWSTONE).requiresTool()));
    public static final Block GLOWSTONE_BRICKS = Wanilla.registerBlock("glowstone_bricks",
            new Block(FabricBlockSettings.copy(POLISHED_GLOWSTONE).requiresTool()));
            public static final Block CRACKED_GLOWSTONE_BRICKS = Wanilla.registerBlock("cracked_glowstone_bricks",
                    new Block(FabricBlockSettings.copy(GLOWSTONE_BRICKS).requiresTool()));
            public static final Block GLOWSTONE_BRICK_SLAB = Wanilla.registerBlock("glowstone_brick_slab",
                    new SlabBlock(FabricBlockSettings.copy(GLOWSTONE_BRICKS).requiresTool()));
            public static final Block GLOWSTONE_BRICK_STAIRS = Wanilla.registerBlock("glowstone_brick_stairs",
                    new StairsBlock(GLOWSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(GLOWSTONE_BRICKS).requiresTool()));
            public static final Block GLOWSTONE_BRICK_WALL = Wanilla.registerBlock("glowstone_brick_wall",
                    new WallBlock(FabricBlockSettings.copy(GLOWSTONE_BRICKS).requiresTool()));
    
    public static final Block CHISELED_GLOWSTONE_BRICKS = Wanilla.registerBlock("chiseled_glowstone_bricks",
            new Block(FabricBlockSettings.copy(POLISHED_GLOWSTONE).requiresTool()));
    public static final Block CARVED_GLOWSTONE_BRICKS = Wanilla.registerBlock("carved_glowstone_bricks",
            new Block(FabricBlockSettings.copy(POLISHED_GLOWSTONE).requiresTool()));
    
    
    public static final Block DIMSTONE = Wanilla.registerBlock("dimstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLASS).strength(0.3F).sounds(IEBlockSoundGroups.DIMSTONE).luminance(12)));
            public static final Block DIMSTONE_SLAB = Wanilla.registerBlock("dimstone_slab",
                    new SlabBlock(FabricBlockSettings.copy(DIMSTONE)));
            public static final Block DIMSTONE_STAIRS = Wanilla.registerBlock("dimstone_stairs",
                    new StairsBlock(DIMSTONE.getDefaultState(), FabricBlockSettings.copy(DIMSTONE)));
            public static final Block DIMSTONE_WALL = Wanilla.registerBlock("dimstone_wall",
                    new WallBlock(FabricBlockSettings.copy(DIMSTONE)));
    public static final Block POLISHED_DIMSTONE = Wanilla.registerBlock("polished_dimstone",
            new Block(FabricBlockSettings.copy(DIMSTONE).strength(1.5F, 6.0F).requiresTool()));
            public static final Block POLISHED_DIMSTONE_SLAB = Wanilla.registerBlock("polished_dimstone_slab",
                    new SlabBlock(FabricBlockSettings.copy(POLISHED_DIMSTONE).requiresTool()));
            public static final Block POLISHED_DIMSTONE_STAIRS = Wanilla.registerBlock("polished_dimstone_stairs",
                    new StairsBlock(POLISHED_DIMSTONE.getDefaultState(), FabricBlockSettings.copy(POLISHED_DIMSTONE).requiresTool()));
            public static final Block POLISHED_DIMSTONE_WALL = Wanilla.registerBlock("polished_dimstone_wall",
                    new WallBlock(FabricBlockSettings.copy(POLISHED_DIMSTONE).requiresTool()));
    public static final Block DIMSTONE_BRICKS = Wanilla.registerBlock("dimstone_bricks",
            new Block(FabricBlockSettings.copy(POLISHED_DIMSTONE).requiresTool()));
            public static final Block CRACKED_DIMSTONE_BRICKS = Wanilla.registerBlock("cracked_dimstone_bricks",
                    new Block(FabricBlockSettings.copy(DIMSTONE_BRICKS).requiresTool()));
            public static final Block DIMSTONE_BRICK_SLAB = Wanilla.registerBlock("dimstone_brick_slab",
                    new SlabBlock(FabricBlockSettings.copy(DIMSTONE_BRICKS).requiresTool()));
            public static final Block DIMSTONE_BRICK_STAIRS = Wanilla.registerBlock("dimstone_brick_stairs",
                    new StairsBlock(DIMSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(DIMSTONE_BRICKS).requiresTool()));
            public static final Block DIMSTONE_BRICK_WALL = Wanilla.registerBlock("dimstone_brick_wall",
                    new WallBlock(FabricBlockSettings.copy(DIMSTONE_BRICKS).requiresTool()));
    public static final Block CHISELED_DIMSTONE_BRICKS = Wanilla.registerBlock("chiseled_dimstone_bricks",
            new Block(FabricBlockSettings.copy(POLISHED_DIMSTONE).requiresTool()));
    
    
    public static final Block DULLSTONE = Wanilla.registerBlock("dullstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLASS).strength(0.3F).sounds(IEBlockSoundGroups.DULLSTONE)));
            public static final Block DULLSTONE_SLAB = Wanilla.registerBlock("dullstone_slab",
                    new SlabBlock(FabricBlockSettings.copy(DULLSTONE)));
            public static final Block DULLSTONE_STAIRS = Wanilla.registerBlock("dullstone_stairs",
                    new StairsBlock(DULLSTONE.getDefaultState(), FabricBlockSettings.copy(DULLSTONE)));
            public static final Block DULLSTONE_WALL = Wanilla.registerBlock("dullstone_wall",
                    new WallBlock(FabricBlockSettings.copy(DULLSTONE)));
    public static final Block POLISHED_DULLSTONE = Wanilla.registerBlock("polished_dullstone",
            new Block(FabricBlockSettings.copy(DULLSTONE).strength(1.5F, 6.0F).requiresTool()));
            public static final Block POLISHED_DULLSTONE_SLAB = Wanilla.registerBlock("polished_dullstone_slab",
                    new SlabBlock(FabricBlockSettings.copy(POLISHED_DULLSTONE).requiresTool()));
            public static final Block POLISHED_DULLSTONE_STAIRS = Wanilla.registerBlock("polished_dullstone_stairs",
                    new StairsBlock(POLISHED_DULLSTONE.getDefaultState(), FabricBlockSettings.copy(POLISHED_DULLSTONE).requiresTool()));
            public static final Block POLISHED_DULLSTONE_WALL = Wanilla.registerBlock("polished_dullstone_wall",
                    new WallBlock(FabricBlockSettings.copy(POLISHED_DULLSTONE).requiresTool()));
    public static final Block DULLSTONE_BRICKS = Wanilla.registerBlock("dullstone_bricks",
            new Block(FabricBlockSettings.copy(POLISHED_DULLSTONE).requiresTool()));
            public static final Block CRACKED_DULLSTONE_BRICKS = Wanilla.registerBlock("cracked_dullstone_bricks",
                    new Block(FabricBlockSettings.copy(DULLSTONE_BRICKS).requiresTool()));
            public static final Block DULLSTONE_BRICK_SLAB = Wanilla.registerBlock("dullstone_brick_slab",
                    new SlabBlock(FabricBlockSettings.copy(DULLSTONE_BRICKS).requiresTool()));
            public static final Block DULLSTONE_BRICK_STAIRS = Wanilla.registerBlock("dullstone_brick_stairs",
                    new StairsBlock(DULLSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(DULLSTONE_BRICKS).requiresTool()));
            public static final Block DULLSTONE_BRICK_WALL = Wanilla.registerBlock("dullstone_brick_wall",
                    new WallBlock(FabricBlockSettings.copy(DULLSTONE_BRICKS).requiresTool()));
    public static final Block CHISELED_DULLSTONE_BRICKS = Wanilla.registerBlock("chiseled_dullstone_bricks",
            new Block(FabricBlockSettings.copy(POLISHED_DULLSTONE).requiresTool()));
    
    
    
    /*
    Glow Set
     */
    public static final Block GLOW_LANTERN = Wanilla.registerBlock("glow_lantern",
            new LanternBlock(FabricBlockSettings.copy(Blocks.LANTERN).requiresTool()));
    public static final Block GLOW_CAMPFIRE = Wanilla.registerBlock("glow_campfire",
            new CampfireBlock(false, 0, FabricBlockSettings.copy(Blocks.CAMPFIRE)));
    /*
    public static final Block GLOW_FIRE = Wanilla.registerBlock("glow_fire",
            new GlowFireBlock(FabricBlockSettings.copy(Blocks.FIRE)),
            ModItemGroup.GLOWSTUFF);

     */
    public static final Block GLOWSTONES = Wanilla.registerBlock("glowstones",
            new Glowstones(FabricBlockSettings.copy(Blocks.CANDLE).luminance(Glowstones.STATE_TO_LUMINANCE)));

    //-------------------------------------------------------------------------------------------------------------------
    

    public static void registerModBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }


    /*
    Utility Functions
     */

    @SuppressWarnings("unused")
    public static void register() {
    }

    private static ToIntFunction<BlockState> getLuminanceValueLit(int luminanceLevel) {
        return (state) -> state.get(Properties.LIT) ? luminanceLevel : 0;
    }
}
