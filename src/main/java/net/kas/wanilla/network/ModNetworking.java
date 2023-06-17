package net.kas.wanilla.network;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.enchantment.ImperishableEnchantment;
import net.kas.wanilla.mixin.common.invoker.LivingEntityInvoker;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public final class ModNetworking {

    private ModNetworking() {
    }

    public static final Identifier EQUIPMENT_BREAK_EFFECTS = new Identifier(Wanilla.MOD_ID, "equipment_break_effects");

    @Environment(EnvType.CLIENT)
    public static void registerClientReceivers() {
        // Plays item break effects when the durability of an item reaches 0.
        ClientPlayNetworking.registerGlobalReceiver(EQUIPMENT_BREAK_EFFECTS, (client, handler, buf, responseSender) -> {
            int itemId = buf.readInt();

            client.execute(() -> {
                if (client.player != null) {
                    Item item = Item.byRawId(itemId);
                    ItemStack stack = new ItemStack(item);
                    if (ImperishableEnchantment.hasImperishable(stack)) {
                        ((LivingEntityInvoker) client.player).imperishableItems$invokePlayEquipmentBreakEffects(new ItemStack(item));
                    }
                }
            });
        });
    }
}
