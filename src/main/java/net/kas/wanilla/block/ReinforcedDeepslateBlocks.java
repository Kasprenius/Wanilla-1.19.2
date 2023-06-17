package net.kas.wanilla.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kas.wanilla.Wanilla;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

public class ReinforcedDeepslateBlocks {

    public static final Block REINFORCED_DEEPSLATE = Wanilla.registerBlock("reinforced_deepslate",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE).strength(50.0f, 1200.0f).requiresTool()));
            public static final Block REINFORCED_DEEPSLATE_STAIRS = Wanilla.registerBlock("reinforced_deepslate_stairs",
                    new StairsBlock(REINFORCED_DEEPSLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE).strength(50.0f, 1200.0f).requiresTool()));
            public static final Block REINFORCED_DEEPSLATE_SLAB = Wanilla.registerBlock("reinforced_deepslate_slab",
                    new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE).strength(50.0f, 1200.0f).requiresTool()));
            public static final Block REINFORCED_DEEPSLATE_WALL = Wanilla.registerBlock("reinforced_deepslate_wall",
                    new WallBlock(FabricBlockSettings.copy(REINFORCED_DEEPSLATE)));
    public static final Block REINFORCED_DEEPSLATE_PILLAR = Wanilla.registerBlock("reinforced_deepslate_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE).strength(50.0f, 1200.0f).requiresTool()));






    public static void registerBlocks() {
        Wanilla.LOGGER.debug("Registering fixed Reinforced Deepslate for " + Wanilla.MOD_ID);
    }
}
