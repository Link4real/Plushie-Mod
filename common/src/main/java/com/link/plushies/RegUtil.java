package com.link.plushies;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public class RegUtil {
    public static <T> ResourceKey<T> resourceId(ResourceKey<Registry<T>> registry, String item) {
        return ResourceKey.create(registry, ResourceLocation.fromNamespaceAndPath(PlushiesMod.MOD_ID, item));
    }
}
