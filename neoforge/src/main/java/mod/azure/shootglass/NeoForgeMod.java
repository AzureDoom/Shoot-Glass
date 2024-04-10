package mod.azure.shootglass;

import mod.azure.azurelib.AzureLibMod;
import mod.azure.azurelib.config.format.ConfigFormats;
import net.minecraftforge.fml.common.Mod;

@Mod(ShootGlass.MOD_ID)
public final class NeoForgeMod {

    public NeoForgeMod() {
        ShootGlass.shootGlassConfig = AzureLibMod.registerConfig(ShootGlassConfig.class,
                ConfigFormats.json()).getConfigInstance();
    }
}
