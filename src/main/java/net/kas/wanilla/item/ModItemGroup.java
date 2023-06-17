package net.kas.wanilla.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kas.wanilla.block.*;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final RegistryKey<ItemGroup> WANILLA = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier("wanilla", "wanilla"));
    public static final RegistryKey<ItemGroup> SHINYSTUFF = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier("wanilla", "shinystuff"));
    public static final RegistryKey<ItemGroup> WOODSTUFF = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier("wanilla", "woodstuff"));
    public static final RegistryKey<ItemGroup> STONESTUFF = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier("wanilla", "stonestuff"));
    public static final RegistryKey<ItemGroup> GLASSSTUFF = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier("wanilla", "glassstuff"));
    public static final RegistryKey<ItemGroup> GLOWSTUFF = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier("wanilla", "glowstuff"));
    public static final RegistryKey<ItemGroup> FLOORING = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier("wanilla", "flooring"));

    public static void registerGroups() {
        Registry.register(Registries.ITEM_GROUP, WANILLA, FabricItemGroup.builder()
            .icon(() -> new ItemStack(GlowBlocks.GLOW_CAMPFIRE))
            .displayName(Text.literal("Wanilla"))
            .build()); // build() no longer registers by itself
        Registry.register(Registries.ITEM_GROUP, SHINYSTUFF, FabricItemGroup.builder()
                .icon(() -> new ItemStack(Blocks.GOLD_BLOCK))
                .displayName(Text.literal("Shiny Stuff (Wanilla)"))
                .build()); // build() no longer registers by itself
        Registry.register(Registries.ITEM_GROUP, WOODSTUFF, FabricItemGroup.builder()
                .icon(() -> new ItemStack(WoodBlocks.MOSAIC_OAK_PLANKS))
                .displayName(Text.literal("Wood Stuff (Wanilla)"))
                .build()); // build() no longer registers by itself
        Registry.register(Registries.ITEM_GROUP, STONESTUFF, FabricItemGroup.builder()
                .icon(() -> new ItemStack(StoneBlocks.POLISHED_STONE))
                .displayName(Text.literal("Stone Stuff (Wanilla)"))
                .build()); // build() no longer registers by itself
        Registry.register(Registries.ITEM_GROUP, GLASSSTUFF, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GlassBlocks.FRAMED_GLASS))
                .displayName(Text.literal("Glass Stuff (Wanilla)"))
                .build()); // build() no longer registers by itself
        Registry.register(Registries.ITEM_GROUP, GLOWSTUFF, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GlowBlocks.CARVED_GLOWSTONE_BRICKS))
                .displayName(Text.literal("Glow Stuff (Wanilla)"))
                .build()); // build() no longer registers by itself
        Registry.register(Registries.ITEM_GROUP, FLOORING, FabricItemGroup.builder()
                .icon(() -> new ItemStack(FloorBlocks.GOLD_TILE_FLOOR))
                .displayName(Text.literal("Flooring"))
                .build()); // build() no longer registers by itself
    }
}
