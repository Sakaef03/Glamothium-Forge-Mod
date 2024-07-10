package net.hotaru.glamothiumarsenal.util;

import net.hotaru.glamothiumarsenal.GlamothiumArsenal;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.tags.TagKey;

public class ModTags {
    public static class Blocks
    {
        public static final TagKey<Block> NEEDS_GLAMOTHIUM_TOOL = tag("needs_glamothium_tool");

        private static TagKey<Block> tag(String name)
        {
            return BlockTags.create(new ResourceLocation(GlamothiumArsenal.MODID, name));
        }
    }

    public static class Items
    {
        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(new ResourceLocation(GlamothiumArsenal.MODID, name));
        }
    }
}
