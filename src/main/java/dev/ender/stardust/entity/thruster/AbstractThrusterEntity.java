package dev.ender.stardust.entity.thruster;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public abstract class AbstractThrusterEntity extends BlockEntity implements IAnimatable {

    private final AnimationFactory factory = new AnimationFactory(this);

    public AbstractThrusterEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
}
