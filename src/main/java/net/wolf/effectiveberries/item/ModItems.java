package net.wolf.effectiveberries.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.wolf.effectiveberries.EffectiveBerries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EffectiveBerries.MOD_ID);

    public static final DeferredItem<Item> SWIFTNESS_BERRIES = ITEMS.register("swiftness_berries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SWIFTNESS_BERRIES).stacksTo(16)));
    public static final DeferredItem<Item> LEAPING_BERRIES = ITEMS.register("leaping_berries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LEAPING_BERRIES).stacksTo(16)));
    public static final DeferredItem<Item> STRENGTH_BERRIES = ITEMS.register("strength_berries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STRENGTH_BERRIES).stacksTo(16)));
    public static final DeferredItem<Item> REGENERATION_BERRIES = ITEMS.register("regeneration_berries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.REGENERATION_BERRIES).stacksTo(16)));
    public static final DeferredItem<Item> JACK_OF_ALL_BERRIES = ITEMS.register("jack_of_all_berries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.JACK_OF_ALL_BERRIES).stacksTo(16)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.effectiveberries.jack_of_all_berries.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
