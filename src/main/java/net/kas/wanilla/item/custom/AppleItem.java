package net.kas.wanilla.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AppleItem extends Item {
    String toolTip;

    public AppleItem(Item.Settings settings, String tooltip) {
        super(settings);
        this.toolTip = tooltip;
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal(toolTip).formatted(Formatting.GRAY));
    }
}