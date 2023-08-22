package com.link.plushies;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Plushies.MOD_ID);

    public static final Item.Properties props = new Item.Properties().stacksTo(16);

    public static final RegistryObject<Item> SNOW_GOLEM = ITEMS.register("snow_golem_plushie", () -> new BlockItem(Blocks.SNOW_GOLEM_BLOCK.get(), props));
    private static final RegistryObject<Item> AXOLOTL = ITEMS.register("axolotl_plushie", () -> new BlockItem(Blocks.AXOLOTL_BLOCK.get(), props));
    private static final RegistryObject<Item> BEE = ITEMS.register("bee_plushie", () -> new BlockItem(Blocks.BEE_BLOCK.get(), props));
    private static final RegistryObject<Item> CAT = ITEMS.register("cat_plushie", () -> new BlockItem(Blocks.CAT_BLOCK.get(), props));
    private static final RegistryObject<Item> COW = ITEMS.register("cow_plushie", () -> new BlockItem(Blocks.COW_BLOCK.get(), props));
    private static final RegistryObject<Item> DOLPHIN = ITEMS.register("dolphin_plushie", () -> new BlockItem(Blocks.DOLPHIN_BLOCK.get(), props));
    private static final RegistryObject<Item> DRAGON = ITEMS.register("dragon_plushie", () -> new BlockItem(Blocks.DRAGON_BLOCK.get(), props));
    private static final RegistryObject<Item> ENDERMAN = ITEMS.register("enderman_plushie", () -> new BlockItem(Blocks.ENDERMAN_BLOCK.get(), props));
    private static final RegistryObject<Item> FROG = ITEMS.register("frog_plushie", () -> new BlockItem(Blocks.FROG_BLOCK.get(), props));
    private static final RegistryObject<Item> GOAT = ITEMS.register("goat_plushie", () -> new BlockItem(Blocks.GOAT_BLOCK.get(), props));
    private static final RegistryObject<Item> LLAMA = ITEMS.register("llama_plushie", () -> new BlockItem(Blocks.LLAMA_BLOCK.get(), props));
    private static final RegistryObject<Item> SLIME = ITEMS.register("slime_plushie", () -> new BlockItem(Blocks.SLIME_BLOCK.get(), props));
    private static final RegistryObject<Item> MAGMA_CUBE = ITEMS.register("magma_cube_plushie", () -> new BlockItem(Blocks.MAGMA_CUBE_BLOCK.get(), props));
    private static final RegistryObject<Item> MOOSHROOM = ITEMS.register("mooshroom_plushie", () -> new BlockItem(Blocks.MOOSHROOM_BLOCK.get(), props));
    private static final RegistryObject<Item> PANDA = ITEMS.register("panda_plushie", () -> new BlockItem(Blocks.PANDA_BLOCK.get(), props));
    private static final RegistryObject<Item> PARROT = ITEMS.register("parrot_plushie", () -> new BlockItem(Blocks.PARROT_BLOCK.get(), props));
    private static final RegistryObject<Item> RED_FOX = ITEMS.register("red_fox_plushie", () -> new BlockItem(Blocks.RED_FOX_BLOCK.get(), props));
    private static final RegistryObject<Item> WHITE_FOX = ITEMS.register("white_fox_plushie", () -> new BlockItem(Blocks.WHITE_FOX_BLOCK.get(), props));
    private static final RegistryObject<Item> WARDEN = ITEMS.register("warden_plushie", () -> new BlockItem(Blocks.WARDEN_BLOCK.get(), props));
    private static final RegistryObject<Item> SHEEP = ITEMS.register("sheep_plushie", () -> new BlockItem(Blocks.SHEEP_BLOCK.get(), props));
    private static final RegistryObject<Item> TURTLE = ITEMS.register("turtle_plushie", () -> new BlockItem(Blocks.TURTLE_BLOCK.get(), props));

    /* NEW IN v1.2.1 */
    private static final RegistryObject<Item> ALLAY = ITEMS.register("allay_plushie", () -> new BlockItem(Blocks.ALLAY_BLOCK.get(), props));
    private static final RegistryObject<Item> PIG = ITEMS.register("pig_plushie", () -> new BlockItem(Blocks.PIG_BLOCK.get(), props));
    private static final RegistryObject<Item> TADPOLE = ITEMS.register("tadpole_plushie", () -> new BlockItem(Blocks.TADPOLE_BLOCK.get(), props));


    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Plushies.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PLUSHIE_TAB = CREATIVE_MODE_TABS.register("plushie_tab", () -> CreativeModeTab.builder().icon(() -> SNOW_GOLEM.get().getDefaultInstance()).displayItems((paramaters, output) -> {
        output.accept(SNOW_GOLEM.get());
        output.accept(AXOLOTL.get());
        output.accept(BEE.get());
        output.accept(CAT.get());
        output.accept(DOLPHIN.get());
        output.accept(COW.get());
        output.accept(DRAGON.get());
        output.accept(ENDERMAN.get());
        output.accept(FROG.get());
        output.accept(GOAT.get());
        output.accept(LLAMA.get());
        output.accept(SLIME.get());
        output.accept(MAGMA_CUBE.get());
        output.accept(MOOSHROOM.get());
        output.accept(PANDA.get());
        output.accept(PARROT.get());
        output.accept(RED_FOX.get());
        output.accept(WHITE_FOX.get());
        output.accept(WARDEN.get());
        output.accept(SHEEP.get());
        output.accept(TURTLE.get());

        output.accept(ALLAY.get());
        output.accept(PIG.get());
        output.accept(TADPOLE.get());

    }).build());
}
