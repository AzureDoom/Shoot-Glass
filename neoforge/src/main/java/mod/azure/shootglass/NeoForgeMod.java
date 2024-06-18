package mod.azure.shootglass;

import mod.azure.azurelib.common.internal.common.AzureLibMod;
import mod.azure.azurelib.common.internal.common.config.format.ConfigFormats;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ShootGlass.MOD_ID)
public final class NeoForgeMod {

    public NeoForgeMod(IEventBus modEventBus) {
        ShootGlass.shootGlassConfig = AzureLibMod.registerConfig(ShootGlassConfig.class,
                ConfigFormats.json()).getConfigInstance();
    }
}
