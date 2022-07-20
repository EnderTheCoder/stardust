package dev.ender.stardust.item.cannon;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public abstract class AbstractCannonItem extends BlockItem {
    public AbstractCannonItem(Block block, Settings settings) {
        super(block, settings);
    }
}
