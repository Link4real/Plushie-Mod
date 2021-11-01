package com.link.plushies.mod;

import com.link.plushies.mod.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {




    public static final String MOD_ID = "plushies";







    @Override
    public void onInitialize() {
        ModBlocks.registerItems();
    }
}
