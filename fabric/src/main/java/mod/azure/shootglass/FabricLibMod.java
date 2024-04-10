package mod.azure.shootglass;

import mod.azure.azurelib.AzureLibMod;
import mod.azure.azurelib.config.format.ConfigFormats;
import net.fabricmc.api.ModInitializer;

public final class FabricLibMod implements ModInitializer {

    @Override
    public void onInitialize() {
        ShootGlass.shootGlassConfig = AzureLibMod.registerConfig(ShootGlassConfig.class,
                ConfigFormats.json()).getConfigInstance();
    }
}
