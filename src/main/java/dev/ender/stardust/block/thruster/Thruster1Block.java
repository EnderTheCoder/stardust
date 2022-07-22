package dev.ender.stardust.block.thruster;

import dev.ender.stardust.Stardust;
import dev.ender.stardust.entity.thruster.Thruster1Entity;
import dev.ender.stardust.registry.BlockEntityRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Thruster1Block extends AbstractThruster {
    private Thruster1Entity entity;

    public Thruster1Block(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        this.entity = new Thruster1Entity(pos, state);
        return this.entity;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {


            if (!world.isClient && hand == Hand.MAIN_HAND) {
                entity.switchState();

                Stardust.LOGGER.info("triggered switch " + entity.isOn);
            }

        return super.onUse(state, world, pos, player, hand, hit);
    }
}
