package net.hotaru.glamothiumarsenal.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.hotaru.glamothiumarsenal.GlamothiumArsenal;
import net.hotaru.glamothiumarsenal.entity.animations.ModAnimationDefinitions;
import net.hotaru.glamothiumarsenal.entity.custom.GnawStingEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class GnawStingModel<T extends Entity> extends HierarchicalModel<T> {
	//public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(GlamothiumArsenal.MODID, "gnawsting_layer"), "main");
	private final ModelPart gnawsting;
	private final ModelPart body;
	private final ModelPart left_wing;
	private final ModelPart right_wing;
	private final ModelPart front_legs;
	private final ModelPart middle_legs;
	private final ModelPart back_legs;
	private final ModelPart left_antenna;
	private final ModelPart stinger;
	private final ModelPart right_antenna;
	private final ModelPart torso;

	public GnawStingModel(ModelPart root) {
		this.gnawsting = root.getChild("gnawsting");
		this.body = gnawsting.getChild("body");
		this.torso = gnawsting.getChild("torso");
		this.left_wing = gnawsting.getChild("left_wing");
		this.right_wing = gnawsting.getChild("right_wing");
		this.front_legs = gnawsting.getChild("front_legs");
		this.middle_legs = gnawsting.getChild("middle_legs");
		this.back_legs = gnawsting.getChild("back_legs");
		this.left_antenna = gnawsting.getChild("left_antenna");
		this.stinger = gnawsting.getChild("stinger");
		this.right_antenna = gnawsting.getChild("right_antenna");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition gnawsting = partdefinition.addOrReplaceChild("gnawsting", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = gnawsting.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_wing = gnawsting.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.5F, -9.0F, -3.0F));

		PartDefinition right_wing = gnawsting.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(0, 18).addBox(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -9.0F, -3.0F));

		PartDefinition front_legs = gnawsting.addOrReplaceChild("front_legs", CubeListBuilder.create().texOffs(28, 1).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -2.0F, -2.0F));

		PartDefinition middle_legs = gnawsting.addOrReplaceChild("middle_legs", CubeListBuilder.create().texOffs(27, 3).addBox(-4.0F, 0.0F, 0.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -2.0F, 0.0F));

		PartDefinition back_legs = gnawsting.addOrReplaceChild("back_legs", CubeListBuilder.create().texOffs(27, 5).addBox(-4.0F, 0.0F, 0.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -2.0F, 2.0F));

		PartDefinition left_antenna = gnawsting.addOrReplaceChild("left_antenna", CubeListBuilder.create().texOffs(2, 0).addBox(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, -5.0F));

		PartDefinition stinger = gnawsting.addOrReplaceChild("stinger", CubeListBuilder.create().texOffs(24, 7).addBox(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 0.0F));

		PartDefinition right_antenna = gnawsting.addOrReplaceChild("right_antenna", CubeListBuilder.create().texOffs(2, 3).addBox(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, -5.0F));

		PartDefinition torso = gnawsting.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.animateWalk(ModAnimationDefinitions.walk, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((GnawStingEntity) entity).idleAnimationState, ModAnimationDefinitions.idle, ageInTicks, 1f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		gnawsting.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return gnawsting;
	}
}