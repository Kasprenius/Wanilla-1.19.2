package net.kas.wanilla.util;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtList;

import java.util.Map;

public final class ImperishableBlockEntityHelper {

    private ImperishableBlockEntityHelper() {
    }

    // Copies the enchantments and repair cost of an ItemStack to a BlockEntity.
    @SuppressWarnings("ConstantConditions")
    public static void setBlockEntityEnchantments(BlockEntity blockEntity, ItemStack stack) {
        if (stack.hasEnchantments()) {
            ((ImperishableBlockEntityAccess) blockEntity).imperishableItems$setImperishableItemsEnchantments(stack.getEnchantments());
        }

        if (stack.hasNbt()) {
            if (stack.getNbt().contains("RepairCost", 3)) {
                ((ImperishableBlockEntityAccess) blockEntity).imperishableItems$setImperishableItemsRepairCost(stack.getRepairCost());
            }
        }
    }

    // Copies the enchantments and repair cost of a BlockEntity to an ItemStack.
    public static void setDroppedItemStackEnchantments(BlockEntity blockEntity, ItemStack stack) {
        NbtElement enchantmentsNbt = ((ImperishableBlockEntityAccess) blockEntity).imperishableItems$getImperishableItemsEnchantments();
        if (enchantmentsNbt != null) {
            Map<Enchantment, Integer> enchantmentsMap = EnchantmentHelper.fromNbt((NbtList) enchantmentsNbt);
            EnchantmentHelper.set(enchantmentsMap, stack);
        }

        Integer repairCost = ((ImperishableBlockEntityAccess) blockEntity).imperishableItems$getImperishableItemsRepairCost();
        if (repairCost != null) {
            stack.setRepairCost(repairCost);
        }
    }
}
