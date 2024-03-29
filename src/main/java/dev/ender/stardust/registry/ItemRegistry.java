package dev.ender.stardust.registry;

import dev.ender.stardust.Stardust;
import dev.ender.stardust.item.cannon.medium.RailGun4MediumItem;
import dev.ender.stardust.item.controller.ShipComputer4Item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {


    public static RailGun4MediumItem RAIL_GUN_4_MEDIUM_ITEM = new RailGun4MediumItem(BlockRegistry.RAIL_GUN_4_MEDIUM_BLOCK, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static ShipComputer4Item SHIP_COMPUTER_4_ITEM = new ShipComputer4Item(BlockRegistry.SHIP_COMPUTER_4_BLOCK, new FabricItemSettings().group(ItemGroup.COMBAT));

    public static void register() {
        Registry.register(
                Registry.ITEM,
                new Identifier(Stardust.MOD_ID, "rail_gun_4_medium_item"),
                RAIL_GUN_4_MEDIUM_ITEM
        );

        Registry.register(Registry.ITEM,
                new Identifier(Stardust.MOD_ID, "ship_computer_4_item"),
                SHIP_COMPUTER_4_ITEM
        );
    }
}
