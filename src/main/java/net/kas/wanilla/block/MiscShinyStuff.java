package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class MiscShinyStuff {


    public static final Block LAPIS_TILE = Wanilla.registerBlock("lapis_tile",
            new Block(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK).requiresTool()));




    //-------------------------------------------------------------------------------------------------------------------
    

    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering ModBlocks for " + Wanilla.MOD_ID);
    }
}
