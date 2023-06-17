package net.kas.wanilla.enchantment;

import net.kas.wanilla.Wanilla;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public final class ImperishableEnchantment extends Enchantment {

    public static final String ENCHANTMENT_ID = "imperishable";
    public static final String TRANSLATION_KEY = Wanilla.MOD_ID + '.' + ENCHANTMENT_ID;

    public ImperishableEnchantment(Rarity weight) {
        super(weight, EnchantmentTarget.VANISHABLE, EquipmentSlot.values());
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return !hasImperishable(stack);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public int getMinPower(int level) {
        /*
        return Math.max(ImperishableItems.getConfig().imperishableMinLevel, 0);
         */
        return 15;
    }

    @Override
    public int getMaxPower(int level) {
        /*
        return getMinPower(level) + Math.max(ImperishableItems.getConfig().imperishableMaxLevelsAboveMin, 0);
         */
        return 50;
    }

    @Override
    public boolean isTreasure() {
        /*
        return ImperishableItems.getConfig().imperishableIsTreasure;
         */
        return false;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        /*
        return ImperishableItems.getConfig().imperishableSoldByVillagers;
         */
        return true;
    }

    // Returns true if an ItemStack has the Imperishable enchantment. Returns false otherwise.
    public static boolean hasImperishable(ItemStack stack) {
        return EnchantmentHelper.getLevel(ModEnchantments.IMPERISHABLE, stack) != 0;
    }

    // Returns true if an ItemStack is damageable, has the Imperishable enchantment, and the damage on it is more than the item's maximum damage. Returns false otherwise.
    public static boolean isBrokenImperishable(ItemStack stack) {
        return stack.isDamageable() && stack.getDamage() >= stack.getMaxDamage() && (hasImperishable(stack));
    }

    // Removes the "(Broken)" string from the name of tools with Imperishable at 0 durability, so it doesn't mess with anvil renaming.
    public static String itemNameRemoveBroken(String name, ItemStack stack) {
        String trimmedName = name;

        if (isBrokenImperishable(stack)) {
            Text broken = Text.translatable("item.name." + TRANSLATION_KEY + ".broken");
            int brokenLength = broken.getString().length();
            trimmedName = trimmedName.substring(0, trimmedName.length() - brokenLength);
        }

        return trimmedName;
    }
}
