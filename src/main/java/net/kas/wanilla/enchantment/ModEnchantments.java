package net.kas.wanilla.enchantment;

import net.kas.wanilla.Wanilla;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {
    public static Enchantment LIGHT_WALKER = register("light_walker",
            new LightWalkerEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.ARMOR_FEET, EquipmentSlot.FEET));
    public static Enchantment IMPERISHABLE = register("imperishable",
            new ImperishableEnchantment(Enchantment.Rarity.RARE));


    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(Wanilla.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering Enchantments for " + Wanilla.MOD_ID);
    }
}
