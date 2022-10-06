package net.kas.wanilla.registry;

import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class ModTags {
    public static final TagKey<Block> GLOW_FIRE_BASE_BLOCKS = ModTags.of("glow_fire_base_blocks");

    private static TagKey<Block> of(String id) {
        return TagKey.of(Registry.BLOCK_KEY, new Identifier(id));
    }
}
