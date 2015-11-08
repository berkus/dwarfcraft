package pw.psr.dwarfcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BasicItem extends Item {
	public BasicItem(String unlocalizedName) {
		super();
		setUnlocalizedName(unlocalizedName);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
