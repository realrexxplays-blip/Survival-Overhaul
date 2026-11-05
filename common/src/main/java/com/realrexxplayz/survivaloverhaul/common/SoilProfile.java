package com.realrexxplayz.survivaloverhaul.common;

/** Loader-independent soil nutrient model. Nutrients are clamped to 0..100. */
public final class SoilProfile {
    private int nutrients;

    public SoilProfile() {
        this(100);
    }

    public SoilProfile(int nutrients) {
        this.nutrients = clamp(nutrients);
    }

    public int nutrients() {
        return nutrients;
    }

    public void harvest() {
        nutrients = clamp(nutrients - 12);
    }

    public void compost(int amount) {
        nutrients = clamp(nutrients + Math.max(0, amount));
    }

    public void rotateCrop() {
        nutrients = clamp(nutrients + 5);
    }

    private static int clamp(int value) {
        return Math.max(0, Math.min(100, value));
    }
}
