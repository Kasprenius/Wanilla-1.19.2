package net.kas.wanilla.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.GlowGlassBlocks;
import net.kas.wanilla.block.ModBlocks;
import net.kas.wanilla.block.StoneBlocks;
import net.kas.wanilla.block.WoodBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup WANILLA = FabricItemGroupBuilder.build(
            new Identifier(Wanilla.MOD_ID, "wanilla"), () -> new ItemStack(ModBlocks.GLOW_CAMPFIRE)
    );

    public static final ItemGroup WOODSTUFF = FabricItemGroupBuilder.build(
            new Identifier(Wanilla.MOD_ID, "woodstuff"), () -> new ItemStack(WoodBlocks.MOSAIC_OAK_PLANKS)
    );
    public static final ItemGroup STONESTUFF = FabricItemGroupBuilder.build(
            new Identifier(Wanilla.MOD_ID, "stonestuff"), () -> new ItemStack(StoneBlocks.POLISHED_STONE)
    );

    public static final ItemGroup SHINYSTUFF = FabricItemGroupBuilder.build(
            new Identifier(Wanilla.MOD_ID, "shinystuff"), () -> new ItemStack(Blocks.GOLD_BLOCK)
    );

    public static final ItemGroup GLOWSTUFF = FabricItemGroupBuilder.create(
                    new Identifier(Wanilla.MOD_ID, "glowstuff"))
            .icon(() -> new ItemStack(ModBlocks.GLOW_CAMPFIRE))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Blocks.GLOWSTONE));
                stacks.add(new ItemStack(ModBlocks.GLOWSTONE_SLAB));
                stacks.add(new ItemStack(ModBlocks.GLOWSTONE_STAIRS));
                stacks.add(new ItemStack(ModBlocks.GLOWSTONE_WALL));
                stacks.add(new ItemStack(ModBlocks.GLOWSTONE_BRICKS));
                stacks.add(new ItemStack(ModBlocks.GLOWSTONE_BRICK_SLAB));
                stacks.add(new ItemStack(ModBlocks.GLOWSTONE_BRICK_STAIRS));
                stacks.add(new ItemStack(ModBlocks.GLOWSTONE_BRICK_WALL));
                stacks.add(new ItemStack(ModBlocks.POLISHED_GLOWSTONE));
                stacks.add(new ItemStack(ModBlocks.POLISHED_GLOWSTONE_SLAB));
                stacks.add(new ItemStack(ModBlocks.POLISHED_GLOWSTONE_STAIRS));
                stacks.add(new ItemStack(ModBlocks.POLISHED_GLOWSTONE_WALL));
                stacks.add(new ItemStack(ModBlocks.CHISELED_GLOWSTONE_BRICKS));
                stacks.add(new ItemStack(ModBlocks.CARVED_GLOWSTONE_BRICKS));
                stacks.add(new ItemStack(ModBlocks.CRACKED_GLOWSTONE_BRICKS));
                stacks.add(new ItemStack(ModBlocks.DIMSTONE));
                stacks.add(new ItemStack(ModBlocks.DIMSTONE_SLAB));
                stacks.add(new ItemStack(ModBlocks.DIMSTONE_STAIRS));
                stacks.add(new ItemStack(ModBlocks.DIMSTONE_WALL));
                stacks.add(new ItemStack(ModBlocks.DIMSTONE_BRICKS));
                stacks.add(new ItemStack(ModBlocks.DIMSTONE_BRICK_SLAB));
                stacks.add(new ItemStack(ModBlocks.DIMSTONE_BRICK_STAIRS));
                stacks.add(new ItemStack(ModBlocks.DIMSTONE_BRICK_WALL));
                stacks.add(new ItemStack(ModBlocks.POLISHED_DIMSTONE));
                stacks.add(new ItemStack(ModBlocks.POLISHED_DIMSTONE_SLAB));
                stacks.add(new ItemStack(ModBlocks.POLISHED_DIMSTONE_STAIRS));
                stacks.add(new ItemStack(ModBlocks.POLISHED_DIMSTONE_WALL));
                stacks.add(new ItemStack(ModBlocks.CHISELED_DIMSTONE_BRICKS));
                stacks.add(new ItemStack(ModBlocks.CRACKED_DIMSTONE_BRICKS));
                stacks.add(new ItemStack(ModBlocks.DULLSTONE));
                stacks.add(new ItemStack(ModBlocks.DULLSTONE_SLAB));
                stacks.add(new ItemStack(ModBlocks.DULLSTONE_STAIRS));
                stacks.add(new ItemStack(ModBlocks.DULLSTONE_WALL));
                stacks.add(new ItemStack(ModBlocks.DULLSTONE_BRICKS));
                stacks.add(new ItemStack(ModBlocks.DULLSTONE_BRICK_SLAB));
                stacks.add(new ItemStack(ModBlocks.DULLSTONE_BRICK_STAIRS));
                stacks.add(new ItemStack(ModBlocks.DULLSTONE_BRICK_WALL));
                stacks.add(new ItemStack(ModBlocks.POLISHED_DULLSTONE));
                stacks.add(new ItemStack(ModBlocks.POLISHED_DULLSTONE_SLAB));
                stacks.add(new ItemStack(ModBlocks.POLISHED_DULLSTONE_STAIRS));
                stacks.add(new ItemStack(ModBlocks.POLISHED_DULLSTONE_WALL));
                stacks.add(new ItemStack(ModBlocks.CHISELED_DULLSTONE_BRICKS));
                stacks.add(new ItemStack(ModBlocks.CRACKED_DULLSTONE_BRICKS));
                stacks.add(new ItemStack(ModBlocks.GLOWDUST_SAND));
                stacks.add(new ItemStack(ModBlocks.GLOWDUST));
                stacks.add(new ItemStack(GlowGlassBlocks.GLOW_GLASS));
                stacks.add(new ItemStack(GlowGlassBlocks.GLOW_GLASS_PANE));
                stacks.add(new ItemStack(ModBlocks.GLOW_CAMPFIRE));
                stacks.add(new ItemStack(ModBlocks.GLOW_LANTERN));

            })
            .build();
}
