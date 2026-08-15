package dev.envixity.cff;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class CffMod implements ModInitializer {
    public static final String MOD_ID = "cff";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("CFF v0.1 bootstrap: WATER/LAVA profile core loaded; Flowing Fluids bridge available.");
    }
}
