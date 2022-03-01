package com.florian.rifts.util.registerer.block;

import com.florian.rifts.util.registerer.block.AbstractBlockRegisterer;
import com.florian.rifts.util.registerer.block.BlockOptionRegisterer;
import net.minecraft.block.Block;

public class BlockRegisterer extends AbstractBlockRegisterer<BlockOptionRegisterer> {

    public BlockRegisterer(String name)
    {
        super(name);
    }

    @Override
    protected BlockOptionRegisterer getOptions(String name, Block block) {
        return new BlockOptionRegisterer(block, name);
    }
}
