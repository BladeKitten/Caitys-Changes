
package net.mcreator.caityschanges.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.caityschanges.init.CaitysChangesModTabs;

public class ReinforcedEmeraldIngotItem extends Item {
	public ReinforcedEmeraldIngotItem() {
		super(new Item.Properties().tab(CaitysChangesModTabs.TAB_CAITYS_CHANGES).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("reinforced_emerald_ingot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
