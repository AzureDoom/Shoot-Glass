package mod.azure.shootglass;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ShootGlassMod implements ModInitializer {

	public static final TagKey<Block> BREAKABLE_BLOCKS = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("shootglass", "breakable_blocks"));

	@Override
	public void onInitialize() {
	}
}