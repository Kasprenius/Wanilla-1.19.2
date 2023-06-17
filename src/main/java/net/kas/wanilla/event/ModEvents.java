package net.kas.wanilla.event;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.kas.wanilla.enchantment.ImperishableEnchantment;
import net.minecraft.item.Equipment;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.Formatting;
import net.minecraft.util.TypedActionResult;

public final class ModEvents {

    private ModEvents() {
    }

    public static void registerEvents() {
        /*
        // Initialises the Imperishable blacklist when the world loads.
        ServerWorldEvents.LOAD.register((server, world) -> ImperishableBlacklistsHandler.initBlacklists());

         */

        // Item specific right click actions are cancelled if the item has Imperishable and is at 0 durability.
        UseItemCallback.EVENT.register((player, world, hand) -> {
            ItemStack stack = player.getStackInHand(hand);
            if (ImperishableEnchantment.hasImperishable(stack)) {
                if (!player.isCreative() && !player.isSpectator()) {
                    // Still allow a wearable item to be equipped even if the item is broken.
                    if (!(stack.getItem() instanceof Equipment)) {
                        if (ImperishableEnchantment.isBrokenImperishable(stack)) {
                            return TypedActionResult.fail(stack);
                        }
                    }
                }
            }

            return TypedActionResult.pass(stack);
        });
    }

    @Environment(EnvType.CLIENT)
    public static void registerClientEvents() {
        // Adds a message to the tooltip of an item with Imperishable at 0 durability.
        ItemTooltipCallback.EVENT.register((stack, context, lines) -> {
            if (ImperishableEnchantment.hasImperishable(stack)) {
                if (ImperishableEnchantment.isBrokenImperishable(stack)) {
                    boolean inserted = false;

                    if (context.isAdvanced()) {
                        int index = 0;
                        while (index < lines.size() && !inserted) {
                            Text line = lines.get(index);
                            if (line.getContent() instanceof TranslatableTextContent translatableContent) {

                                if (translatableContent.getKey().equals("item.durability")) {
                                    lines.add(index, Text.translatable("item.tooltip." + ImperishableEnchantment.TRANSLATION_KEY + ".broken").formatted(Formatting.RED));
                                    lines.add(index, ScreenTexts.EMPTY);
                                    inserted = true;
                                }
                            }

                            index++;
                        }
                    }

                    if (!inserted) {
                        lines.add(ScreenTexts.EMPTY);
                        lines.add(Text.translatable("item.tooltip." + ImperishableEnchantment.TRANSLATION_KEY + ".broken").formatted(Formatting.RED));
                    }
                }
            }
        });
    }
}
