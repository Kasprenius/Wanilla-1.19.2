package net.kas.wanilla.client.rendering;

import net.kas.wanilla.access.PersistentProjectileEntityAccess;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.util.math.BlockPos;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Environment(EnvType.CLIENT)
public class DynamicLightingHandler {

    private static final MinecraftClient MinecraftInstance = MinecraftClient.getInstance();
    public static final Map<BlockPos, LightData> LIGHT_SOURCES = new ConcurrentHashMap<>();


    public static void tick(PersistentProjectileEntity persistentProjectileEntity) {
        if (persistentProjectileEntity != null && MinecraftInstance.player != null) {
          if (shouldGlow(persistentProjectileEntity)) {
              LIGHT_SOURCES.put(persistentProjectileEntity.getBlockPos(), new LightData(0.5F));
          }
        }
    }


    public static boolean shouldGlow(PersistentProjectileEntity persistentProjectileEntity) {
        return ((PersistentProjectileEntityAccess) persistentProjectileEntity).getGlow();
    }

    public static class LightData {
        public boolean shouldKeep = true;
        public double time;
        public double amplifier;

        public LightData(double amplifier) {
            this.amplifier = amplifier;
            this.time = 20 * amplifier;
        }
    }
}
