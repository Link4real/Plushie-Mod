package com.link.plushies.fabric;

import com.link.plushies.PlushiesMod;
import net.fabricmc.api.ModInitializer;

public class PlushiesModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        PlushiesMod.init();
    }
}
