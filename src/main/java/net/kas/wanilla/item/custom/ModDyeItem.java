package net.kas.wanilla.item.custom;

import com.google.common.collect.Maps;
import java.util.Map;

import net.kas.wanilla.block.materials.ModDyeColors;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SignChangingItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class ModDyeItem extends Item implements SignChangingItem {
    private static final Map<ModDyeColors, net.kas.wanilla.item.custom.ModDyeItem> DYES = Maps.newEnumMap(ModDyeColors.class);
    private final ModDyeColors color;

    public ModDyeItem(ModDyeColors color, Item.Settings settings) {
        super(settings);
        this.color = color;
        DYES.put(color, this);
    }

    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (entity instanceof SheepEntity sheepEntity) {
            user.sendMessage(Text.literal("Sorry, haven't figured that out yet!"), true);
            /*
            if (sheepEntity.isAlive() && !sheepEntity.isSheared() && sheepEntity.getModColor() != this.color) {
                sheepEntity.getWorld().playSoundFromEntity(user, sheepEntity, SoundEvents.ITEM_DYE_USE, SoundCategory.PLAYERS, 1.0F, 1.0F);
                if (!user.getWorld().isClient) {
                    //sheepEntity.setModColor(this.color);
                    //stack.decrement(1);
                }

                return ActionResult.success(user.getWorld().isClient);
            }

             */
        }

        return ActionResult.PASS;
    }

    public ModDyeColors getColor() {
        return this.color;
    }

    public static net.kas.wanilla.item.custom.ModDyeItem byColor(ModDyeColors color) {
        return (net.kas.wanilla.item.custom.ModDyeItem)DYES.get(color);
    }

    public boolean useOnSign(World world, SignBlockEntity signBlockEntity, boolean front, PlayerEntity player) {
        player.sendMessage(Text.literal("Sorry, haven't figured that out yet!"), true);
        /*
        if (signBlockEntity.changeText((text) -> {
            return text.withModColor(this.getColor());
        }, front)) {
            world.playSound((PlayerEntity)null, signBlockEntity.getPos(), SoundEvents.ITEM_DYE_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return true;
        } else {

        }
         */
        return false;
    }
}