package net.kas.wanilla;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.kas.wanilla.block.*;
import net.kas.wanilla.block.entities.CustomFurnaceEntity;
import net.kas.wanilla.block.entities.InfusionTableEntity;
import net.kas.wanilla.enchantment.ModEnchantments;
import net.kas.wanilla.event.ModEvents;
import net.kas.wanilla.item.ItemPlacement;
import net.kas.wanilla.item.ModItemGroup;
import net.kas.wanilla.item.ModItems;
import net.kas.wanilla.world.gen.ModWorldGen;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class Wanilla implements ModInitializer {
	public static final String MOD_ID = "wanilla";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Map<String, Block> blocks = new HashMap<>();
	public static final Map<String, Item> items = new HashMap<>();
	public static BlockEntityType<InfusionTableEntity> INFUSION_TABLE_ENTITY;
	public static BlockEntityType<CustomFurnaceEntity> CUSTOM_FURNACE_ENTITY;

	private static long lastTime = 0;


	@Override
	public void onInitialize() {
		ModWorldGen.generateWorldGen();
		ModItemGroup.registerGroups();

		LanternBlocks.registerBlocks();
		EndRods.registerBlocks();
		EndlightBlocks.registerBlocks();
		WoolBlocks.registerBlocks();
		ChiseledBookshelfBlocks.registerBlocks();
		SlimeHoneyBlocks.registerBlocks();
		MiscStuff.registerBlocks();
		ModItems.registerModItems();

		IronBlocks.registerBlocks();
		BlastIronBlocks.registerBlocks();
		GoldBlocks.registerBlocks();
		NetheriteBlocks.registerBlocks();
		AmethystBlocks.registerBlocks();
		DiamondBlocks.registerBlocks();
		EmeraldBlocks.registerBlocks();
		RubyBlocks.registerBlocks();
		MiscShinyStuff.registerBlocks();

		StoneBlocks.registerBlocks();
		ReinforcedDeepslateBlocks.registerBlocks();
		ConcreteBlocks.registerBlocks();

		Hedges.registerBlocks();
		WoodBlocks.registerBlocks();

		GlowBlocks.registerModBlocks();
		GlowGlassBlocks.registerBlocks();

		FloorBlocks.registerBlocks();

		ModEnchantments.registerModEnchantments();

		ItemPlacement.init();
		ModEvents.registerEvents();

		INFUSION_TABLE_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, Wanilla.MOD_ID + ":infusion_table_entity",
				FabricBlockEntityTypeBuilder.create(InfusionTableEntity::new, MiscStuff.INFUSION_TABLE).build(null));
		CUSTOM_FURNACE_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, Wanilla.MOD_ID + ":custom_furnace_entity",
				FabricBlockEntityTypeBuilder.create(CustomFurnaceEntity::new, MiscStuff.DEEPSLATE_FURNACE).build(null));

		AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) -> {
			Item itemInHand = player.getStackInHand(hand).getItem();

			if (itemInHand != ModItems.TUNING_FORK) return ActionResult.PASS;

			long currentTime = world.getTimeOfDay();
			if (lastTime == 0 || Math.abs(currentTime - lastTime) > 1)
			{
				itemInHand.canMine(world.getBlockState(pos), world, pos, player);
				lastTime = currentTime;
			}
			return ActionResult.PASS;
		});
	}

	public static Block registerBlock(String name, Block block) {
		Registry.register(Registries.BLOCK, new Identifier(Wanilla.MOD_ID, name), block);
		registerItem(name, new BlockItem(block, new Item.Settings()));
		return block;
	}

	public static void registerItem(String name, Item item) {
		Registry.register(Registries.ITEM, new Identifier(Wanilla.MOD_ID, name), item);
	}

	public static float aroundRadial(float angle){
		while(angle >= 3.1415927F) {
			angle -= 6.2831855F;
		}

		while(angle < -3.1415927F) {
			angle += 6.2831855F;
		}

		return angle;
	}
}
