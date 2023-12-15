
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moregenerators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.moregenerators.block.SSSBlock;
import net.mcreator.moregenerators.MoreGeneratorsMod;

public class MoreGeneratorsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreGeneratorsMod.MODID);
	public static final RegistryObject<Block> SSS = REGISTRY.register("sss", () -> new SSSBlock());
}
