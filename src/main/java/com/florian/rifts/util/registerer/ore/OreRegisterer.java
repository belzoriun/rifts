package com.florian.rifts.util.registerer.ore;

import com.florian.rifts.util.registerer.block.AbstractBlockRegisterer;
import com.florian.rifts.util.registerer.ore.OreOptionRegisterer;
import net.minecraft.block.Block;

public class OreRegisterer extends AbstractBlockRegisterer<OreOptionRegisterer> {


    public OreRegisterer(String name) {
        super(name);
    }

    @Override
    protected OreOptionRegisterer getOptions(String name, Block block) {
        return new OreOptionRegisterer(block, name);
    }


}
