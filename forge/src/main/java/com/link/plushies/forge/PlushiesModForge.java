package com.link.plushies.forge;

import dev.architectury.platform.forge.EventBuses;
import com.link.plushies.PlushiesMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PlushiesMod.MOD_ID)
public class PlushiesModForge {
    public PlushiesModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(PlushiesMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        PlushiesMod.init();
    }
}
