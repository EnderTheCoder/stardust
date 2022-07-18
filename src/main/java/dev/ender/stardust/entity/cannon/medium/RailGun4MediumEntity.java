package dev.ender.stardust.entity.cannon.medium;

import dev.ender.stardust.entity.cannon.AbstractCannonEntity;
import dev.ender.stardust.registry.EntityRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import software.bernie.example.block.tile.FertilizerTileEntity;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class RailGun4MediumEntity extends AbstractCannonMediumEntity implements IAnimatable {
    private final AnimationFactory factory = new AnimationFactory(this);

    public RailGun4MediumEntity(BlockPos pos, BlockState state) {
        super(EntityRegistry.RAIL_GUN_4_MEDIUM_ENTITY, pos, state);
    }

    @Override
    public void registerControllers(AnimationData animationData) {

    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
}
