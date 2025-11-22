package com.link.plushies.mixin;

import com.link.plushies.AbstractClientPlayerLastHug;
import net.minecraft.client.player.AbstractClientPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(AbstractClientPlayer.class)
public class MixinAbstractClientPlayer implements AbstractClientPlayerLastHug {
    @Unique
    int last_hug;

    @Override
    public int getLastHug() {
        return last_hug;
    }

    @Override
    public void setLastHug(int tick) {
        last_hug = tick;
    }
}
