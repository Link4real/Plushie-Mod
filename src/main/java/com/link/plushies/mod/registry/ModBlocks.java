package com.link.plushies.mod.registry;

import com.link.plushies.mod.Plushies.FoxPlushie;
import com.link.plushies.mod.Plushies.PandaPlushie;
import com.link.plushies.mod.Plushies.SlimePlushie;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.link.plushies.mod.Main.MOD_ID;

public class ModBlocks {


    public static final Block PANDA_PLUSHIE = new PandaPlushie(FabricBlockSettings.of(Material.WOOL).nonOpaque().sounds(BlockSoundGroup.WOOL).strength(0.7f));
    public static final Block SLIME_PLUSHIE = new SlimePlushie(FabricBlockSettings.of(Material.WOOL).nonOpaque().sounds(BlockSoundGroup.WOOL).strength(0.6f));
    public static final Block RED_FOX_PLUSHIE = new FoxPlushie(FabricBlockSettings.of(Material.WOOL).nonOpaque().sounds(BlockSoundGroup.WOOL).strength(0.8f));
    public static final Block WHITE_FOX_PLUSHIE = new FoxPlushie(FabricBlockSettings.of(Material.WOOL).nonOpaque().sounds(BlockSoundGroup.WOOL).strength(0.8f));

    public static void registerItems() {


        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "panda_plushie"), PANDA_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "panda_plushie"), new BlockItem(PANDA_PLUSHIE, new FabricItemSettings().maxCount(16).group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "slime_plushie"), SLIME_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "slime_plushie"), new BlockItem(SLIME_PLUSHIE, new FabricItemSettings().maxCount(16).group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "red_fox_plushie"), RED_FOX_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "red_fox_plushie"), new BlockItem(RED_FOX_PLUSHIE, new FabricItemSettings().maxCount(16).group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "white_fox_plushie"), WHITE_FOX_PLUSHIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "white_fox_plushie"), new BlockItem(WHITE_FOX_PLUSHIE, new FabricItemSettings().maxCount(16).group(ItemGroup.DECORATIONS)));
    }
}
