package com.link.plushies.mod.registry;

import com.link.plushies.mod.Main;
import com.link.plushies.mod.Plushies.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MagmaBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static com.link.plushies.mod.Main.MOD_ID;

public class ModBlocks {


    public static final Block PANDA_PLUSHIE = new PandaPlushie(FabricBlockSettings.of(Material.WOOL).nonOpaque().sounds(BlockSoundGroup.WOOL).strength(0.7f));
    public static final Block SLIME_PLUSHIE = new SlimePlushie(FabricBlockSettings.of(Material.WOOL).nonOpaque().sounds(BlockSoundGroup.WOOL).strength(0.6f));
    public static final Block RED_FOX_PLUSHIE = new FoxPlushie(FabricBlockSettings.of(Material.WOOL).nonOpaque().sounds(BlockSoundGroup.WOOL).strength(0.8f));
    public static final Block WHITE_FOX_PLUSHIE = new FoxPlushie(FabricBlockSettings.of(Material.WOOL).nonOpaque().sounds(BlockSoundGroup.WOOL).strength(0.8f));
    public static final Block DRAGON_PLUSHIE = new DragonPlushie(FabricBlockSettings.of(Material.WOOL).nonOpaque().sounds(BlockSoundGroup.WOOL).strength(0.9f));
    //v1.1
    public static final Block COW_PLUSHIE = new CowPlushie(FabricBlockSettings.of(Material.WOOL).nonOpaque().sounds(BlockSoundGroup.WOOL).strength(0.9f));
    public static final Block MOOSHROOM_PLUSHIE = new CowPlushie(FabricBlockSettings.of(Material.WOOL).nonOpaque().strength(0.9f).sounds(BlockSoundGroup.WOOL));
    public static final Block BEE_PLUSHIE = new BeePlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL));
    public static final Block LLAMA_PLUSHIE = new LlamaPlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL).luminance(1));
    public static final Block MAGMA_CUBE_PLUSHIE = new SlimePlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL));
    //v1.2
    public static final Block AXOLOTL_PLUSHIE = new AxolotlPlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL));
    public static final Block TURTLE_PLUSHIE = new TurtlePlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL));
    public static final Block SNOW_GOLEM_PLUSHIE = new SnowgolemPlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL));
    public static final Block DOLPHIN_PLUSHIE = new DolphinPlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL));
    public static final Block PARROT_PLUSHIE = new ParrotPlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL));
    public static final Block WARDEN_PLUSHIE = new WardenPlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL));
    public static final Block FROG_PLUSHIE = new FrogPlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL));
    public static final Block GOAT_PLUSHIE = new GoatPlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL));
    public static final Block CAT_PLUSHIE = new CatPlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL));
    public static final Block ENDERMAN_PLUSHIE = new EndermanPlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL));
    public static final Block SHEEP_PLUSHIE = new SheepPlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL));

    public static void registerItems() {
        //Panda Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "panda_plushie"), PANDA_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "panda_plushie"), new BlockItem(PANDA_PLUSHIE, new FabricItemSettings().maxCount(16).group(Main.ITEM_GROUP)));
        //Slime Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "slime_plushie"), SLIME_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "slime_plushie"), new BlockItem(SLIME_PLUSHIE, new FabricItemSettings().maxCount(16).group(Main.ITEM_GROUP)));
        //Red Fox Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "red_fox_plushie"), RED_FOX_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "red_fox_plushie"), new BlockItem(RED_FOX_PLUSHIE, new FabricItemSettings().maxCount(16).group(Main.ITEM_GROUP)));
        //White Fox Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "white_fox_plushie"), WHITE_FOX_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "white_fox_plushie"), new BlockItem(WHITE_FOX_PLUSHIE, new FabricItemSettings().maxCount(16).group(Main.ITEM_GROUP)));
        //Dragon Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dragon_plushie"), DRAGON_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dragon_plushie"), new BlockItem(DRAGON_PLUSHIE, new FabricItemSettings().rarity(Rarity.EPIC).maxCount(16).group(Main.ITEM_GROUP)));
        //Cow Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"cow_plushie"), COW_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cow_plushie"), new BlockItem(COW_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
        //Mooshroom Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"mooshroom_plushie"), MOOSHROOM_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mooshroom_plushie"), new BlockItem(MOOSHROOM_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
        //Bee Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"bee_plushie"), BEE_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bee_plushie"), new BlockItem(BEE_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
        //Llama Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"llama_plushie"), LLAMA_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "llama_plushie"), new BlockItem(LLAMA_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
        //Magma Cube Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"magma_cube_plushie"), MAGMA_CUBE_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "magma_cube_plushie"), new BlockItem(MAGMA_CUBE_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
        //Axolotl Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"axolotl_plushie"), AXOLOTL_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "axolotl_plushie"), new BlockItem(AXOLOTL_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
        //Turtle Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"turtle_plushie"), TURTLE_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "turtle_plushie"), new BlockItem(TURTLE_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
        //Snow Golem Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"snow_golem_plushie"), SNOW_GOLEM_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "snow_golem_plushie"), new BlockItem(SNOW_GOLEM_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
        //Dolphin Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"dolphin_plushie"), DOLPHIN_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dolphin_plushie"), new BlockItem(DOLPHIN_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
        //Parrot Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"parrot_plushie"), PARROT_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "parrot_plushie"), new BlockItem(PARROT_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
        //Warden Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"warden_plushie"), WARDEN_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warden_plushie"), new BlockItem(WARDEN_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
        //Frog Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"frog_plushie"), FROG_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "frog_plushie"), new BlockItem(FROG_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
        //Goat Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "goat_plushie"), GOAT_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "goat_plushie"), new BlockItem(GOAT_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
        //Cat Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cat_plushie"), CAT_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cat_plushie"), new BlockItem(CAT_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
        //Enderman Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "enderman_plushie"), ENDERMAN_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "enderman_plushie"), new BlockItem(ENDERMAN_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
        //Sheep Plushie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "sheep_plushie"), SHEEP_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sheep_plushie"), new BlockItem(SHEEP_PLUSHIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(16)));
    }
}
