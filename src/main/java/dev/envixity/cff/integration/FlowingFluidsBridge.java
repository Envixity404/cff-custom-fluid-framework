package dev.envixity.cff.integration;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.material.FlowingFluid;
import traben.flowing_fluids.api.FlowingFluidsAPI;

public final class FlowingFluidsBridge {
    private static final FlowingFluidsAPI API = FlowingFluidsAPI.getInstance("cff");
    private FlowingFluidsBridge() {}

    public static void enable(FlowingFluid fluid, MinecraftServer server) {
        API.enableThisFluid(fluid, server);
    }

    public static boolean isHandled(FlowingFluid fluid) {
        return API.doesModifyThisFluid(fluid);
    }
}
