package wintertide;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Skis extends Item {

	Skis() {
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("skis");
		setTextureName("wintertide:skis");
	}
}
