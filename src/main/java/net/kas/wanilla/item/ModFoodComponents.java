package net.kas.wanilla.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent NETHERITE_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 3), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3600, 4), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1200, 0), 1.0F).alwaysEdible().build();
    public static final FoodComponent AMETHYST_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 200, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 600, 0), 1.0F).alwaysEdible().build();
    public static final FoodComponent DIAMOND_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 12000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2400, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 12000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 2), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 12000, 0), 1.0F).alwaysEdible().build();
    public static final FoodComponent EMERALD_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 36000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 36000, 0), 1.0F).alwaysEdible().build();
    public static final FoodComponent RUBY_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 6000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 6000, 3), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 20, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 3), 1.0F).alwaysEdible().build();
    public static final FoodComponent LAPIS_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.3F).alwaysEdible().build();

}
