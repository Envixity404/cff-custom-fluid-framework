package dev.envixity.cff.test;

import dev.envixity.cff.CffMod;
import dev.envixity.cff.api.CffFluidRegistry;
import dev.envixity.cff.api.FluidProfiles;
import net.minecraft.world.level.material.Fluids;

/**
 * Phase-2 smoke test.
 *
 * We deliberately bind CFF's two behavior classes to vanilla flowing fluids
 * first. This proves that profiles can attach to real runtime fluids without
 * introducing custom blocks/items/textures before the bridge is verified.
 */
public final class CffTestFluids {
    private CffTestFluids() {}

    public static void register() {
        CffFluidRegistry.register(Fluids.FLOWING_WATER, FluidProfiles.WATER);
        CffFluidRegistry.register(Fluids.FLOWING_LAVA, FluidProfiles.LAVA);

        CffMod.LOGGER.info(
            "CFF test profiles registered: FLOWING_WATER -> WATER (fast/runny), FLOWING_LAVA -> LAVA (slow/heavy)"
        );
    }
}
