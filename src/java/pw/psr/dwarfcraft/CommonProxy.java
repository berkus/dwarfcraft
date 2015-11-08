package pw.psr.dwarfcraft;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import pw.psr.dwarfcraft.items.ModItems;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    	ModItems.init();
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}
