
package net.helshim.helshimmod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.helshim.helshimmod.item.ItemFeu;
import net.helshim.helshimmod.ElementsHelshimMod;

@ElementsHelshimMod.ModElement.Tag
public class TabHelshim extends ElementsHelshimMod.ModElement {
	public TabHelshim(ElementsHelshimMod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabhelshim") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemFeu.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
