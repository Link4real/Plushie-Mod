package com.link.plushies.mod;

import com.link.plushies.mod.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {
    public static final String MOD_ID = "plushies";


    //ItemGroup!

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
            new Identifier("plushies", "main"))
            .icon(() -> new ItemStack(ModBlocks.PANDA_PLUSHIE))
            .appendItems(stacks -> {
             stacks.add(new ItemStack(ModBlocks.PANDA_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.SLIME_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.RED_FOX_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.WHITE_FOX_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.DRAGON_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.COW_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.MOOSHROOM_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.BEE_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.LLAMA_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.MAGMA_CUBE_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.AXOLOTL_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.TURTLE_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.SNOW_GOLEM_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.DOLPHIN_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.PARROT_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.WARDEN_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.FROG_PLUSHIE));
             stacks.add(new ItemStack(ModBlocks.GOAT_PLUSHIE));
            })
            .build();
    // ...

    @Override
    public void onInitialize() {
        ModBlocks.registerItems();
    }
}
