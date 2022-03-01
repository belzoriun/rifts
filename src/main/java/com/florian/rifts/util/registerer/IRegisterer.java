package com.florian.rifts.util.registerer;

import com.florian.rifts.util.GroupManager;
import com.florian.rifts.util.registerer.block.AbstractBlockRegisterer;
import net.minecraft.item.ItemGroup;

public interface IRegisterer<T> {
    T register();
}
