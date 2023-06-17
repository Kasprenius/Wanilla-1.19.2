package net.kas.wanilla.mixin;


import net.kas.wanilla.enchantment.ModEnchantments;
import net.minecraft.block.PowderSnowBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.minecraft.enchantment.EnchantmentHelper.getEquipmentLevel;

@Mixin(PowderSnowBlock.class)
public class PowderSnowLightwalkerMixin {
    @Inject(method = "canWalkOnPowderSnow", at = @At("HEAD"), cancellable = true)
    private static void hasLightwalker (Entity entity, CallbackInfoReturnable<Boolean> cir) {
        if (getEquipmentLevel(ModEnchantments.LIGHT_WALKER, (LivingEntity) entity) > 0) {
            cir.setReturnValue(true);
        }
    }
}
