package com.link.plushies;

import com.link.plushies.blocks.*;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
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
    public static final RegistrySupplier<Block> SNOW_GOLEM_BLOCK = registerBlock("snow_golem_plushie", SnowGolemPlushieBlock::new);
    public static final RegistrySupplier<Block> AXOLOTL_BLOCK = registerBlock("axolotl_plushie", AxolotlPlushieBlock::new);
    public static final RegistrySupplier<Block> BEE_BLOCK = registerBlock("bee_plushie", BeePlushieBlock::new);
    public static final RegistrySupplier<Block> CAT_BLOCK = registerBlock("cat_plushie", CatPlushieBlock::new);
    public static final RegistrySupplier<Block> COW_BLOCK = registerBlock("cow_plushie", CowPlushieBlock::new);
    public static final RegistrySupplier<Block> DOLPHIN_BLOCK = registerBlock("dolphin_plushie", DolphinPlushieBlock::new);
    public static final RegistrySupplier<Block> DRAGON_BLOCK = registerBlock("dragon_plushie", DragonPlushieBlock::new);
    public static final RegistrySupplier<Block> ENDERMAN_BLOCK = registerBlock("enderman_plushie", EndermanPlushieBlock::new);
    public static final RegistrySupplier<Block> FROG_BLOCK = registerBlock("frog_plushie", FrogPlushieBlock::new);
    public static final RegistrySupplier<Block> GOAT_BLOCK = registerBlock("goat_plushie", GoatPlushieBlock::new);
    public static final RegistrySupplier<Block> LLAMA_BLOCK = registerBlock("llama_plushie", LlamaPlushieBlock::new);
    public static final RegistrySupplier<Block> SLIME_BLOCK = registerBlock("slime_plushie", SlimePlushieBlock::new);
    public static final RegistrySupplier<Block> MAGMA_CUBE_BLOCK = registerBlock("magma_cube_plushie", SlimePlushieBlock::new);
    public static final RegistrySupplier<Block> MOOSHROOM_BLOCK = registerBlock("mooshroom_plushie", CowPlushieBlock::new);
    public static final RegistrySupplier<Block> PANDA_BLOCK = registerBlock("panda_plushie", PandaPlushieBlock::new);
    public static final RegistrySupplier<Block> PARROT_BLOCK = registerBlock("parrot_plushie", ParrotPlushieBlock::new);
    public static final RegistrySupplier<Block> RED_FOX_BLOCK = registerBlock("red_fox_plushie", FoxPlushieBlock::new);
    public static final RegistrySupplier<Block> WHITE_FOX_BLOCK = registerBlock("white_fox_plushie", FoxPlushieBlock::new);
    public static final RegistrySupplier<Block> WARDEN_BLOCK = registerBlock("warden_plushie", WardenPlushieBlock::new);
    public static final RegistrySupplier<Block> SHEEP_BLOCK = registerBlock("sheep_plushie", SheepPlushieBlock::new);
    public static final RegistrySupplier<Block> TURTLE_BLOCK = registerBlock("turtle_plushie", TurtlePlushieBlock::new);

    /* NEW IN v1.2.1 */
    public static final RegistrySupplier<Block> ALLAY_BLOCK = registerBlock("allay_plushie", AllayPlushieBlock::new);
    public static final RegistrySupplier<Block> TADPOLE_BLOCK = registerBlock("tadpole_plushie", TadpolePlushieBlock::new);
    public static final RegistrySupplier<Block> PIG_BLOCK = registerBlock("pig_plushie", PigPlushieBlock::new);

    /* NEW IN v1.3.0 */
    public static final RegistrySupplier<Block> VEX_BLOCK = registerBlock("vex_plushie", VexPlushieBlock::new);
    public static final RegistrySupplier<Block> BROWN_RABBIT_BLOCK = registerBlock("brown_rabbit_plushie", RabbitPlushieBlock::new);
    public static final RegistrySupplier<Block> WHITE_RABBIT_BLOCK = registerBlock("white_rabbit_plushie", RabbitPlushieBlock::new);
    public static final RegistrySupplier<Block> BLACK_RABBIT_BLOCK = registerBlock("black_rabbit_plushie", RabbitPlushieBlock::new);
    public static final RegistrySupplier<Block> WHITE_SPLOTCHED_RABBIT_BLOCK = registerBlock("white_splotched_rabbit_plushie", RabbitPlushieBlock::new);
    public static final RegistrySupplier<Block> YELLOW_RABBIT_BLOCK = registerBlock("yellow_rabbit_plushie", RabbitPlushieBlock::new);
    public static final RegistrySupplier<Block> SALT_RABBIT_BLOCK = registerBlock("salt_rabbit_plushie", RabbitPlushieBlock::new);
    public static final RegistrySupplier<Block> KILLER_RABBIT_BLOCK = registerBlock("killer_bunny_plushie", RabbitPlushieBlock::new);
    public static final RegistrySupplier<Block> TOAST_RABBIT_BLOCK = registerBlock("toast_rabbit_plushie", RabbitPlushieBlock::new);
    public static final RegistrySupplier<Block> STRIDER_BLOCK = registerBlock("strider_plushie", StriderPlushieBlock::new);
    public static final RegistrySupplier<Block> ENDERMITE_BLOCK = registerBlock("endermite_plushie", EndermitePlushieBlock::new);
    public static final RegistrySupplier<Block> CHICKEN_BLOCK = registerBlock("chicken_plushie", ChickenPlushieBlock::new);
    public static final RegistrySupplier<Block> EVOKER_BLOCK = registerBlock("evoker_plushie", VillagerPlushies::new);
    public static final RegistrySupplier<Block> VINDICATOR_BLOCK = registerBlock("vindicator_plushie", VillagerPlushies::new);
    public static final RegistrySupplier<Block> ZOMBIE_BLOCK = registerBlock("zombie_plushie", ZombiePlushieBlock::new);
    public static final RegistrySupplier<Block> WOLF_BLOCK = registerBlock("wolf_plushie", WolfPlushieBlock::new);
    public static final RegistrySupplier<Block> SQUID_BLOCK = registerBlock("squid_plushie", SquidPlushieBlock::new);
    public static final RegistrySupplier<Block> GLOW_SQUID_BLOCK = registerBlock("glow_squid_plushie", SquidPlushieBlock::new);
    public static final RegistrySupplier<Block> PILLAGER_BLOCK = registerBlock("pillager_plushie", PillagerPlushieBlock::new);
    public static final RegistrySupplier<Block> ILLUSIONER_BLOCK  = registerBlock("illusioner_plushie", VillagerPlushies::new);
    public static final RegistrySupplier<Block> CAMEL_BLOCK = registerBlock("camel_plushie", CamelPlushieBlock::new);
    public static final RegistrySupplier<Block> GUARDIAN_BLOCK = registerBlock("guardian_plushie", GuardianPlushieBlock::new);
    public static final RegistrySupplier<Block> ELDER_GUARDIAN_BLOCK = registerBlock("elder_guardian_plushie", GuardianPlushieBlock::new);
    public static final RegistrySupplier<Block> SNIFFER_BLOCK = registerBlock("sniffer_plushie", SnifferPlushieBlock::new);
    public static final RegistrySupplier<Block> POLAR_BEAR_BLOCK = registerBlock("polar_bear_plushie", PolarBearPlushieBlock::new);
    public static final RegistrySupplier<Block> WITCH_BLOCK = registerBlock("witch_plushie", WitchPlushieBlock::new);
    public static final RegistrySupplier<Block> RAVAGER_BLOCK = registerBlock("ravager_plushie", RavagerPlushieBlock::new);
    public static final RegistrySupplier<Block> HORSE_BLOCK = registerBlock("horse_plushie", HorseHoglinPlushieBlock::new);
    public static final RegistrySupplier<Block> SPIDER_BLOCK = registerBlock("spider_plushie", SpiderPlushieBlock::new);
    public static final RegistrySupplier<Block> CREEPER_BLOCK = registerBlock("creeper_plushie", CreeperPlushieBlock::new);

    /* NEW IN v1.4.0 */

    public static final RegistrySupplier<Block> HUSK_BLOCK = registerBlock("husk_plushie", ZombiePlushieBlock::new);
    public static final RegistrySupplier<Block> WARM_FROG_BLOCK = registerBlock("warm_frog_plushie", FrogPlushieBlock::new);
    public static final RegistrySupplier<Block> COLD_FROG_BLOCK = registerBlock("cold_frog_plushie", FrogPlushieBlock::new);
    public static final RegistrySupplier<Block> PUFFERFISH_BLOCK = registerBlock("pufferfish_plushie", PufferfishPlushieBlock::new);
    public static final RegistrySupplier<Block> HOGLIN_BLOCK = registerBlock("hoglin_plushie", HorseHoglinPlushieBlock::new);
    public static final RegistrySupplier<Block> OCELOT_BLOCK = registerBlock("ocelot_plushie", OcelotPlushieBlock::new);
    public static final RegistrySupplier<Block> BAT_BLOCK = registerBlock("bat_plushie", BatPlushieBlock::new);
    public static final RegistrySupplier<Block> SALMON_BLOCK = registerBlock("salmon_plushie", SalmonPlushieBlock::new);
    public static final RegistrySupplier<Block> ZOGLIN_BLOCK = registerBlock("zoglin_plushie", ZoglinPlushieBlock::new);
    public static final RegistrySupplier<Block> COD_BLOCK = registerBlock("cod_plushie", CodPlushieBlock::new);
    public static final RegistrySupplier<Block> PIGLIN_BLOCK = registerBlock("piglin_plushie", PiglinPlushieBlock::new);
    public static final RegistrySupplier<Block> BRUTE_BLOCK = registerBlock("piglin_brute_plushie", PiglinPlushieBlock::new);
    public static final RegistrySupplier<Block> ZOMPIGLIN_BLOCK = registerBlock("zombiefied_piglin_plushie", PiglinPlushieBlock::new);
    public static final RegistrySupplier<Block> VILLAGER_BLOCK = registerBlock("villager_plushie", VillagerPlushies::new);
    public static final RegistrySupplier<Block> WANDERING_TRADER_BLOCK = registerBlock("wandering_trader_plushie", VillagerPlushies::new);
    public static final RegistrySupplier<Block> DROWNED_BLOCK = registerBlock("drowned_plushie", ZombiePlushieBlock::new);
    public static final RegistrySupplier<Block> SHULKER_BLOCK = registerBlock("shulker_plushie", ShulkerPlushieBlock::new);
    public static final RegistrySupplier<Block> ZOMBIE_VILLAGER_BLOCK = registerBlock("zombie_villager_plushie", VillagerPlushies::new);
    public static final RegistrySupplier<Block> GOLEM_BLOCK = registerBlock("iron_golem_plushie", GolemPlushieBlock::new);
    public static final RegistrySupplier<Block> SKELETON_BLOCK = registerBlock("skeleton_plushie", SkeletonPlushies::new);
    public static final RegistrySupplier<Block> WITHER_SKELETON_BLOCK = registerBlock("wither_skeleton_plushie", SkeletonPlushies::new);
    public static final RegistrySupplier<Block> CAVE_SPIDER_BLOCK = registerBlock("cave_spider_plushie", CaveSpiderPlushieBlock::new);
    public static final RegistrySupplier<Block> SKELETON_HORSE_BLOCK = registerBlock("skeleton_horse_plushie", HorseHoglinPlushieBlock::new);
    public static final RegistrySupplier<Block> STRAY_BLOCK = registerBlock("stray_plushie", SkeletonPlushies::new);
    public static final RegistrySupplier<Block> SILVERFISH_BLOCK = registerBlock("silverfish_plushie", SilverfishPlushieBlock::new);
    public static final RegistrySupplier<Block> BLAZE_BLOCK = registerBlock("blaze_plushie", BlazePlushieBlock::new);
    public static final RegistrySupplier<Block> GHAST_BLOCK = registerBlock("ghast_plushie", GhastPlushieBlock::new);
    public static final RegistrySupplier<Block> WITHER_BLOCK = registerBlock("wither_plushie", WitherPlushieBlock::new);
    public static final RegistrySupplier<Block> PHANTOM_BLOCK = registerBlock("phantom_plushie", PhantomPlushieBlock::new);

    /* NEW IN v1.5.0 */
    public static final RegistrySupplier<Block> SMALL_TROP_BLOCK = registerBlock("small_tropical_fish_plushie", SmallTropPlushieBlock::new);
    public static final RegistrySupplier<Block> LARGE_TROP_BLOCK = registerBlock("large_tropical_fish_plushie", LargeTropPlushieBlock::new);
    public static final RegistrySupplier<Block> ARMADILLO_BLOCK = registerBlock("armadillo_plushie", ArmadilloPlushieBlock::new);
    public static final RegistrySupplier<Block> BREEZE_BLOCK = registerBlock("breeze_plushie", BreezePlushieBlock::new);
    public static final RegistrySupplier<Block> ZOMBIE_HORSE_BLOCK = registerBlock("zombie_horse_plushie", HorseHoglinPlushieBlock::new);
    public static final RegistrySupplier<Block> BOGGED_BLOCK = registerBlock("bogged_plushie", SkeletonPlushies::new);
    public static final RegistrySupplier<Block> MULE_BLOCK = registerBlock("mule_plushie", HorseHoglinPlushieBlock::new);
    public static final RegistrySupplier<Block> DONKEY_BLOCK = registerBlock("donkey_plushie", HorseHoglinPlushieBlock::new);
}
