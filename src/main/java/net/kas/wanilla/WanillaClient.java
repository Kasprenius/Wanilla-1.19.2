package net.kas.wanilla;

import com.sun.net.httpserver.Filter;
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
                GlowGlass.GLOW_GLASS,
                GlowGlass.GLOW_GLASS_PANE,
                GlowGlass.GLOW_GLASS_SLAB,
                GlowGlass.GLOW_GLASS_STAIRS,
                GlowGlass.GLOW_GLASS_WALL,
                GlassBlocks.GLASS_WALL

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
