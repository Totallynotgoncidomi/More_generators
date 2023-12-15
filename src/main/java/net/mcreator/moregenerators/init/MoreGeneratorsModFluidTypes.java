
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moregenerators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.moregenerators.fluid.types.OilFluidType;
import net.mcreator.moregenerators.MoreGeneratorsMod;

public class MoreGeneratorsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MoreGeneratorsMod.MODID);
	public static final RegistryObject<FluidType> OIL_TYPE = REGISTRY.register("oil", () -> new OilFluidType());
}
