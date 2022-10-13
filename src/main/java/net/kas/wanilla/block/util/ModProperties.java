package net.kas.wanilla.block.util;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Property;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;


public class ModProperties {
    public static final ModIntProperty RUNS = new ModIntProperty("runs", 0, 9);


    public ModProperties() {
    }
}


