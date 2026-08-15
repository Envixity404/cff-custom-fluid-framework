package dev.envixity.cff.api;

public final class FluidProfiles {
    private FluidProfiles() {}

    public static final FluidProfile WATER = new FluidProfile("water", FluidClass.WATER, 5, 1);
    public static final FluidProfile LAVA  = new FluidProfile("lava", FluidClass.LAVA, 30, 2);
}
