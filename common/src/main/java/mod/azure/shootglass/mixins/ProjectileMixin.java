package mod.azure.shootglass.mixins;

import mod.azure.shootglass.ShootGlass;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractArrow.class)
public abstract class ProjectileMixin extends Entity {

    protected ProjectileMixin(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(at = @At("HEAD"), method = "onHitBlock")
    private void breakGlass(BlockHitResult blockHitResult, CallbackInfo info) {
        if (this.level().getBlockState(blockHitResult.getBlockPos()).is(ShootGlass.BREAKABLE_BLOCKS)) {
            this.level().destroyBlock(blockHitResult.getBlockPos(), true);
            if (!this.level().isClientSide && ShootGlass.shootGlassConfig.removeProjectile)
                this.remove(RemovalReason.DISCARDED);
        }
    }
}