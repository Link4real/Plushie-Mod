package com.link.plushies;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(PlushiesMod.MOD_ID, Registries.ITEM);

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(PlushiesMod.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> PLUSHIE_TAB = TABS.register(
            "plushie_tab", // Tab ID
            () -> CreativeTabRegistry.create(
                    Component.translatable("category.plushies.main"), // Tab Name
                    () -> Items.PANDA.get().getDefaultInstance() // Icon
            )
    );

    public static final Item.Properties props = new Item.Properties().stacksTo(16).arch$tab(PLUSHIE_TAB);

    public static final RegistrySupplier<Item> PANDA = ITEMS.register("panda_plushie", () -> new BlockItem(Blocks.PANDA_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> PARROT = ITEMS.register("parrot_plushie", () -> new BlockItem(Blocks.PARROT_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> LLAMA = ITEMS.register("llama_plushie", () -> new BlockItem(Blocks.LLAMA_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> CAMEL = ITEMS.register("camel_plushie", () -> new BlockItem(Blocks.CAMEL_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> COW = ITEMS.register("cow_plushie", () -> new BlockItem(Blocks.COW_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> MOOSHROOM = ITEMS.register("mooshroom_plushie", () -> new BlockItem(Blocks.MOOSHROOM_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> SHEEP = ITEMS.register("sheep_plushie", () -> new BlockItem(Blocks.SHEEP_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> PIG = ITEMS.register("pig_plushie", () -> new BlockItem(Blocks.PIG_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> HORSE = ITEMS.register("horse_plushie", () -> new BlockItem(Blocks.HORSE_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> BEE = ITEMS.register("bee_plushie", () -> new BlockItem(Blocks.BEE_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> CAT = ITEMS.register("cat_plushie", () -> new BlockItem(Blocks.CAT_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> CHICKEN = ITEMS.register("chicken_plushie", () -> new BlockItem(Blocks.CHICKEN_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> WOLF = ITEMS.register("wolf_plushie", () -> new BlockItem(Blocks.WOLF_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> RED_FOX = ITEMS.register("red_fox_plushie", () -> new BlockItem(Blocks.RED_FOX_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> WHITE_FOX = ITEMS.register("white_fox_plushie", () -> new BlockItem(Blocks.WHITE_FOX_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> GOAT = ITEMS.register("goat_plushie", () -> new BlockItem(Blocks.GOAT_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> SNOW_GOLEM = ITEMS.register("snow_golem_plushie", () -> new BlockItem(Blocks.SNOW_GOLEM_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> POLAR_BEAR = ITEMS.register("polar_bear_plushie", () -> new BlockItem(Blocks.POLAR_BEAR_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> SNIFFER = ITEMS.register("sniffer_plushie", () -> new BlockItem(Blocks.SNIFFER_BLOCK.get(), props.rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> BROWN_RABBIT = ITEMS.register("brown_rabbit_plushie", () -> new BlockItem(Blocks.BROWN_RABBIT_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> WHITE_RABBIT = ITEMS.register("white_rabbit_plushie", () -> new BlockItem(Blocks.WHITE_RABBIT_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> BLACK_RABBIT = ITEMS.register("black_rabbit_plushie", () -> new BlockItem(Blocks.BLACK_RABBIT_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> WHITE_SPLOTCHED_RABBIT = ITEMS.register("white_splotched_rabbit_plushie", () -> new BlockItem(Blocks.WHITE_SPLOTCHED_RABBIT_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> YELLOW_RABBIT = ITEMS.register("yellow_rabbit_plushie", () -> new BlockItem(Blocks.YELLOW_RABBIT_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> SALT_RABBIT = ITEMS.register("salt_rabbit_plushie", () -> new BlockItem(Blocks.SALT_RABBIT_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> TOAST_RABBIT = ITEMS.register("toast_rabbit_plushie", () -> new BlockItem(Blocks.TOAST_RABBIT_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> KILLER_BUNNY = ITEMS.register("killer_bunny_plushie", () -> new BlockItem(Blocks.KILLER_RABBIT_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> ALLAY = ITEMS.register("allay_plushie", () -> new BlockItem(Blocks.ALLAY_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> AXOLOTL = ITEMS.register("axolotl_plushie", () -> new BlockItem(Blocks.AXOLOTL_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> DOLPHIN = ITEMS.register("dolphin_plushie", () -> new BlockItem(Blocks.DOLPHIN_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> SQUID = ITEMS.register("squid_plushie", () -> new BlockItem(Blocks.SQUID_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> GLOW_SQUID = ITEMS.register("glow_squid_plushie", () -> new BlockItem(Blocks.GLOW_SQUID_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> GUARDIAN = ITEMS.register("guardian_plushie", () -> new BlockItem(Blocks.GUARDIAN_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> ELDER_GUARDIAN = ITEMS.register("elder_guardian_plushie", () -> new BlockItem(Blocks.ELDER_GUARDIAN_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> TURTLE = ITEMS.register("turtle_plushie", () -> new BlockItem(Blocks.TURTLE_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> FROG = ITEMS.register("frog_plushie", () -> new BlockItem(Blocks.FROG_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> TADPOLE = ITEMS.register("tadpole_plushie", () -> new BlockItem(Blocks.TADPOLE_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> SLIME = ITEMS.register("slime_plushie", () -> new BlockItem(Blocks.SLIME_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> MAGMA_CUBE = ITEMS.register("magma_cube_plushie", () -> new BlockItem(Blocks.MAGMA_CUBE_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> STRIDER = ITEMS.register("strider_plushie", () -> new BlockItem(Blocks.STRIDER_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> WARDEN = ITEMS.register("warden_plushie", () -> new BlockItem(Blocks.WARDEN_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> ENDERMAN = ITEMS.register("enderman_plushie", () -> new BlockItem(Blocks.ENDERMAN_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> ENDERMITE = ITEMS.register("endermite_plushie", () -> new BlockItem(Blocks.ENDERMITE_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> CREEPER = ITEMS.register("creeper_plushie", () -> new BlockItem(Blocks.CREEPER_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> ZOMBIE = ITEMS.register("zombie_plushie", () -> new BlockItem(Blocks.ZOMBIE_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> SPIDER = ITEMS.register("spider_plushie", () -> new BlockItem(Blocks.SPIDER_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> DRAGON = ITEMS.register("dragon_plushie", () -> new BlockItem(Blocks.DRAGON_BLOCK.get(), props.rarity(Rarity.EPIC)));
    public static final RegistrySupplier<Item> PILLAGER = ITEMS.register("pillager_plushie", () -> new BlockItem(Blocks.PILLAGER_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> ILLUSIONER = ITEMS.register("illusioner_plushie", () -> new BlockItem(Blocks.ILLUSIONER_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> VINDICATOR = ITEMS.register("vindicator_plushie", () -> new BlockItem(Blocks.VINDICATOR_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> EVOKER = ITEMS.register("evoker_plushie", () -> new BlockItem(Blocks.EVOKER_BLOCK.get(), props.rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> WITCH = ITEMS.register("witch_plushie", () -> new BlockItem(Blocks.WITCH_BLOCK.get(), props.rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> RAVAGER = ITEMS.register("ravager_plushie", () -> new BlockItem(Blocks.RAVAGER_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> VEX = ITEMS.register("vex_plushie", () -> new BlockItem(Blocks.VEX_BLOCK.get(), props.rarity(Rarity.COMMON)));

    private static final RegistrySupplier<Item> HUSK = ITEMS.register("husk_plushie", () -> new BlockItem(Blocks.HUSK_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> WARM_FROG = ITEMS.register("warm_frog_plushie", () -> new BlockItem(Blocks.WARM_FROG_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> COLD_FROG = ITEMS.register("cold_frog_plushie", () -> new BlockItem(Blocks.COLD_FROG_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> PUFFERFISH = ITEMS.register("pufferfish_plushie", () -> new BlockItem(Blocks.PUFFERFISH_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> HOGLIN = ITEMS.register("hoglin_plushie", () -> new BlockItem(Blocks.HOGLIN_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> OCELOT = ITEMS.register("ocelot_plushie", () -> new BlockItem(Blocks.OCELOT_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> BAT = ITEMS.register("bat_plushie", () -> new BlockItem(Blocks.BAT_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> SALMON = ITEMS.register("salmon_plushie", () -> new BlockItem(Blocks.SALMON_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> ZOGLIN = ITEMS.register("zoglin_plushie", () -> new BlockItem(Blocks.ZOGLIN_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> COD = ITEMS.register("cod_plushie", () -> new BlockItem(Blocks.COD_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> PIGLIN = ITEMS.register("piglin_plushie", () -> new BlockItem(Blocks.PIGLIN_BLOCK.get(), props.rarity(Rarity.UNCOMMON)));
    private static final RegistrySupplier<Item> PIGLIN_BRUTE = ITEMS.register("piglin_brute_plushie", () -> new BlockItem(Blocks.BRUTE_BLOCK.get(), props.rarity(Rarity.UNCOMMON)));
    private static final RegistrySupplier<Item> ZOMBIEIFED_PIGLIN = ITEMS.register("zombiefied_piglin_plushie", () -> new BlockItem(Blocks.ZOMPIGLIN_BLOCK.get(), props.rarity(Rarity.UNCOMMON)));
    private static final RegistrySupplier<Item> VILLAGER = ITEMS.register("villager_plushie", () -> new BlockItem(Blocks.VILLAGER_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> WANDERING_TRADER = ITEMS.register("wandering_trader_plushie", () -> new BlockItem(Blocks.WANDERING_TRADER_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> DROWNED = ITEMS.register("drowned_plushie", () -> new BlockItem(Blocks.DROWNED_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> SHULKER = ITEMS.register("shulker_plushie", () -> new BlockItem(Blocks.SHULKER_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> ZOMBIE_VILLAGER = ITEMS.register("zombie_villager_plushie", () -> new BlockItem(Blocks.ZOMBIE_VILLAGER_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> GOLEM = ITEMS.register("iron_golem_plushie", () -> new BlockItem(Blocks.GOLEM_BLOCK.get(), props.rarity(Rarity.COMMON)));
    private static final RegistrySupplier<Item> SKELETON = ITEMS.register("skeleton_plushie", () -> new BlockItem(Blocks.SKELETON_BLOCK.get(), props.rarity(Rarity.UNCOMMON)));
    private static final RegistrySupplier<Item> WITHER_SKELETON = ITEMS.register("wither_skeleton_plushie", () -> new BlockItem(Blocks.WITHER_SKELETON_BLOCK.get(), props.rarity(Rarity.UNCOMMON)));



}
