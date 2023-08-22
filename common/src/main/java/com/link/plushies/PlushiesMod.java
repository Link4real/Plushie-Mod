package com.link.plushies;

public class PlushiesMod {
    public static final String MOD_ID = "plushies";

    public static void init() {
        Blocks.BLOCKS.register();
        Items.ITEMS.register();
        Items.TABS.register();
    }
}
