package com.link.plushies;

public interface AbstractClientPlayerLastHug {
    default int getLastHug() {
        return 0;
    }

    default void setLastHug(int tick) {
    }
}
