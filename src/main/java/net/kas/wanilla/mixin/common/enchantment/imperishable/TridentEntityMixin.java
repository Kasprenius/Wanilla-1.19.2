package net.kas.wanilla.mixin.common.enchantment.imperishable;

import net.kas.wanilla.enchantment.ImperishableEnchantment;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TridentEntity.class)
abstract class TridentEntityMixin extends PersistentProjectileEntityMixin {

    @Shadow
    private ItemStack tridentStack;

    // Tridents with Imperishable stop falling when they reach the world's minimum Y.
    @Inject(method = "tick", at = @At("TAIL"))
    private void imperishableItems$checkTridentImperishable(CallbackInfo ci) {
            if (ImperishableEnchantment.hasImperishable(tridentStack)) {
                if (!isNoClip()) {
                    if (getY() < world.getBottomY()) {
                        setVelocity(Vec3d.ZERO);
                        setPosition(getX(), world.getBottomY(), getZ());
                        inGround = true;
                        setNoClip(true);
                    }
                }
            }
    }

    // Tridents with Imperishable don't despawn.
    @Inject(method = "age", at = @At("HEAD"), cancellable = true)
    private void imperishableItems$imperishableAge(CallbackInfo ci) {
            if (ImperishableEnchantment.hasImperishable(tridentStack)) {
                ci.cancel();
            }
        }
}
