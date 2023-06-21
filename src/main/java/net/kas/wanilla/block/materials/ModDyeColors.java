package net.kas.wanilla.block.materials;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.block.MapColor;
import net.minecraft.util.DyeColor;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.function.ValueLists;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public enum ModDyeColors implements StringIdentifiable {
    ANCIENT_GREEN(0, "ancient_green", 748874, MapColor.DARK_GREEN, 10483147, 5482881);
    //private static final IntFunction<DyeColor> BY_ID = ValueLists.createIdToValueFunction(DyeColor::getId, values(), ValueLists.OutOfBoundsHandling.ZERO);
    private static final Int2ObjectOpenHashMap<DyeColor> BY_FIREWORK_COLOR = new Int2ObjectOpenHashMap((Map) Arrays.stream(values()).collect(Collectors.toMap((color) -> {
        return color.fireworkColor;
    }, (color) -> {
        return color;
    })));
    public static final StringIdentifiable.Codec<DyeColor> CODEC = StringIdentifiable.createCodec(DyeColor::values);
    private final int id;
    private final String name;
    private final MapColor mapColor;
    private final float[] colorComponents;
    private final int fireworkColor;
    private final int signColor;

    private ModDyeColors(int id, String name, int color, MapColor mapColor, int fireworkColor, int signColor) {
        this.id = id;
        this.name = name;
        this.mapColor = mapColor;
        this.signColor = signColor;
        int j = (color & 16711680) >> 16;
        int k = (color & '\uff00') >> 8;
        int l = (color & 255) >> 0;
        this.colorComponents = new float[]{(float)j / 255.0F, (float)k / 255.0F, (float)l / 255.0F};
        this.fireworkColor = fireworkColor;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float[] getColorComponents() {
        return this.colorComponents;
    }

    public MapColor getMapColor() {
        return this.mapColor;
    }

    public int getFireworkColor() {
        return this.fireworkColor;
    }

    public int getSignColor() {
        return this.signColor;
    }

    /*public static DyeColor byId(int id) {
        return (DyeColor)BY_ID.apply(id);
    }

     */

    @Nullable
    @Contract("_,!null->!null;_,null->_")
    public static DyeColor byName(String name, @Nullable DyeColor defaultColor) {
        DyeColor dyeColor = (DyeColor)CODEC.byId(name);
        return dyeColor != null ? dyeColor : defaultColor;
    }

    @Nullable
    public static DyeColor byFireworkColor(int color) {
        return (DyeColor)BY_FIREWORK_COLOR.get(color);
    }

    public String toString() {
        return this.name;
    }

    public String asString() {
        return this.name;
    }
}
