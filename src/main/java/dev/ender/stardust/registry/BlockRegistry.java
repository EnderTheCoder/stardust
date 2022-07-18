package dev.ender.stardust.registry;

import dev.ender.stardust.block.base.medium.CannonBaseMediumBlock;
import dev.ender.stardust.block.cannon.medium.RailGun4MediumBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static dev.ender.stardust.Stardust.MOD_ID;


public class BlockRegistry {
    public static final CannonBaseMediumBlock CANNON_BASE_MEDIUM = new CannonBaseMediumBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final RailGun4MediumBlock RAIL_GUN_4_MEDIUM_BLOCK = new RailGun4MediumBlock(FabricBlockSettings.of(Material.METAL).strength(100.0f));

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cannon_base_medium"), CANNON_BASE_MEDIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rail_gun_4_medium"), RAIL_GUN_4_MEDIUM_BLOCK);
    }

}
