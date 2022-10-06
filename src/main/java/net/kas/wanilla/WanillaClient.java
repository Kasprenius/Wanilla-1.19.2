package net.kas.wanilla;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.kas.wanilla.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class WanillaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        /*
        Translucent Rendering
         */
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                ModBlocks.GLOW_GLASS,
                ModBlocks.GLOW_GLASS_PANE
        );

        /*
        Cut-out Rendering
         */
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.GLOW_LANTERN,
                ModBlocks.GLOW_CAMPFIRE
        );
    }
}
