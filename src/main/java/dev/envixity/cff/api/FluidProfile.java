package dev.envixity.cff.api;

public record FluidProfile(String id, FluidClass fluidClass, int tickDelay, int levelDecreasePerBlock) {
    public FluidProfile {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("profile id cannot be blank");
        if (fluidClass == null) throw new IllegalArgumentException("fluidClass cannot be null");
        if (tickDelay < 1) throw new IllegalArgumentException("tickDelay must be >= 1");
        if (levelDecreasePerBlock < 1) throw new IllegalArgumentException("levelDecreasePerBlock must be >= 1");
    }
}
