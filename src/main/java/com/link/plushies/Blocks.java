package com.link.plushies;

import com.link.plushies.blocks.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Plushies.MOD_ID);


    public static final RegistryObject<Block> SNOW_GOLEM_BLOCK = BLOCKS.register("snow_golem",
            SnowGolemPlushie::new);
    public static final RegistryObject<Block> AXOLOTL_BLOCK = BLOCKS.register("axolotl", AxolotlPlushie::new);
    public static final RegistryObject<Block> BEE_BLOCK = BLOCKS.register("bee", BeePlushie::new);
    public static final RegistryObject<Block> CAT_BLOCK = BLOCKS.register("cat", CatPlushie::new);
    public static final RegistryObject<Block> COW_BLOCK = BLOCKS.register("cow", CowPlushie::new);
    public static final RegistryObject<Block> DOLPHIN_BLOCK = BLOCKS.register("dolphin", DolphinPlushie::new);
    public static final RegistryObject<Block> DRAGON_BLOCK = BLOCKS.register("dragon", DragonPlushie::new);
    public static final RegistryObject<Block> ENDERMAN_BLOCK = BLOCKS.register("enderman", EndermanPlushie::new);
    public static final RegistryObject<Block> FROG_BLOCK = BLOCKS.register("frog", FrogPlushie::new);
    public static final RegistryObject<Block> GOAT_BLOCK = BLOCKS.register("goat", GoatPlushie::new);
    public static final RegistryObject<Block> LLAMA_BLOCK = BLOCKS.register("llama", LlamaPlushie::new);
    public static final RegistryObject<Block> SLIME_BLOCK = BLOCKS.register("slime", SlimePlushie::new);
    public static final RegistryObject<Block> MAGMA_CUBE_BLOCK = BLOCKS.register("magma_cube", SlimePlushie::new);
    public static final RegistryObject<Block> MOOSHROOM_BLOCK = BLOCKS.register("mooshroom", CowPlushie::new);
    public static final RegistryObject<Block> PANDA_BLOCK = BLOCKS.register("panda", PandaPlushie::new);
    public static final RegistryObject<Block> PARROT_BLOCK = BLOCKS.register("parrot", ParrotPlushie::new);
    public static final RegistryObject<Block> RED_FOX_BLOCK = BLOCKS.register("red_fox", FoxPlushie::new);
    public static final RegistryObject<Block> WHITE_FOX_BLOCK = BLOCKS.register("white_fox", FoxPlushie::new);
    public static final RegistryObject<Block> WARDEN_BLOCK = BLOCKS.register("warden", WardenPlushie::new);
    public static final RegistryObject<Block> SHEEP_BLOCK = BLOCKS.register("sheep", SheepPlushie::new);
    public static final RegistryObject<Block> TURTLE_BLOCK = BLOCKS.register("turtle", TurtlePlushie::new);

}
