package net.kas.wanilla.registry;

import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.kas.wanilla.block.ModBlocks;
import net.kas.wanilla.block.entities.GlowCampfireBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.util.registry.Registry;

public class IEBlockEntities {

    public static final BlockEntityType<GlowCampfireBlockEntity> GLOW_CAMPFIRE_ENTITY;

    static {
        GLOW_CAMPFIRE_ENTITY = registerBlockEntity("glow_campfire", GlowCampfireBlockEntity::new, ModBlocks.GLOW_CAMPFIRE);
    }

    /*
    Util. Functions
     */
    @SuppressWarnings("Unused")
    public static void register(){
    }

    public static <T extends BlockEntity> void registerBER(BlockEntityType<T> type, BlockEntityRendererFactory<? super T> factory) {
        BlockEntityRendererRegistry.register(type, factory);
    }

    private static <T extends BlockEntity> BlockEntityType<T> registerBlockEntity(String ID, BlockEntityType.BlockEntityFactory<T> factory, Block... blocks) {
        return Registry.register(Registry.BLOCK_ENTITY_TYPE, "infernalexp:" + ID, BlockEntityType.Builder.create(factory, blocks).build(null));
    }
}
