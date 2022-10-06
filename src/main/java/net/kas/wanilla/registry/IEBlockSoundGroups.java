package net.kas.wanilla.registry;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

import static net.kas.wanilla.registry.IESoundEvents.DULLSTONE_BREAK;
import static net.kas.wanilla.registry.IESoundEvents.DULLSTONE_FALL;
import static net.kas.wanilla.registry.IESoundEvents.DULLSTONE_HIT;
import static net.kas.wanilla.registry.IESoundEvents.DULLSTONE_PLACE;
import static net.kas.wanilla.registry.IESoundEvents.DULLSTONE_STEP;

public class IEBlockSoundGroups {

    /*
    Block Sound Groups
     */
    public static final BlockSoundGroup DULLSTONE = new BlockSoundGroup(1.0F, 1.0F, DULLSTONE_BREAK, DULLSTONE_STEP, DULLSTONE_PLACE, DULLSTONE_HIT, DULLSTONE_FALL);
    public static final BlockSoundGroup DIMSTONE = new BlockSoundGroup(1.0F, 1.0F, SoundEvents.BLOCK_GLASS_BREAK, DULLSTONE_STEP, SoundEvents.BLOCK_GLASS_PLACE, SoundEvents.BLOCK_GLASS_HIT, SoundEvents.BLOCK_GLASS_FALL);

    @SuppressWarnings("unused")
    public static void register(){
    }

}
