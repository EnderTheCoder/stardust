package dev.ender.stardust.registry;

import dev.ender.stardust.block.base.medium.CannonBaseMediumBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static dev.ender.stardust.Stardust.MOD_ID;


public class BlockRegistry {
    public static final CannonBaseMediumBlock CANNON_BASE_MEDIUM = new CannonBaseMediumBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f));


    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cannon_base_medium"), CANNON_BASE_MEDIUM);

    }

}
