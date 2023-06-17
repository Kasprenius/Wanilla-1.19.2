package net.kas.wanilla.block.templates;

import com.mojang.datafixers.optics.Wander;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.entities.CustomFurnaceEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
public class CustomFurnaceBlock extends BlockWithEntity {

    private static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;

    public static final BooleanProperty SOUL = BooleanProperty.of("soul");

    protected double speed;
    protected double fuel;
    protected int dupe;

    public CustomFurnaceBlock(Settings settings) {
        super(settings);
        this.speed = 1;
        this.fuel = 1;

        this.setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH).with(LIT, false).with(SOUL, false));
    }

    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return checkType(world, type, Wanilla.CUSTOM_FURNACE_ENTITY);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CustomFurnaceEntity(pos, state);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            this.openContainer(world, pos, player);
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (!state.isOf(newState.getBlock())) {
            BlockEntity be = world.getBlockEntity(pos);
            if (be instanceof CustomFurnaceEntity furnace) {
                if (world instanceof ServerWorld) {
                    ItemScatterer.spawn(world, pos, furnace);
                    ((CustomFurnaceEntity)be).getRecipesUsedAndDropExperience((ServerWorld)world, Vec3d.ofCenter(pos));
                }

                world.updateComparators(pos, this);
            }

            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    private void openContainer(World world, BlockPos blockPos, PlayerEntity playerEntity) {
        BlockEntity blockEntity = world.getBlockEntity(blockPos);

        if (blockEntity instanceof CustomFurnaceEntity) {
            playerEntity.openHandledScreen((NamedScreenHandlerFactory) blockEntity);
            playerEntity.increaseStat(Stats.INTERACT_WITH_FURNACE, 1);
        }
    }

    public List<ItemStack> getDroppedStacks(BlockState blockState, LootContext.Builder lootContext$Builder) {
        ArrayList<ItemStack> dropList = new ArrayList<ItemStack>();
        dropList.add(new ItemStack(this));
        return dropList;
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (state.get(LIT)) {
            double x = (double) pos.getX() + 0.5D;
            double y = (double) pos.getY();
            double z = (double) pos.getZ() + 0.5D;

            if (random.nextDouble() < 0.1D) {
                world.playSound(x, y, z, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
            }

            Direction direction_1 = state.get(FACING);
            Direction.Axis direction$Axis_1 = direction_1.getAxis();

            double double_5 = random.nextDouble() * 0.6D - 0.3D;
            double double_6 = direction$Axis_1 == Direction.Axis.X ? (double) direction_1.getOffsetX() * 0.52D : double_5;
            double double_7 = random.nextDouble() * 6.0D / 16.0D;
            double double_8 = direction$Axis_1 == Direction.Axis.Z ? (double) direction_1.getOffsetZ() * 0.52D : double_5;

            world.addParticle(ParticleTypes.SMOKE, x + double_6, y + double_7, z + double_8, 0.0D, 0.0D, 0.0D);
            if (state.get(SOUL)) {
                world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, x + double_6, y + double_7, z + double_8, 0.0D, 0.0D, 0.0D);
            } else {
                world.addParticle(ParticleTypes.FLAME, x + double_6, y + double_7, z + double_8, 0.0D, 0.0D, 0.0D);
            }

        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        if (context.getWorld().getBlockState(context.getBlockPos().down()).getBlock() == Blocks.SOUL_SAND || context.getWorld().getBlockState(context.getBlockPos().down()).getBlock() == Blocks.SOUL_SOIL) {
            return this.getDefaultState().with(SOUL, true).with(FACING, context.getHorizontalPlayerFacing().getOpposite());
        } else {
            return this.getDefaultState().with(FACING, context.getHorizontalPlayerFacing().getOpposite());
        }
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        if (itemStack.hasCustomName()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);

            if (blockEntity instanceof CustomFurnaceEntity) {
                ((CustomFurnaceEntity) blockEntity).setCustomName(itemStack.getName());
            }
        }
    }

    @Override
    public boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    @Override
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return ScreenHandler.calculateComparatorOutput(world.getBlockEntity(pos));
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, LIT);
        builder.add(SOUL);
    }

    @Nullable
    protected static <T extends BlockEntity> BlockEntityTicker<T> checkType(World world, BlockEntityType<T> givenType, BlockEntityType<? extends CustomFurnaceEntity> expectedType) {
        return world.isClient ? null : checkType(givenType, expectedType, CustomFurnaceEntity::tick);
    }

    public double getSpeedModifier() {
        return speed;
    }

    public double getFuelModifier() {
        return fuel;
    }

    public int getDuplicationChance() {
        return dupe;
    }
}