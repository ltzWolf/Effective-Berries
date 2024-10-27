package net.wolf.effectiveberries.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties SWIFTNESS_BERRIES = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 2), 1f).build();
    public static final FoodProperties LEAPING_BERRIES = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 200, 2), 1f).build();

}
