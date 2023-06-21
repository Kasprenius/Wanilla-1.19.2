package net.kas.wanilla.item.custom;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.dimension.v1.FabricDimensions;
import net.fabricmc.loader.api.FabricLoader;
import net.kas.wanilla.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.nbt.NbtOps;
import net.minecraft.nbt.scanner.NbtCollector;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.GlobalPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.TeleportTarget;
import net.minecraft.world.World;
import net.minecraft.world.poi.PointOfInterestTypes;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class InterspacialCompassItem extends Item {

    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String NAME = "interspacialcompass";

    public InterspacialCompassItem(Item.Settings settings) { super(settings); }}

    /*
    public static boolean hasLodestone(ItemStack stack) {
        NbtCompound nbtCompound = stack.getNbt();
        return nbtCompound != null && (nbtCompound.contains("LodestoneDimension") || nbtCompound.contains("LodestonePos"));
    }

    private static Optional<RegistryKey<World>> getLodestoneDimension(NbtCompound nbt) {
        return World.CODEC.parse(NbtOps.INSTANCE, nbt.get("LodestoneDimension")).result();
    }

    @Nullable
    public static GlobalPos createLodestonePos(NbtCompound nbt) {
        boolean bl = nbt.contains("LodestonePos");
        boolean bl2 = nbt.contains("LodestoneDimension");
        if (bl && bl2) {
            Optional<RegistryKey<World>> optional = getLodestoneDimension(nbt);
            if (optional.isPresent()) {
                BlockPos blockPos = NbtHelper.toBlockPos(nbt.getCompound("LodestonePos"));
                return GlobalPos.create((RegistryKey)optional.get(), blockPos);
            }
        }

        return null;
    }

    public boolean hasGlint(ItemStack stack) {
        return hasLodestone(stack) || super.hasGlint(stack);
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient) {
            if (hasLodestone(stack)) {
                NbtCompound nbtCompound = stack.getOrCreateNbt();
                if (nbtCompound.contains("LodestoneTracked") && !nbtCompound.getBoolean("LodestoneTracked")) {
                    return;
                }

                Optional<RegistryKey<World>> optional = getLodestoneDimension(nbtCompound);
                if (optional.isPresent() && optional.get() == world.getRegistryKey() && nbtCompound.contains("LodestonePos")) {
                    BlockPos blockPos = NbtHelper.toBlockPos(nbtCompound.getCompound("LodestonePos"));
                    if (!world.isInBuildLimit(blockPos) || !((ServerWorld)world).getPointOfInterestStorage().hasTypeAt(PointOfInterestTypes.LODESTONE, blockPos)) {
                        nbtCompound.remove("LodestonePos");
                    }
                }
            }

        }
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        if (!world.getBlockState(blockPos).isOf(Blocks.LODESTONE)) {
            return super.useOnBlock(context);
        } else {
            world.playSound((PlayerEntity)null, blockPos, SoundEvents.ITEM_LODESTONE_COMPASS_LOCK, SoundCategory.PLAYERS, 1.0F, 1.0F);
            PlayerEntity playerEntity = context.getPlayer();
            ItemStack itemStack = context.getStack();
            boolean bl = !playerEntity.getAbilities().creativeMode && itemStack.getCount() == 1;
            if (bl) {
                this.writeNbt(world.getRegistryKey(), blockPos, itemStack.getOrCreateNbt());
                NbtCompound nbt = new NbtCompound();


                nbt.put("LodestonePos", NbtHelper.fromBlockPos(blockPos));
                nbt.put("LodestoneDimension", getLodestoneDimension(nbt));

                itemStack.setNbt();


                nbt.putBoolean("LodestoneTracked", true);
            } else {
                ItemStack itemStack2 = new ItemStack(ModItems.INTERSPACIAL_COMPASS, 1);
                NbtCompound nbtCompound = itemStack.hasNbt() ? itemStack.getNbt().copy() : new NbtCompound();
                itemStack2.setNbt(nbtCompound);
                if (!playerEntity.getAbilities().creativeMode) {
                    itemStack.decrement(1);
                }

                this.writeNbt(world.getRegistryKey(), blockPos, nbtCompound);
                if (!playerEntity.getInventory().insertStack(itemStack2)) {
                    playerEntity.dropItem(itemStack2, false);
                }
            }

            return ActionResult.success(world.isClient);
        }
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        if (InterspacialCompassItem.hasLodestone(stack)) {
            return UseAction.BOW;
        }

        return super.getUseAction(stack);
    }


    /**
     * {@return the maximum use (right-click) time of this item, in ticks}
     * Once a player has used an item for said number of ticks, they stop using it, and {@link Item#finishUsing} is called.
     *
     * @param stack
     */
    //@Override
    /*
    public int getMaxUseTime(ItemStack stack) {
        if (InterspacialCompassItem.hasLodestone(stack)) {
            return 24;
        }
        return super.getMaxUseTime(stack);
    }

    @Override
    public boolean isUsedOnRelease(ItemStack stack) {
        return true;
    }



    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity entity, int remainingUseTicks) {

        if (world.isClient) {
            //fovSetter.setMinecraftFov();
            return;
        }

        if ((entity instanceof PlayerEntity user) && !world.isClient && remainingUseTicks <= 0) {
            NbtCompound nbtCompound = stack.getNbt();
            if (InterspacialCompassItem.hasLodestone(stack) && !world.isClient()) {
                NbtElement lodestonePosKey = stack.getOrCreateNbt().get(InterspacialCompassItem.LODESTONE_POS_KEY);
                if (lodestonePosKey == null) {
                    return; // happens if lodestone is broken
                }
                BlockPos pos = NbtHelper.toBlockPos((NbtCompound) lodestonePosKey);
                Optional<RegistryKey<World>> optional = World.CODEC.parse(NbtOps.INSTANCE, nbtCompound.get("LodestoneDimension")).result();
                if (optional.isPresent()) {
                    // same dimension as user
                    if (optional.get().equals(world.getRegistryKey())) {
                        info("Dimensional Anchor used: Same dimension");
                        info("xpTpCosts enabled");
                        if (user.experienceLevel >= 5 || user.isCreative()) {
                            info("same dimension travel critera met. Executing...");
                            BlockPos tpPos = findTpPosition(pos, world);
                            if (tpPos != null) {
                                user.addExperience(-55);
                                user.teleport(tpPos.getX() + 0.5, tpPos.getY() + 1, tpPos.getZ() + 0.5);
                            } else {
                                user.sendMessage(Text.literal("Could not find suitable spot to teleport to! Teleport canceled"), true);
                            }
                            info("Executed.");
                        } else {
                            info("Same dimension travel criteria NOT met. Executing consequences...");
                            Random random = new Random();
                            int rand = random.nextInt(3);
                            doSameDimensionConsequences(rand, user, pos, stack, world, random);
                            info("Executed.");
                        }
                        return;
                    }
                    // different dimension
                    else {
                        info("Dimensional Anchor used: Different dimension");
                        ServerWorld lodestoneDimension = Objects.requireNonNull(world.getServer()).getWorld(optional.get());
                        info("xpTpCosts enabled");
                        if (user.experienceLevel >= 30 || user.isCreative()) {
                            info("different dimension travel critera met. Executing...");
                            user.addExperience(-1395);
                            BlockPos tpPos = findTpPosition(pos, lodestoneDimension);
                            if (tpPos != null) {
                                FabricDimensions.teleport(user, lodestoneDimension, new TeleportTarget(new Vec3d(tpPos.getX(), tpPos.getY() + 1, tpPos.getZ()), user.getVelocity(), user.getYaw(), user.getPitch()));
                            } else {
                                user.sendMessage(Text.literal("Could not find suitable spot to teleport to! Teleport canceled"), true);
                            }
                            info("Executed.");
                        } else {
                            info("Different dimension travel criteria NOT met. Executing consequences...");
                            Random random = new Random();

                            doDifferentDimensionConsequences(user, stack, world, random);
                            info("Executed.");
                        }
                        return;
                    }
                }
            }
        }
    }

    /**
     * Called when an item is used by a player.
     * The use action, by default, is bound to the right mouse button.
     *
     * <p>This method is called on both the logical client and logical server, so take caution when overriding this method.
     * The logical side can be checked using {@link World#isClient() world.isClient()}.
     *
     * @param world the world the item was used in
     * @param user  the player who used the item
     * @param hand  the hand used
     * @return a typed action result that specifies whether using the item was successful.
     * The action result contains the new item stack that the player's hand will be set to.
     */
    /*
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (InterspacialCompassItem.hasLodestone(user.getStackInHand(hand))) {
            if (world.isClient) {
                //fovSetter.getFov();
                return super.use(world, user, hand);
            }
            NbtElement lodestonePosKey = user.getStackInHand(hand).getOrCreateNbt().get(InterspacialCompassItem.LODESTONE_POS_KEY);
            if (lodestonePosKey == null) {
                user.sendMessage(Text.literal("Could not locate lodestone, was it broken?"), true);
                return super.use(world, user, hand);
            }
            user.sendMessage(Text.literal("Charging... (let go when fully charged)"), true);
            user.setCurrentHand(hand);
        }
        return super.use(world, user, hand);
    }

    private void doDifferentDimensionConsequences(PlayerEntity user, ItemStack stack, World world, Random random) {
        user.damage(world.getDamageSources().outOfWorld(), random.nextInt(6) + 5);
        stack.decrement(1);
        world.playSound(user, user.getBlockPos(), SoundEvents.BLOCK_ANVIL_BREAK, SoundCategory.AMBIENT, 1f, 1f);

        List<World> worlds = Lists.newArrayList(Objects.requireNonNull(world.getServer()).getWorlds());

        // can cast since server only holds serverworlds
        ServerWorld randomWorld = (ServerWorld) worlds.get(random.nextInt(worlds.size()));

        BlockPos targetPos = null;

        info("Found random world to tp to: " + randomWorld.getRegistryKey());

        while (targetPos == null) {
            int x = random.nextInt(-15000, 15001);
            int z = random.nextInt(-15000, 15001);
            int y = random.nextInt(-63, 300);

            BlockPos attemptedPos = new BlockPos(x, y, z);
            if ((world.getBlockState(attemptedPos).isAir() && world.getBlockState(attemptedPos.up()).isAir()) || (world.getBlockState(attemptedPos).getFluidState().isIn(FluidTags.WATER))) {
                targetPos = attemptedPos;
            }
        }

        info("Found target BlockPos: " + targetPos + ". Teleporting now...");
        FabricDimensions.teleport(user, randomWorld, new TeleportTarget(new Vec3d(targetPos.getX(), targetPos.getY() + 1, targetPos.getZ()), user.getVelocity(), user.getYaw(), user.getPitch()));
    }


    private void doSameDimensionConsequences(int rand, PlayerEntity user, BlockPos pos, ItemStack stack, World world, Random random) {
        switch (rand) {
            case 0 -> {
                info("case 0, damaging user and tp..ing to right coords");
                user.damage(world.getDamageSources().generic(), random.nextInt(5) + 1);
                BlockPos tpPos = findTpPosition(pos, world);
                if (tpPos != null) {
                    user.teleport(tpPos.getX(), tpPos.getY() + 1, tpPos.getZ());
                } else {
                    user.sendMessage(Text.literal("Could not find suitable spot to teleport to! Teleport canceled"), true);
                }
            }
            case 1 -> {
                info("case 1, getting rid of compass");
                stack.decrement(1);
                world.playSound(user, user.getBlockPos(), SoundEvents.BLOCK_ANVIL_BREAK, SoundCategory.AMBIENT, 1f, 1f);
            }
            case 2 -> {
                info("case 2, tping randomly within 25 block radius of lodestone blockPos: " + pos);
                BlockPos targetPos = null;
                for (BlockPos blockPos : BlockPos.iterateRandomly(net.minecraft.util.math.random.Random.create(), 300, pos, 25)) {
                    if ((world.getBlockState(blockPos).isAir() && world.getBlockState(blockPos.up()).isAir()) || (world.getBlockState(blockPos).getFluidState().isIn(FluidTags.WATER))) {
                        targetPos = blockPos;
                        break;
                    }
                }
                if (targetPos == null) {
                    info("could not find suitable coord to tp too, doing same dim consequences again");
                    doSameDimensionConsequences(random.nextInt(2), user, pos, stack, world, random);
                } else {
                    info("Found target BlockPos: " + targetPos + ". Teleporting now...");
                    user.teleport(targetPos.getX(), targetPos.getY(), targetPos.getZ());
                }
            }
            default -> throw new IllegalStateException("Tried to do consequences for Dimensional Anchor with a value higher than expected!");
        }
    }

    private static BlockPos findTpPosition(BlockPos lodestonePos, World world) {

        if ((world.getBlockState(lodestonePos.up()).isAir() && world.getBlockState(lodestonePos.up().up()).isAir()) || (world.getBlockState(lodestonePos).getFluidState().isIn(FluidTags.WATER))) {
            return lodestonePos;
        }

        BlockPos targetPos = null;
        for (BlockPos blockPos : BlockPos.iterateOutwards(lodestonePos, 5, 5, 5)) {
            if ((world.getBlockState(blockPos).isAir() && world.getBlockState(blockPos.up()).isAir()) || (world.getBlockState(blockPos).getFluidState().isIn(FluidTags.WATER))) {
                targetPos = blockPos;
                break;
            }
        }

        return targetPos;
    }

    private static void info(String s) {
        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            LOGGER.info(s);
        }

    }

    public String getTranslationKey(ItemStack stack) {
        return hasLodestone(stack) ? "item.wanilla.anchored_interspacial_compass" : super.getTranslationKey(stack);
    }
}

     */
