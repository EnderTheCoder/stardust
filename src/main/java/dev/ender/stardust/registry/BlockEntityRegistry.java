package dev.ender.stardust.registry;

import dev.ender.stardust.entity.cannon.medium.RailGun4MediumEntity;
import dev.ender.stardust.entity.controller.ShipComputer4Entity;
import dev.ender.stardust.entity.thruster.Thruster1Entity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;

import static dev.ender.stardust.Stardust.MOD_ID;

public class BlockEntityRegistry {

    public static BlockEntityType<RailGun4MediumEntity> RAIL_GUN_4_MEDIUM_ENTITY = Registry.register(
            Registry.BLOCK_ENTITY_TYPE, MOD_ID + ":rail_gun_4_medium",
            FabricBlockEntityTypeBuilder.create(RailGun4MediumEntity::new, BlockRegistry.RAIL_GUN_4_MEDIUM_BLOCK).build(null));
    public static BlockEntityType<Thruster1Entity> THRUSTER_1_ENTITY = Registry.register(
            Registry.BLOCK_ENTITY_TYPE, MOD_ID + ":thruster_1_entity",
            FabricBlockEntityTypeBuilder.create(Thruster1Entity::new, BlockRegistry.THRUSTER_1_BLOCK).build(null));

    public static BlockEntityType<ShipComputer4Entity> SHIP_COMPUTER_4_ENTITY = Registry.register(
            Registry.BLOCK_ENTITY_TYPE, MOD_ID + ":ship_computer_4_entity",
            FabricBlockEntityTypeBuilder.create(ShipComputer4Entity::new, BlockRegistry.SHIP_COMPUTER_4_BLOCK).build(null)
    );

    public static void register() {
    }
}
