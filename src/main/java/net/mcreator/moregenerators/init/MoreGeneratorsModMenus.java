
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moregenerators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.moregenerators.world.inventory.BiomassguiMenu;
import net.mcreator.moregenerators.MoreGeneratorsMod;

public class MoreGeneratorsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MoreGeneratorsMod.MODID);
	public static final RegistryObject<MenuType<BiomassguiMenu>> BIOMASSGUI = REGISTRY.register("biomassgui", () -> IForgeMenuType.create(BiomassguiMenu::new));
}
