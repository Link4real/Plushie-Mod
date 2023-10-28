package com.link.plushies;

import com.link.plushies.blocks.*;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
public class Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(PlushiesMod.MOD_ID, Registries.BLOCK);
    /* LEGACY PLUSHIES */
    public static final RegistrySupplier<Block> SNOW_GOLEM_BLOCK = BLOCKS.register("snow_golem_plushie", SnowGolemPlushie::new);
    public static final RegistrySupplier<Block> AXOLOTL_BLOCK = BLOCKS.register("axolotl_plushie", AxolotlPlushie::new);
    public static final RegistrySupplier<Block> BEE_BLOCK = BLOCKS.register("bee_plushie", BeePlushie::new);
    public static final RegistrySupplier<Block> CAT_BLOCK = BLOCKS.register("cat_plushie", CatPlushie::new);
    public static final RegistrySupplier<Block> COW_BLOCK = BLOCKS.register("cow_plushie", CowPlushie::new);
    public static final RegistrySupplier<Block> DOLPHIN_BLOCK = BLOCKS.register("dolphin_plushie", DolphinPlushie::new);
    public static final RegistrySupplier<Block> DRAGON_BLOCK = BLOCKS.register("dragon_plushie", DragonPlushie::new);
    public static final RegistrySupplier<Block> ENDERMAN_BLOCK = BLOCKS.register("enderman_plushie", EndermanPlushie::new);
    public static final RegistrySupplier<Block> FROG_BLOCK = BLOCKS.register("frog_plushie", FrogPlushie::new);
    public static final RegistrySupplier<Block> GOAT_BLOCK = BLOCKS.register("goat_plushie", GoatPlushie::new);
    public static final RegistrySupplier<Block> LLAMA_BLOCK = BLOCKS.register("llama_plushie", LlamaPlushie::new);
    public static final RegistrySupplier<Block> SLIME_BLOCK = BLOCKS.register("slime_plushie", SlimePlushie::new);
    public static final RegistrySupplier<Block> MAGMA_CUBE_BLOCK = BLOCKS.register("magma_cube_plushie", SlimePlushie::new);
    public static final RegistrySupplier<Block> MOOSHROOM_BLOCK = BLOCKS.register("mooshroom_plushie", CowPlushie::new);
    public static final RegistrySupplier<Block> PANDA_BLOCK = BLOCKS.register("panda_plushie", PandaPlushie::new);
    public static final RegistrySupplier<Block> PARROT_BLOCK = BLOCKS.register("parrot_plushie", ParrotPlushie::new);
    public static final RegistrySupplier<Block> RED_FOX_BLOCK = BLOCKS.register("red_fox_plushie", FoxPlushie::new);
    public static final RegistrySupplier<Block> WHITE_FOX_BLOCK = BLOCKS.register("white_fox_plushie", FoxPlushie::new);
    public static final RegistrySupplier<Block> WARDEN_BLOCK = BLOCKS.register("warden_plushie", WardenPlushie::new);
    public static final RegistrySupplier<Block> SHEEP_BLOCK = BLOCKS.register("sheep_plushie", SheepPlushie::new);
    public static final RegistrySupplier<Block> TURTLE_BLOCK = BLOCKS.register("turtle_plushie", TurtlePlushie::new);

    /* NEW IN v1.2.1 */
    public static final RegistrySupplier<Block> ALLAY_BLOCK = BLOCKS.register("allay_plushie", AllayPlushie::new);
    public static final RegistrySupplier<Block> TADPOLE_BLOCK = BLOCKS.register("tadpole_plushie", TadpolePlushie::new);
    public static final RegistrySupplier<Block> PIG_BLOCK = BLOCKS.register("pig_plushie", PigPlushie::new);

    /* NEW IN v1.3.0 */
    public static final RegistrySupplier<Block> VEX_BLOCK = BLOCKS.register("vex_plushie", VexPlushie::new);

    public static final RegistrySupplier<Block> BROWN_RABBIT_BLOCK = BLOCKS.register("brown_rabbit_plushie", RabbitPlushie::new);
    public static final RegistrySupplier<Block> WHITE_RABBIT_BLOCK = BLOCKS.register("white_rabbit_plushie", RabbitPlushie::new);
    public static final RegistrySupplier<Block> BLACK_RABBIT_BLOCK = BLOCKS.register("black_rabbit_plushie", RabbitPlushie::new);
    public static final RegistrySupplier<Block> WHITE_SPLOTCHED_RABBIT_BLOCK = BLOCKS.register("white_splotched_rabbit_plushie", RabbitPlushie::new);
    public static final RegistrySupplier<Block> YELLOW_RABBIT_BLOCK = BLOCKS.register("yellow_rabbit_plushie", RabbitPlushie::new);
    public static final RegistrySupplier<Block> SALT_RABBIT_BLOCK = BLOCKS.register("salt_rabbit_plushie", RabbitPlushie::new);
    public static final RegistrySupplier<Block> KILLER_RABBIT_BLOCK = BLOCKS.register("killer_bunny_plushie", RabbitPlushie::new);
    public static final RegistrySupplier<Block> TOAST_RABBIT_BLOCK = BLOCKS.register("toast_rabbit_plushie", RabbitPlushie::new);

    public static final RegistrySupplier<Block> STRIDER_BLOCK = BLOCKS.register("strider_plushie", StriderPlushie::new);
    public static final RegistrySupplier<Block> ENDERMITE_BLOCK = BLOCKS.register("endermite_plushie", EndermitePlushie::new);
    public static final RegistrySupplier<Block> CHICKEN_BLOCK = BLOCKS.register("chicken_plushie", ChickenPlushie::new);
    public static final RegistrySupplier<Block> EVOKER_BLOCK = BLOCKS.register("evoker_plushie", IllagerPlushies::new);
    public static final RegistrySupplier<Block> VINDICATOR_BLOCK = BLOCKS.register("vindicator_plushie", IllagerPlushies::new);
    public static final RegistrySupplier<Block> ZOMBIE_BLOCK = BLOCKS.register("zombie_plushie", ZombiePlushie::new);
    public static final RegistrySupplier<Block> WOLF_BLOCK = BLOCKS.register("wolf_plushie", WolfPlushie::new);
    public static final RegistrySupplier<Block> SQUID_BLOCK = BLOCKS.register("squid_plushie", SquidPlushie::new);
    public static final RegistrySupplier<Block> GLOW_SQUID_BLOCK = BLOCKS.register("glow_squid_plushie", SquidPlushie::new);
    public static final RegistrySupplier<Block> PILLAGER_BLOCK = BLOCKS.register("pillager_plushie", PillagerPlushie::new);
    public static final RegistrySupplier<Block> ILLUSIONER_BLOCK  = BLOCKS.register("illusioner_plushie", IllagerPlushies::new);
    public static final RegistrySupplier<Block> CAMEL_BLOCK = BLOCKS.register("camel_plushie", CamelPlushie::new);
    public static final RegistrySupplier<Block> GUARDIAN_BLOCK = BLOCKS.register("guardian_plushie", GuardianPlushie::new);
    public static final RegistrySupplier<Block> ELDER_GUARDIAN_BLOCK = BLOCKS.register("elder_guardian_plushie", GuardianPlushie::new);
    public static final RegistrySupplier<Block> SNIFFER_BLOCK = BLOCKS.register("sniffer_plushie", SnifferPlushie::new);
    public static final RegistrySupplier<Block> POLAR_BEAR_BLOCK = BLOCKS.register("polar_bear_plushie", PolarBearPlushie::new);
    public static final RegistrySupplier<Block> WITCH_BLOCK = BLOCKS.register("witch_plushie", WitchPlushie::new);
    public static final RegistrySupplier<Block> RAVAGER_BLOCK = BLOCKS.register("ravager_plushie", RavagerPlushie::new);
    public static final RegistrySupplier<Block> HORSE_BLOCK = BLOCKS.register("horse_plushie", HorseHoglinPlushie::new);
    public static final RegistrySupplier<Block> SPIDER_BLOCK = BLOCKS.register("spider_plushie", SpiderPlushie::new);
    public static final RegistrySupplier<Block> CREEPER_BLOCK = BLOCKS.register("creeper_plushie", CreeperPlushie::new);

    /* NEW IN v1.4.0 */

    public static final RegistrySupplier<Block> HUSK_BLOCK = BLOCKS.register("husk_plushie", ZombiePlushie::new);
    public static final RegistrySupplier<Block> WARM_FROG_BLOCK = BLOCKS.register("warm_frog_plushie", FrogPlushie::new);
    public static final RegistrySupplier<Block> COLD_FROG_BLOCK = BLOCKS.register("cold_frog_plushie", FrogPlushie::new);
    public static final RegistrySupplier<Block> PUFFERFISH_BLOCK = BLOCKS.register("pufferfish_plushie", PufferfishPlushie::new);
    public static final RegistrySupplier<Block> HOGLIN_BLOCK = BLOCKS.register("hoglin_plushie", HorseHoglinPlushie::new);

}
