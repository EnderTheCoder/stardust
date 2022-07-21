package dev.ender.stardust.client.gecko.renderer;

import dev.ender.stardust.client.gecko.model.ShipComputer4Model;
import dev.ender.stardust.entity.controller.ShipComputer4Entity;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class ShipComputer4Renderer extends GeoBlockRenderer<ShipComputer4Entity> {
    public ShipComputer4Renderer() {
        super(new ShipComputer4Model());
    }
}
