package dev.ender.stardust.registry;

import dev.ender.stardust.block.base.medium.CannonBaseMediumBlock;
import dev.ender.stardust.block.cannon.medium.RailGun4MediumBlock;
import dev.ender.stardust.block.controller.ShipComputer1Block;
import dev.ender.stardust.block.controller.ShipComputer4Block;
import dev.ender.stardust.block.thruster.Thruster1Block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static dev.ender.stardust.Stardust.MOD_ID;


public class BlockRegistry {
    public static final CannonBaseMediumBlock CANNON_BASE_MEDIUM_BLOCK = new CannonBaseMediumBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final RailGun4MediumBlock RAIL_GUN_4_MEDIUM_BLOCK = new RailGun4MediumBlock(FabricBlockSettings.of(Material.METAL).strength(100.0f).luminance((state) -> 15));

    public static final Thruster1Block THRUSTER_1_BLOCK = new Thruster1Block(FabricBlockSettings.of(Material.METAL).strength(100.0f).luminance((state) -> 15));

    public static final ShipComputer1Block SHIP_COMPUTER_1_BLOCK = new ShipComputer1Block(FabricBlockSettings.of(Material.GLASS));
    public static final ShipComputer4Block SHIP_COMPUTER_4_BLOCK = new ShipComputer4Block(FabricBlockSettings.of(Material.GLASS).luminance((state) -> 15));

   public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cannon_base_medium_block"), CANNON_BASE_MEDIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rail_gun_4_medium_block"), RAIL_GUN_4_MEDIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "thruster_1_block"), THRUSTER_1_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ship_computer_1_block"), SHIP_COMPUTER_1_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ship_computer_4_block"), SHIP_COMPUTER_4_BLOCK);

   }
}
