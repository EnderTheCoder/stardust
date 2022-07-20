package dev.ender.stardust.client.gecko.model;

import dev.ender.stardust.Stardust;
import dev.ender.stardust.block.thruster.Thruster1Block;
import dev.ender.stardust.entity.thruster.Thruster1Entity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class Thruster1Model extends AnimatedGeoModel<Thruster1Entity> {
    @Override
    public Identifier getModelLocation(Thruster1Entity object) {
        return new Identifier(Stardust.MOD_ID, "geo/thruster_1.geo.json");
    }

    @Override
    public Identifier getTextureLocation(Thruster1Entity object) {
        return new Identifier(Stardust.MOD_ID, "textures/block/thruster_1.png");
    }

    @Override
    public Identifier getAnimationFileLocation(Thruster1Entity animatable) {
        return null;
    }
}
