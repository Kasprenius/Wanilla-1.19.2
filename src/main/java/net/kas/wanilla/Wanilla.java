package net.kas.wanilla;

import net.fabricmc.api.ModInitializer;
import net.kas.wanilla.block.AmethystBlocks;
import net.kas.wanilla.block.GoldBlocks;
import net.kas.wanilla.block.ModBlocks;
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
		GoldBlocks.registerBlocks();
		AmethystBlocks.registerBlocks();
	}
}
