package net.kas.wanilla.mixin;

import net.kas.wanilla.block.SlimeHoneyBlocks;
import net.kas.wanilla.block.templates.ColoredHoneyBlock;
import net.kas.wanilla.block.templates.ColoredSlimeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = PistonHandler.class, priority = 450)
public abstract class SlimePistonHandler {

    @Inject(method = "isBlockSticky", at = @At("HEAD"), cancellable = true)
    private static void isBlockSticky(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        if (state.getBlock() instanceof ColoredSlimeBlock || state.getBlock() instanceof ColoredHoneyBlock) {
            cir.setReturnValue(true);
        }
    }

    @Inject(method = "isAdjacentBlockStuck", at = @At("HEAD"), cancellable = true)
    private static void isAdjacentBlockStuck(BlockState blockState1, BlockState blockState2, CallbackInfoReturnable<Boolean> ci) {
        Block block1 = blockState1.getBlock();
        Block block2 = blockState2.getBlock();

        // Colored Slime Blocks do not stick to Slime, Honey or Colored Honey
        if (SlimeHoneyBlocks.isColoredSlime(block1)) {
            if (block2 == Blocks.SLIME_BLOCK || block2 == Blocks.HONEY_BLOCK || SlimeHoneyBlocks.isColoredHoney(block2)) {
                ci.setReturnValue(false);
            }
        }

        if (SlimeHoneyBlocks.isColoredSlime(block2)) {
            if (block1 == Blocks.SLIME_BLOCK || block1 == Blocks.HONEY_BLOCK || SlimeHoneyBlocks.isColoredHoney(block2)) {
                ci.setReturnValue(false);
            }
        }

        // Colored Honey Blocks do not stick to Slime, Honey or Colored Slime
        if (SlimeHoneyBlocks.isColoredHoney(block1)) {
            if (block2 == Blocks.SLIME_BLOCK || block2 == Blocks.HONEY_BLOCK || SlimeHoneyBlocks.isColoredSlime(block2)) {
                ci.setReturnValue(false);
            }
        }

        if (SlimeHoneyBlocks.isColoredHoney(block2)) {
            if (block1 == Blocks.SLIME_BLOCK || block1 == Blocks.HONEY_BLOCK || SlimeHoneyBlocks.isColoredSlime(block2)) {
                ci.setReturnValue(false);
            }
        }

        // Colored slime blocks do not stick to colored slime blocks of other colors, but they
        // do stick to colored slime blocks of the SAME color.
        if (block1 != block2 && SlimeHoneyBlocks.isColoredSlime(block1) && SlimeHoneyBlocks.isColoredSlime(block2)) {
            ci.setReturnValue(false);
        }

        // Colored honey blocks do not stick to colored honey blocks of other colors, but they
        // do stick to colored honey blocks of the SAME color.
        if (block1 != block2 && SlimeHoneyBlocks.isColoredHoney(block1) && SlimeHoneyBlocks.isColoredHoney(block2)) {
            ci.setReturnValue(false);
        }
    }

}