package dev.ender.stardust.block.cannon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractCannonBlock extends Block implements BlockEntityProvider {
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
