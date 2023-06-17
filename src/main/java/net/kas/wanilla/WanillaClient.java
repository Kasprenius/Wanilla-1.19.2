package net.kas.wanilla;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.kas.wanilla.block.*;
import net.kas.wanilla.block.entities.InfusionTableEntityRenderer;
import net.kas.wanilla.event.ModEvents;
import net.kas.wanilla.network.ModNetworking;
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

        ModNetworking.registerClientReceivers();
        ModEvents.registerClientEvents();

        BlockEntityRendererRegistry.register(Wanilla.INFUSION_TABLE_ENTITY, InfusionTableEntityRenderer::new);

        instance.getModContainer("wanilla").ifPresent(modContainer -> {
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("wanilla:3drdw"),  modContainer, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("wanilla:bestdoors"),  modContainer, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("wanilla:normalbeacon"),  modContainer, ResourcePackActivationType.NORMAL);
            if (instance.isModLoaded("charm")) {
                ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("wanilla:bettercharmchests"),  modContainer, ResourcePackActivationType.NORMAL);
            }
            if(instance.isModLoaded("expandedstorage")) {
                ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("wanilla:expandedgoldfix"),  modContainer, ResourcePackActivationType.NORMAL);
            }
        });

        /*
        Translucent Rendering
         */
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                GlowGlassBlocks.GLOW_GLASS,
                GlowGlassBlocks.GLOW_GLASS_STAIRS,
                GlowGlassBlocks.GLOW_GLASS_SLAB,
                GlowGlassBlocks.GLOW_GLASS_PANE,
                GlowGlassBlocks.GLOW_GLASS_FLOOR,
                GlowGlassBlocks.GLOW_GLASS_WALL,

                GlassBlocks.GLASS_FLOOR,
                GlassBlocks.GLASS_WALL,
                GlassBlocks.WHITE_STAINED_GLASS_FLOOR,
                GlassBlocks.WHITE_STAINED_GLASS_WALL,
                GlassBlocks.LIGHT_GRAY_STAINED_GLASS_FLOOR,
                GlassBlocks.LIGHT_GRAY_STAINED_GLASS_WALL,
                GlassBlocks.GRAY_STAINED_GLASS_FLOOR,
                GlassBlocks.GRAY_STAINED_GLASS_WALL,
                GlassBlocks.BLACK_STAINED_GLASS_FLOOR,
                GlassBlocks.BLACK_STAINED_GLASS_WALL,
                GlassBlocks.BROWN_STAINED_GLASS_FLOOR,
                GlassBlocks.BROWN_STAINED_GLASS_WALL,
                GlassBlocks.RED_STAINED_GLASS_FLOOR,
                GlassBlocks.RED_STAINED_GLASS_WALL,
                GlassBlocks.ORANGE_STAINED_GLASS_FLOOR,
                GlassBlocks.ORANGE_STAINED_GLASS_WALL,
                GlassBlocks.YELLOW_STAINED_GLASS_FLOOR,
                GlassBlocks.YELLOW_STAINED_GLASS_WALL,
                GlassBlocks.LIME_STAINED_GLASS_FLOOR,
                GlassBlocks.LIME_STAINED_GLASS_WALL,
                GlassBlocks.GREEN_STAINED_GLASS_FLOOR,
                GlassBlocks.GREEN_STAINED_GLASS_WALL,
                GlassBlocks.CYAN_STAINED_GLASS_FLOOR,
                GlassBlocks.CYAN_STAINED_GLASS_WALL,
                GlassBlocks.LIGHT_BLUE_STAINED_GLASS_FLOOR,
                GlassBlocks.LIGHT_BLUE_STAINED_GLASS_WALL,
                GlassBlocks.BLUE_STAINED_GLASS_FLOOR,
                GlassBlocks.BLUE_STAINED_GLASS_WALL,
                GlassBlocks.PURPLE_STAINED_GLASS_FLOOR,
                GlassBlocks.PURPLE_STAINED_GLASS_WALL,
                GlassBlocks.MAGENTA_STAINED_GLASS_FLOOR,
                GlassBlocks.MAGENTA_STAINED_GLASS_WALL,
                GlassBlocks.PINK_STAINED_GLASS_FLOOR,
                GlassBlocks.PINK_STAINED_GLASS_WALL,





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

                GlassBlocks.GILDED_CYAN_STAINED_GLASS,

                SlimeHoneyBlocks.WHITE_SLIME_BLOCK,
                SlimeHoneyBlocks.LIGHT_GRAY_SLIME_BLOCK,
                SlimeHoneyBlocks.GRAY_SLIME_BLOCK,
                SlimeHoneyBlocks.BLACK_SLIME_BLOCK,
                SlimeHoneyBlocks.BROWN_SLIME_BLOCK,
                SlimeHoneyBlocks.RED_SLIME_BLOCK,
                SlimeHoneyBlocks.ORANGE_SLIME_BLOCK,
                SlimeHoneyBlocks.YELLOW_SLIME_BLOCK,
                SlimeHoneyBlocks.LIME_SLIME_BLOCK,
                SlimeHoneyBlocks.GREEN_SLIME_BLOCK,
                SlimeHoneyBlocks.CYAN_SLIME_BLOCK,
                SlimeHoneyBlocks.LIGHT_BLUE_SLIME_BLOCK,
                SlimeHoneyBlocks.BLUE_SLIME_BLOCK,
                SlimeHoneyBlocks.PURPLE_SLIME_BLOCK,
                SlimeHoneyBlocks.MAGENTA_SLIME_BLOCK,
                SlimeHoneyBlocks.PINK_SLIME_BLOCK,

                SlimeHoneyBlocks.WHITE_HONEY_BLOCK,
                SlimeHoneyBlocks.LIGHT_GRAY_HONEY_BLOCK,
                SlimeHoneyBlocks.GRAY_HONEY_BLOCK,
                SlimeHoneyBlocks.BLACK_HONEY_BLOCK,
                SlimeHoneyBlocks.BROWN_HONEY_BLOCK,
                SlimeHoneyBlocks.RED_HONEY_BLOCK,
                SlimeHoneyBlocks.ORANGE_HONEY_BLOCK,
                SlimeHoneyBlocks.YELLOW_HONEY_BLOCK,
                SlimeHoneyBlocks.LIME_HONEY_BLOCK,
                SlimeHoneyBlocks.GREEN_HONEY_BLOCK,
                SlimeHoneyBlocks.CYAN_HONEY_BLOCK,
                SlimeHoneyBlocks.LIGHT_BLUE_HONEY_BLOCK,
                SlimeHoneyBlocks.BLUE_HONEY_BLOCK,
                SlimeHoneyBlocks.PURPLE_HONEY_BLOCK,
                SlimeHoneyBlocks.MAGENTA_HONEY_BLOCK,
                SlimeHoneyBlocks.PINK_HONEY_BLOCK
        );
        /*
        Cut-out Rendering
         */
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                IronBlocks.IRON_CHAIN,
                IronBlocks.BIG_IRON_CHAIN,
                BlastIronBlocks.BIG_BLAST_IRON_CHAIN,
                BlastIronBlocks.BLAST_IRON_BARS,
                BlastIronBlocks.BLAST_IRON_DOOR,
                GoldBlocks.GOLD_CHAIN,
                GoldBlocks.BIG_GOLD_CHAIN,
                GoldBlocks.GOLD_BARS,
                NetheriteBlocks.NETHERITE_CHAIN,
                NetheriteBlocks.BIG_NETHERITE_CHAIN,
                NetheriteBlocks.NETHERITE_BARS,
                GlowBlocks.GLOW_LANTERN,
                GlowBlocks.GLOW_CAMPFIRE,

                EndlightBlocks.ENDLIGHT_LANTERN,

                Hedges.OAK_HEDGE,
                Hedges.SPRUCE_HEDGE,
                Hedges.BIRCH_HEDGE,
                Hedges.JUNGLE_HEDGE,
                Hedges.ACACIA_HEDGE,
                Hedges.DARK_OAK_HEDGE,
                Hedges.MANGROVE_HEDGE,
                Hedges.CHERRY_HEDGE,
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
        registerBlockColor(Hedges.CHERRY_HEDGE, Blocks.CHERRY_LEAVES);
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
