package mod.azure.shootglass;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;

@Mod("shootglass")
public class ShootGlassMod {

	public static final TagKey<Block> BREAKABLE_BLOCKS = TagKey.create(Registries.BLOCK, new ResourceLocation("shootglass", "breakable_blocks"));

	public ShootGlassMod() {
	}
}