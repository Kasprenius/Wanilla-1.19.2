package net.kas.wanilla.block.templates;

import net.kas.wanilla.enchantment.ModEnchantments;
import net.kas.wanilla.item.ModItems;
import net.kas.wanilla.item.custom.EmptyGlassJarItem;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import static net.minecraft.enchantment.EnchantmentHelper.getEquipmentLevel;

public class EndLightBlock extends Block  {
    public static final BooleanProperty LIT;
    VoxelShape SOLID = VoxelShapes.fullCube();
    VoxelShape NOT_SOLID = VoxelShapes.empty();

    public EndLightBlock(Settings settings) {

        super(settings);
        this.setDefaultState((BlockState)this.getDefaultState().with(LIT, false));
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        Item item = itemStack.getItem();
        if (item instanceof EmptyGlassJarItem) {
            if (!player.isCreative()) {
                itemStack.decrement(1);
            }
            world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_BEACON_POWER_SELECT, SoundCategory.BLOCKS, 0.5F, 2.0F);
            world.setBlockState(pos, Blocks.AIR.getDefaultState());

            player.getInventory().offerOrDrop(ModItems.ENDLIGHT_GLASS_JAR.getDefaultStack());

            return ActionResult.SUCCESS;
        }
        return ActionResult.FAIL;
    }
    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        return stateFrom.isOf(this) ? true : super.isSideInvisible(state, stateFrom, direction);
    }

    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.empty();
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return context.isHolding(ModItems.EMPTY_GLASS_JAR) || context.isHolding(ModItems.ENDLIGHT_GLASS_JAR) ? VoxelShapes.fullCube() : VoxelShapes.empty();
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        //boolean isPowered = (Boolean)state.get(LIT);
        if (context instanceof EntityShapeContext entityShapeContext) {
            Entity entity = entityShapeContext.getEntity();
            if (entity != null) {
                if (canWalkOnEndLight(entity) &&
                        context.isAbove(VoxelShapes.fullCube(), pos, false) &&
                        !context.isDescending() && world.getBlockState(pos.up()).getBlock() != state.getBlock()) {
                    return SOLID;
                }
            }
        }
        /*
        else if (isPowered) {
            return SOLID;
        }*/
        return NOT_SOLID;
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (!world.isClient) {
            boolean bl = (Boolean)state.get(LIT);
            if (bl != world.isReceivingRedstonePower(pos)) {
                if (bl) {
                    world.scheduleBlockTick(pos, this, 4);
                } else {
                    world.setBlockState(pos, (BlockState)state.cycle(LIT), 2);
                }
            }

        }
    }

    @Override
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SOLID;
    }
    public static boolean canWalkOnEndLight(Entity entity) {
        /*
        if (entity.getType().isIn(ModTags.ENDLIGHT_WALKABLE_MOBS)) {
            return true;
        } else {
         */
            return entity instanceof LivingEntity && hasLightWalker((LivingEntity) entity);
       // }
    }
    public static boolean hasLightWalker(LivingEntity entity) {
        return getEquipmentLevel(ModEnchantments.LIGHT_WALKER, entity) > 0;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    static {
        LIT = RedstoneLampBlock.LIT;
    }
}
