package net.kas.wanilla.block.entities;

import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.templates.CustomFurnaceBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.FurnaceScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class CustomFurnaceEntity extends AbstractFurnaceBlockEntity {

    public CustomFurnaceEntity(BlockPos pos, BlockState state) {
        super(Wanilla.CUSTOM_FURNACE_ENTITY, pos, state, RecipeType.SMELTING);
    }

    @Override
    public int getFuelTime(ItemStack fuel) {
        return (int) (super.getFuelTime(fuel) / getFuelModifier());
    }

    @Override
    public Text getContainerName() {
        return Text.translatable("container.furnace");
    }

    @Override
    public ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new FurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }

    public double getSpeedModifier() {
        if(getCachedState().getBlock() instanceof CustomFurnaceBlock) {
            return ((CustomFurnaceBlock) getCachedState().getBlock()).getSpeedModifier();
        }

        return 1;
    }

    public double getFuelModifier() {
        if(getCachedState().getBlock() instanceof CustomFurnaceBlock) {
            return ((CustomFurnaceBlock) getCachedState().getBlock()).getFuelModifier();
        }

        return 1;
    }

    public int getDuplicationChance() {
        if(getCachedState().getBlock() instanceof CustomFurnaceBlock) {
            return ((CustomFurnaceBlock) getCachedState().getBlock()).getDuplicationChance();
        }

        return 0;
    }
}