package com.link.plushies;

import com.link.plushies.blocks.*;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(PlushiesMod.MOD_ID, Registries.BLOCK);

    public static <T extends Block> RegistrySupplier<T> registerBlock(String id, Function<Block.Properties, T> constructor) {
        return BLOCKS.register(id,
                ()->constructor.apply(
                        Block.Properties.of()
                                .setId(RegUtil.resourceId(Registries.BLOCK, id))
                                .ignitedByLava()
                                .mapColor(MapColor.WOOL)
                                .sound(SoundType.WOOL)
                                .strength(0.7f)
                )
        );
    }

    /* LEGACY PLUSHIES */
    public static final RegistrySupplier<Block> SNOW_GOLEM_BLOCK = registerBlock("snow_golem_plushie", SnowGolemPlushie::new);
    public static final RegistrySupplier<Block> AXOLOTL_BLOCK = registerBlock("axolotl_plushie", AxolotlPlushie::new);
    public static final RegistrySupplier<Block> BEE_BLOCK = registerBlock("bee_plushie", BeePlushie::new);
    public static final RegistrySupplier<Block> CAT_BLOCK = registerBlock("cat_plushie", CatPlushie::new);
    public static final RegistrySupplier<Block> COW_BLOCK = registerBlock("cow_plushie", CowPlushie::new);
    public static final RegistrySupplier<Block> DOLPHIN_BLOCK = registerBlock("dolphin_plushie", DolphinPlushie::new);
    public static final RegistrySupplier<Block> DRAGON_BLOCK = registerBlock("dragon_plushie", DragonPlushie::new);
    public static final RegistrySupplier<Block> ENDERMAN_BLOCK = registerBlock("enderman_plushie", EndermanPlushie::new);
    public static final RegistrySupplier<Block> FROG_BLOCK = registerBlock("frog_plushie", FrogPlushie::new);
    public static final RegistrySupplier<Block> GOAT_BLOCK = registerBlock("goat_plushie", GoatPlushie::new);
    public static final RegistrySupplier<Block> LLAMA_BLOCK = registerBlock("llama_plushie", LlamaPlushie::new);
    public static final RegistrySupplier<Block> SLIME_BLOCK = registerBlock("slime_plushie", SlimePlushie::new);
    public static final RegistrySupplier<Block> MAGMA_CUBE_BLOCK = registerBlock("magma_cube_plushie", SlimePlushie::new);
    public static final RegistrySupplier<Block> MOOSHROOM_BLOCK = registerBlock("mooshroom_plushie", CowPlushie::new);
    public static final RegistrySupplier<Block> PANDA_BLOCK = registerBlock("panda_plushie", PandaPlushie::new);
    public static final RegistrySupplier<Block> PARROT_BLOCK = registerBlock("parrot_plushie", ParrotPlushie::new);
    public static final RegistrySupplier<Block> RED_FOX_BLOCK = registerBlock("red_fox_plushie", FoxPlushie::new);
    public static final RegistrySupplier<Block> WHITE_FOX_BLOCK = registerBlock("white_fox_plushie", FoxPlushie::new);
    public static final RegistrySupplier<Block> WARDEN_BLOCK = registerBlock("warden_plushie", WardenPlushie::new);
    public static final RegistrySupplier<Block> SHEEP_BLOCK = registerBlock("sheep_plushie", SheepPlushie::new);
    public static final RegistrySupplier<Block> TURTLE_BLOCK = registerBlock("turtle_plushie", TurtlePlushie::new);

    /* NEW IN v1.2.1 */
    public static final RegistrySupplier<Block> ALLAY_BLOCK = registerBlock("allay_plushie", AllayPlushie::new);
    public static final RegistrySupplier<Block> TADPOLE_BLOCK = registerBlock("tadpole_plushie", TadpolePlushie::new);
    public static final RegistrySupplier<Block> PIG_BLOCK = registerBlock("pig_plushie", PigPlushie::new);

    /* NEW IN v1.3.0 */
    public static final RegistrySupplier<Block> VEX_BLOCK = registerBlock("vex_plushie", VexPlushie::new);
    public static final RegistrySupplier<Block> BROWN_RABBIT_BLOCK = registerBlock("brown_rabbit_plushie", RabbitPlushie::new);
    public static final RegistrySupplier<Block> WHITE_RABBIT_BLOCK = registerBlock("white_rabbit_plushie", RabbitPlushie::new);
    public static final RegistrySupplier<Block> BLACK_RABBIT_BLOCK = registerBlock("black_rabbit_plushie", RabbitPlushie::new);
    public static final RegistrySupplier<Block> WHITE_SPLOTCHED_RABBIT_BLOCK = registerBlock("white_splotched_rabbit_plushie", RabbitPlushie::new);
    public static final RegistrySupplier<Block> YELLOW_RABBIT_BLOCK = registerBlock("yellow_rabbit_plushie", RabbitPlushie::new);
    public static final RegistrySupplier<Block> SALT_RABBIT_BLOCK = registerBlock("salt_rabbit_plushie", RabbitPlushie::new);
    public static final RegistrySupplier<Block> KILLER_RABBIT_BLOCK = registerBlock("killer_bunny_plushie", RabbitPlushie::new);
    public static final RegistrySupplier<Block> TOAST_RABBIT_BLOCK = registerBlock("toast_rabbit_plushie", RabbitPlushie::new);
    public static final RegistrySupplier<Block> STRIDER_BLOCK = registerBlock("strider_plushie", StriderPlushie::new);
    public static final RegistrySupplier<Block> ENDERMITE_BLOCK = registerBlock("endermite_plushie", EndermitePlushie::new);
    public static final RegistrySupplier<Block> CHICKEN_BLOCK = registerBlock("chicken_plushie", ChickenPlushie::new);
    public static final RegistrySupplier<Block> EVOKER_BLOCK = registerBlock("evoker_plushie", VillagerPlushies::new);
    public static final RegistrySupplier<Block> VINDICATOR_BLOCK = registerBlock("vindicator_plushie", VillagerPlushies::new);
    public static final RegistrySupplier<Block> ZOMBIE_BLOCK = registerBlock("zombie_plushie", ZombiePlushie::new);
    public static final RegistrySupplier<Block> WOLF_BLOCK = registerBlock("wolf_plushie", WolfPlushie::new);
    public static final RegistrySupplier<Block> SQUID_BLOCK = registerBlock("squid_plushie", SquidPlushie::new);
    public static final RegistrySupplier<Block> GLOW_SQUID_BLOCK = registerBlock("glow_squid_plushie", SquidPlushie::new);
    public static final RegistrySupplier<Block> PILLAGER_BLOCK = registerBlock("pillager_plushie", PillagerPlushie::new);
    public static final RegistrySupplier<Block> ILLUSIONER_BLOCK  = registerBlock("illusioner_plushie", VillagerPlushies::new);
    public static final RegistrySupplier<Block> CAMEL_BLOCK = registerBlock("camel_plushie", CamelPlushie::new);
    public static final RegistrySupplier<Block> GUARDIAN_BLOCK = registerBlock("guardian_plushie", GuardianPlushie::new);
    public static final RegistrySupplier<Block> ELDER_GUARDIAN_BLOCK = registerBlock("elder_guardian_plushie", GuardianPlushie::new);
    public static final RegistrySupplier<Block> SNIFFER_BLOCK = registerBlock("sniffer_plushie", SnifferPlushie::new);
    public static final RegistrySupplier<Block> POLAR_BEAR_BLOCK = registerBlock("polar_bear_plushie", PolarBearPlushie::new);
    public static final RegistrySupplier<Block> WITCH_BLOCK = registerBlock("witch_plushie", WitchPlushie::new);
    public static final RegistrySupplier<Block> RAVAGER_BLOCK = registerBlock("ravager_plushie", RavagerPlushie::new);
    public static final RegistrySupplier<Block> HORSE_BLOCK = registerBlock("horse_plushie", HorseHoglinPlushie::new);
    public static final RegistrySupplier<Block> SPIDER_BLOCK = registerBlock("spider_plushie", SpiderPlushie::new);
    public static final RegistrySupplier<Block> CREEPER_BLOCK = registerBlock("creeper_plushie", CreeperPlushie::new);

    /* NEW IN v1.4.0 */

    public static final RegistrySupplier<Block> HUSK_BLOCK = registerBlock("husk_plushie", ZombiePlushie::new);
    public static final RegistrySupplier<Block> WARM_FROG_BLOCK = registerBlock("warm_frog_plushie", FrogPlushie::new);
    public static final RegistrySupplier<Block> COLD_FROG_BLOCK = registerBlock("cold_frog_plushie", FrogPlushie::new);
    public static final RegistrySupplier<Block> PUFFERFISH_BLOCK = registerBlock("pufferfish_plushie", PufferfishPlushie::new);
    public static final RegistrySupplier<Block> HOGLIN_BLOCK = registerBlock("hoglin_plushie", HorseHoglinPlushie::new);
    public static final RegistrySupplier<Block> OCELOT_BLOCK = registerBlock("ocelot_plushie", OcelotPlushie::new);
    public static final RegistrySupplier<Block> BAT_BLOCK = registerBlock("bat_plushie", BatPlushie::new);
    public static final RegistrySupplier<Block> SALMON_BLOCK = registerBlock("salmon_plushie", SalmonPlushie::new);
    public static final RegistrySupplier<Block> ZOGLIN_BLOCK = registerBlock("zoglin_plushie", ZoglinPlushie::new);
    public static final RegistrySupplier<Block> COD_BLOCK = registerBlock("cod_plushie", CodPlushie::new);
    public static final RegistrySupplier<Block> PIGLIN_BLOCK = registerBlock("piglin_plushie", PiglinPlushie::new);
    public static final RegistrySupplier<Block> BRUTE_BLOCK = registerBlock("piglin_brute_plushie", PiglinPlushie::new);
    public static final RegistrySupplier<Block> ZOMPIGLIN_BLOCK = registerBlock("zombiefied_piglin_plushie", PiglinPlushie::new);
    public static final RegistrySupplier<Block> VILLAGER_BLOCK = registerBlock("villager_plushie", VillagerPlushies::new);
    public static final RegistrySupplier<Block> WANDERING_TRADER_BLOCK = registerBlock("wandering_trader_plushie", VillagerPlushies::new);
    public static final RegistrySupplier<Block> DROWNED_BLOCK = registerBlock("drowned_plushie", ZombiePlushie::new);
    public static final RegistrySupplier<Block> SHULKER_BLOCK = registerBlock("shulker_plushie", ShulkerPlushie::new);
    public static final RegistrySupplier<Block> ZOMBIE_VILLAGER_BLOCK = registerBlock("zombie_villager_plushie", VillagerPlushies::new);
    public static final RegistrySupplier<Block> GOLEM_BLOCK = registerBlock("iron_golem_plushie", GolemPlushie::new);
    public static final RegistrySupplier<Block> SKELETON_BLOCK = registerBlock("skeleton_plushie", SkeletonPlushies::new);
    public static final RegistrySupplier<Block> WITHER_SKELETON_BLOCK = registerBlock("wither_skeleton_plushie", SkeletonPlushies::new);
    public static final RegistrySupplier<Block> CAVE_SPIDER_BLOCK = registerBlock("cave_spider_plushie", CaveSpiderPlushie::new);
    public static final RegistrySupplier<Block> SKELETON_HORSE_BLOCK = registerBlock("skeleton_horse_plushie", HorseHoglinPlushie::new);
    public static final RegistrySupplier<Block> STRAY_BLOCK = registerBlock("stray_plushie", SkeletonPlushies::new);
    public static final RegistrySupplier<Block> SILVERFISH_BLOCK = registerBlock("silverfish_plushie", SilverfishPlushie::new);
    public static final RegistrySupplier<Block> BLAZE_BLOCK = registerBlock("blaze_plushie", BlazePlushie::new);
    public static final RegistrySupplier<Block> GHAST_BLOCK = registerBlock("ghast_plushie", GhastPlushie::new);
    public static final RegistrySupplier<Block> WITHER_BLOCK = registerBlock("wither_plushie", WitherPlushie::new);
    public static final RegistrySupplier<Block> PHANTOM_BLOCK = registerBlock("phantom_plushie", PhantomPlushie::new);

    /* NEW IN v1.5.0 */
    public static final RegistrySupplier<Block> SMALL_TROP_BLOCK = registerBlock("small_tropical_fish_plushie", SmallTropPlushie::new);
    public static final RegistrySupplier<Block> LARGE_TROP_BLOCK = registerBlock("large_tropical_fish_plushie", LargeTropPlushie::new);
    public static final RegistrySupplier<Block> ARMADILLO_BLOCK = registerBlock("armadillo_plushie", ArmadilloPlushie::new);
    public static final RegistrySupplier<Block> BREEZE_BLOCK = registerBlock("breeze_plushie", BreezePlushie::new);
    public static final RegistrySupplier<Block> ZOMBIE_HORSE_BLOCK = registerBlock("zombie_horse_plushie", HorseHoglinPlushie::new);
    public static final RegistrySupplier<Block> BOGGED_BLOCK = registerBlock("bogged_plushie", SkeletonPlushies::new);
    public static final RegistrySupplier<Block> MULE_BLOCK = registerBlock("mule_plushie", HorseHoglinPlushie::new);
    public static final RegistrySupplier<Block> DONKEY_BLOCK = registerBlock("donkey_plushie", HorseHoglinPlushie::new);
}
