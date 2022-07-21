package dev.ender.stardust.client.gecko.model;

import dev.ender.stardust.Stardust;
import dev.ender.stardust.entity.controller.ShipComputer4Entity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ShipComputer4Model extends AnimatedGeoModel<ShipComputer4Entity> {
    @Override
    public Identifier getModelLocation(ShipComputer4Entity object) {
        return new Identifier(Stardust.MOD_ID, "geo/ship_computer_4_block.geo.json");
    }

    @Override
    public Identifier getTextureLocation(ShipComputer4Entity object) {
        return new Identifier(Stardust.MOD_ID, "textures/block/ship_computer_4_block.png");
    }

    @Override
    public Identifier getAnimationFileLocation(ShipComputer4Entity animatable) {
        return new Identifier(Stardust.MOD_ID, "animations/ship_computer_4_open_and_close.json");
    }
}
