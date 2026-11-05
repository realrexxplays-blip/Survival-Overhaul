package com.realrexxplayz.survivaloverhaul.fabric;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SurvivalOverhaulFabric implements ModInitializer {
    public static final String MOD_ID = "survival_overhaul";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Survival Overhaul (Fabric) initialized. Gameplay systems are under development.");
    }
}
