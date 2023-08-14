package com.faboslav.friendsandfoes.entity;

import com.faboslav.friendsandfoes.mixin.IllusionerEntityMixin;
import net.minecraft.entity.mob.IllusionerEntity;

/**
 * @see IllusionerEntityMixin
 */
public interface IllusionerEntityAccess
{
	void friendsandfoes_setIllusioner(IllusionerEntity illusionerEntity);

	void friendsandfoes_setIsIllusion(boolean isIllusion);

	void friendsandfoes_setTicksUntilDespawn(int ticksUntilDespawn);

	boolean friendsandfoes_tryToTeleport(int x, int y, int z);

	void friendsandfoes_spawnCloudParticles();
}
