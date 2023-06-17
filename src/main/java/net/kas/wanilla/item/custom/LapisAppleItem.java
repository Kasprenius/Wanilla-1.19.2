package net.kas.wanilla.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LapisAppleItem extends Item {

    private final SoundEvent levelUp = SoundEvents.ENTITY_PLAYER_LEVELUP;
    String toolTip;
    public LapisAppleItem(Settings settings, String tooltip) {
        super(settings);
        this.toolTip = tooltip;
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof PlayerEntity player) {
            player.addExperienceLevels(1);
            player.playSound(levelUp, 0.75f, 1);
        }
        return this.isFood() ? user.eatFood(world, stack) : stack;
    }

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal(toolTip).formatted(Formatting.GRAY));
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
