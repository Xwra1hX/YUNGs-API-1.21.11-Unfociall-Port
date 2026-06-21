package com.yungnickyoung.minecraft.yungsapi.world.structure.terrainadaptation.beardifier;

/**
 * Exposes the noise-world dimensions retained by the 1.21.11 NoiseChunk mixin.
 */
public interface NoiseChunkSettingsSupplier {
    int yungsapi_getNoiseHeight();

    int yungsapi_getNoiseMinY();
}
