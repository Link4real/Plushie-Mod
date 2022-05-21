package com.link.plushies;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("plushies")
public class Plushies {
    public static final String MOD_ID = "plushies";

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.PANDA.get());
        }
    };

    public Plushies() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Items.ITEMS.register(eventBus);
        Blocks.BLOCKS.register(eventBus);
    }
}
