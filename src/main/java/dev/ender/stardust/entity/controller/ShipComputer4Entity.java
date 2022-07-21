package dev.ender.stardust.entity.controller;

import dev.ender.stardust.Stardust;
import dev.ender.stardust.registry.BlockEntityRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import software.bernie.example.entity.RocketProjectile;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class ShipComputer4Entity extends BlockEntity implements IAnimatable {

    public boolean isOpen = false;
    public boolean isSwitching = false;
    private final AnimationFactory factory = new AnimationFactory(this);
    public final AnimationController<ShipComputer4Entity> controller = new AnimationController<>(this, "controller", 0, this::predicate);
    public ShipComputer4Entity(BlockPos pos, BlockState state) {
        super(BlockEntityRegistry.SHIP_COMPUTER_4_ENTITY, pos, state);
    }

    public void switchState() {
        if (!isSwitching) {
            this.isOpen = !isOpen;
            this.isSwitching = true;
        }
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(controller);
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (!isSwitching) return PlayState.CONTINUE;
        isSwitching = false;
        if (isOpen) {
            Stardust.LOGGER.info("triggered close");
            this.controller.setAnimation(new AnimationBuilder().addAnimation("close", false));
        } else {
            Stardust.LOGGER.info("triggered open");
            this.controller.setAnimation(new AnimationBuilder().addAnimation("open", false));
        }
        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        this.isOpen = nbt.getBoolean("isOpen");
        this.isSwitching = nbt.getBoolean("isSwitching");
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        nbt.putBoolean("isOpen", this.isOpen);
        nbt.putBoolean("isSwitching", this.isSwitching);
        super.writeNbt(nbt);
    }
}
