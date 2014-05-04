package wintertide;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "wintertide", name = "Wintertide", version = "0.0.1")
public class Wintertide {
	@EventHandler
	public void preInit(FMLPreInitializationEvent preInitEvent) {
	        Skis skis = new Skis();
	        skis.setTextureName("wintertide:skis");
	        GameRegistry.registerItem(skis, skis.getUnlocalizedName(), "wintertide");
	}
	
	@EventHandler
    public void load(FMLInitializationEvent event) {
		GameRegistry.addRecipe(new ItemStack(new Skis(), 1),
				"p p",
				"p p",
				"p p",
                'p', new ItemStack(Blocks.planks));
	}
}
