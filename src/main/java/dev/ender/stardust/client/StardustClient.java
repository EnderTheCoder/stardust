package dev.ender.stardust.client;

import dev.ender.stardust.client.gecko.renderer.RailGun4MediumRenderer;
import dev.ender.stardust.client.gecko.renderer.Thruster1Renderer;
import dev.ender.stardust.registry.BlockEntityRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;

@Environment(EnvType.CLIENT)
public class StardustClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererRegistry.register(BlockEntityRegistry.RAIL_GUN_4_MEDIUM_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new RailGun4MediumRenderer());
        BlockEntityRendererRegistry.register(BlockEntityRegistry.THRUSTER_1_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new Thruster1Renderer());
    }
}
