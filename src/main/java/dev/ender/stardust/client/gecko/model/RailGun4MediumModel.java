package dev.ender.stardust.client.gecko.model;

import dev.ender.stardust.entity.cannon.medium.RailGun4MediumEntity;
import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import static dev.ender.stardust.Stardust.MOD_ID;

public class RailGun4MediumModel extends AnimatedGeoModel<RailGun4MediumEntity> {
    @Override
    public Identifier getModelLocation(RailGun4MediumEntity object) {
        return new Identifier(MOD_ID, "geo/rail_gun_4_medium.geo.json");
    }

    @Override
    public Identifier getTextureLocation(RailGun4MediumEntity object) {
        return new Identifier(MOD_ID, "textures/block/rail_gun_4_medium.png");
    }

    @Override
    public Identifier getAnimationFileLocation(RailGun4MediumEntity animatable) {
        return null;
    }
}
