package com.link.plushies;

import net.minecraft.client.renderer.entity.ItemRenderer;
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

    /* NEW IN v1.3.0 */
    private static final RegistryObject<Item> VEX = ITEMS.register("vex_plushie", () -> new BlockItem(Blocks.VEX_BLOCK.get(), props));
    private static final RegistryObject<Item> CREEPER = ITEMS.register("creeper_plushie", () -> new BlockItem(Blocks.CREEPER_BLOCK.get(), props));

    public static final RegistryObject<Item> BROWN_RABBIT = ITEMS.register("brown_rabbit_plushie", () -> new BlockItem(Blocks.BROWN_RABBIT_BLOCK.get(), props));
    public static final RegistryObject<Item> WHITE_RABBIT = ITEMS.register("white_rabbit_plushie", () -> new BlockItem(Blocks.WHITE_RABBIT_BLOCK.get(), props));
    public static final RegistryObject<Item> BLACK_RABBIT = ITEMS.register("black_rabbit_plushie", () -> new BlockItem(Blocks.BLACK_RABBIT_BLOCK.get(), props));
    public static final RegistryObject<Item> WHITE_SPLOTCHED_RABBIT = ITEMS.register("white_splotched_rabbit_plushie", () -> new BlockItem(Blocks.WHITE_SPLOTCHED_RABBIT_BLOCK.get(), props));
    public static final RegistryObject<Item> YELLOW_RABBIT = ITEMS.register("yellow_rabbit_plushie", () -> new BlockItem(Blocks.YELLOW_RABBIT_BLOCK.get(), props));
    public static final RegistryObject<Item> SALT_RABBIT = ITEMS.register("salt_rabbit_plushie", () -> new BlockItem(Blocks.SALT_RABBIT_BLOCK.get(), props));
    public static final RegistryObject<Item> KILLER_BUNNY = ITEMS.register("killer_bunny_plushie", () -> new BlockItem(Blocks.KILLER_RABBIT_BLOCK.get(), props));
    public static final RegistryObject<Item> TOAST_RABBIT = ITEMS.register("toast_rabbit_plushie", () -> new BlockItem(Blocks.TOAST_RABBIT_BLOCK.get(), props));

    public static final RegistryObject<Item> STRIDER = ITEMS.register("strider_plushie", () -> new BlockItem(Blocks.STRIDER_BLOCK.get(), props));
    public static final RegistryObject<Item> ENDERMITE = ITEMS.register("endermite_plushie", () -> new BlockItem(Blocks.ENDERMITE_BLOCK.get(), props));
    public static final RegistryObject<Item> CHICKEN = ITEMS.register("chicken_plushie", () -> new BlockItem(Blocks.CHICKEN_BLOCK.get(), props));
    public static final RegistryObject<Item> EVOKER = ITEMS.register("evoker_plushie", () -> new BlockItem(Blocks.EVOKER_BLOCK.get(), props));
    public static final RegistryObject<Item> VINDICATOR = ITEMS.register("vindicator_plushie", () -> new BlockItem(Blocks.VINDICATOR_BLOCK.get(), props));
    public static final RegistryObject<Item> ZOMBIE = ITEMS.register("zombie_plushie", () -> new BlockItem(Blocks.ZOMBIE_BLOCK.get(), props));
    public static final RegistryObject<Item> WOLF = ITEMS.register("wolf_plushie", () -> new BlockItem(Blocks.WOLF_BLOCK.get(), props));
    public static final RegistryObject<Item> SQUID = ITEMS.register("squid_plushie", () -> new BlockItem(Blocks.SQUID_BLOCK.get(), props));
    public static final RegistryObject<Item> GLOW_SQUID = ITEMS.register("glow_squid_plushie", () -> new BlockItem(Blocks.GLOW_SQUID_BLOCK.get(), props));
    public static final RegistryObject<Item> PILLAGER = ITEMS.register("pillager_plushie", () -> new BlockItem(Blocks.PILLAGER_BLOCK.get(), props));
    public static final RegistryObject<Item> ILLUSIONER = ITEMS.register("illusioner_plushie", () -> new BlockItem(Blocks.ILLUSIONER_BLOCK.get(), props));
    public static final RegistryObject<Item> CAMEL = ITEMS.register("camel_plushie", () -> new BlockItem(Blocks.CAMEL_BLOCK.get(), props));
    public static final RegistryObject<Item> GUARDIAN = ITEMS.register("guardian_plushie", () -> new BlockItem(Blocks.GUARDIAN_BLOCK.get(), props));
    public static final RegistryObject<Item> ELDER_GUARDIAN = ITEMS.register("elder_guardian_plushie", () -> new BlockItem(Blocks.ELDER_GUARDIAN_BLOCK.get(), props));
    public static final RegistryObject<Item> SNIFFER = ITEMS.register("sniffer_plushie", () -> new BlockItem(Blocks.SNIFFER_BLOCK.get(), props));
    public static final RegistryObject<Item> POLAR_BEAR = ITEMS.register("polar_bear_plushie", () -> new BlockItem(Blocks.POLAR_BEAR_BLOCK.get(), props));
    public static final RegistryObject<Item> WITCH = ITEMS.register("witch_plushie", () -> new BlockItem(Blocks.WITCH_BLOCK.get(), props));
    public static final RegistryObject<Item> RAVAGER = ITEMS.register("ravager_plushie", () -> new BlockItem(Blocks.RAVAGER_BLOCK.get(), props));
    public static final RegistryObject<Item> HORSE = ITEMS.register("horse_plushie", () -> new BlockItem(Blocks.HORSE_BLOCK.get(), props));
    public static final RegistryObject<Item> SPIDER = ITEMS.register("spider_plushie", () -> new BlockItem(Blocks.SPIDER_BLOCK.get(), props));


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

        output.accept(VEX.get());
        output.accept(CREEPER.get());
        output.accept(BROWN_RABBIT.get());
        output.accept(WHITE_RABBIT.get());
        output.accept(BLACK_RABBIT.get());
        output.accept(WHITE_SPLOTCHED_RABBIT.get());
        output.accept(YELLOW_RABBIT.get());
        output.accept(SALT_RABBIT.get());
        output.accept(KILLER_BUNNY.get());
        output.accept(TOAST_RABBIT.get());
        output.accept(STRIDER.get());
        output.accept(ENDERMITE.get());
        output.accept(CHICKEN.get());
        output.accept(EVOKER.get());
        output.accept(VINDICATOR.get());
        output.accept(ZOMBIE.get());
        output.accept(WOLF.get());
        output.accept(SQUID.get());
        output.accept(GLOW_SQUID.get());
        output.accept(PILLAGER.get());
        output.accept(ILLUSIONER.get());
        output.accept(CAMEL.get());
        output.accept(GUARDIAN.get());
        output.accept(ELDER_GUARDIAN.get());
        output.accept(SNIFFER.get());
        output.accept(POLAR_BEAR.get());
        output.accept(WITCH.get());
        output.accept(RAVAGER.get());
        output.accept(HORSE.get());
        output.accept(SPIDER.get());

    }).build());
}
