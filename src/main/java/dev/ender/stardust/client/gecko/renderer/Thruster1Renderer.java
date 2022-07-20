package dev.ender.stardust.client.gecko.renderer;

import dev.ender.stardust.client.gecko.model.Thruster1Model;
import dev.ender.stardust.entity.thruster.Thruster1Entity;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class Thruster1Renderer extends GeoBlockRenderer<Thruster1Entity> {
    public Thruster1Renderer() {
        super(new Thruster1Model());
    }
}
