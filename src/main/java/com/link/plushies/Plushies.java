package com.link.plushies;

import com.link.plushies.blocks.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("plushies")
public class Plushies {
    private static final String MODID = "plushies";

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(MODID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(PANDA);
        }
    };
    private static final Plushie PANDA = new PandaPlushie();
    private static final Plushie SLIME = new SlimePlushie();
    private static final Plushie RED_FOX = new FoxPlushie();
    private static final Plushie WHITE_FOX = new FoxPlushie();
    private static final Plushie DRAGON = new DragonPlushie();
    private static final Plushie COW = new CowPlushie();
    private static final Plushie MOOSHROOM = new CowPlushie();
    private static final Plushie BEE = new BeePlushie();
    private static final Plushie LLAMA = new LlamaPlushie();
    private static final Plushie MAGMA_CUBE = new SlimePlushie();
    private static final Plushie AXOLOTL = new AxolotlPlushie();
    private static final Plushie TURTLE = new TurtlePlushie();
    private static final Plushie SNOW_GOLEM = new SnowGolemPlushie();
    private static final Plushie DOLPHIN = new DolphinPlushie();
    private static final Plushie PARROT = new ParrotPlushie();
    private static final Plushie WARDEN = new WardenPlushie();
    private static final Plushie FROG = new FrogPlushie();
    private static final Plushie GOAT = new GoatPlushie();
    private static final Plushie CAT = new CatPlushie();
    private static final Plushie ENDERMAN = new EndermanPlushie();
    private static final Plushie SHEEP = new SheepPlushie();

    public Plushies() {
        Item.Properties props = new Item.Properties()
                .stacksTo(16)
                .tab(Plushies.ITEM_GROUP);
        BLOCKS.register("panda_plushie", () -> PANDA);
        ITEMS.register("panda_plushie", () -> new BlockItem(PANDA, props));
        BLOCKS.register("slime_plushie", () -> SLIME);
        ITEMS.register("slime_plushie", () -> new BlockItem(SLIME, props));
        BLOCKS.register("red_fox_plushie", () -> RED_FOX);
        ITEMS.register("red_fox_plushie", () -> new BlockItem(RED_FOX, props));
        BLOCKS.register("white_fox_plushie", () -> WHITE_FOX);
        ITEMS.register("white_fox_plushie", () -> new BlockItem(WHITE_FOX, props));
        BLOCKS.register("dragon_plushie", () -> DRAGON);
        ITEMS.register("dragon_plushie", () -> new BlockItem(DRAGON, props));
        BLOCKS.register("cow_plushie", () -> COW);
        ITEMS.register("cow_plushie", () -> new BlockItem(COW, props));
        BLOCKS.register("mooshroom_plushie", () -> MOOSHROOM);
        ITEMS.register("mooshroom_plushie", () -> new BlockItem(MOOSHROOM, props));
        BLOCKS.register("bee_plushie", () -> BEE);
        ITEMS.register("bee_plushie", () -> new BlockItem(BEE, props));
        BLOCKS.register("llama_plushie", () -> LLAMA);
        ITEMS.register("llama_plushie", () -> new BlockItem(LLAMA, props));
        BLOCKS.register("magma_cube_plushie", () -> MAGMA_CUBE);
        ITEMS.register("magma_cube_plushie", () -> new BlockItem(MAGMA_CUBE, props));
        BLOCKS.register("axolotl_plushie", () -> AXOLOTL);
        ITEMS.register("axolotl_plushie", () -> new BlockItem(AXOLOTL, props));
        BLOCKS.register("turtle_plushie", () -> TURTLE);
        ITEMS.register("turtle_plushie", () -> new BlockItem(TURTLE, props));
        BLOCKS.register("snow_golem_plushie", () -> SNOW_GOLEM);
        ITEMS.register("snow_golem_plushie", () -> new BlockItem(SNOW_GOLEM, props));
        BLOCKS.register("dolphin_plushie", () -> DOLPHIN);
        ITEMS.register("dolphin_plushie", () -> new BlockItem(DOLPHIN, props));
        BLOCKS.register("parrot_plushie", () -> PARROT);
        ITEMS.register("parrot_plushie", () -> new BlockItem(PARROT, props));
        BLOCKS.register("warden_plushie", () -> WARDEN);
        ITEMS.register("warden_plushie", () -> new BlockItem(WARDEN, props));
        BLOCKS.register("frog_plushie", () -> FROG);
        ITEMS.register("frog_plushie", () -> new BlockItem(FROG, props));
        BLOCKS.register("goat_plushie", () -> GOAT);
        ITEMS.register("goat_plushie", () -> new BlockItem(GOAT, props));
        BLOCKS.register("cat_plushie", () -> CAT);
        ITEMS.register("cat_plushie", () -> new BlockItem(CAT, props));
        BLOCKS.register("enderman_plushie", () -> ENDERMAN);
        ITEMS.register("enderman_plushie", () -> new BlockItem(ENDERMAN, props));
        BLOCKS.register("sheep_plushie", () -> SHEEP);
        ITEMS.register("sheep_plushie", () -> new BlockItem(SHEEP, props));
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
