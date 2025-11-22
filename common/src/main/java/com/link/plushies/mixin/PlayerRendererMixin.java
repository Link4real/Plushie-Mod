package com.link.plushies.mixin;

import com.link.plushies.AbstractClientPlayerLastHug;
import com.link.plushies.PlushieBlockItem;
import com.link.plushies.Tags;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerRenderer.class)
public class PlayerRendererMixin {
    @Inject(
            method = "getArmPose(Lnet/minecraft/client/player/AbstractClientPlayer;Lnet/minecraft/world/entity/HumanoidArm;)Lnet/minecraft/client/model/HumanoidModel$ArmPose;",
            cancellable = true,
            at = @At("HEAD")
    )
    private static void injectGetArmPose(AbstractClientPlayer player, HumanoidArm humanoidArm, CallbackInfoReturnable<HumanoidModel.ArmPose> cir) {
        ItemStack itemStack = player.getUseItem();
        if (!(itemStack.getItem() instanceof PlushieBlockItem))
            return;

        if (itemStack.getTags().anyMatch((TagKey<Item> tag) -> tag.equals(Tags.TAG_HUGGABLE))) {
            Level level = player.level();
            AbstractClientPlayerLastHug lastHugInstance = (AbstractClientPlayerLastHug) player;
            if (lastHugInstance.getLastHug() != player.tickCount && (player.tickCount & 0b11111) == 0) {
                RandomSource random = level.getRandom();
                double d0 = random.nextGaussian() * 0.02;
                double d1 = random.nextGaussian() * 0.02;
                double d2 = random.nextGaussian() * 0.02;
                level.addParticle(ParticleTypes.HEART, player.getRandomX(1.0), player.getRandomY() + 0.5, player.getRandomZ(1.0), d0, d1, d2);
                level.addParticle(ParticleTypes.HEART, player.getRandomX(1.0), player.getRandomY() + 0.5, player.getRandomZ(1.0), d0, d1, d2);
                lastHugInstance.setLastHug(player.tickCount);
            }
            cir.setReturnValue(HumanoidModel.ArmPose.CROSSBOW_HOLD);
            cir.cancel();
        }
    }
}
