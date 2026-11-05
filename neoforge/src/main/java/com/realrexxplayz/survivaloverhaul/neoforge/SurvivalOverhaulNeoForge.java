package com.realrexxplayz.survivaloverhaul.neoforge;

import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(SurvivalOverhaulNeoForge.MOD_ID)
public final class SurvivalOverhaulNeoForge {
    public static final String MOD_ID = "survival_overhaul";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public SurvivalOverhaulNeoForge() {
        LOGGER.info("Survival Overhaul (NeoForge) initialized. Gameplay systems are under development.");
    }
}
