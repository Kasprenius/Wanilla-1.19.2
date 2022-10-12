package net.kas.wanilla.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.ToIntFunction;

public class LanternBlocks {

    public static final Block LARGE_LANTERN = registerBlock("large_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15)),
            ModItemGroup.WANILLA);
    public static final Block LARGE_SOUL_LANTERN = registerBlock("large_soul_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15)),
            ModItemGroup.WANILLA);
    public static final Block LARGE_REDSTONE_LANTERN = registerBlock("large_redstone_lantern",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(getLightValueLit(12))),
            ModItemGroup.WANILLA);
    public static final Block LARGE_ENDER_LANTERN = registerBlock("large_ender_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15)),
            ModItemGroup.WANILLA);
    public static final Block LARGE_CURSED_LANTERN = registerBlock("large_cursed_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15)),
            ModItemGroup.WANILLA);
    public static final Block LARGE_GLOW_LANTERN = registerBlock("large_glow_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15)),
            ModItemGroup.WANILLA);

    public static final Block LARGE_GOLD_LANTERN = registerBlock("large_gold_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15)),
            ModItemGroup.WANILLA);
    public static final Block LARGE_GOLD_SOUL_LANTERN = registerBlock("large_gold_soul_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15)),
            ModItemGroup.WANILLA);
    public static final Block LARGE_GOLD_REDSTONE_LANTERN = registerBlock("large_gold_redstone_lantern",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(getLightValueLit(12))),
            ModItemGroup.WANILLA);
    public static final Block LARGE_GOLD_ENDER_LANTERN = registerBlock("large_gold_ender_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15)),
            ModItemGroup.WANILLA);
    public static final Block LARGE_GOLD_CURSED_LANTERN = registerBlock("large_gold_cursed_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15)),
            ModItemGroup.WANILLA);
    public static final Block LARGE_GOLD_GLOW_LANTERN = registerBlock("large_gold_glow_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15)),
            ModItemGroup.WANILLA);


    //-------------------------------------------------------------------------------------------------------------------

    private static ToIntFunction<BlockState> getLightValueLit(int lightValue) {
        return (state) -> state.get(Properties.LIT) ? lightValue : 0;
    }

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Wanilla.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Wanilla.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }
}
