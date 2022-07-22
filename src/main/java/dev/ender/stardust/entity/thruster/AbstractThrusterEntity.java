package dev.ender.stardust.entity.thruster;

import dev.ender.stardust.Stardust;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public abstract class AbstractThrusterEntity extends BlockEntity implements IAnimatable {

    public boolean isOn = false;
    private final AnimationFactory factory = new AnimationFactory(this);

    public AbstractThrusterEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public void switchState() {
        this.isOn = !this.isOn;
        assert this.world != null;
        this.world.updateListeners(pos, this.world.getBlockState(this.pos), this.world.getBlockState(this.pos), Block.NOTIFY_LISTENERS);
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        assert this.world != null;
        if (this.world.isClient) Stardust.LOGGER.info("write on client");
        nbt.putBoolean("isOn", this.isOn);
        Stardust.LOGGER.info("triggered write " + this.isOn);
        super.writeNbt(nbt);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);

        this.isOn = nbt.getBoolean("isOn");
        Stardust.LOGGER.info("triggered read " + this.isOn);

    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return createNbt();
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }

}
