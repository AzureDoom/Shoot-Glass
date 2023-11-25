package mod.azure.shootglass;

import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
@Mod(ShootGlass.MOD_ID)
public final class NeoForgeMod {

    public static NeoForgeMod instance;

    public NeoForgeMod() {
        instance = this;
    }
}
