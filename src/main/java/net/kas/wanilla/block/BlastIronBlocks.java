package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.materials.ModMaterials;
import net.kas.wanilla.block.templates.BigChain;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;


public class BlastIronBlocks {

    public static final Block BLAST_IRON_BLOCK = Wanilla.registerBlock("blast_iron_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(25.0F, 600.0F).requiresTool().mapColor(MapColor.GRAY)));
            public static final Block BLAST_IRON_STAIRS = Wanilla.registerBlock("blast_iron_stairs",
                    new StairsBlock(BLAST_IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(BLAST_IRON_BLOCK)));
            public static final Block BLAST_IRON_SLAB = Wanilla.registerBlock("blast_iron_slab",
                    new SlabBlock(FabricBlockSettings.copyOf(BLAST_IRON_BLOCK)));
            public static final Block BLAST_IRON_WALL = Wanilla.registerBlock("blast_iron_wall",
                    new WallBlock(FabricBlockSettings.copyOf(BLAST_IRON_BLOCK).requiresTool()));
    public static final Block CUT_BLAST_IRON = Wanilla.registerBlock("cut_blast_iron",
            new Block(FabricBlockSettings.copyOf(BLAST_IRON_BLOCK)));
            public static final Block CUT_BLAST_IRON_STAIRS = Wanilla.registerBlock("cut_blast_iron_stairs",
                    new StairsBlock(CUT_BLAST_IRON.getDefaultState(), FabricBlockSettings.copyOf(BLAST_IRON_BLOCK)));
            public static final Block CUT_BLAST_IRON_SLAB = Wanilla.registerBlock("cut_blast_iron_slab",
                    new SlabBlock(FabricBlockSettings.copyOf(BLAST_IRON_BLOCK)));
            public static final Block CUT_BLAST_IRON_WALL = Wanilla.registerBlock("cut_blast_iron_wall",
                    new WallBlock(FabricBlockSettings.copyOf(CUT_BLAST_IRON).requiresTool()));

    public static final Block BEVELED_BLAST_IRON = Wanilla.registerBlock("beveled_blast_iron",
            new Block(FabricBlockSettings.copyOf(BLAST_IRON_BLOCK).requiresTool()));

    public static final Block BLAST_IRON_TILE = Wanilla.registerBlock("blast_iron_tile",
            new Block(FabricBlockSettings.copy(BLAST_IRON_BLOCK).requiresTool()));
    public static final Block BLAST_IRON_BARS = Wanilla.registerBlock("blast_iron_bars",
            new PaneBlock(FabricBlockSettings.copyOf(BLAST_IRON_BLOCK)));

    public static final Block BLAST_IRON_DOOR = Wanilla.registerBlock("blast_iron_door",
            new DoorBlock(FabricBlockSettings.copyOf(BLAST_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).nonOpaque(), ModMaterials.BLAST_IRON));

    /*
    public static final Block WRAPPED_BLAST_IRON_CHAINS = Wanilla.registerBlock("wrapped_blast_iron_chains",
            new WrappedChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(25.0F, 600.0F).requiresTool(), Blocks.CHAIN),
            ModItemGroup.SHINYSTUFF); //G

     */
    public static final Block BIG_BLAST_IRON_CHAIN = Wanilla.registerBlock("big_blast_iron_chain",
            new BigChain(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(25.0F, 600.0F).requiresTool()));  //G




    //-------------------------------------------------------------------------------------------------------------------

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }
}
