package dev.ender.stardust.block.cannon.medium;

import dev.ender.stardust.registry.BlockEntityRegistry;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import software.bernie.example.registry.TileRegistry;

public class RailGun4MediumBlock extends AbstractCannonBlockMediumBlock {

    public RailGun4MediumBlock(Settings settings) {
        super(settings);
    }
    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return BlockEntityRegistry.RAIL_GUN_4_MEDIUM_ENTITY.instantiate(pos, state);
    }

    @Override
    public void shoot() {

    }

}
