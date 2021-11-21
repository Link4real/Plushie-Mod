package com.link.plushies.mod.registry;

import com.link.plushies.mod.Main;
import com.link.plushies.mod.Plushies.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
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
    public static final Block COW_PLUSHIE = new CowPlushie(FabricBlockSettings.of(Material.WOOL).nonOpaque().sounds(BlockSoundGroup.WOOL).strength(0.9f));
    public static final Block MOOSHROOM_PLUSHIE = new CowPlushie(FabricBlockSettings.of(Material.WOOL).nonOpaque().strength(0.9f).sounds(BlockSoundGroup.WOOL));
    public static final Block BEE_PLUSHIE = new BeePlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL));
    public static final Block LLAMA_PLUSHIE = new LlamaPlushie(FabricBlockSettings.of(Material.WOOL).strength(0.9f).sounds(BlockSoundGroup.WOOL));

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
    }
}
