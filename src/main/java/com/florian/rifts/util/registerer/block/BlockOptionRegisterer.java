package com.florian.rifts.util.registerer.block;

import net.minecraft.block.Block;

public class BlockOptionRegisterer extends AbstractBlockOptionsRegisterer {


    protected BlockOptionRegisterer(Block block, String name) {
        super(block, name);
        setSaver(this);
    }
}
