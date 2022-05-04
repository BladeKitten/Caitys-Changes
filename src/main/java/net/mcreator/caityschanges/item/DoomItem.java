
package net.mcreator.caityschanges.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.caityschanges.init.CaitysChangesModTabs;
import net.mcreator.caityschanges.init.CaitysChangesModSounds;

import java.util.List;

public class DoomItem extends RecordItem {
	public DoomItem() {
		super(0, CaitysChangesModSounds.REGISTRY.get(new ResourceLocation("caitys_changes:doom")),
				new Item.Properties().tab(CaitysChangesModTabs.TAB_CAITYS_CHANGES).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("doom");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("by Sxarlett"));
	}
}
