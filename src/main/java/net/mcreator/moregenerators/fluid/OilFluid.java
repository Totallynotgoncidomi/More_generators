
package net.mcreator.moregenerators.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.moregenerators.init.MoreGeneratorsModItems;
import net.mcreator.moregenerators.init.MoreGeneratorsModFluids;
import net.mcreator.moregenerators.init.MoreGeneratorsModFluidTypes;
import net.mcreator.moregenerators.init.MoreGeneratorsModBlocks;

public abstract class OilFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MoreGeneratorsModFluidTypes.OIL_TYPE.get(), () -> MoreGeneratorsModFluids.OIL.get(), () -> MoreGeneratorsModFluids.FLOWING_OIL.get())
			.explosionResistance(100f).bucket(() -> MoreGeneratorsModItems.OIL_BUCKET.get()).block(() -> (LiquidBlock) MoreGeneratorsModBlocks.OIL.get());

	private OilFluid() {
		super(PROPERTIES);
	}

	public static class Source extends OilFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends OilFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
