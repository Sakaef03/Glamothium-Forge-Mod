package net.hotaru.glamothiumarsenal.event;

import net.hotaru.glamothiumarsenal.GlamothiumArsenal;
import net.hotaru.glamothiumarsenal.entity.ModEntities;
import net.hotaru.glamothiumarsenal.entity.custom.GnawStingEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GlamothiumArsenal.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents
{
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event)
    {
        event.put(ModEntities.GNAWSTING.get(), GnawStingEntity.createAttributes().build());
    }
}
