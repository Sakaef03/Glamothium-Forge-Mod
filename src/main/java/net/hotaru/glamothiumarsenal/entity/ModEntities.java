package net.hotaru.glamothiumarsenal.entity;

import net.hotaru.glamothiumarsenal.GlamothiumArsenal;
import net.hotaru.glamothiumarsenal.entity.custom.GnawStingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities
{
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GlamothiumArsenal.MODID);

    public static final RegistryObject<EntityType<GnawStingEntity>>  GNAWSTING = ENTITY_TYPES.register("gnawsting", () -> EntityType.Builder.of(GnawStingEntity::new, MobCategory.CREATURE).sized(1.0f, 1.0f).build("gnawsting"));

    public static void register(IEventBus eventBus)
    {
        ENTITY_TYPES.register(eventBus);
    }
}
