package dev.ender.stardust.entity.thruster;

import dev.ender.stardust.registry.BlockEntityRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;

public class Thruster1Entity extends AbstractThrusterEntity{
    public Thruster1Entity(BlockPos pos, BlockState state) {
        super(BlockEntityRegistry.THRUSTER_1_ENTITY, pos, state);
    }

    @Override
    public void registerControllers(AnimationData animationData) {

    }
}
