package net.kas.wanilla;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.kas.wanilla.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class WanillaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FabricLoader instance = FabricLoader.getInstance();

        instance.getModContainer("wanilla").ifPresent(modContainer -> {
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("wanilla:3drdw"),  modContainer, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("wanilla:bestdoors"),  modContainer, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("wanilla:normalbeacon"),  modContainer, ResourcePackActivationType.NORMAL);
            if (instance.isModLoaded("charm")) {
                ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("wanilla:bettercharmchests"),  modContainer, ResourcePackActivationType.NORMAL);
            }
        });

        /*
        Translucent Rendering
         */
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                GlowGlassBlocks.GLOW_GLASS,
                GlowGlassBlocks.GLOW_GLASS_PANE,
                GlowGlassBlocks.GLOW_GLASS_SLAB,
                GlowGlassBlocks.GLOW_GLASS_STAIRS,
                GlowGlassBlocks.GLOW_GLASS_WALL,
                GlassBlocks.GLASS_WALL,
                GlassBlocks.BLACK_STAINED_GLASS_WALL,
                GlassBlocks.BLUE_STAINED_GLASS_WALL,
                GlassBlocks.BROWN_STAINED_GLASS_WALL,
                GlassBlocks.CYAN_STAINED_GLASS_WALL,
                GlassBlocks.GRAY_STAINED_GLASS_WALL,
                GlassBlocks.GREEN_STAINED_GLASS_WALL,
                GlassBlocks.LIGHT_BLUE_STAINED_GLASS_WALL,
                GlassBlocks.LIGHT_GRAY_STAINED_GLASS_WALL,
                GlassBlocks.LIME_STAINED_GLASS_WALL,
                GlassBlocks.MAGENTA_STAINED_GLASS_WALL,
                GlassBlocks.ORANGE_STAINED_GLASS_WALL,
                GlassBlocks.PINK_STAINED_GLASS_WALL,
                GlassBlocks.PURPLE_STAINED_GLASS_WALL,
                GlassBlocks.RED_STAINED_GLASS_WALL,
                GlassBlocks.WHITE_STAINED_GLASS_WALL,
                GlassBlocks.YELLOW_STAINED_GLASS_WALL,


                GlassBlocks.FRAMED_GLASS,
                    GlassBlocks.FRAMED_GLASS_STAIRS,
                    GlassBlocks.FRAMED_GLASS_SLAB,
                    GlassBlocks.FRAMED_GLASS_PANE,
                    GlassBlocks.FRAMED_GLASS_FLOOR,
                GlassBlocks.FRAMED_BLACK_STAINED_GLASS,
                    GlassBlocks.FRAMED_BLACK_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_BLACK_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_BLACK_STAINED_GLASS_FLOOR,
                GlassBlocks.FRAMED_BLUE_STAINED_GLASS,
                    GlassBlocks.FRAMED_BLUE_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_BLUE_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_BLUE_STAINED_GLASS_FLOOR,
                GlassBlocks.FRAMED_BROWN_STAINED_GLASS,
                    GlassBlocks.FRAMED_BROWN_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_BROWN_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_BROWN_STAINED_GLASS_FLOOR,
                GlassBlocks.FRAMED_CYAN_STAINED_GLASS,
                    GlassBlocks.FRAMED_CYAN_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_CYAN_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_CYAN_STAINED_GLASS_FLOOR,
                GlassBlocks.FRAMED_GRAY_STAINED_GLASS,
                    GlassBlocks.FRAMED_GRAY_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_GRAY_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_GRAY_STAINED_GLASS_FLOOR,
                GlassBlocks.FRAMED_GREEN_STAINED_GLASS,
                    GlassBlocks.FRAMED_GREEN_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_GREEN_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_GREEN_STAINED_GLASS_FLOOR,
                GlassBlocks.FRAMED_LIGHT_BLUE_STAINED_GLASS,
                    GlassBlocks.FRAMED_LIGHT_BLUE_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_LIGHT_BLUE_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_LIGHT_BLUE_STAINED_GLASS_FLOOR,
                GlassBlocks.FRAMED_LIGHT_GRAY_STAINED_GLASS,
                    GlassBlocks.FRAMED_LIGHT_GRAY_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_LIGHT_GRAY_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_LIGHT_GRAY_STAINED_GLASS_FLOOR,
                GlassBlocks.FRAMED_LIME_STAINED_GLASS,
                    GlassBlocks.FRAMED_LIME_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_LIME_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_LIME_STAINED_GLASS_FLOOR,
                GlassBlocks.FRAMED_MAGENTA_STAINED_GLASS,
                    GlassBlocks.FRAMED_MAGENTA_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_MAGENTA_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_MAGENTA_STAINED_GLASS_FLOOR,
                GlassBlocks.FRAMED_ORANGE_STAINED_GLASS,
                    GlassBlocks.FRAMED_ORANGE_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_ORANGE_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_ORANGE_STAINED_GLASS_FLOOR,
                GlassBlocks.FRAMED_PINK_STAINED_GLASS,
                    GlassBlocks.FRAMED_PINK_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_PINK_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_PINK_STAINED_GLASS_FLOOR,
                GlassBlocks.FRAMED_PURPLE_STAINED_GLASS,
                    GlassBlocks.FRAMED_PURPLE_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_PURPLE_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_PURPLE_STAINED_GLASS_FLOOR,
                GlassBlocks.FRAMED_RED_STAINED_GLASS,
                    GlassBlocks.FRAMED_RED_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_RED_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_RED_STAINED_GLASS_FLOOR,
                GlassBlocks.FRAMED_WHITE_STAINED_GLASS,
                    GlassBlocks.FRAMED_WHITE_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_WHITE_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_WHITE_STAINED_GLASS_FLOOR,
                GlassBlocks.FRAMED_YELLOW_STAINED_GLASS,
                    GlassBlocks.FRAMED_YELLOW_STAINED_GLASS_SLAB,
                    GlassBlocks.FRAMED_YELLOW_STAINED_GLASS_PANE,
                    GlassBlocks.FRAMED_YELLOW_STAINED_GLASS_FLOOR,

                GlassBlocks.GILDED_CYAN_STAINED_GLASS

        );

        /*
        Cut-out Rendering
         */
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.GLOW_LANTERN,
                ModBlocks.GLOW_CAMPFIRE,
                GoldBlocks.GOLD_CHAIN,
                GoldBlocks.BIG_GOLD_CHAIN,
                BlastIronBlocks.BIG_BLAST_IRON_CHAIN,
                IronBlocks.IRON_CHAIN,
                IronBlocks.BIG_IRON_CHAIN,
                NetheriteBlocks.NETHERITE_CHAIN,
                NetheriteBlocks.BIG_NETHERITE_CHAIN,
                GoldBlocks.GOLD_BARS,
                BlastIronBlocks.BLAST_IRON_BARS,
                NetheriteBlocks.NETHERITE_BARS,
                Hedges.OAK_HEDGE,
                Hedges.SPRUCE_HEDGE,
                Hedges.BIRCH_HEDGE,
                Hedges.JUNGLE_HEDGE,
                Hedges.ACACIA_HEDGE,
                Hedges.DARK_OAK_HEDGE,
                Hedges.MANGROVE_HEDGE,
                Hedges.AZALEA_HEDGE,
                Hedges.FLOWERING_AZALEA_HEDGE

        );

        registerBlockColor(Hedges.OAK_HEDGE, Blocks.OAK_LEAVES);
        registerBlockColor(Hedges.SPRUCE_HEDGE, Blocks.SPRUCE_LEAVES);
        registerBlockColor(Hedges.BIRCH_HEDGE, Blocks.BIRCH_LEAVES);
        registerBlockColor(Hedges.JUNGLE_HEDGE, Blocks.JUNGLE_LEAVES);
        registerBlockColor(Hedges.ACACIA_HEDGE, Blocks.ACACIA_LEAVES);
        registerBlockColor(Hedges.DARK_OAK_HEDGE, Blocks.DARK_OAK_LEAVES);
        registerBlockColor(Hedges.MANGROVE_HEDGE, Blocks.ACACIA_LEAVES);
    }

    public void registerBlockColor(Block block, Block templateBlock) {
        ColorProviderRegistry.BLOCK.register((block1, pos, world, layer) -> {
            BlockColorProvider provider = ColorProviderRegistry.BLOCK.get(templateBlock);
            return provider == null ? -1 : provider.getColor(block1, pos, world, layer);
        }, block);

        ColorProviderRegistry.ITEM.register((item, layer) -> {
            ItemColorProvider provider = ColorProviderRegistry.ITEM.get(templateBlock);
            return provider == null ? -1 : provider.getColor(item, layer);
        }, block.asItem());
    }
}
