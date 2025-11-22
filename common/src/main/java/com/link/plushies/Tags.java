package com.link.plushies;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class Tags {
    public static final TagKey<Item> TAG_HUGGABLE = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PlushiesMod.MOD_ID, "huggable"));
}
