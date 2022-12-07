package com.link.plushies.mod;

import com.link.plushies.mod.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {
    public static final String MOD_ID = "plushies";

    ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier("plushies", "main"))
            .displayName(Text.literal("Plushie Mod"))
            .icon(() -> new ItemStack(ModBlocks.PANDA_PLUSHIE))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(ModBlocks.PANDA_PLUSHIE);
                entries.add(ModBlocks.SLIME_PLUSHIE);
                entries.add(ModBlocks.RED_FOX_PLUSHIE);
                entries.add(ModBlocks.WHITE_FOX_PLUSHIE);
                entries.add(ModBlocks.DRAGON_PLUSHIE);
                entries.add(ModBlocks.COW_PLUSHIE);
                entries.add(ModBlocks.MOOSHROOM_PLUSHIE);
                entries.add(ModBlocks.BEE_PLUSHIE);
                entries.add(ModBlocks.LLAMA_PLUSHIE);
                entries.add(ModBlocks.MAGMA_CUBE_PLUSHIE);
                entries.add(ModBlocks.AXOLOTL_PLUSHIE);
                entries.add(ModBlocks.TURTLE_PLUSHIE);
                entries.add(ModBlocks.SNOW_GOLEM_PLUSHIE);
                entries.add(ModBlocks.DOLPHIN_PLUSHIE);
                entries.add(ModBlocks.PARROT_PLUSHIE);
                entries.add(ModBlocks.WARDEN_PLUSHIE);
                entries.add(ModBlocks.FROG_PLUSHIE);
                entries.add(ModBlocks.GOAT_PLUSHIE);
                entries.add(ModBlocks.CAT_PLUSHIE);
                entries.add(ModBlocks.ENDERMAN_PLUSHIE);
                entries.add(ModBlocks.SHEEP_PLUSHIE);
                entries.add(ModBlocks.PIG_PLUSHIE);
                entries.add(ModBlocks.TADPOLE_PLUSHIE);
                entries.add(ModBlocks.ALLAY_PLUSHIE);

            })
            .build();
    @Override
    public void onInitialize() {
        ModBlocks.registerItems();
    }
}
