
package net.hlft.developer_tool.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.hlft.developer_tool.itemgroup.WeaponItemGroup;
import net.hlft.developer_tool.DeveloperToolModElements;

@DeveloperToolModElements.ModElement.Tag
public class CopperKtanaItem extends DeveloperToolModElements.ModElement {
	@ObjectHolder("developer_tool:copper_ktana")
	public static final Item block = null;
	public CopperKtanaItem(DeveloperToolModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 230;
			}

			public float getEfficiency() {
				return 1f;
			}

			public float getAttackDamage() {
				return -0.2f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2f, new Item.Properties().group(WeaponItemGroup.tab)) {
		}.setRegistryName("copper_ktana"));
	}
}
