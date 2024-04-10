package mod.azure.shootglass;

import mod.azure.azurelib.config.Config;
import mod.azure.azurelib.config.Configurable;

@Config(id = ShootGlass.MOD_ID)
public class ShootGlassConfig {
    @Configurable
    @Configurable.Synchronized
    public boolean removeProjectile = true;
}
