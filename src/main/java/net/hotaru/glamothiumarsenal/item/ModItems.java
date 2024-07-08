package net.hotaru.glamothiumarsenal.item;

import net.hotaru.glamothiumarsenal.GlamothiumArsenal;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GlamothiumArsenal.MODID);

    public static final RegistryObject<Item> GLAMOTHIUM = ITEMS.register("glamothium", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
