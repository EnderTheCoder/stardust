package dev.ender.stardust.block.thruster;

import dev.ender.stardust.registry.BlockEntityRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class Thruster1Block extends AbstractThruster{
    public Thruster1Block(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return BlockEntityRegistry.THRUSTER_1_ENTITY.instantiate(pos, state);
    }
}
