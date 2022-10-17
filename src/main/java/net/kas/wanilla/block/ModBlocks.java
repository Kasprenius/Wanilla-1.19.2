package net.kas.wanilla.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.AbstractStoneButtonBlock;
import net.kas.wanilla.block.templates.GlowdustBlock;
import net.kas.wanilla.block.templates.Glowstones;
import net.kas.wanilla.item.ModItemGroup;
import net.kas.wanilla.registry.IEBlockSoundGroups;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.ToIntFunction;

public class ModBlocks {
    /*
    Base Set
     */
    public static final Block DIMSTONE = registerBlock("dimstone",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3F).sounds(IEBlockSoundGroups.DIMSTONE).luminance(12)),
            ModItemGroup.WANILLA);
    public static final Block DULLSTONE = registerBlock("dullstone",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3F).sounds(IEBlockSoundGroups.DULLSTONE)),
            ModItemGroup.WANILLA);

    /*
    Smooth Base Set
     */
    public static final Block SMOOTH_GLOWSTONE = registerBlock("smooth_glowstone",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(1.5F, 6.0F).sounds(BlockSoundGroup.GLASS).requiresTool().luminance(15)),
            ModItemGroup.WANILLA);
    public static final Block SMOOTH_DIMSTONE = registerBlock("smooth_dimstone",
            new Block(FabricBlockSettings.copy(DIMSTONE).strength(1.5F, 6.0F).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block SMOOTH_DULLSTONE = registerBlock("smooth_dullstone",
            new Block(FabricBlockSettings.copy(DULLSTONE).strength(1.5F, 6.0F).requiresTool()),
            ModItemGroup.WANILLA);

    /*
    Brick Base Set
     */
    public static final Block GLOWSTONE_BRICKS = registerBlock("glowstone_bricks",
            new Block(FabricBlockSettings.copy(SMOOTH_GLOWSTONE).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block DIMSTONE_BRICKS = registerBlock("dimstone_bricks",
            new Block(FabricBlockSettings.copy(SMOOTH_DIMSTONE).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block DULLSTONE_BRICKS = registerBlock("dullstone_bricks",
            new Block(FabricBlockSettings.copy(SMOOTH_DULLSTONE).requiresTool()),
            ModItemGroup.WANILLA);


    /*
    Cracked Brick Base Set
     */
    public static final Block CRACKED_GLOWSTONE_BRICKS = registerBlock("cracked_glowstone_bricks",
            new Block(FabricBlockSettings.copy(SMOOTH_GLOWSTONE).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block CRACKED_DIMSTONE_BRICKS = registerBlock("cracked_dimstone_bricks",
            new Block(FabricBlockSettings.copy(SMOOTH_DIMSTONE).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block CRACKED_DULLSTONE_BRICKS = registerBlock("cracked_dullstone_bricks",
            new Block(FabricBlockSettings.copy(SMOOTH_DULLSTONE).requiresTool()),
            ModItemGroup.WANILLA);

    /*
    Chiseled Brick Base Set
     */
    public static final Block CHISELED_GLOWSTONE_BRICKS = registerBlock("chiseled_glowstone_bricks",
            new Block(FabricBlockSettings.copy(SMOOTH_GLOWSTONE).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block CHISELED_DIMSTONE_BRICKS = registerBlock("chiseled_dimstone_bricks",
            new Block(FabricBlockSettings.copy(SMOOTH_DIMSTONE).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block CHISELED_DULLSTONE_BRICKS = registerBlock("chiseled_dullstone_bricks",
            new Block(FabricBlockSettings.copy(SMOOTH_DULLSTONE).requiresTool()),
            ModItemGroup.WANILLA);

    /*
    Carved Brick Base Set
    */
    public static final Block CARVED_GLOWSTONE_BRICKS = registerBlock("carved_glowstone_bricks",
            new Block(FabricBlockSettings.copy(GLOWSTONE_BRICKS).requiresTool()),
            ModItemGroup.WANILLA);

    /*
    Smooth Glowstone Set
     */
    public static final Block SMOOTH_GLOWSTONE_SLAB = registerBlock("smooth_glowstone_slab",
            new SlabBlock(FabricBlockSettings.copy(SMOOTH_GLOWSTONE).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block SMOOTH_GLOWSTONE_STAIRS = registerBlock("smooth_glowstone_stairs",
            new StairsBlock(SMOOTH_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_GLOWSTONE).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block SMOOTH_GLOWSTONE_WALL = registerBlock("smooth_glowstone_wall",
            new WallBlock(FabricBlockSettings.copy(GLOWSTONE_BRICKS).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block SMOOTH_GLOWSTONE_BUTTON = registerBlock("smooth_glowstone_button",
            new AbstractStoneButtonBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.5F, 0.5F).sounds(BlockSoundGroup.GLASS).luminance(15).noCollision()),
            ModItemGroup.WANILLA);

    /*
    Smooth Dimstone Set
     */
    public static final Block SMOOTH_DIMSTONE_SLAB = registerBlock("smooth_dimstone_slab",
            new SlabBlock(FabricBlockSettings.copy(SMOOTH_DIMSTONE).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block SMOOTH_DIMSTONE_STAIRS = registerBlock("smooth_dimstone_stairs",
            new StairsBlock(SMOOTH_DIMSTONE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_DIMSTONE).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block SMOOTH_DIMSTONE_WALL = registerBlock("smooth_dimstone_wall",
            new WallBlock(FabricBlockSettings.copy(DIMSTONE_BRICKS).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block SMOOTH_DIMSTONE_BUTTON = registerBlock("smooth_dimstone_button",
            new AbstractStoneButtonBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.5F, 0.5F).sounds(BlockSoundGroup.GLASS).luminance(12).noCollision()),
            ModItemGroup.WANILLA);

    /*
    Smooth Dullstone Set
     */
    public static final Block SMOOTH_DULLSTONE_SLAB = registerBlock("smooth_dullstone_slab",
            new SlabBlock(FabricBlockSettings.copy(SMOOTH_DULLSTONE).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block SMOOTH_DULLSTONE_STAIRS = registerBlock("smooth_dullstone_stairs",
            new StairsBlock(SMOOTH_DULLSTONE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_DULLSTONE).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block SMOOTH_DULLSTONE_WALL = registerBlock("smooth_dullstone_wall",
            new WallBlock(FabricBlockSettings.copy(DULLSTONE_BRICKS).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block SMOOTH_DULLSTONE_BUTTON = registerBlock("smooth_dullstone_button",
            new AbstractStoneButtonBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.5F, 0.5F).sounds(IEBlockSoundGroups.DULLSTONE).noCollision()),
            ModItemGroup.WANILLA);

    /*
    Glowstone Brick Set
     */
    public static final Block GLOWSTONE_BRICK_SLAB = registerBlock("glowstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(GLOWSTONE_BRICKS).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block GLOWSTONE_BRICK_STAIRS = registerBlock("glowstone_brick_stairs",
            new StairsBlock(GLOWSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(GLOWSTONE_BRICKS).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block GLOWSTONE_BRICK_WALL = registerBlock("glowstone_brick_wall",
            new WallBlock(FabricBlockSettings.copy(GLOWSTONE_BRICKS).requiresTool()),
            ModItemGroup.WANILLA);

    /*
    Dimstone Brick Set
     */
    public static final Block DIMSTONE_BRICK_SLAB = registerBlock("dimstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(DIMSTONE_BRICKS).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block DIMSTONE_BRICK_STAIRS = registerBlock("dimstone_brick_stairs",
            new StairsBlock(DIMSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(DIMSTONE_BRICKS).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block DIMSTONE_BRICK_WALL = registerBlock("dimstone_brick_wall",
            new WallBlock(FabricBlockSettings.copy(DIMSTONE_BRICKS).requiresTool()),
            ModItemGroup.WANILLA);

    /*
    Dullstone Brick Set
     */
    public static final Block DULLSTONE_BRICK_SLAB = registerBlock("dullstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(DULLSTONE_BRICKS).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block DULLSTONE_BRICK_STAIRS = registerBlock("dullstone_brick_stairs",
            new StairsBlock(DULLSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(DULLSTONE_BRICKS).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block DULLSTONE_BRICK_WALL = registerBlock("dullstone_brick_wall",
            new WallBlock(FabricBlockSettings.copy(DULLSTONE_BRICKS).requiresTool()),
            ModItemGroup.WANILLA);

    /*
    More Defaults
     */
    public static final Block GLOWSTONE_SLAB = registerBlock("glowstone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3F).sounds(BlockSoundGroup.GLASS).luminance(15)),
            ModItemGroup.WANILLA);
    public static final Block GLOWSTONE_STAIRS = registerBlock("glowstone_stairs",
            new StairsBlock(GLOWSTONE_SLAB.getDefaultState(), FabricBlockSettings.copy(GLOWSTONE_SLAB)),
            ModItemGroup.WANILLA);
    public static final Block GLOWSTONE_WALL = registerBlock("glowstone_wall",
            new WallBlock(FabricBlockSettings.copy(GLOWSTONE_SLAB)),
            ModItemGroup.WANILLA);
    public static final Block DIMSTONE_SLAB = registerBlock("dimstone_slab",
            new SlabBlock(FabricBlockSettings.copy(DIMSTONE)),
            ModItemGroup.WANILLA);
    public static final Block DIMSTONE_STAIRS = registerBlock("dimstone_stairs",
            new StairsBlock(DIMSTONE.getDefaultState(), FabricBlockSettings.copy(DIMSTONE)),
            ModItemGroup.WANILLA);
    public static final Block DIMSTONE_WALL = registerBlock("dimstone_wall",
            new WallBlock(FabricBlockSettings.copy(DIMSTONE)),
            ModItemGroup.WANILLA);
    public static final Block DULLSTONE_SLAB = registerBlock("dullstone_slab",
            new SlabBlock(FabricBlockSettings.copy(DULLSTONE)),
            ModItemGroup.WANILLA);
    public static final Block DULLSTONE_STAIRS = registerBlock("dullstone_stairs",
            new StairsBlock(DULLSTONE.getDefaultState(), FabricBlockSettings.copy(DULLSTONE)),
            ModItemGroup.WANILLA);
    public static final Block DULLSTONE_WALL = registerBlock("dullstone_wall",
            new WallBlock(FabricBlockSettings.copy(DULLSTONE)),
            ModItemGroup.WANILLA);


    /*
    Glowdust Set
     */
    public static final Block GLOWDUST_SAND = registerBlock("glowdust_sand",
            new SandBlock(0xFFC267, FabricBlockSettings.of(Material.SNOW_BLOCK, MapColor.PALE_YELLOW).strength(0.2F, 0.2F).luminance(4).sounds(BlockSoundGroup.SAND)),
            ModItemGroup.WANILLA);
    public static final Block GLOWDUST = registerBlock("glowdust",
            new GlowdustBlock(FabricBlockSettings.of(Material.SNOW_BLOCK, MapColor.PALE_YELLOW).strength(0.2F, 0.2F).sounds(BlockSoundGroup.SAND)),
            ModItemGroup.WANILLA);
    /*
    Glow Set
     */
    public static final Block GLOW_LANTERN = registerBlock("glow_lantern",
            new LanternBlock(FabricBlockSettings.copy(Blocks.LANTERN).requiresTool()),
            ModItemGroup.WANILLA);
    public static final Block GLOW_CAMPFIRE = registerBlock("glow_campfire",
            new CampfireBlock(false, 0, FabricBlockSettings.copy(Blocks.CAMPFIRE)),
            ModItemGroup.WANILLA);
    /*
    public static final Block GLOW_FIRE = registerBlock("glow_fire",
            new GlowFireBlock(FabricBlockSettings.copy(Blocks.FIRE)),
            ModItemGroup.WANILLA);

     */


    public static final Block GLOWSTONES = registerBlock("glowstones",
            new Glowstones(FabricBlockSettings.copy(Blocks.CANDLE).luminance(Glowstones.STATE_TO_LUMINANCE)),
            ModItemGroup.WANILLA);





    public static final Block POLISHED_STONE_PILLAR = registerBlock("polished_stone_pillar",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STONE).requiresTool()),
            ModItemGroup.WANILLA);


    //-------------------------------------------------------------------------------------------------------------------

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Wanilla.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Wanilla.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

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
