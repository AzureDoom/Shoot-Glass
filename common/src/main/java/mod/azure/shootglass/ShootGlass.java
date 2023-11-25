package mod.azure.shootglass;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ShootGlass {
    public static final String MOD_ID = "shootglass";
    public static final TagKey<Block> BREAKABLE_BLOCKS = TagKey.create(Registries.BLOCK, new ResourceLocation("shootglass", "breakable_blocks"));

    public static final ResourceLocation modResource(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}
