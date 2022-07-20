package dev.ender.stardust.entity.cannon.medium;

import dev.ender.stardust.registry.BlockEntityRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class RailGun4MediumEntity extends AbstractCannonMediumEntity {

    public RailGun4MediumEntity(BlockPos pos, BlockState state) {
        super(BlockEntityRegistry.RAIL_GUN_4_MEDIUM_ENTITY, pos, state);
    }

    @Override
    public void registerControllers(AnimationData animationData) {

    }


}
