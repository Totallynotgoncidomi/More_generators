
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moregenerators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.moregenerators.item.OilItem;
import net.mcreator.moregenerators.item.EnergyMeterItem;
import net.mcreator.moregenerators.item.BiofuelItem;
import net.mcreator.moregenerators.MoreGeneratorsMod;

public class MoreGeneratorsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoreGeneratorsMod.MODID);
	public static final RegistryObject<Item> BIOFUEL = REGISTRY.register("biofuel", () -> new BiofuelItem());
	public static final RegistryObject<Item> OIL_BUCKET = REGISTRY.register("oil_bucket", () -> new OilItem());
	public static final RegistryObject<Item> BIOMASS_BURNER = block(MoreGeneratorsModBlocks.BIOMASS_BURNER);
	public static final RegistryObject<Item> ENERGY_METER = REGISTRY.register("energy_meter", () -> new EnergyMeterItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
