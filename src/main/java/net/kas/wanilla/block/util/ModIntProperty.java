package net.kas.wanilla.block.util;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import net.minecraft.state.property.Property;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public class ModIntProperty extends Property<Integer> {
    private final ImmutableSet<Integer> values;
    private final int min;
    private final int max;

    public ModIntProperty(String name, int min, int max) {
        super(name, Integer.class);
        if (min < 0) {
            throw new IllegalArgumentException("Min value of " + name + " must be 0 or greater");
        } else if (max <= min) {
            throw new IllegalArgumentException("Max value of " + name + " must be greater than min (" + min + ")");
        } else {
            this.min = min;
            this.max = max;
            Set<Integer> set = Sets.newHashSet();

            for (int i = min; i < max; ++i) {
                set.add(i);
            }

            this.values = ImmutableSet.copyOf(set);
        }
    }

    public Collection<Integer> getValues() {
        return this.values;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object instanceof ModIntProperty modIntProperty && super.equals(object)) {
            return this.values.equals(modIntProperty.values);
        } else {
            return false;
        }
    }

    public int computeHashCode() {
        return 31 * super.computeHashCode() + this.values.hashCode();
    }

    public static ModIntProperty of(String name, int min, int max) {
        return new ModIntProperty(name, min, max);
    }

    public Optional<Integer> parse(String name) {
        try {
            Integer integer = Integer.valueOf(name);
            return integer >= this.min && integer <= this.max ? Optional.of(integer) : Optional.empty();
        } catch (NumberFormatException var3) {
            return Optional.empty();
        }
    }

    public String name(Integer integer) {
        return integer.toString();
    }
}
