package net.kas.wanilla.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.EndlightBlocks;
import net.kas.wanilla.block.materials.ModToolMaterials;
import net.kas.wanilla.item.custom.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item EMPTY_GLASS_JAR = registerItem("empty_glass_jar",
            new EmptyGlassJarItem(new FabricItemSettings()));

    public static final Item ENDLIGHT_GLASS_JAR = registerItem("endlight_glass_jar",
            new EndlightGlassJarItem(EndlightBlocks.ENDLIGHT, new FabricItemSettings()));

    public static final Item VOIDLIGHT_GLASS_JAR = registerItem("voidlight_glass_jar",
            new VoidlightGlassJarItem(EndlightBlocks.VOIDLIGHT, new FabricItemSettings()));

    public static final Item ALLAY_GLASS_JAR = registerItem("allay_glass_jar",
            new AllayGlassJarItem(new FabricItemSettings()));

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings()));
    public static final Item NETHERITE_APPLE = registerItem("netherite_apple",
            new AppleItem(new FabricItemSettings().food(ModFoodComponents.NETHERITE_APPLE).rarity(Rarity.EPIC), "Tough it out!"));
    public static final Item AMETHYST_APPLE = registerItem("amethyst_apple",
            new AppleItem(new FabricItemSettings().food(ModFoodComponents.AMETHYST_APPLE).rarity(Rarity.EPIC), "Nice for quick escapes"));
    public static final Item DIAMOND_APPLE = registerItem("diamond_apple",
            new AppleItem(new FabricItemSettings().food(ModFoodComponents.DIAMOND_APPLE).rarity(Rarity.EPIC), "Diamonds beget more diamonds"));
    public static final Item EMERALD_APPLE = registerItem("emerald_apple",
            new AppleItem(new FabricItemSettings().food(ModFoodComponents.EMERALD_APPLE).rarity(Rarity.EPIC), "Get lucky"));
    public static final Item RUBY_APPLE = registerItem("ruby_apple",
            new AppleItem(new FabricItemSettings().food(ModFoodComponents.RUBY_APPLE).rarity(Rarity.EPIC), "My hearts will go on"));
    public static final Item LAPIS_APPLE = registerItem("lapis_apple",
            new LapisAppleItem(new FabricItemSettings().food(ModFoodComponents.LAPIS_APPLE).rarity(Rarity.RARE), "Level Up"));

    public static final Item TUNING_FORK = registerItem("tuning_fork",
            new DebugStickItem(new FabricItemSettings().rarity(Rarity.UNCOMMON).maxCount(1)));

    public static final Item BLAST_IRON_SWORD = registerItem("blast_iron_sword",
            new SwordItem(ModToolMaterials.BLAST_IRON, 3, -2.4F, new Item.Settings()));
    public static final Item BLAST_IRON_SHOVEL = registerItem("blast_iron_shovel",
            new ShovelItem(ModToolMaterials.BLAST_IRON, 1.5F, -3.0F, new Item.Settings()));
    public static final Item BLAST_IRON_PICKAXE = registerItem("blast_iron_pickaxe",
            new PickaxeItem(ModToolMaterials.BLAST_IRON, 1, -2.8F, new Item.Settings()));
    public static final Item BLAST_IRON_AXE = registerItem("blast_iron_axe",
            new AxeItem(ModToolMaterials.BLAST_IRON, 6, -3.1F, new Item.Settings()));
    public static final Item BLAST_IRON_HOE = registerItem("blast_iron_hoe",
            new HoeItem(ModToolMaterials.BLAST_IRON, -2, -1.0F, new Item.Settings()));

    public static final Item SUMMON_LIGHTNING_SCROLL = registerItem("summon_lightning_scroll",
            new SummonLightningScroll(new FabricItemSettings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Wanilla.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Wanilla.LOGGER.debug("Registering Mod Items for " + Wanilla.MOD_ID);
    }


}
