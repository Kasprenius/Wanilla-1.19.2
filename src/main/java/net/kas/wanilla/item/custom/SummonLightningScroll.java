package net.kas.wanilla.item.custom;

import net.kas.wanilla.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.function.CommandFunction;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class SummonLightningScroll extends Item {

    public SummonLightningScroll(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        ActionResult actionResult = super.useOnBlock(context);
        PlayerEntity playerEntity = context.getPlayer();

        if (context.getWorld() != null && !context.getWorld().isClient && playerEntity != null) {
            BlockPos blockPos = context.getBlockPos();
            BlockPos blockPos2 = null;
            if (context.getWorld().getBlockState(context.getBlockPos()).getCollisionShape(context.getWorld(), context.getBlockPos()).isEmpty()) {
                blockPos2 = blockPos;
            } else blockPos2 = blockPos.offset(context.getSide());
            EntityType.LIGHTNING_BOLT.spawn(
                    (ServerWorld) context.getWorld(),
                    null,
                    null,
                    blockPos2,
                    SpawnReason.TRIGGERED,
                    false,
                    false
            );
            EntityType.LIGHTNING_BOLT.spawn(
                    (ServerWorld) context.getWorld(),
                    null,
                    null,
                    blockPos2,
                    SpawnReason.TRIGGERED,
                    false,
                    false
            );
            EntityType.LIGHTNING_BOLT.spawn(
                    (ServerWorld) context.getWorld(),
                    null,
                    null,
                    blockPos2,
                    SpawnReason.TRIGGERED,
                    false,
                    false
            );

            if (!playerEntity.isCreative()) {
                Hand hand = context.getHand();
                playerEntity.getStackInHand(hand).decrement(1);
            }
            return ActionResult.CONSUME;
        }
        return super.useOnBlock(context);
    }
}
