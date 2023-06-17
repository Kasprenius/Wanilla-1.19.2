package net.kas.wanilla.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kas.wanilla.block.*;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class ItemPlacement {
    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.addAfter(Blocks.OAK_SLAB,
                    WoodBlocks.ALIGNED_OAK_PLANKS, WoodBlocks.ALIGNED_OAK_PLANK_STAIRS, WoodBlocks.ALIGNED_OAK_PLANK_SLAB, WoodBlocks.MOSAIC_OAK_PLANKS, WoodBlocks.MOSAIC_OAK_PLANK_STAIRS, WoodBlocks.MOSAIC_OAK_PLANK_SLAB);
            entries.addAfter(Blocks.OAK_BUTTON, Hedges.OAK_HEDGE);
            entries.addAfter(Blocks.SPRUCE_SLAB,
                    WoodBlocks.ALIGNED_SPRUCE_PLANKS, WoodBlocks.ALIGNED_SPRUCE_PLANK_STAIRS, WoodBlocks.ALIGNED_SPRUCE_PLANK_SLAB, WoodBlocks.MOSAIC_SPRUCE_PLANKS, WoodBlocks.MOSAIC_SPRUCE_PLANK_STAIRS, WoodBlocks.MOSAIC_SPRUCE_PLANK_SLAB);
            entries.addAfter(Blocks.SPRUCE_BUTTON, Hedges.SPRUCE_HEDGE);
            entries.addAfter(Blocks.BIRCH_SLAB,
                    WoodBlocks.ALIGNED_BIRCH_PLANKS, WoodBlocks.ALIGNED_BIRCH_PLANK_STAIRS, WoodBlocks.ALIGNED_BIRCH_PLANK_SLAB, WoodBlocks.MOSAIC_BIRCH_PLANKS, WoodBlocks.MOSAIC_BIRCH_PLANK_STAIRS, WoodBlocks.MOSAIC_BIRCH_PLANK_SLAB);
            entries.addAfter(Blocks.BIRCH_BUTTON, Hedges.BIRCH_HEDGE);
            entries.addAfter(Blocks.JUNGLE_SLAB,
                    WoodBlocks.ALIGNED_JUNGLE_PLANKS, WoodBlocks.ALIGNED_JUNGLE_PLANK_STAIRS, WoodBlocks.ALIGNED_JUNGLE_PLANK_SLAB, WoodBlocks.MOSAIC_JUNGLE_PLANKS, WoodBlocks.MOSAIC_JUNGLE_PLANK_STAIRS, WoodBlocks.MOSAIC_JUNGLE_PLANK_SLAB);
            entries.addAfter(Blocks.JUNGLE_BUTTON, Hedges.JUNGLE_HEDGE);
            entries.addAfter(Blocks.ACACIA_SLAB,
                    WoodBlocks.ALIGNED_ACACIA_PLANKS, WoodBlocks.ALIGNED_ACACIA_PLANK_STAIRS, WoodBlocks.ALIGNED_ACACIA_PLANK_SLAB, WoodBlocks.MOSAIC_ACACIA_PLANKS, WoodBlocks.MOSAIC_ACACIA_PLANK_STAIRS, WoodBlocks.MOSAIC_ACACIA_PLANK_SLAB);
            entries.addAfter(Blocks.ACACIA_BUTTON, Hedges.ACACIA_HEDGE);
            entries.addAfter(Blocks.DARK_OAK_SLAB,
                    WoodBlocks.ALIGNED_DARK_OAK_PLANKS, WoodBlocks.ALIGNED_DARK_OAK_PLANK_STAIRS, WoodBlocks.ALIGNED_DARK_OAK_PLANK_SLAB, WoodBlocks.MOSAIC_DARK_OAK_PLANKS, WoodBlocks.MOSAIC_DARK_OAK_PLANK_STAIRS, WoodBlocks.MOSAIC_DARK_OAK_PLANK_SLAB);
            entries.addAfter(Blocks.DARK_OAK_BUTTON, Hedges.DARK_OAK_HEDGE);
            entries.addAfter(Blocks.MANGROVE_SLAB,
                    WoodBlocks.ALIGNED_MANGROVE_PLANKS, WoodBlocks.ALIGNED_MANGROVE_PLANK_STAIRS, WoodBlocks.ALIGNED_MANGROVE_PLANK_SLAB, WoodBlocks.MOSAIC_MANGROVE_PLANKS, WoodBlocks.MOSAIC_MANGROVE_PLANK_STAIRS, WoodBlocks.MOSAIC_MANGROVE_PLANK_SLAB);
            entries.addAfter(Blocks.MANGROVE_BUTTON, Hedges.MANGROVE_HEDGE);
            entries.addAfter(Blocks.CHERRY_SLAB,
                    WoodBlocks.ALIGNED_CHERRY_PLANKS, WoodBlocks.ALIGNED_CHERRY_PLANK_STAIRS, WoodBlocks.ALIGNED_CHERRY_PLANK_SLAB, WoodBlocks.MOSAIC_CHERRY_PLANKS, WoodBlocks.MOSAIC_CHERRY_PLANK_STAIRS, WoodBlocks.MOSAIC_CHERRY_PLANK_SLAB);
            entries.addAfter(Blocks.CHERRY_BUTTON, Hedges.CHERRY_HEDGE);
            entries.addAfter(Blocks.STRIPPED_BAMBOO_BLOCK, WoodBlocks.ALIGNED_BAMBOO_PLANK_STAIRS, WoodBlocks.ALIGNED_BAMBOO_PLANK_SLAB);
            entries.addAfter(Blocks.CRIMSON_SLAB,
                    WoodBlocks.ALIGNED_CRIMSON_PLANKS, WoodBlocks.ALIGNED_CRIMSON_PLANK_STAIRS, WoodBlocks.ALIGNED_CRIMSON_PLANK_SLAB, WoodBlocks.MOSAIC_CRIMSON_PLANKS, WoodBlocks.MOSAIC_CRIMSON_PLANK_STAIRS, WoodBlocks.MOSAIC_CRIMSON_PLANK_SLAB);
            entries.addAfter(Blocks.WARPED_SLAB,
                    WoodBlocks.ALIGNED_WARPED_PLANKS, WoodBlocks.ALIGNED_WARPED_PLANK_STAIRS, WoodBlocks.ALIGNED_WARPED_PLANK_SLAB, WoodBlocks.MOSAIC_WARPED_PLANKS, WoodBlocks.MOSAIC_WARPED_PLANK_STAIRS, WoodBlocks.MOSAIC_WARPED_PLANK_SLAB);

            entries.addAfter(Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_STAIRS, Blocks.BAMBOO_SLAB);

            entries.addAfter(Blocks.IRON_BLOCK,
                    IronBlocks.IRON_STAIRS, IronBlocks.IRON_SLAB, IronBlocks.IRON_WALL, IronBlocks.CUT_IRON, IronBlocks.CUT_IRON_STAIRS, IronBlocks.CUT_IRON_SLAB, IronBlocks.CUT_IRON_WALL, IronBlocks.BEVELED_IRON, IronBlocks.IRON_PILLAR, IronBlocks.IRON_TILE, IronBlocks.IRON_FENCE);
            entries.addAfter(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE,
                    IronBlocks.BIG_IRON_CHAIN, IronBlocks.IRON_CHAIN,
                    BlastIronBlocks.BLAST_IRON_BLOCK, BlastIronBlocks.BLAST_IRON_STAIRS, BlastIronBlocks.BLAST_IRON_SLAB, BlastIronBlocks.BLAST_IRON_WALL,
                    BlastIronBlocks.CUT_BLAST_IRON, BlastIronBlocks.CUT_BLAST_IRON_STAIRS, BlastIronBlocks.CUT_BLAST_IRON_SLAB, BlastIronBlocks.CUT_BLAST_IRON_WALL,
                    BlastIronBlocks.BEVELED_BLAST_IRON, BlastIronBlocks.BLAST_IRON_TILE, BlastIronBlocks.BLAST_IRON_BARS, BlastIronBlocks.BLAST_IRON_DOOR, BlastIronBlocks.BIG_BLAST_IRON_CHAIN);
            entries.addAfter(Blocks.GOLD_BLOCK,
                    GoldBlocks.GOLD_STAIRS, GoldBlocks.GOLD_SLAB, GoldBlocks.GOLD_WALL, GoldBlocks.CUT_GOLD, GoldBlocks.CUT_GOLD_STAIRS, GoldBlocks.CUT_GOLD_SLAB, GoldBlocks.CUT_GOLD_WALL,
                    GoldBlocks.GOLD_BRICKS, GoldBlocks.GOLD_BRICK_SLAB, GoldBlocks.GOLD_BRICK_WALL, GoldBlocks.BEVELED_GOLD, GoldBlocks.GOLD_PILLAR, GoldBlocks.GOLD_TILE,
                    GoldBlocks.GOLD_FENCE, GoldBlocks.GOLD_BARS, GoldBlocks.GOLD_DOOR);
            entries.addAfter(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE,
                    GoldBlocks.BIG_GOLD_CHAIN, GoldBlocks.GOLD_CHAIN);
            entries.addAfter(GoldBlocks.GOLD_CHAIN,
                    NetheriteBlocks.RAW_NETHERITE_BLOCK, NetheriteBlocks.RAW_NETHERITE_STAIRS, NetheriteBlocks.RAW_NETHERITE_SLAB, NetheriteBlocks.RAW_NETHERITE_WALL,
                    Blocks.NETHERITE_BLOCK, NetheriteBlocks.NETHERITE_STAIRS, NetheriteBlocks.NETHERITE_SLAB, NetheriteBlocks.NETHERITE_WALL, NetheriteBlocks.BEVELED_NETHERITE, NetheriteBlocks.NETHERITE_TILE,
                    NetheriteBlocks.NETHERITE_BARS, NetheriteBlocks.BIG_NETHERITE_CHAIN, NetheriteBlocks.NETHERITE_CHAIN);
            entries.addAfter(NetheriteBlocks.NETHERITE_CHAIN,
                    Blocks.AMETHYST_BLOCK, AmethystBlocks.AMETHYST_STAIRS, AmethystBlocks.AMETHYST_SLAB, AmethystBlocks.AMETHYST_WALL, AmethystBlocks.MELTED_AMETHYST,
                    AmethystBlocks.POLISHED_AMETHYST, AmethystBlocks.POLISHED_AMETHYST_STAIRS, AmethystBlocks.POLISHED_AMETHYST_SLAB, AmethystBlocks.POLISHED_AMETHYST_WALL,
                    AmethystBlocks.AMETHYST_BRICKS, AmethystBlocks.AMETHYST_BRICKS_STAIRS, AmethystBlocks.AMETHYST_BRICK_SLAB, AmethystBlocks.AMETHYST_BRICK_WALL,
                    AmethystBlocks.CHISELED_AMETHYST, AmethystBlocks.CARVED_AMETHYST, AmethystBlocks.AMETHYST_PILLAR, AmethystBlocks.AMETHYST_TILE);
            entries.addAfter(AmethystBlocks.AMETHYST_TILE,
                    DiamondBlocks.RAW_DIAMOND_BLOCK, DiamondBlocks.RAW_DIAMOND_STAIRS, DiamondBlocks.RAW_DIAMOND_SLAB, DiamondBlocks.RAW_DIAMOND_WALL,
                    Blocks.DIAMOND_BLOCK, DiamondBlocks.DIAMOND_STAIRS, DiamondBlocks.DIAMOND_SLAB, DiamondBlocks.DIAMOND_WALL,
                    DiamondBlocks.DIAMOND_BRICKS, DiamondBlocks.DIAMOND_BRICK_SLAB, DiamondBlocks.DIAMOND_BRICK_WALL,
                    DiamondBlocks.BEVELED_DIAMOND, DiamondBlocks.DIAMOND_PILLAR, DiamondBlocks.DIAMOND_TILE);
            entries.addAfter(DiamondBlocks.DIAMOND_TILE,
                    EmeraldBlocks.RAW_EMERALD_BLOCK, EmeraldBlocks.RAW_EMERALD_STAIRS, EmeraldBlocks.RAW_EMERALD_SLAB, EmeraldBlocks.RAW_EMERALD_WALL,
                    Blocks.EMERALD_BLOCK, EmeraldBlocks.EMERALD_STAIRS, EmeraldBlocks.EMERALD_SLAB, EmeraldBlocks.EMERALD_WALL,
                    EmeraldBlocks.CUT_EMERALD, EmeraldBlocks.CUT_EMERALD_STAIRS, EmeraldBlocks.CUT_EMERALD_SLAB, EmeraldBlocks.CUT_EMERALD_WALL,
                    EmeraldBlocks.BEVELED_EMERALD, EmeraldBlocks.EMERALD_PILLAR, EmeraldBlocks.EMERALD_TILE);
            entries.addAfter(EmeraldBlocks.EMERALD_TILE,
                    RubyBlocks.RAW_RUBY_BLOCK, RubyBlocks.RAW_RUBY_STAIRS, RubyBlocks.RAW_RUBY_SLAB, RubyBlocks.RAW_RUBY_WALL,
                    RubyBlocks.RUBY_BLOCK, RubyBlocks.RUBY_STAIRS, RubyBlocks.RUBY_SLAB, RubyBlocks.RUBY_WALL,
                    RubyBlocks.CUT_RUBY, RubyBlocks.CUT_RUBY_STAIRS, RubyBlocks.CUT_RUBY_SLAB, RubyBlocks.CUT_RUBY_WALL,
                    RubyBlocks.BEVELED_RUBY, RubyBlocks.RUBY_PILLAR, RubyBlocks.RUBY_TILE,
                    Blocks.LAPIS_BLOCK, MiscShinyStuff.LAPIS_TILE);

            entries.addAfter(Blocks.REINFORCED_DEEPSLATE, ReinforcedDeepslateBlocks.REINFORCED_DEEPSLATE, ReinforcedDeepslateBlocks.REINFORCED_DEEPSLATE_STAIRS,
                    ReinforcedDeepslateBlocks.REINFORCED_DEEPSLATE_SLAB, ReinforcedDeepslateBlocks.REINFORCED_DEEPSLATE_PILLAR, ReinforcedDeepslateBlocks.REINFORCED_DEEPSLATE_WALL);

            entries.addAfter(Blocks.MOSSY_COBBLESTONE_WALL, StoneBlocks.POLISHED_STONE, StoneBlocks.POLISHED_STONE_STAIRS, StoneBlocks.POLISHED_STONE_SLAB, StoneBlocks.POLISHED_STONE_WALL);
            entries.addAfter(Blocks.SMOOTH_STONE_SLAB, StoneBlocks.CUT_STONE, StoneBlocks.CUT_STONE_STAIRS, StoneBlocks.CUT_STONE_SLAB, StoneBlocks.CUT_STONE_WALL);
            entries.addAfter(Blocks.MOSSY_STONE_BRICK_WALL, Blocks.CHISELED_STONE_BRICKS, StoneBlocks.STONE_PILLAR);

            entries.addAfter(Blocks.POLISHED_ANDESITE_SLAB, Blocks.CALCITE, StoneBlocks.CALCITE_STAIRS, StoneBlocks.CALCITE_SLAB, StoneBlocks.CALCITE_WALL,
                    StoneBlocks.POLISHED_CALCITE, StoneBlocks.POLISHED_CALCITE_STAIRS, StoneBlocks.POLISHED_CALCITE_SLAB, StoneBlocks.POLISHED_CALCITE_WALL,
                    StoneBlocks.CALCITE_BRICKS, StoneBlocks.CALCITE_BRICK_STAIRS, StoneBlocks.CALCITE_BRICK_SLAB, StoneBlocks.CALCITE_BRICK_WALL);

            entries.addAfter(Blocks.SANDSTONE_WALL, StoneBlocks.POLISHED_SANDSTONE, StoneBlocks.POLISHED_SANDSTONE_STAIRS, StoneBlocks.POLISHED_SANDSTONE_SLAB, StoneBlocks.POLISHED_SANDSTONE_WALL,
                    Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_SANDSTONE_STAIRS, Blocks.SMOOTH_SANDSTONE_SLAB, StoneBlocks.SANDSTONE_BRICKS, StoneBlocks.SANDSTONE_BRICK_STAIRS, StoneBlocks.SANDSTONE_BRICK_SLAB, StoneBlocks.SANDSTONE_BRICK_WALL,
                    Blocks.CUT_SANDSTONE, Blocks.CUT_SANDSTONE_SLAB, Blocks.CHISELED_SANDSTONE, StoneBlocks.SANDSTONE_PILLAR);

            entries.addAfter(Blocks.POLISHED_BLACKSTONE_BRICK_WALL, GlowBlocks.GLOWDUST_SAND, GlowBlocks.GLOWDUST, Blocks.GLOWSTONE, GlowBlocks.GLOWSTONE_STAIRS, GlowBlocks.GLOWSTONE_SLAB, GlowBlocks.GLOWSTONE_WALL,
                    GlowBlocks.POLISHED_GLOWSTONE, GlowBlocks.POLISHED_GLOWSTONE_STAIRS, GlowBlocks.POLISHED_GLOWSTONE_SLAB, GlowBlocks.POLISHED_GLOWSTONE_WALL,
                    GlowBlocks.GLOWSTONE_BRICKS, GlowBlocks.CRACKED_GLOWSTONE_BRICKS, GlowBlocks.GLOWSTONE_BRICK_STAIRS, GlowBlocks.GLOWSTONE_BRICK_SLAB, GlowBlocks.GLOWSTONE_BRICK_WALL,
                    GlowBlocks.CHISELED_GLOWSTONE_BRICKS, GlowBlocks.CARVED_GLOWSTONE_BRICKS,
                    GlowBlocks.DIMSTONE, GlowBlocks.DIMSTONE_STAIRS, GlowBlocks.DIMSTONE_SLAB, GlowBlocks.DIMSTONE_WALL,
                    GlowBlocks.POLISHED_DIMSTONE, GlowBlocks.POLISHED_DIMSTONE_STAIRS, GlowBlocks.POLISHED_DIMSTONE_SLAB, GlowBlocks.POLISHED_DIMSTONE_WALL,
                    GlowBlocks.DIMSTONE_BRICKS, GlowBlocks.CRACKED_DIMSTONE_BRICKS, GlowBlocks.DIMSTONE_BRICK_STAIRS, GlowBlocks.DIMSTONE_BRICK_SLAB, GlowBlocks.DIMSTONE_BRICK_WALL,
                    GlowBlocks.CHISELED_DIMSTONE_BRICKS,
                    GlowBlocks.DULLSTONE, GlowBlocks.DULLSTONE_STAIRS, GlowBlocks.DULLSTONE_SLAB, GlowBlocks.DULLSTONE_WALL,
                    GlowBlocks.POLISHED_DULLSTONE, GlowBlocks.POLISHED_DULLSTONE_STAIRS, GlowBlocks.POLISHED_DULLSTONE_SLAB, GlowBlocks.POLISHED_DULLSTONE_WALL,
                    GlowBlocks.DULLSTONE_BRICKS, GlowBlocks.CRACKED_DULLSTONE_BRICKS, GlowBlocks.DULLSTONE_BRICK_STAIRS, GlowBlocks.DULLSTONE_BRICK_SLAB, GlowBlocks.DULLSTONE_BRICK_WALL,
                    GlowBlocks.CHISELED_DULLSTONE_BRICKS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.addAfter(Blocks.PINK_WOOL, WoolBlocks.QUILTED_WHITE_WOOL, WoolBlocks.QUILTED_LIGHT_GRAY_WOOL, WoolBlocks.QUILTED_GRAY_WOOL, WoolBlocks.QUILTED_BLACK_WOOL,
                    WoolBlocks.QUILTED_BROWN_WOOL, WoolBlocks.QUILTED_RED_WOOL, WoolBlocks.QUILTED_ORANGE_WOOL, WoolBlocks.QUILTED_YELLOW_WOOL,
                    WoolBlocks.QUILTED_LIME_WOOL, WoolBlocks.QUILTED_GREEN_WOOL, WoolBlocks.QUILTED_CYAN_WOOL, WoolBlocks.QUILTED_LIGHT_BLUE_WOOL, WoolBlocks.QUILTED_BLUE_WOOL,
                    WoolBlocks.QUILTED_PURPLE_WOOL, WoolBlocks.QUILTED_MAGENTA_WOOL, WoolBlocks.QUILTED_PINK_WOOL,

                    WoolBlocks.NAPPED_WHITE_WOOL, WoolBlocks.NAPPED_LIGHT_GRAY_WOOL, WoolBlocks.NAPPED_GRAY_WOOL, WoolBlocks.NAPPED_BLACK_WOOL,
                    WoolBlocks.NAPPED_BROWN_WOOL, WoolBlocks.NAPPED_RED_WOOL, WoolBlocks.NAPPED_ORANGE_WOOL, WoolBlocks.NAPPED_YELLOW_WOOL,
                    WoolBlocks.NAPPED_LIME_WOOL, WoolBlocks.NAPPED_GREEN_WOOL, WoolBlocks.NAPPED_CYAN_WOOL, WoolBlocks.NAPPED_LIGHT_BLUE_WOOL,
                    WoolBlocks.NAPPED_BLUE_WOOL, WoolBlocks.NAPPED_PURPLE_WOOL, WoolBlocks.NAPPED_MAGENTA_WOOL, WoolBlocks.NAPPED_PINK_WOOL);
            entries.addAfter(Blocks.WHITE_CONCRETE, ConcreteBlocks.WHITE_CONCRETE_STAIRS, ConcreteBlocks.WHITE_CONCRETE_SLAB, ConcreteBlocks.WHITE_CONCRETE_WALL,
                    Blocks.LIGHT_GRAY_CONCRETE, ConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS, ConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB, ConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL,
                    Blocks.GRAY_CONCRETE, ConcreteBlocks.GRAY_CONCRETE_STAIRS, ConcreteBlocks.GRAY_CONCRETE_SLAB, ConcreteBlocks.GRAY_CONCRETE_WALL,
                    Blocks.BLACK_CONCRETE, ConcreteBlocks.BLACK_CONCRETE_STAIRS, ConcreteBlocks.BLACK_CONCRETE_SLAB, ConcreteBlocks.BLACK_CONCRETE_WALL,
                    Blocks.BROWN_CONCRETE, ConcreteBlocks.BROWN_CONCRETE_STAIRS, ConcreteBlocks.BROWN_CONCRETE_SLAB, ConcreteBlocks.BROWN_CONCRETE_WALL,
                    Blocks.RED_CONCRETE, ConcreteBlocks.RED_CONCRETE_STAIRS, ConcreteBlocks.RED_CONCRETE_SLAB, ConcreteBlocks.RED_CONCRETE_WALL,
                    Blocks.ORANGE_CONCRETE, ConcreteBlocks.ORANGE_CONCRETE_STAIRS, ConcreteBlocks.ORANGE_CONCRETE_SLAB, ConcreteBlocks.ORANGE_CONCRETE_WALL,
                    Blocks.YELLOW_CONCRETE, ConcreteBlocks.YELLOW_CONCRETE_STAIRS, ConcreteBlocks.YELLOW_CONCRETE_SLAB, ConcreteBlocks.YELLOW_CONCRETE_WALL,
                    Blocks.LIME_CONCRETE, ConcreteBlocks.LIME_CONCRETE_STAIRS, ConcreteBlocks.LIME_CONCRETE_SLAB, ConcreteBlocks.LIME_CONCRETE_WALL,
                    Blocks.GREEN_CONCRETE, ConcreteBlocks.GREEN_CONCRETE_STAIRS, ConcreteBlocks.GREEN_CONCRETE_SLAB, ConcreteBlocks.GREEN_CONCRETE_WALL,
                    Blocks.CYAN_CONCRETE, ConcreteBlocks.CYAN_CONCRETE_STAIRS, ConcreteBlocks.CYAN_CONCRETE_SLAB, ConcreteBlocks.CYAN_CONCRETE_WALL,
                    Blocks.LIGHT_BLUE_CONCRETE, ConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS, ConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB, ConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL,
                    Blocks.BLUE_CONCRETE, ConcreteBlocks.BLUE_CONCRETE_STAIRS, ConcreteBlocks.BLUE_CONCRETE_SLAB, ConcreteBlocks.BLUE_CONCRETE_WALL,
                    Blocks.PURPLE_CONCRETE, ConcreteBlocks.PURPLE_CONCRETE_STAIRS, ConcreteBlocks.PURPLE_CONCRETE_SLAB, ConcreteBlocks.PURPLE_CONCRETE_WALL,
                    Blocks.MAGENTA_CONCRETE, ConcreteBlocks.MAGENTA_CONCRETE_STAIRS, ConcreteBlocks.MAGENTA_CONCRETE_SLAB, ConcreteBlocks.MAGENTA_CONCRETE_WALL,
                    Blocks.PINK_CONCRETE, ConcreteBlocks.PINK_CONCRETE_STAIRS, ConcreteBlocks.PINK_CONCRETE_SLAB, ConcreteBlocks.PINK_CONCRETE_WALL);
            entries.addAfter(Blocks.PINK_STAINED_GLASS_PANE, GlassBlocks.GLASS_FLOOR, GlassBlocks.WHITE_STAINED_GLASS_FLOOR, GlassBlocks.LIGHT_GRAY_STAINED_GLASS_FLOOR, GlassBlocks.GRAY_STAINED_GLASS_FLOOR,
                    GlassBlocks.BLACK_STAINED_GLASS_FLOOR, GlassBlocks.BROWN_STAINED_GLASS_FLOOR, GlassBlocks.RED_STAINED_GLASS_FLOOR, GlassBlocks.ORANGE_STAINED_GLASS_FLOOR, GlassBlocks.YELLOW_STAINED_GLASS_FLOOR,
                    GlassBlocks.LIME_STAINED_GLASS_FLOOR, GlassBlocks.GREEN_STAINED_GLASS_FLOOR, GlassBlocks.CYAN_STAINED_GLASS_FLOOR, GlassBlocks.LIGHT_BLUE_STAINED_GLASS_FLOOR, GlassBlocks.BLUE_STAINED_GLASS_FLOOR,
                    GlassBlocks.PURPLE_STAINED_GLASS_FLOOR, GlassBlocks.MAGENTA_STAINED_GLASS_FLOOR, GlassBlocks.PINK_STAINED_GLASS_FLOOR,

                    GlassBlocks.GLASS_WALL, GlassBlocks.WHITE_STAINED_GLASS_WALL, GlassBlocks.LIGHT_GRAY_STAINED_GLASS_WALL, GlassBlocks.GRAY_STAINED_GLASS_WALL,
                    GlassBlocks.BLACK_STAINED_GLASS_WALL, GlassBlocks.BROWN_STAINED_GLASS_WALL, GlassBlocks.RED_STAINED_GLASS_WALL, GlassBlocks.ORANGE_STAINED_GLASS_WALL, GlassBlocks.YELLOW_STAINED_GLASS_WALL,
                    GlassBlocks.LIME_STAINED_GLASS_WALL, GlassBlocks.GREEN_STAINED_GLASS_WALL, GlassBlocks.CYAN_STAINED_GLASS_WALL, GlassBlocks.LIGHT_BLUE_STAINED_GLASS_WALL, GlassBlocks.BLUE_STAINED_GLASS_WALL,
                    GlassBlocks.PURPLE_STAINED_GLASS_WALL, GlassBlocks.MAGENTA_STAINED_GLASS_WALL, GlassBlocks.PINK_STAINED_GLASS_WALL
                    );
            entries.addAfter(Blocks.PINK_SHULKER_BOX, Blocks.SLIME_BLOCK, SlimeHoneyBlocks.WHITE_SLIME_BLOCK, SlimeHoneyBlocks.LIGHT_GRAY_SLIME_BLOCK, SlimeHoneyBlocks.GRAY_SLIME_BLOCK,
                    SlimeHoneyBlocks.BLACK_SLIME_BLOCK, SlimeHoneyBlocks.BROWN_SLIME_BLOCK, SlimeHoneyBlocks.RED_SLIME_BLOCK, SlimeHoneyBlocks.ORANGE_SLIME_BLOCK, SlimeHoneyBlocks.YELLOW_SLIME_BLOCK,
                    SlimeHoneyBlocks.LIME_SLIME_BLOCK, SlimeHoneyBlocks.GREEN_SLIME_BLOCK, SlimeHoneyBlocks.CYAN_SLIME_BLOCK, SlimeHoneyBlocks.LIGHT_BLUE_SLIME_BLOCK, SlimeHoneyBlocks.BLUE_SLIME_BLOCK,
                    SlimeHoneyBlocks.PURPLE_SLIME_BLOCK, SlimeHoneyBlocks.MAGENTA_SLIME_BLOCK, SlimeHoneyBlocks.PINK_SLIME_BLOCK,

                    Blocks.HONEY_BLOCK, SlimeHoneyBlocks.WHITE_HONEY_BLOCK, SlimeHoneyBlocks.LIGHT_GRAY_HONEY_BLOCK, SlimeHoneyBlocks.GRAY_HONEY_BLOCK,
                    SlimeHoneyBlocks.BLACK_HONEY_BLOCK, SlimeHoneyBlocks.BROWN_HONEY_BLOCK, SlimeHoneyBlocks.RED_HONEY_BLOCK, SlimeHoneyBlocks.ORANGE_HONEY_BLOCK, SlimeHoneyBlocks.YELLOW_HONEY_BLOCK,
                    SlimeHoneyBlocks.LIME_HONEY_BLOCK, SlimeHoneyBlocks.GREEN_HONEY_BLOCK, SlimeHoneyBlocks.CYAN_HONEY_BLOCK, SlimeHoneyBlocks.LIGHT_BLUE_HONEY_BLOCK, SlimeHoneyBlocks.BLUE_HONEY_BLOCK,
                    SlimeHoneyBlocks.PURPLE_HONEY_BLOCK, SlimeHoneyBlocks.MAGENTA_HONEY_BLOCK, SlimeHoneyBlocks.PINK_HONEY_BLOCK
                    );
            entries.addAfter(Blocks.PINK_BANNER, EndlightBlocks.CONDENSED_ENDLIGHT, EndlightBlocks.CONDENSED_VOIDLIGHT, EndlightBlocks.LIGHT_GRAY_CONDENSED_ENDLIGHT, EndlightBlocks.GRAY_CONDENSED_ENDLIGHT, EndlightBlocks.BROWN_CONDENSED_ENDLIGHT,
                    EndlightBlocks.RED_CONDENSED_ENDLIGHT, EndlightBlocks.ORANGE_CONDENSED_ENDLIGHT, EndlightBlocks.YELLOW_CONDENSED_ENDLIGHT, EndlightBlocks.LIME_CONDENSED_ENDLIGHT, EndlightBlocks.GREEN_CONDENSED_ENDLIGHT,
                    EndlightBlocks.CYAN_CONDENSED_ENDLIGHT, EndlightBlocks.LIGHT_BLUE_CONDENSED_ENDLIGHT, EndlightBlocks.BLUE_CONDENSED_ENDLIGHT, EndlightBlocks.PURPLE_CONDENSED_ENDLIGHT, EndlightBlocks.MAGENTA_CONDENSED_ENDLIGHT,
                    EndlightBlocks. PINK_CONDENSED_ENDLIGHT,

                    Blocks.END_ROD, EndRods.WHITE_END_ROD, EndRods.LIGHT_GRAY_END_ROD, EndRods.GRAY_END_ROD, EndRods.BLACK_END_ROD, EndRods.BROWN_END_ROD, EndRods.RED_END_ROD,
                    EndRods.ORANGE_END_ROD, EndRods.YELLOW_END_ROD, EndRods.LIME_END_ROD, EndRods.GREEN_END_ROD, EndRods.CYAN_END_ROD, EndRods.LIGHT_BLUE_END_ROD, EndRods.BLUE_END_ROD,
                    EndRods.PURPLE_END_ROD, EndRods.MAGENTA_END_ROD, EndRods.PINK_END_ROD);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
                    entries.addAfter(Blocks.SHROOMLIGHT, Hedges.OAK_HEDGE,
                            Hedges.SPRUCE_HEDGE,
                            Hedges.BIRCH_HEDGE,
                            Hedges.JUNGLE_HEDGE,
                            Hedges.ACACIA_HEDGE,
                            Hedges.DARK_OAK_HEDGE,
                            Hedges.MANGROVE_HEDGE,
                            Hedges.CHERRY_HEDGE,
                            Hedges.AZALEA_HEDGE,
                            Hedges.FLOWERING_AZALEA_HEDGE);
                    entries.addAfter(Blocks.DEEPSLATE_COAL_ORE, Blocks.COPPER_ORE, Blocks.DEEPSLATE_COPPER_ORE, Blocks.IRON_ORE, Blocks.DEEPSLATE_IRON_ORE,
                            Blocks.GOLD_ORE, Blocks.DEEPSLATE_GOLD_ORE, Blocks.DIAMOND_ORE, Blocks.DEEPSLATE_DIAMOND_ORE, Blocks.EMERALD_ORE, Blocks.DEEPSLATE_EMERALD_ORE,
                            RubyBlocks.DEEPSLATE_RUBY_ORE,
                            Blocks.LAPIS_ORE, Blocks.DEEPSLATE_LAPIS_ORE);
                    entries.addAfter(Blocks.RAW_COPPER_BLOCK, Blocks.RAW_IRON_BLOCK, Blocks.RAW_GOLD_BLOCK, NetheriteBlocks.RAW_NETHERITE_BLOCK, DiamondBlocks.RAW_DIAMOND_BLOCK, EmeraldBlocks.RAW_EMERALD_BLOCK, RubyBlocks.RAW_RUBY_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.addAfter(Blocks.SOUL_LANTERN, GlowBlocks.GLOW_LANTERN, EndlightBlocks.ENDLIGHT_LANTERN, IronBlocks.IRON_CHAIN, IronBlocks.BIG_IRON_CHAIN);
            entries.addAfter(Blocks.CHAIN, BlastIronBlocks.BIG_BLAST_IRON_CHAIN, GoldBlocks.GOLD_CHAIN, GoldBlocks.BIG_GOLD_CHAIN, NetheriteBlocks.NETHERITE_CHAIN, NetheriteBlocks.BIG_NETHERITE_CHAIN);
            entries.addAfter(Blocks.PEARLESCENT_FROGLIGHT, LanternBlocks.LARGE_IRON_LANTERN, LanternBlocks.LARGE_IRON_SOUL_LANTERN, LanternBlocks.LARGE_IRON_GLOW_LANTERN,
                    LanternBlocks.LARGE_IRON_ENDER_LANTERN, LanternBlocks.LARGE_IRON_AMETHYST_LANTERN,LanternBlocks.LARGE_IRON_REDSTONE_LANTERN,
                    LanternBlocks.LARGE_BLAST_IRON_LANTERN, LanternBlocks.LARGE_BLAST_IRON_SOUL_LANTERN, LanternBlocks.LARGE_BLAST_IRON_GLOW_LANTERN,
                    LanternBlocks.LARGE_BLAST_IRON_ENDER_LANTERN, LanternBlocks.LARGE_BLAST_IRON_AMETHYST_LANTERN,LanternBlocks.LARGE_BLAST_IRON_REDSTONE_LANTERN,
                    LanternBlocks.LARGE_GOLD_LANTERN, LanternBlocks.LARGE_GOLD_SOUL_LANTERN, LanternBlocks.LARGE_GOLD_GLOW_LANTERN, 
                    LanternBlocks.LARGE_GOLD_ENDER_LANTERN, LanternBlocks.LARGE_GOLD_AMETHYST_LANTERN, LanternBlocks.LARGE_GOLD_REDSTONE_LANTERN,
                    LanternBlocks.LARGE_NETHERITE_LANTERN, LanternBlocks.LARGE_NETHERITE_SOUL_LANTERN, LanternBlocks.LARGE_NETHERITE_GLOW_LANTERN,
                    LanternBlocks.LARGE_NETHERITE_ENDER_LANTERN, LanternBlocks.LARGE_NETHERITE_AMETHYST_LANTERN, LanternBlocks.LARGE_NETHERITE_REDSTONE_LANTERN);
            entries.addAfter(Blocks.FURNACE, MiscStuff.DEEPSLATE_FURNACE);
            entries.addAfter(Blocks.SOUL_CAMPFIRE, GlowBlocks.GLOW_CAMPFIRE);
            entries.addAfter(Blocks.ENCHANTING_TABLE, MiscStuff.INFUSION_TABLE);
            entries.addAfter(Blocks.CHISELED_BOOKSHELF,
                    ChiseledBookshelfBlocks.SPRUCE_CHISELED_BOOKSHELF, ChiseledBookshelfBlocks.BIRCH_CHISELED_BOOKSHELF, ChiseledBookshelfBlocks.JUNGLE_CHISELED_BOOKSHELF,
                    ChiseledBookshelfBlocks.ACACIA_CHISELED_BOOKSHELF, ChiseledBookshelfBlocks.DARK_OAK_CHISELED_BOOKSHELF, ChiseledBookshelfBlocks.MANGROVE_CHISELED_BOOKSHELF, ChiseledBookshelfBlocks.CHERRY_CHISELED_BOOKSHELF,
                    ChiseledBookshelfBlocks.BAMBOO_CHISELED_BOOKSHELF, ChiseledBookshelfBlocks.CRIMSON_CHISELED_BOOKSHELF, ChiseledBookshelfBlocks.WARPED_CHISELED_BOOKSHELF, ChiseledBookshelfBlocks.GOLD_CHISELED_BOOKSHELF);
            entries.addAfter(Blocks.TINTED_GLASS, GlowGlassBlocks.GLOW_GLASS, GlowGlassBlocks.GLOW_GLASS_STAIRS, GlowGlassBlocks.GLOW_GLASS_SLAB, GlowGlassBlocks.GLOW_GLASS_PANE, GlowGlassBlocks.GLOW_GLASS_FLOOR, GlowGlassBlocks.GLOW_GLASS_WALL);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.addAfter(Items.IRON_HOE, ModItems.BLAST_IRON_SHOVEL, ModItems.BLAST_IRON_PICKAXE, ModItems.BLAST_IRON_AXE, ModItems.BLAST_IRON_HOE);
            entries.addAfter(Items.MILK_BUCKET, ModItems.EMPTY_GLASS_JAR, ModItems.ENDLIGHT_GLASS_JAR, ModItems.VOIDLIGHT_GLASS_JAR, ModItems.ALLAY_GLASS_JAR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.addAfter(Items.IRON_SWORD, ModItems.BLAST_IRON_SWORD);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.addAfter(Items.ENCHANTED_GOLDEN_APPLE, ModItems.NETHERITE_APPLE, ModItems.AMETHYST_APPLE, ModItems.DIAMOND_APPLE, ModItems.EMERALD_APPLE, ModItems.RUBY_APPLE, ModItems.LAPIS_APPLE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.addAfter(Items.RAW_GOLD, Items.DIAMOND);
            entries.addAfter(Items.EMERALD, ModItems.RUBY);
            entries.addAfter(Items.GLASS_BOTTLE, ModItems.EMPTY_GLASS_JAR);
            entries.addAfter(Items.GUNPOWDER, Items.GLOWSTONE_DUST, GlowBlocks.GLOWSTONES);
        });
    }
}
