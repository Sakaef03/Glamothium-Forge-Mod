package net.hotaru.glamothiumarsenal.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.hotaru.glamothiumarsenal.GlamothiumArsenal;
import net.hotaru.glamothiumarsenal.entity.custom.GnawStingEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GnawStingRenderer extends MobRenderer<GnawStingEntity, GnawStingModel<GnawStingEntity>>
{
    public GnawStingRenderer(EntityRendererProvider.Context pContext)
    {
        super(pContext, new GnawStingModel<>(pContext.bakeLayer(ModModelLayers.GNAWSTING_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(GnawStingEntity pEntity)
    {
        return new ResourceLocation(GlamothiumArsenal.MODID, "textures/entity/gnawsting.png");
    }

    @Override
    public void render(GnawStingEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
