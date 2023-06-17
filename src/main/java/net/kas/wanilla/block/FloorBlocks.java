package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.FloorBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class FloorBlocks {

    public static final Block LAPIS_TILE_FLOOR = Wanilla.registerBlock("lapis_tile_floor",
            new FloorBlock(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK).requiresTool()));

    //Copper Tile Floor

    public static final Block IRON_TILE_FLOOR = Wanilla.registerBlock("iron_tile_floor",
            new FloorBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).requiresTool()));
    public static final Block BLAST_IRON_TILE_FLOOR = Wanilla.registerBlock("blast_iron_tile_floor",
            new FloorBlock(FabricBlockSettings.copy(BlastIronBlocks.BLAST_IRON_BLOCK).requiresTool()));
    public static final Block GOLD_TILE_FLOOR = Wanilla.registerBlock("gold_tile_floor",
            new FloorBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).requiresTool()));
    public static final Block NETHERITE_TILE_FLOOR = Wanilla.registerBlock("netherite_tile_floor",
            new FloorBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).requiresTool()));
    public static final Block AMETHYST_TILE_FLOOR = Wanilla.registerBlock("amethyst_tile_floor",
            new FloorBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK).requiresTool()));
    public static final Block DIAMOND_TILE_FLOOR = Wanilla.registerBlock("diamond_tile_floor",
            new FloorBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));
    public static final Block EMERALD_TILE_FLOOR = Wanilla.registerBlock("emerald_tile_floor",
            new FloorBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).requiresTool()));
    public static final Block RUBY_TILE_FLOOR = Wanilla.registerBlock("ruby_tile_floor",
            new FloorBlock(FabricBlockSettings.copy(RubyBlocks.RUBY_BLOCK).requiresTool()));

    //-------------------------------------------------------------------------------------------------------------------


    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }
}
