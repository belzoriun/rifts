package com.florian.rifts.util;

import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public interface ICorruptedElement {

    int MAX_SPREAD_WIDTH = 20;
    double SPREAD_VELOCITY = 5;

    IntProperty SPREAD_WIDTH = IntProperty.of("spread_width", 0, MAX_SPREAD_WIDTH);
    IntProperty ITEMS_EATEN = IntProperty.of("items_eaten", 0, MAX_SPREAD_WIDTH);
    BooleanProperty DISCARDING = BooleanProperty.of("discarding");
    BooleanProperty DOES_DROP_ITEM = BooleanProperty.of("drop_eye");
    IntProperty EYE_ID = IntProperty.of("eye_id", 0, Integer.MAX_VALUE);

    public List<BlockPos> getNeighbors(BlockPos pos);
}
