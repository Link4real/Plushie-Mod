package com.link.plushies;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("plushies")
public class Plushies {
    public static final String MOD_ID = "plushies";

    public Plushies() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Items.ITEMS.register(eventBus);
        Blocks.BLOCKS.register(eventBus);

        eventBus.addListener(this::registerCreativeTab);
    }

    @SubscribeEvent
    public void registerCreativeTab(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation(MOD_ID), builder -> {
            builder.title(Component.literal("Plushies"))
                    .icon(() -> new ItemStack(Items.SNOW_GOLEM.get()))
                    .displayItems((enabledFlags, tabOutput, hasPermissions) -> {
                        tabOutput.accept(Items.SNOW_GOLEM.get());
                        tabOutput.accept(Items.AXOLOTL.get());
                        tabOutput.accept(Items.BEE.get());
                        tabOutput.accept(Items.CAT.get());
                        tabOutput.accept(Items.COW.get());
                        tabOutput.accept(Items.DOLPHIN.get());
                        tabOutput.accept(Items.DRAGON.get());
                        tabOutput.accept(Items.ENDERMAN.get());
                        tabOutput.accept(Items.FROG.get());
                        tabOutput.accept(Items.GOAT.get());
                        tabOutput.accept(Items.LLAMA.get());
                        tabOutput.accept(Items.SLIME.get());
                        tabOutput.accept(Items.MAGMA_CUBE.get());
                        tabOutput.accept(Items.MOOSHROOM.get());
                        tabOutput.accept(Items.PANDA.get());
                        tabOutput.accept(Items.PARROT.get());
                        tabOutput.accept(Items.RED_FOX.get());
                        tabOutput.accept(Items.WHITE_FOX.get());
                        tabOutput.accept(Items.WARDEN.get());
                        tabOutput.accept(Items.SHEEP.get());
                        tabOutput.accept(Items.TURTLE.get());
                    }).build();
        });
    }
}