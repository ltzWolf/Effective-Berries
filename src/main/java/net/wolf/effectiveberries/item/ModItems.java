package net.wolf.effectiveberries.item;

import net.wolf.effectiveberries.EffectiveBerries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EffectiveBerries.MOD_ID);

    public static final DeferredItem<Item> SWIFTNESS_BERRIES = ITEMS.register("swiftness_berries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SWIFTNESS_BERRIES).stacksTo(16)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
