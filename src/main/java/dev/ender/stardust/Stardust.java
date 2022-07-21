package dev.ender.stardust;

import dev.ender.stardust.registry.BlockRegistry;
import dev.ender.stardust.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Stardust implements ModInitializer {

    public static String MOD_ID = "stardust";
    public static final Logger LOGGER = LogManager.getLogger();
    @Override
    public void onInitialize() {
        BlockRegistry.register();
        ItemRegistry.register();
    }
}
