package net.kas.wanilla;

import net.fabricmc.api.ModInitializer;
import net.kas.wanilla.block.*;
import net.kas.wanilla.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wanilla implements ModInitializer {
	public static final String MOD_ID = "wanilla";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		GlassBlocks.registerBlocks();
		GlowGlassBlocks.registerBlocks();
		ReinforcedDeepslateBlocks.registerBlocks();
		EndRods.registerBlocks();

		StoneBlocks.registerBlocks();
		WoodBlocks.registerBlocks();
		Hedges.registerBlocks();

		IronBlocks.registerBlocks();
		BlastIronBlocks.registerBlocks();
		GoldBlocks.registerBlocks();
		EmeraldBlocks.registerBlocks();
		DiamondBlocks.registerBlocks();
		AmethystBlocks.registerBlocks();
		NetheriteBlocks.registerBlocks();

		LanternBlocks.registerBlocks();

	}

}
