
package net.mcreator.caityschanges.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.caityschanges.init.CaitysChangesModTabs;

public class TemperedEmeraldItem extends Item {
	public TemperedEmeraldItem() {
		super(new Item.Properties().tab(CaitysChangesModTabs.TAB_CAITYS_CHANGES).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("tempered_emerald");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
