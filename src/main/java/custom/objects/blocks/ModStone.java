package custom.objects.blocks;

import custom.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;


public class ModStone extends Block{

	public ModStone() {
		super(BlockBehaviour.Properties
				.of()
				.strength(1.5F, 6F)
				.requiresCorrectToolForDrops()
				);
				
		
		ModBlocks.pickaxe.add(this);
		ModBlocks.stones.add(this);
	}

}
