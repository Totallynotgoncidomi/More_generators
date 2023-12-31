package net.mcreator.moregenerators.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class EnergyMeterRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity) {
		if (direction == null || entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(((new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, direction).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, BlockPos.containing(x, y, z))) + "/" + (new Object() {
				public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, direction).ifPresent(capability -> _retval.set(capability.getMaxEnergyStored()));
					return _retval.get();
				}
			}.getMaxEnergyStored(world, BlockPos.containing(x, y, z))) + " Energy at " + direction)), true);
	}
}
