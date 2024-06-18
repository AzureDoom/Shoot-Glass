package mod.azure.shootglass;

import mod.azure.azurelib.common.internal.common.AzureLibMod;
import mod.azure.azurelib.common.internal.common.config.format.ConfigFormats;
import net.fabricmc.api.ModInitializer;

public final class FabricLibMod implements ModInitializer {

    @Override
    public void onInitialize() {
        ShootGlass.shootGlassConfig = AzureLibMod.registerConfig(ShootGlassConfig.class,
                ConfigFormats.json()).getConfigInstance();
    }
}
