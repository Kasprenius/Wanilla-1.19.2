package net.kas.wanilla.mixin.common.util;

import net.kas.wanilla.util.ImperishableBlockEntityHelper;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ShulkerBoxBlock.class)
abstract class ShulkerBoxBlockMixin extends BlockWithEntity {

    @SuppressWarnings("unused")
    @Shadow
    public static ItemStack getItemStack(@Nullable DyeColor color) {
        throw new AssertionError();
    }

    @Shadow
    public abstract @Nullable DyeColor getColor();

    @SuppressWarnings("unused")
    protected ShulkerBoxBlockMixin(Settings settings) {
        super(settings);
    }

    // Sets the enchantments and repair cost of the shulker box item dropped when a shulker box with enchantments and repair cost is broken by a player in creative mode.
    @Inject(method = "onBreak", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/ItemEntity;<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V"))
    private void imperishableItems$setDroppedShulkerStackEnchantments(World world, BlockPos pos, BlockState state, PlayerEntity player, CallbackInfo ci) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            ItemStack stack = getItemStack(getColor());
            ImperishableBlockEntityHelper.setDroppedItemStackEnchantments(blockEntity, stack);
    }
}
