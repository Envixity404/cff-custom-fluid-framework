package dev.envixity.cff.integration;

import dev.envixity.cff.CffMod;
import dev.envixity.cff.api.CffFluidRegistry;
import dev.envixity.cff.api.FluidProfile;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluids;

/** Connects CFF's profile registry to Flowing Fluids once a server exists. */
public final class CffServerHooks {
    private CffServerHooks() {}

    public static void register() {
        ServerLifecycleEvents.SERVER_STARTED.register(server -> {
            enableProfiled(Fluids.FLOWING_WATER, server);
            enableProfiled(Fluids.FLOWING_LAVA, server);
        });
    }

    private static void enableProfiled(FlowingFluid fluid, net.minecraft.server.MinecraftServer server) {
        FluidProfile profile = CffFluidRegistry.profileOf(fluid);
        if (profile == null) return;

        FlowingFluidsBridge.enable(fluid, server);
        CffMod.LOGGER.info(
            "CFF handed {} profile {} ({}) to Flowing Fluids [tickDelay={}, levelDecrease={}]",
            fluid, profile.id(), profile.fluidClass(), profile.tickDelay(), profile.levelDecreasePerBlock()
        );
    }
}
