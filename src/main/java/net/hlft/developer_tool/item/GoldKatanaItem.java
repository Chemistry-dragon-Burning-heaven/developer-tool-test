
package net.hlft.developer_tool.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.hlft.developer_tool.itemgroup.WeaponItemGroup;
import net.hlft.developer_tool.DeveloperToolModElements;

@DeveloperToolModElements.ModElement.Tag
public class GoldKatanaItem extends DeveloperToolModElements.ModElement {
	@ObjectHolder("developer_tool:gold_katana")
	public static final Item block = null;
	public GoldKatanaItem(DeveloperToolModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 200;
			}

			public float getEfficiency() {
				return 1f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.GOLD_INGOT, (int) (1)));
			}
		}, 3, -2f, new Item.Properties().group(WeaponItemGroup.tab)) {
		}.setRegistryName("gold_katana"));
	}
}
