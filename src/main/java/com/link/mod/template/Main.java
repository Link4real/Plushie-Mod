package com.link.mod.template;

import com.link.mod.template.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {




    public static final String MOD_ID = "modid";







    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
