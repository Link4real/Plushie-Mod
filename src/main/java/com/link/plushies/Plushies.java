package com.link.plushies;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("plushies")
public class Plushies {
    public static final String MOD_ID = "plushies";

    public Plushies() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Blocks.BLOCKS.register(modEventBus);
        Items.ITEMS.register(modEventBus);
        Items.CREATIVE_MODE_TABS.register(modEventBus);
    }
}
