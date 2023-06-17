package net.kas.wanilla.registry;

import net.kas.wanilla.Wanilla;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;


public class IESoundEvents {

    /*
    Dullstone
     */
    public static final SoundEvent DULLSTONE_BREAK = register("block.dullstone.break");
    public static final SoundEvent DULLSTONE_STEP = register("block.dullstone.step");
    public static final SoundEvent DULLSTONE_PLACE = register("block.dullstone.place");
    public static final SoundEvent DULLSTONE_HIT = register("block.dullstone.hit");
    public static final SoundEvent DULLSTONE_FALL = register("block.dullstone.fall");



    /*
    Util Functions
     */

    @SuppressWarnings("unused")
    public static void register() {
    }

    public static SoundEvent register(String ID) {
        Identifier identifier = new Identifier(Wanilla.MOD_ID, ID);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }
}
