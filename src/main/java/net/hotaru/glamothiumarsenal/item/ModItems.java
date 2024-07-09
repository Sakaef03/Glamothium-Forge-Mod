package net.hotaru.glamothiumarsenal.item;

import net.hotaru.glamothiumarsenal.GlamothiumArsenal;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GlamothiumArsenal.MODID);

    public static final RegistryObject<Item> GLAMOTHIUM = ITEMS.register("glamothium", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GLAMOTHIUM_HELMET = ITEMS.register("glamothium_helmet", () -> new ArmorItem(ModArmorMaterials.GLAMOTHIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> GLAMOTHIUM_CHESTPLATE = ITEMS.register("glamothium_chestplate", () -> new ArmorItem(ModArmorMaterials.GLAMOTHIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> GLAMOTHIUM_LEGGINGS = ITEMS.register("glamothium_leggings", () -> new ArmorItem(ModArmorMaterials.GLAMOTHIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> GLAMOTHIUM_BOOTS= ITEMS.register("glamothium_boots", () -> new ArmorItem(ModArmorMaterials.GLAMOTHIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
