package net.hotaru.glamothiumarsenal.item;

import net.hotaru.glamothiumarsenal.GlamothiumArsenal;
import net.hotaru.glamothiumarsenal.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier GLAMOTHIUM = TierSortingRegistry.registerTier(new ForgeTier(5, 1500, 5, 4, 25, ModTags.Blocks.NEEDS_GLAMOTHIUM_TOOL, () -> Ingredient.of(ModItems.GLAMOTHIUM.get())), new ResourceLocation(GlamothiumArsenal.MODID, "glamothium"), List.of(Tiers.NETHERITE), List.of());
}
