
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moregenerators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.moregenerators.MoreGeneratorsMod;

public class MoreGeneratorsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MoreGeneratorsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BIOMASS_BURNER = register("biomass_burner", MoreGeneratorsModBlocks.BIOMASS_BURNER, BiomassBurnerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
