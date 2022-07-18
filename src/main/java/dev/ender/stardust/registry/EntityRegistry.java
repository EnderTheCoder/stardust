package dev.ender.stardust.registry;

import dev.ender.stardust.entity.cannon.medium.RailGun4MediumEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;

import static dev.ender.stardust.Stardust.MOD_ID;
import static software.bernie.example.registry.EntityRegistry.buildEntity;

public class EntityRegistry {

    public static BlockEntityType<RailGun4MediumEntity> RAIL_GUN_4_MEDIUM_ENTITY = Registry.register(
            Registry.BLOCK_ENTITY_TYPE, MOD_ID + ":rail_gun_4_medium",
            FabricBlockEntityTypeBuilder.create(RailGun4MediumEntity::new, BlockRegistry.RAIL_GUN_4_MEDIUM_BLOCK).build(null));


    public static void register() {
    }
}
