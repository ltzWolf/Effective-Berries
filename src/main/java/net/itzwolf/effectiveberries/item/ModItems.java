package net.itzwolf.effectiveberries.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.itzwolf.effectiveberries.EffectiveBerries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EffectiveBerries.MOD_ID);

    public static final DeferredItem<Item> BERRIES_OF_SWIFTNESS = ITEMS.register("berries_of_swiftness",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BERRIES_OF_SWIFTNESS).stacksTo(16)));
    public static final DeferredItem<Item> BERRIES_OF_LEAPING = ITEMS.register("berries_of_leaping",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BERRIES_OF_LEAPING).stacksTo(16)));
    public static final DeferredItem<Item> BERRIES_OF_STRENGTH = ITEMS.register("berries_of_strength",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BERRIES_OF_STRENGTH).stacksTo(16)));
    public static final DeferredItem<Item> BERRIES_OF_REGENERATION = ITEMS.register("berries_of_regeneration",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BERRIES_OF_REGENERATION).stacksTo(16)));
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
