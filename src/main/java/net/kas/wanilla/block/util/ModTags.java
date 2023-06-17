package net.kas.wanilla.block.util;

import net.kas.wanilla.Wanilla;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class ModTags {

    public static final TagKey<Block> HEDGES = Blocks.createTag("hedges");
    //public static final TagKey<EntityType<?>> ENDLIGHT_WALKABLE_MOBS = Entities.createEntityTag("endlight_walkable_mobs");
    public static class Blocks {
        public static final TagKey<Block> GLOW_FIRE_BASE_BLOCKS = createTag("glow_fire_base_blocks");
        public static final TagKey<Block> CHAINS = createTag("chains");
        public static final TagKey<Block> HEDGES = createTag("hedges");


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Wanilla.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
        }
    }
    /*
    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM_KEY, new Identifier(Wanilla.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }


    public static class Entities {
        private static TagKey<EntityType<?>> createEntityTag(String name) {
            return TagKey.of(RegistryKeys.ENTITY_TYPE_KEY, new Identifier(Wanilla.MOD_ID, name));
        }
    }


     */
}
