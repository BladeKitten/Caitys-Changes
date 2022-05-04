
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.caityschanges.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CaitysChangesModTabs {
	public static CreativeModeTab TAB_CAITYS_CHANGES;

	public static void load() {
		TAB_CAITYS_CHANGES = new CreativeModeTab("tabcaitys_changes") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CaitysChangesModItems.REINFORCED_EMERALD_INGOT);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
