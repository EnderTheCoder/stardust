package dev.ender.stardust.entity.cannon.medium;

import dev.ender.stardust.entity.cannon.AbstractCannonEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public abstract class AbstractCannonMediumEntity extends AbstractCannonEntity {

    public AbstractCannonMediumEntity(BlockEntityType<? extends AbstractCannonEntity> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }
}
