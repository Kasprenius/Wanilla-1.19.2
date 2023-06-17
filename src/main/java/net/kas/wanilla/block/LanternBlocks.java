package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.state.property.Properties;

import java.util.function.ToIntFunction;

public class LanternBlocks {

    public static final Block LARGE_IRON_LANTERN = Wanilla.registerBlock("large_iron_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(5.0F, 6.0F)));
    public static final Block LARGE_IRON_SOUL_LANTERN = Wanilla.registerBlock("large_iron_soul_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(5.0F, 6.0F)));
    public static final Block LARGE_IRON_REDSTONE_LANTERN = Wanilla.registerBlock("large_iron_redstone_lantern",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(getLightValueLit(12)).requiresTool().strength(5.0F, 6.0F)));
    public static final Block LARGE_IRON_ENDER_LANTERN = Wanilla.registerBlock("large_iron_ender_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(5.0F, 6.0F)));
    public static final Block LARGE_IRON_AMETHYST_LANTERN = Wanilla.registerBlock("large_iron_amethyst_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(5.0F, 6.0F)));
    public static final Block LARGE_IRON_GLOW_LANTERN = Wanilla.registerBlock("large_iron_glow_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(5.0F, 6.0F)));

    public static final Block LARGE_BLAST_IRON_LANTERN = Wanilla.registerBlock("large_blast_iron_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(25.0F, 600.0F)));
    public static final Block LARGE_BLAST_IRON_SOUL_LANTERN = Wanilla.registerBlock("large_blast_iron_soul_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(25.0F, 600.0F)));
    public static final Block LARGE_BLAST_IRON_REDSTONE_LANTERN = Wanilla.registerBlock("large_blast_iron_redstone_lantern",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(getLightValueLit(12)).requiresTool().strength(25.0F, 600.0F)));
    public static final Block LARGE_BLAST_IRON_ENDER_LANTERN = Wanilla.registerBlock("large_blast_iron_ender_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(25.0F, 600.0F)));
    public static final Block LARGE_BLAST_IRON_AMETHYST_LANTERN = Wanilla.registerBlock("large_blast_iron_amethyst_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(25.0F, 600.0F)));
    public static final Block LARGE_BLAST_IRON_GLOW_LANTERN = Wanilla.registerBlock("large_blast_iron_glow_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(25.0F, 600.0F)));

    public static final Block LARGE_GOLD_LANTERN = Wanilla.registerBlock("large_gold_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(3.0f, 6.0f)));
    public static final Block LARGE_GOLD_SOUL_LANTERN = Wanilla.registerBlock("large_gold_soul_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(3.0f, 6.0f)));
    public static final Block LARGE_GOLD_REDSTONE_LANTERN = Wanilla.registerBlock("large_gold_redstone_lantern",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(getLightValueLit(12)).requiresTool().strength(3.0f, 6.0f)));
    public static final Block LARGE_GOLD_ENDER_LANTERN = Wanilla.registerBlock("large_gold_ender_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(3.0f, 6.0f)));
    public static final Block LARGE_GOLD_AMETHYST_LANTERN = Wanilla.registerBlock("large_gold_amethyst_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(3.0f, 6.0f)));
    public static final Block LARGE_GOLD_GLOW_LANTERN = Wanilla.registerBlock("large_gold_glow_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(3.0f, 6.0f)));

    public static final Block LARGE_NETHERITE_LANTERN = Wanilla.registerBlock("large_netherite_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(50.0F, 1200.0F)));
    public static final Block LARGE_NETHERITE_SOUL_LANTERN = Wanilla.registerBlock("large_netherite_soul_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(50.0F, 1200.0F)));
    public static final Block LARGE_NETHERITE_REDSTONE_LANTERN = Wanilla.registerBlock("large_netherite_redstone_lantern",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(getLightValueLit(12)).requiresTool().strength(50.0F, 1200.0F)));
    public static final Block LARGE_NETHERITE_ENDER_LANTERN = Wanilla.registerBlock("large_netherite_ender_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(50.0F, 1200.0F)));
    public static final Block LARGE_NETHERITE_AMETHYST_LANTERN = Wanilla.registerBlock("large_netherite_amethyst_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(50.0F, 1200.0F)));
    public static final Block LARGE_NETHERITE_GLOW_LANTERN = Wanilla.registerBlock("large_netherite_glow_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15).requiresTool().strength(50.0F, 1200.0F)));


    //-------------------------------------------------------------------------------------------------------------------

    private static ToIntFunction<BlockState> getLightValueLit(int lightValue) {
        return (state) -> state.get(Properties.LIT) ? lightValue : 0;
    }
    

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }
}
