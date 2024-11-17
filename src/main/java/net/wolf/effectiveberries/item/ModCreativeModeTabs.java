package net.wolf.effectiveberries.item;

import net.wolf.effectiveberries.EffectiveBerries;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.awt.*;
import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EffectiveBerries.MOD_ID);

    public static final Supplier<CreativeModeTab> EFFECTIVE_BERRIES = CREATIVE_MODE_TAB.register("effective_berries",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SWIFTNESS_BERRIES.get()))
                    .title(Component.translatable("creativetab.effectiveberries.effective_berries"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SWIFTNESS_BERRIES);
                        output.accept(ModItems.LEAPING_BERRIES);
                        output.accept(ModItems.STRENGTH_BERRIES);
                        output.accept(ModItems.REGENERATION_BERRIES);
                        output.accept(ModItems.JACK_OF_ALL_BERRIES);
                     }).build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
