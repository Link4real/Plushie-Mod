package com.link.plushies;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Plushies.MOD_ID);


    public static final Item.Properties props = new Item.Properties().stacksTo(16);


    public static final RegistryObject<Item> AXOLOTL = ITEMS.register("axolotl", () -> new BlockItem(Blocks.AXOLOTL_BLOCK.get(), props));
    public static final RegistryObject<Item> BEE = ITEMS.register("bee", () -> new BlockItem(Blocks.BEE_BLOCK.get(), props));
    public static final RegistryObject<Item> CAT = ITEMS.register("cat", () -> new BlockItem(Blocks.CAT_BLOCK.get(), props));
    public static final RegistryObject<Item> COW = ITEMS.register("cow", () -> new BlockItem(Blocks.COW_BLOCK.get(), props));
    public static final RegistryObject<Item> DOLPHIN = ITEMS.register("dolphin", () -> new BlockItem(Blocks.DOLPHIN_BLOCK.get(), props));
    public static final RegistryObject<Item> DRAGON = ITEMS.register("dragon", () -> new BlockItem(Blocks.DRAGON_BLOCK.get(), props));
    public static final RegistryObject<Item> ENDERMAN = ITEMS.register("enderman", () -> new BlockItem(Blocks.ENDERMAN_BLOCK.get(), props));
    public static final RegistryObject<Item> FROG = ITEMS.register("frog", () -> new BlockItem(Blocks.FROG_BLOCK.get(), props));
    public static final RegistryObject<Item> GOAT = ITEMS.register("goat", () -> new BlockItem(Blocks.GOAT_BLOCK.get(), props));
    public static final RegistryObject<Item> LLAMA = ITEMS.register("llama", () -> new BlockItem(Blocks.LLAMA_BLOCK.get(), props));
    public static final RegistryObject<Item> SLIME = ITEMS.register("slime", () -> new BlockItem(Blocks.SLIME_BLOCK.get(), props));
    public static final RegistryObject<Item> SNOW_GOLEM = ITEMS.register("snow_golem", () -> new BlockItem(Blocks.SNOW_GOLEM_BLOCK.get(), props));
    public static final RegistryObject<Item> MAGMA_CUBE = ITEMS.register("magma_cube", () -> new BlockItem(Blocks.MAGMA_CUBE_BLOCK.get(), props));
    public static final RegistryObject<Item> MOOSHROOM = ITEMS.register("mooshroom", () -> new BlockItem(Blocks.MOOSHROOM_BLOCK.get(), props));
    public static final RegistryObject<Item> PANDA = ITEMS.register("panda", () -> new BlockItem(Blocks.PANDA_BLOCK.get(), props));
    public static final RegistryObject<Item> PARROT = ITEMS.register("parrot", () -> new BlockItem(Blocks.PARROT_BLOCK.get(), props));
    public static final RegistryObject<Item> RED_FOX = ITEMS.register("red_fox", () -> new BlockItem(Blocks.RED_FOX_BLOCK.get(), props));
    public static final RegistryObject<Item> WHITE_FOX = ITEMS.register("white_fox", () -> new BlockItem(Blocks.WHITE_FOX_BLOCK.get(), props));
    public static final RegistryObject<Item> WARDEN = ITEMS.register("warden", () -> new BlockItem(Blocks.WARDEN_BLOCK.get(), props));
    public static final RegistryObject<Item> SHEEP = ITEMS.register("sheep", () -> new BlockItem(Blocks.SHEEP_BLOCK.get(), props));
    public static final RegistryObject<Item> TURTLE = ITEMS.register("turtle", () -> new BlockItem(Blocks.TURTLE_BLOCK.get(), props));
}
