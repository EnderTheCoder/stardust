package dev.ender.stardust.client.gecko.renderer;

import dev.ender.stardust.client.gecko.model.RailGun4MediumModel;
import dev.ender.stardust.entity.cannon.medium.RailGun4MediumEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.example.block.tile.BotariumTileEntity;
import software.bernie.example.block.tile.FertilizerTileEntity;
import software.bernie.example.client.model.tile.FertilizerModel;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class RailGun4MediumRenderer extends GeoBlockRenderer<RailGun4MediumEntity> {
    public RailGun4MediumRenderer() {
        super(new RailGun4MediumModel());
    }

}
