package dev.ender.stardust.block.cannon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;

public abstract class AbstractCannonBlock extends Block  {
    public AbstractCannonBlock(Settings settings) {
        super(settings);
    }
    /**
     * control the cannon shooting. should be connected with the tile entity.
     * */
    public abstract void shoot();

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.ENTITYBLOCK_ANIMATED;
    }
}
