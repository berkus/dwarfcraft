package pw.psr.dwarfcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlock extends Block {
	public BasicBlock(String unlocalizedName, Material material, float hardness, float resistance)
	{
		super(material);
		setUnlocalizedName(unlocalizedName);
		setCreativeTab(CreativeTabs.tabBlock);
        setHardness(hardness);
        setResistance(resistance);
	}

	public BasicBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, hardness, resistance);
    }

    public BasicBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }
}
