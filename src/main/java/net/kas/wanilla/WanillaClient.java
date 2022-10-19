package net.kas.wanilla;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.kas.wanilla.block.*;
import net.minecraft.client.render.RenderLayer;

public class WanillaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

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
                GlassBlocks.YELLOW_STAINED_GLASS_WALL

        );

        /*
        Cut-out Rendering
         */
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.GLOW_LANTERN,
                ModBlocks.GLOW_CAMPFIRE,
                ChainBlocks.GOLD_CHAIN,
                ChainBlocks.BIG_GOLD_CHAIN,
                ChainBlocks.BIG_BLAST_IRON_CHAIN,
                ChainBlocks.IRON_CHAIN,
                ChainBlocks.BIG_IRON_CHAIN,
                ChainBlocks.NETHERITE_CHAIN,
                ChainBlocks.BIG_NETHERITE_CHAIN,
                GoldBlocks.GOLD_BARS,
                BlastIronBlocks.BLAST_IRON_BARS,
                NetheriteBlocks.NETHERITE_BARS

        );
    }
}
