package net.kas.wanilla.util;

import net.minecraft.nbt.NbtElement;

public interface ImperishableBlockEntityAccess {

    NbtElement imperishableItems$getImperishableItemsEnchantments();

    void imperishableItems$setImperishableItemsEnchantments(NbtElement enchantments);

    Integer imperishableItems$getImperishableItemsRepairCost();

    void imperishableItems$setImperishableItemsRepairCost(Integer repairCost);
}
