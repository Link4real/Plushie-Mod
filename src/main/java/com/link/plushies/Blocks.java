package com.link.plushies;

import com.link.plushies.blocks.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Plushies.MOD_ID);
    public static final RegistryObject<Block> SNOW_GOLEM_BLOCK = BLOCKS.register("snow_golem_plushie", SnowGolemPlushie::new);
    public static final RegistryObject<Block> AXOLOTL_BLOCK = BLOCKS.register("axolotl_plushie", AxolotlPlushie::new);
    public static final RegistryObject<Block> BEE_BLOCK = BLOCKS.register("bee_plushie", BeePlushie::new);
    public static final RegistryObject<Block> CAT_BLOCK = BLOCKS.register("cat_plushie", CatPlushie::new);
    public static final RegistryObject<Block> COW_BLOCK = BLOCKS.register("cow_plushie", CowPlushie::new);
    public static final RegistryObject<Block> DOLPHIN_BLOCK = BLOCKS.register("dolphin_plushie", DolphinPlushie::new);
    public static final RegistryObject<Block> DRAGON_BLOCK = BLOCKS.register("dragon_plushie", DragonPlushie::new);
    public static final RegistryObject<Block> ENDERMAN_BLOCK = BLOCKS.register("enderman_plushie", EndermanPlushie::new);
    public static final RegistryObject<Block> FROG_BLOCK = BLOCKS.register("frog_plushie", FrogPlushie::new);
    public static final RegistryObject<Block> GOAT_BLOCK = BLOCKS.register("goat_plushie", GoatPlushie::new);
    public static final RegistryObject<Block> LLAMA_BLOCK = BLOCKS.register("llama_plushie", LlamaPlushie::new);
    public static final RegistryObject<Block> SLIME_BLOCK = BLOCKS.register("slime_plushie", SlimePlushie::new);
    public static final RegistryObject<Block> MAGMA_CUBE_BLOCK = BLOCKS.register("magma_cube_plushie", SlimePlushie::new);
    public static final RegistryObject<Block> MOOSHROOM_BLOCK = BLOCKS.register("mooshroom_plushie", CowPlushie::new);
    public static final RegistryObject<Block> PANDA_BLOCK = BLOCKS.register("panda_plushie", PandaPlushie::new);
    public static final RegistryObject<Block> PARROT_BLOCK = BLOCKS.register("parrot_plushie", ParrotPlushie::new);
    public static final RegistryObject<Block> RED_FOX_BLOCK = BLOCKS.register("red_fox_plushie", FoxPlushie::new);
    public static final RegistryObject<Block> WHITE_FOX_BLOCK = BLOCKS.register("white_fox_plushie", FoxPlushie::new);
    public static final RegistryObject<Block> WARDEN_BLOCK = BLOCKS.register("warden_plushie", WardenPlushie::new);
    public static final RegistryObject<Block> SHEEP_BLOCK = BLOCKS.register("sheep_plushie", SheepPlushie::new);
    public static final RegistryObject<Block> TURTLE_BLOCK = BLOCKS.register("turtle_plushie", TurtlePlushie::new);

    /* NEW IN v1.2.1 */
    public static final RegistryObject<Block> ALLAY_BLOCK = BLOCKS.register("allay_plushie", AllayPlushie::new);
    public static final RegistryObject<Block> TADPOLE_BLOCK = BLOCKS.register("tadpole_plushie", TadpolePlushie::new);
    public static final RegistryObject<Block> PIG_BLOCK = BLOCKS.register("pig_plushie", PigPlushie::new);
}
