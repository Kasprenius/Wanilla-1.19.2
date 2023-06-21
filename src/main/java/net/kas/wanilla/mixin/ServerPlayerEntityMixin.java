package net.kas.wanilla.mixin;

import com.mojang.authlib.GameProfile;
import net.kas.wanilla.util.ServerPlayerGetters;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ServerPlayerEntity.class)
public abstract class ServerPlayerEntityMixin extends PlayerEntity implements ServerPlayerGetters {

    @Shadow
    @Nullable
    private BlockPos spawnPointPosition;

    public ServerPlayerEntityMixin(World world, BlockPos pos, float yaw, GameProfile gameProfile) {
        super(world, pos, yaw, gameProfile);
    }

    @Override
    public BlockPos getServerPlayerSpawnPosition() {
        return this.spawnPointPosition;
    }

}