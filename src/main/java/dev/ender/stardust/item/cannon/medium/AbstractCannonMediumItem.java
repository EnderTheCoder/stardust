package dev.ender.stardust.item.cannon.medium;

import dev.ender.stardust.item.cannon.AbstractCannonItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;

public abstract class AbstractCannonMediumItem extends AbstractCannonItem {
    public AbstractCannonMediumItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    protected boolean canPlace(ItemPlacementContext context, BlockState state) {
        return super.canPlace(context, state);
    }
}
