package net.kas.wanilla.item.custom;

import net.kas.wanilla.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class VoidlightGlassJarItem extends BlockItem {
    private final SoundEvent placeSound = SoundEvents.BLOCK_BEACON_POWER_SELECT;

    public VoidlightGlassJarItem(Block block, Item.Settings settings) {
        super(block, settings);
    }

    @Override
    public boolean hasRecipeRemainder() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack itemstack) {
        return new ItemStack(ModItems.EMPTY_GLASS_JAR);
    }


    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        ActionResult actionResult = super.useOnBlock(context);
        PlayerEntity playerEntity = context.getPlayer();
        if (actionResult.isAccepted() && playerEntity != null && !playerEntity.isCreative()) {
            Hand hand = context.getHand();
            playerEntity.getInventory().offerOrDrop(ModItems.EMPTY_GLASS_JAR.getDefaultStack());
        }

        return actionResult;
    }

    public String getTranslationKey() {
        return this.getOrCreateTranslationKey();
    }

    protected SoundEvent getPlaceSound(BlockState state) {
        return this.placeSound;
    }
}
