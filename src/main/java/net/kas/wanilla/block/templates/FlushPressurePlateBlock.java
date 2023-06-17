//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.kas.wanilla.block.templates;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.Iterator;
import java.util.List;

public class FlushPressurePlateBlock extends AbstractPressurePlateBlock {
    protected static final VoxelShape PRESSED_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 0.5, 16.0);
    protected static final VoxelShape DEFAULT_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
    public static final BooleanProperty POWERED;
    private final ActivationRule type;
    private final SoundEvent depressSound;
    private final SoundEvent pressSound;

    public FlushPressurePlateBlock(ActivationRule type, AbstractBlock.Settings settings, SoundEvent depressSound, SoundEvent pressSound) {
        super(settings, BlockSetType.GOLD);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(POWERED, false));
        this.type = type;
        this.depressSound = depressSound;
        this.pressSound = pressSound;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.getRedstoneOutput(state) > 0 ? PRESSED_SHAPE : DEFAULT_SHAPE;
    }

    protected int getRedstoneOutput(BlockState state) {
        return (Boolean)state.get(POWERED) ? 15 : 0;
    }

    protected BlockState setRedstoneOutput(BlockState state, int rsOut) {
        return (BlockState)state.with(POWERED, rsOut > 0);
    }

    protected void playPressSound(WorldAccess world, BlockPos pos) {
        world.playSound((PlayerEntity)null, pos, this.pressSound, SoundCategory.BLOCKS);
    }

    protected void playDepressSound(WorldAccess world, BlockPos pos) {
        world.playSound((PlayerEntity)null, pos, this.depressSound, SoundCategory.BLOCKS);
    }

    protected int getRedstoneOutput(World world, BlockPos pos) {
        Box box = BOX.offset(pos);
        List list;
        switch (this.type) {
            case EVERYTHING:
                list = world.getOtherEntities((Entity)null, box);
                break;
            case MOBS:
                list = world.getNonSpectatingEntities(LivingEntity.class, box);
                break;
            default:
                return 0;
        }

        if (!list.isEmpty()) {
            Iterator var5 = list.iterator();

            while(var5.hasNext()) {
                Entity entity = (Entity)var5.next();
                if (!entity.canAvoidTraps()) {
                    return 15;
                }
            }
        }

        return 0;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{POWERED});
    }

    static {
        POWERED = Properties.POWERED;
    }

    public static enum ActivationRule {
        EVERYTHING,
        MOBS;

        private ActivationRule() {
        }
    }
}
