package net.kas.wanilla.block;

import net.kas.wanilla.block.util.ModTags;
import net.minecraft.block.*;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.Random;

public class BrazierBlock extends Block implements Waterloggable {
    protected static final VoxelShape BRAZIER_SHAPE = Block.createCuboidShape(2D, 0.0D, 2D, 14D, 14D, 14D);
    protected static final VoxelShape BRAZIER_COLLISION_SHAPE = Block.createCuboidShape(2.5D, 0.0D, 2.5D, 13.5D, 13.5D, 13.5D);
    public static final BooleanProperty LIT = Properties.LIT;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    private final boolean isSoul;

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
        builder.add(WATERLOGGED);
    }
    public BrazierBlock(Settings settings, boolean isSoul) {
        super(settings);
        this.setDefaultState(getStateManager().getDefaultState().with(LIT, true).with(WATERLOGGED, true));
        this.isSoul = isSoul;
    }

    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        if (!entityIn.isFireImmune() && state.get(LIT) && entityIn instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity) entityIn)) {
            if (entityIn.getY() >= state.getCollisionShape(worldIn, pos).getMax(Direction.Axis.Y) + pos.getY() - 0.1f) {
                entityIn.damage(DamageSource.IN_FIRE, 1.0F);
            }
        }
        super.onEntityCollision(state, worldIn, pos, entityIn);
    }


    //@Override
    public BlockState getStateForPlacement(ItemPlacementContext context) {
        WorldAccess iworld = context.getWorld();
        BlockPos blockpos = context.getBlockPos();
        boolean flag = iworld.getFluidState(blockpos).getFluid() == Fluids.WATER;
        return this.getDefaultState().with(WATERLOGGED, flag).with(LIT, !flag);
    }

    //@Override
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, WorldAccess worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.get(WATERLOGGED)) {
            worldIn.createAndScheduleBlockTick(currentPos, Blocks.WATER, Fluids.WATER.getTickRate(worldIn));
        }
        return super.getStateForNeighborUpdate(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    //@Override
    public ActionResult use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockHitResult hit) {
        ItemStack heldItem = player.getStackInHand(handIn);
        if (state.get(LIT)) {
            if (heldItem.getItem() instanceof ShovelItem) {
                worldIn.playSound(null, pos, SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE,  SoundCategory.BLOCKS, 0.8F, 1.0F);

                worldIn.setBlockState(pos, state.with(LIT, Boolean.FALSE));
                return ActionResult.SUCCESS;
            }
        } else if (!state.get(WATERLOGGED)) {
            if (hit.getSide() == Direction.UP && heldItem.getItem() == Items.FLINT_AND_STEEL || heldItem.getItem() == Items.FIRE_CHARGE) {

                SoundEvent sound = (heldItem.getItem() == Items.FIRE_CHARGE) ? SoundEvents.ITEM_FIRECHARGE_USE : SoundEvents.ITEM_FLINTANDSTEEL_USE;
                worldIn.playSound(null, pos, sound, SoundCategory.BLOCKS, 1.0F, worldIn.random.nextFloat() * 0.4F + 0.8F);

                worldIn.setBlockState(pos, state.with(LIT, true));
                return ActionResult.CONSUME;

            }
        }
        return super.onUse(state, worldIn, pos, player, handIn, hit);
    }

    //@Override
    public VoxelShape getShape(BlockState state, BlockView worldIn, BlockPos pos, ShapeContext context) {
        return BRAZIER_SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView worldIn, BlockPos pos, ShapeContext context) {
        return BRAZIER_COLLISION_SHAPE;
    }


    //@Override
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        if (stateIn.get(LIT)) {
            if (rand.nextInt(10) == 0) {
                worldIn.playSound((double) ((float) pos.getX() + 0.5F), (double) ((float) pos.getY() + 0.5F), (double) ((float) pos.getZ() + 0.5F), SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 0.5F + rand.nextFloat(), rand.nextFloat() * 0.7F + 0.6F, false);
            }

            if (rand.nextInt(5) == 0) {
                for (int i = 0; i < rand.nextInt(1) + 1; ++i) {
                    if (isSoul) {
                        worldIn.addParticle(ParticleTypes.SOUL, pos.getX() + 0.5f, pos.getY() + 0.8f, pos.getZ() + 0.5f, ((rand.nextFloat() - 0.5f) / 10.0f), (rand.nextFloat()) / 5.0f, ((rand.nextFloat() - 0.5) / 10.0f));
//                        worldIn.addParticle(ParticleTypes.SOUL, (double) ((float) pos.getX() + 0.5F), (double) ((float) pos.getY() + 0.8F), (double) ((float) pos.getZ() + 0.5F), (double) (rand.nextFloat() / 10.0F), 5.0E-5D, (double) (rand.nextFloat() / 10.0F));
                    } else {
                        worldIn.addParticle(ParticleTypes.LAVA, pos.getX() + 0.5F, pos.getY() + 0.8F, pos.getZ() + 0.5F, (rand.nextFloat() / 2.0F), 5.0E-5D, rand.nextFloat() / 2.0F);
                    }
                }
            }

        }
    }

    @Override
    public void onProjectileHit(World worldIn, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
        BlockPos pos = hit.getBlockPos();
        if (!worldIn.isClient && projectile.isOnFire() && projectile.canModifyAt(worldIn, pos) && !state.get(LIT) && !state.get(WATERLOGGED)) {
            worldIn.setBlockState(pos, state.with(Properties.LIT, Boolean.TRUE), 11);
        }
    }

    //@Override
    public boolean placeLiquid(WorldAccess worldIn, BlockPos pos, BlockState state, FluidState fluidStateIn) {
        if (!state.get(Properties.WATERLOGGED) && fluidStateIn.getFluid() == Fluids.WATER) {
            boolean flag = state.get(LIT);
            if (flag) {
                worldIn.playSound((PlayerEntity) null, pos, SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
            worldIn.setBlockState(pos, state.with(WATERLOGGED, Boolean.TRUE).with(LIT, false), 3);
            worldIn.createAndScheduleBlockTick(pos, Blocks.WATER, fluidStateIn.getFluid().getTickRate(worldIn));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    //@Override
    protected void createBlockStateDefinition(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT, WATERLOGGED);
    }

    //@Override
    public boolean isPathfindable(BlockState state, BlockView worldIn, BlockPos pos, NavigationType type) {
        return false;
    }

    public static boolean isLitBrazier(BlockState blockState) {
        return blockState.contains(LIT) && blockState.isIn(ModTags.Blocks.BRAZIERS) && blockState.get(LIT);
    }
//    @Nullable
//    @Override
//    public BlockPathTypes getAiPathNodeType(BlockState state, BlockGetter world, BlockPos pos, @Nullable Mob entity) {
//        return BlockPathTypes.DAMAGE_FIRE;
//    }


}