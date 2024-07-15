package net.hotaru.glamothiumarsenal.item;

import net.hotaru.glamothiumarsenal.GlamothiumArsenal;
import net.hotaru.glamothiumarsenal.entity.ModEntities;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
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

    public static final RegistryObject<Item> GLAMOTHIUM_BOOTS = ITEMS.register("glamothium_boots", () -> new ArmorItem(ModArmorMaterials.GLAMOTHIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> GLAMOTHIUM_PICKAXE = ITEMS.register("glamothium_pickaxe", () -> new PickaxeItem(ModToolTiers.GLAMOTHIUM, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> GLAMOTHIUM_AXE = ITEMS.register("glamothium_axe", () -> new AxeItem(ModToolTiers.GLAMOTHIUM, 7, 1, new Item.Properties()));

    public static final RegistryObject<Item> GLAMOTHIUM_SWORD = ITEMS.register("glamothium_sword", () -> new SwordItem(ModToolTiers.GLAMOTHIUM, 4, 2, new Item.Properties()));

    public static final RegistryObject<Item> GLAMOTHIUM_SHOVEL = ITEMS.register("glamothium_shovel", () -> new ShovelItem(ModToolTiers.GLAMOTHIUM, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> GLAMOTHIUM_HOE = ITEMS.register("glamothium_hoe", () -> new HoeItem(ModToolTiers.GLAMOTHIUM, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> GNAWSTING_SPAWN_EGG = ITEMS.register("gnawsting_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.GNAWSTING, 0x665199, 0xfe71fe, new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
