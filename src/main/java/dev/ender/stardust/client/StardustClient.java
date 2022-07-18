package dev.ender.stardust.client;

import dev.ender.stardust.client.gecko.renderer.RailGun4MediumRenderer;
import dev.ender.stardust.registry.EntityRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import software.bernie.example.client.renderer.tile.BotariumTileRenderer;
import software.bernie.example.registry.TileRegistry;

@Environment(EnvType.CLIENT)
public class StardustClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererRegistry.register(EntityRegistry.RAIL_GUN_4_MEDIUM_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new RailGun4MediumRenderer());
    }
}
