
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moregenerators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.moregenerators.block.OilBlock;
import net.mcreator.moregenerators.block.BiomassBurnerBlock;
import net.mcreator.moregenerators.MoreGeneratorsMod;

public class MoreGeneratorsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreGeneratorsMod.MODID);
	public static final RegistryObject<Block> SSS = REGISTRY.register("sss", () -> new SSSBlock());
	public static final RegistryObject<Block> OIL = REGISTRY.register("oil", () -> new OilBlock());
	public static final RegistryObject<Block> BIOMASS_BURNER = REGISTRY.register("biomass_burner", () -> new BiomassBurnerBlock());
}
