package com.link.plushies;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class PlushieBlockItem extends BlockItem  {
    public PlushieBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    @NotNull
    public InteractionResult use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        if (itemStack.getTags().noneMatch((TagKey<Item> tag) -> tag.equals(Tags.TAG_HUGGABLE))) {
            return InteractionResult.PASS;
        }
        // stolen from mating ai code
        RandomSource random = level.getRandom();
        double d0 = random.nextGaussian() * 0.02;
        double d1 = random.nextGaussian() * 0.02;
        double d2 = random.nextGaussian() * 0.02;
        level.addParticle(ParticleTypes.HEART, player.getRandomX(1.0), player.getRandomY() + 0.5, player.getRandomZ(1.0), d0, d1, d2);
        level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.WOOL_HIT, SoundSource.NEUTRAL, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
        player.startUsingItem(interactionHand);
        return InteractionResult.CONSUME;
    }
}
