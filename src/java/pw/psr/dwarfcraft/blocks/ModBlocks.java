package pw.psr.dwarfcraft.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	public static Block tutorialBlock;
	public static final String tutorialBlockID = "tutorial_block";

	public static void init() {
		GameRegistry.registerBlock(tutorialBlock = new BasicBlock(tutorialBlockID).setLightLevel(1.0f), tutorialBlockID);
	}
}
