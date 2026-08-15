package dev.envixity.cff.api;

import net.minecraft.world.level.material.FlowingFluid;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public final class CffFluidRegistry {
    private static final Map<FlowingFluid, FluidProfile> PROFILES = new IdentityHashMap<>();
    private CffFluidRegistry() {}

    public static synchronized void register(FlowingFluid fluid, FluidProfile profile) {
        Objects.requireNonNull(fluid, "fluid");
        Objects.requireNonNull(profile, "profile");
        PROFILES.put(fluid, profile);
    }

    public static synchronized FluidProfile profileOf(FlowingFluid fluid) {
        return PROFILES.get(fluid);
    }
}
