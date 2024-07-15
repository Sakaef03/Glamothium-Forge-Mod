package net.hotaru.glamothiumarsenal.event;

import net.hotaru.glamothiumarsenal.GlamothiumArsenal;
import net.hotaru.glamothiumarsenal.entity.client.GnawStingModel;
import net.hotaru.glamothiumarsenal.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GlamothiumArsenal.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents
{
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        event.registerLayerDefinition(ModModelLayers.GNAWSTING_LAYER, GnawStingModel::createBodyLayer);
    }
}
