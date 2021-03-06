
package net.hlft.developer_tool.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.hlft.developer_tool.itemgroup.CoinItemGroup;
import net.hlft.developer_tool.DeveloperToolModElements;

@DeveloperToolModElements.ModElement.Tag
public class IronCoinItem extends DeveloperToolModElements.ModElement {
	@ObjectHolder("developer_tool:iron_coin")
	public static final Item block = null;
	public IronCoinItem(DeveloperToolModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CoinItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("iron_coin");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
