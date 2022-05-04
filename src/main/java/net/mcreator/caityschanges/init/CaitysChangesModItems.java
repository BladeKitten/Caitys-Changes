
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.caityschanges.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.caityschanges.item.TemperedEmeraldItem;
import net.mcreator.caityschanges.item.EmeraldiotoolsSwordItem;
import net.mcreator.caityschanges.item.EmeraldiotoolsShovelItem;
import net.mcreator.caityschanges.item.EmeraldiotoolsPickaxeItem;
import net.mcreator.caityschanges.item.EmeraldiotoolsHoeItem;
import net.mcreator.caityschanges.item.EmeraldiotoolsAxeItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CaitysChangesModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item EMERALDIOTOOLS_PICKAXE = register(new EmeraldiotoolsPickaxeItem());
	public static final Item EMERALDIOTOOLS_AXE = register(new EmeraldiotoolsAxeItem());
	public static final Item EMERALDIOTOOLS_SWORD = register(new EmeraldiotoolsSwordItem());
	public static final Item EMERALDIOTOOLS_SHOVEL = register(new EmeraldiotoolsShovelItem());
	public static final Item EMERALDIOTOOLS_HOE = register(new EmeraldiotoolsHoeItem());
	public static final Item TEMPERED_EMERALD = register(new TemperedEmeraldItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
