package net.hotaru.glamothiumarsenal.item;

import net.hotaru.glamothiumarsenal.GlamothiumArsenal;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GlamothiumArsenal.MODID);

    public static final RegistryObject<CreativeModeTab> GLAMOTHIUM_TAB = CREATIVE_MODE_TABS.register("glamothium_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GLAMOTHIUM.get())).title(Component.translatable("creativetab.glamothium_tab")).displayItems((pParameters, pOutput) -> {pOutput.accept(ModItems.GLAMOTHIUM.get());
        pOutput.accept(ModItems.GLAMOTHIUM_HELMET.get());
        pOutput.accept(ModItems.GLAMOTHIUM_CHESTPLATE.get());
        pOutput.accept(ModItems.GLAMOTHIUM_LEGGINGS.get());
        pOutput.accept(ModItems.GLAMOTHIUM_BOOTS.get());
        pOutput.accept(ModItems.GLAMOTHIUM_PICKAXE.get());
        pOutput.accept(ModItems.GLAMOTHIUM_AXE.get());
        pOutput.accept(ModItems.GLAMOTHIUM_SHOVEL.get());
        pOutput.accept(ModItems.GLAMOTHIUM_HOE.get());
        pOutput.accept(ModItems.GLAMOTHIUM_SWORD.get());
        pOutput.accept(ModItems.GNAWSTING_SPAWN_EGG.get());
    }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
