package net.itzwolf.effectiveberries.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties BERRIES_OF_SWIFTNESS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 2), 1f).build();

    public static final FoodProperties BERRIES_OF_LEAPING = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 200, 2), 1f).build();

    public static final FoodProperties BERRIES_OF_STRENGTH = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 2), 1f).build();
    public static final FoodProperties BERRIES_OF_REGENERATION = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 2), 1f).build();
    public static final FoodProperties JACK_OF_ALL_BERRIES = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 2), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 200, 2), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 2), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 2), 1f).build();
}
