package mod.azure.shootglass;

import mod.azure.azurelib.common.api.common.config.Config;
import mod.azure.azurelib.common.internal.common.config.Configurable;

@Config(id = ShootGlass.MOD_ID)
public class ShootGlassConfig {
    @Configurable
    @Configurable.Synchronized
    public boolean removeProjectile = true;
}
