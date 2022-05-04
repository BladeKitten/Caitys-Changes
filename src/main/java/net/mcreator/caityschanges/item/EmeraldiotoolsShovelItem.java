
package net.mcreator.caityschanges.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.caityschanges.init.CaitysChangesModTabs;
import net.mcreator.caityschanges.init.CaitysChangesModItems;

public class EmeraldiotoolsShovelItem extends ShovelItem {
	public EmeraldiotoolsShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CaitysChangesModItems.REINFORCED_EMERALD_INGOT));
			}
		}, 1, -3f, new Item.Properties().tab(CaitysChangesModTabs.TAB_CAITYS_CHANGES));
		setRegistryName("emeraldiotools_shovel");
	}
}
