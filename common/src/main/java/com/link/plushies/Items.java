package com.link.plushies;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;

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

    public static RegistrySupplier<Item> registerItem(String id, RegistrySupplier<Block> block, Item.Properties props) {
        final ResourceKey<Item> registryKey = RegUtil.resourceId(Registries.ITEM, id);
        return ITEMS.register(id, () ->
                    new BlockItem(block.get(), props.setId(registryKey)
                ));
    }

    public static final Item.Properties commonProps = new Item.Properties()
            .stacksTo(16)
            .rarity(Rarity.COMMON)
            .arch$tab(PLUSHIE_TAB);

    public static final RegistrySupplier<Item> PANDA = registerItem("panda_plushie", Blocks.PANDA_BLOCK, commonProps);
    private static final RegistrySupplier<Item> PARROT = registerItem("parrot_plushie", Blocks.PARROT_BLOCK, commonProps);
    public static final RegistrySupplier<Item> CAMEL = registerItem("camel_plushie", Blocks.CAMEL_BLOCK, commonProps);
    private static final RegistrySupplier<Item> LLAMA = registerItem("llama_plushie", Blocks.LLAMA_BLOCK, commonProps);
    private static final RegistrySupplier<Item> COW = registerItem("cow_plushie", Blocks.COW_BLOCK, commonProps);
    private static final RegistrySupplier<Item> MOOSHROOM = registerItem("mooshroom_plushie", Blocks.MOOSHROOM_BLOCK, commonProps);
    private static final RegistrySupplier<Item> SHEEP = registerItem("sheep_plushie", Blocks.SHEEP_BLOCK, commonProps);
    private static final RegistrySupplier<Item> PIG = registerItem("pig_plushie", Blocks.PIG_BLOCK, commonProps);
    public static final RegistrySupplier<Item> HORSE = registerItem("horse_plushie", Blocks.HORSE_BLOCK, commonProps);
    private static final RegistrySupplier<Item> MULE = registerItem("mule_plushie", Blocks.MULE_BLOCK, commonProps);
    private static final RegistrySupplier<Item> DONKEY = registerItem("donkey_plushie", Blocks.DONKEY_BLOCK, commonProps);
    private static final RegistrySupplier<Item> BEE = registerItem("bee_plushie", Blocks.BEE_BLOCK, commonProps);
    private static final RegistrySupplier<Item> CAT = registerItem("cat_plushie", Blocks.CAT_BLOCK, commonProps);
    public static final RegistrySupplier<Item> CHICKEN = registerItem("chicken_plushie", Blocks.CHICKEN_BLOCK, commonProps);
    public static final RegistrySupplier<Item> WOLF = registerItem("wolf_plushie", Blocks.WOLF_BLOCK, commonProps);
    private static final RegistrySupplier<Item> ALLAY = registerItem("allay_plushie", Blocks.ALLAY_BLOCK, commonProps);
    private static final RegistrySupplier<Item> RED_FOX = registerItem("red_fox_plushie", Blocks.RED_FOX_BLOCK, commonProps);
    private static final RegistrySupplier<Item> WHITE_FOX = registerItem("white_fox_plushie", Blocks.WHITE_FOX_BLOCK, commonProps);
    private static final RegistrySupplier<Item> SNOW_GOLEM = registerItem("snow_golem_plushie", Blocks.SNOW_GOLEM_BLOCK, commonProps);
    public static final RegistrySupplier<Item> POLAR_BEAR = registerItem("polar_bear_plushie", Blocks.POLAR_BEAR_BLOCK, commonProps);
    private static final RegistrySupplier<Item> GOAT = registerItem("goat_plushie", Blocks.GOAT_BLOCK, commonProps);
    public static final RegistrySupplier<Item> SNIFFER = registerItem("sniffer_plushie", Blocks.SNIFFER_BLOCK, commonProps.rarity(Rarity.UNCOMMON));
    private static final RegistrySupplier<Item> BAT = registerItem("bat_plushie", Blocks.BAT_BLOCK, commonProps);
    private static final RegistrySupplier<Item> OCELOT = registerItem("ocelot_plushie", Blocks.OCELOT_BLOCK, commonProps);
    private static final RegistrySupplier<Item> ARMADILLO = registerItem("armadillo_plushie", Blocks.ARMADILLO_BLOCK, commonProps);
    public static final RegistrySupplier<Item> BROWN_RABBIT = registerItem("brown_rabbit_plushie", Blocks.BROWN_RABBIT_BLOCK, commonProps);
    public static final RegistrySupplier<Item> WHITE_RABBIT = registerItem("white_rabbit_plushie", Blocks.WHITE_RABBIT_BLOCK, commonProps);
    public static final RegistrySupplier<Item> BLACK_RABBIT = registerItem("black_rabbit_plushie", Blocks.BLACK_RABBIT_BLOCK, commonProps);
    public static final RegistrySupplier<Item> WHITE_SPLOTCHED_RABBIT = registerItem("white_splotched_rabbit_plushie", Blocks.WHITE_SPLOTCHED_RABBIT_BLOCK, commonProps);
    public static final RegistrySupplier<Item> YELLOW_RABBIT = registerItem("yellow_rabbit_plushie", Blocks.YELLOW_RABBIT_BLOCK, commonProps);
    public static final RegistrySupplier<Item> SALT_RABBIT = registerItem("salt_rabbit_plushie", Blocks.SALT_RABBIT_BLOCK, commonProps);
    public static final RegistrySupplier<Item> TOAST_RABBIT = registerItem("toast_rabbit_plushie", Blocks.TOAST_RABBIT_BLOCK, commonProps);
    public static final RegistrySupplier<Item> KILLER_BUNNY = registerItem("killer_bunny_plushie", Blocks.KILLER_RABBIT_BLOCK, commonProps);
    private static final RegistrySupplier<Item> GOLEM = registerItem("iron_golem_plushie", Blocks.GOLEM_BLOCK, commonProps);
    private static final RegistrySupplier<Item> WANDERING_TRADER = registerItem("wandering_trader_plushie", Blocks.WANDERING_TRADER_BLOCK, commonProps);
    private static final RegistrySupplier<Item> VILLAGER = registerItem("villager_plushie", Blocks.VILLAGER_BLOCK, commonProps);
    private static final RegistrySupplier<Item> ZOMBIE_VILLAGER = registerItem("zombie_villager_plushie", Blocks.ZOMBIE_VILLAGER_BLOCK, commonProps);
    public static final RegistrySupplier<Item> PILLAGER = registerItem("pillager_plushie", Blocks.PILLAGER_BLOCK, commonProps);
    public static final RegistrySupplier<Item> ILLUSIONER = registerItem("illusioner_plushie", Blocks.ILLUSIONER_BLOCK, commonProps);
    public static final RegistrySupplier<Item> VINDICATOR = registerItem("vindicator_plushie", Blocks.VINDICATOR_BLOCK, commonProps);
    public static final RegistrySupplier<Item> EVOKER = registerItem("evoker_plushie", Blocks.EVOKER_BLOCK, commonProps.rarity(Rarity.UNCOMMON));
    public static final RegistrySupplier<Item> WITCH = registerItem("witch_plushie", Blocks.WITCH_BLOCK, commonProps);
    public static final RegistrySupplier<Item> RAVAGER = registerItem("ravager_plushie", Blocks.RAVAGER_BLOCK, commonProps);
    private static final RegistrySupplier<Item> VEX = registerItem("vex_plushie", Blocks.VEX_BLOCK, commonProps);
    private static final RegistrySupplier<Item> BREEZE = registerItem("breeze_plushie", Blocks.BREEZE_BLOCK, commonProps.rarity(Rarity.UNCOMMON));
    private static final RegistrySupplier<Item> CREEPER = registerItem("creeper_plushie", Blocks.CREEPER_BLOCK, commonProps);
    private static final RegistrySupplier<Item> SKELETON = registerItem("skeleton_plushie", Blocks.SKELETON_BLOCK, commonProps.rarity(Rarity.UNCOMMON));
    private static final RegistrySupplier<Item> STRAY = registerItem("stray_plushie", Blocks.STRAY_BLOCK, commonProps.rarity(Rarity.UNCOMMON));
    private static final RegistrySupplier<Item> ZOMBIE_HORSE = registerItem("zombie_horse_plushie", Blocks.ZOMBIE_HORSE_BLOCK, commonProps);
    private static final RegistrySupplier<Item> BOGGED = registerItem("bogged_plushie", Blocks.BOGGED_BLOCK, commonProps.rarity(Rarity.UNCOMMON));
    private static final RegistrySupplier<Item> SKELETON_HORSE = registerItem("skeleton_horse_plushie", Blocks.SKELETON_HORSE_BLOCK, commonProps);
    public static final RegistrySupplier<Item> SPIDER = registerItem("spider_plushie", Blocks.SPIDER_BLOCK, commonProps);
    private static final RegistrySupplier<Item> CAVE_SPIDER = registerItem("cave_spider_plushie", Blocks.CAVE_SPIDER_BLOCK, commonProps);
    private static final RegistrySupplier<Item> WARDEN = registerItem("warden_plushie", Blocks.WARDEN_BLOCK, commonProps);
    private static final RegistrySupplier<Item> WITHER = registerItem("wither_plushie", Blocks.WITHER_BLOCK, commonProps.rarity(Rarity.EPIC));
    private static final RegistrySupplier<Item> PHANTOM = registerItem("phantom_plushie", Blocks.PHANTOM_BLOCK, commonProps);
    private static final RegistrySupplier<Item> SILVERFISH = registerItem("silverfish_plushie", Blocks.SILVERFISH_BLOCK, commonProps);
    private static final RegistrySupplier<Item> SLIME = registerItem("slime_plushie", Blocks.SLIME_BLOCK, commonProps);
    public static final RegistrySupplier<Item> ZOMBIE = registerItem("zombie_plushie", Blocks.ZOMBIE_BLOCK, commonProps);
    private static final RegistrySupplier<Item> HUSK = registerItem("husk_plushie", Blocks.HUSK_BLOCK, commonProps);
    private static final RegistrySupplier<Item> DROWNED = registerItem("drowned_plushie", Blocks.DROWNED_BLOCK, commonProps);
    private static final RegistrySupplier<Item> AXOLOTL = registerItem("axolotl_plushie", Blocks.AXOLOTL_BLOCK, commonProps);
    private static final RegistrySupplier<Item> DOLPHIN = registerItem("dolphin_plushie", Blocks.DOLPHIN_BLOCK, commonProps);
    public static final RegistrySupplier<Item> SQUID = registerItem("squid_plushie", Blocks.SQUID_BLOCK, commonProps);
    public static final RegistrySupplier<Item> GLOW_SQUID = registerItem("glow_squid_plushie", Blocks.GLOW_SQUID_BLOCK, commonProps);
    public static final RegistrySupplier<Item> GUARDIAN = registerItem("guardian_plushie", Blocks.GUARDIAN_BLOCK, commonProps);
    public static final RegistrySupplier<Item> ELDER_GUARDIAN = registerItem("elder_guardian_plushie", Blocks.ELDER_GUARDIAN_BLOCK, commonProps);
    private static final RegistrySupplier<Item> TURTLE = registerItem("turtle_plushie", Blocks.TURTLE_BLOCK, commonProps);
    private static final RegistrySupplier<Item> FROG = registerItem("frog_plushie", Blocks.FROG_BLOCK, commonProps);
    private static final RegistrySupplier<Item> WARM_FROG = registerItem("warm_frog_plushie", Blocks.WARM_FROG_BLOCK, commonProps);
    private static final RegistrySupplier<Item> COLD_FROG = registerItem("cold_frog_plushie", Blocks.COLD_FROG_BLOCK, commonProps);
    private static final RegistrySupplier<Item> TADPOLE = registerItem("tadpole_plushie", Blocks.TADPOLE_BLOCK, commonProps);
    private static final RegistrySupplier<Item> SALMON = registerItem("salmon_plushie", Blocks.SALMON_BLOCK, commonProps);
    private static final RegistrySupplier<Item> COD = registerItem("cod_plushie", Blocks.COD_BLOCK, commonProps);
    private static final RegistrySupplier<Item> PUFFERFISH = registerItem("pufferfish_plushie", Blocks.PUFFERFISH_BLOCK, commonProps);
    private static final RegistrySupplier<Item> SMALL_TROP = registerItem("small_tropical_fish_plushie", Blocks.SMALL_TROP_BLOCK, commonProps);
    private static final RegistrySupplier<Item> LARGE_TROP = registerItem("large_tropical_fish_plushie", Blocks.LARGE_TROP_BLOCK, commonProps);
    private static final RegistrySupplier<Item> WITHER_SKELETON = registerItem("wither_skeleton_plushie", Blocks.WITHER_SKELETON_BLOCK, commonProps.rarity(Rarity.UNCOMMON));
    private static final RegistrySupplier<Item> PIGLIN = registerItem("piglin_plushie", Blocks.PIGLIN_BLOCK, commonProps.rarity(Rarity.UNCOMMON));
    private static final RegistrySupplier<Item> PIGLIN_BRUTE = registerItem("piglin_brute_plushie", Blocks.BRUTE_BLOCK, commonProps.rarity(Rarity.UNCOMMON));
    private static final RegistrySupplier<Item> ZOMBIEFIED_PIGLIN = registerItem("zombiefied_piglin_plushie", Blocks.ZOMPIGLIN_BLOCK, commonProps.rarity(Rarity.UNCOMMON));
    private static final RegistrySupplier<Item> BLAZE = registerItem("blaze_plushie", Blocks.BLAZE_BLOCK, commonProps);
    private static final RegistrySupplier<Item> GHAST = registerItem("ghast_plushie", Blocks.GHAST_BLOCK, commonProps);
    private static final RegistrySupplier<Item> HOGLIN = registerItem("hoglin_plushie", Blocks.HOGLIN_BLOCK, commonProps);
    private static final RegistrySupplier<Item> ZOGLIN = registerItem("zoglin_plushie", Blocks.ZOGLIN_BLOCK, commonProps);
    public static final RegistrySupplier<Item> STRIDER = registerItem("strider_plushie", Blocks.STRIDER_BLOCK, commonProps);
    private static final RegistrySupplier<Item> MAGMA_CUBE = registerItem("magma_cube_plushie", Blocks.MAGMA_CUBE_BLOCK, commonProps);
    private static final RegistrySupplier<Item> ENDERMAN = registerItem("enderman_plushie", Blocks.ENDERMAN_BLOCK, commonProps);
    public static final RegistrySupplier<Item> ENDERMITE = registerItem("endermite_plushie", Blocks.ENDERMITE_BLOCK, commonProps);
    private static final RegistrySupplier<Item> SHULKER = registerItem("shulker_plushie", Blocks.SHULKER_BLOCK, commonProps);
    private static final RegistrySupplier<Item> DRAGON = registerItem("dragon_plushie", Blocks.DRAGON_BLOCK, commonProps.rarity(Rarity.EPIC));
}