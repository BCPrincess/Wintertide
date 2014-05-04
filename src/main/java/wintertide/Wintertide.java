package wintertide;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "wintertide", name = "Wintertide", version = "0.0.1")
public class Wintertide {
	
	public String modid = "wintertide";
	
    @Instance("wintertide")
    public static Wintertide instance;

    @SidedProxy(clientSide = "wintertide.ClientProxy", serverSide = "wintertide.CommonProxy")
    public static CommonProxy proxy;
	
    private static Skis skis = new Skis();
    private static ItemStack skisStack = new ItemStack(skis, 1);
    private static ItemStack planksStack = new ItemStack(Blocks.planks, 1);
    
	@EventHandler
	public void preInit(FMLPreInitializationEvent preInitEvent) {
	        GameRegistry.registerItem(skis, skis.getUnlocalizedName(), modid);
	}
	
	@EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
		
		GameRegistry.addRecipe(skisStack,
				"p p",
				"p p",
				"p p",
                'p', planksStack);
	}
}
