package pw.psr.dwarfcraft.client.render.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import pw.psr.dwarfcraft.Main;
import pw.psr.dwarfcraft.blocks.ModBlocks;

public class BlockRenderRegister {
	public static void init() {
		register(ModBlocks.tutorialBlock);
	}

	protected static void register(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Main.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
