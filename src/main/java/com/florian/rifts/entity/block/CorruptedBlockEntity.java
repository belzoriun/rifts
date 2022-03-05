package com.florian.rifts.entity.block;

import com.florian.rifts.Rifts;
import com.florian.rifts.blocks.CorruptedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import org.apache.commons.compress.utils.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class CorruptedBlockEntity extends BlockEntity {

    private Identifier oldBlock;
    private BlockPos parent;
    private int eye;
    private List<Long> children;
    private int childLimit;

    public CorruptedBlockEntity(BlockPos pos, BlockState state) {

        super(Rifts.Entities.CORRUPTED_BLOCK, pos, state);
        this.children = new ArrayList<>();
        this.childLimit = 10;
    }

    public void setOldBlock(Identifier id)
    {
        this.oldBlock = id;
    }

    public Identifier getOldBlock()
    {
        return oldBlock;
    }

    public BlockPos getParent()
    {
        return parent;
    }

    public void addChild(BlockPos pos)
    {
        this.children.add(pos.asLong());
    }

    public boolean canHasMoreChilds()
    {
        return children.size()<childLimit;
    }

    public List<BlockPos> getChildren()
    {
        List<BlockPos> res = new ArrayList<>();
        for(long value : children)
        {
            res.add(BlockPos.fromLong(value));
        }
        return res;
    }

    public void setParent(BlockPos parent)
    {
        this.parent = parent;
    }

    public void setEye(int id) {
        this.eye=id;
    }

    public int getEye()
    {
        return this.eye;
    }

    @Override
    public void writeNbt(NbtCompound tag) {
        // Save the current value of the number to the tag
        tag.putString("old_block", (oldBlock == null ? Registry.BLOCK.getId(Blocks.AIR) : oldBlock).toString());
        tag.putLong("parent_catalyst", parent.asLong());
        tag.putLongArray("children", children);
        tag.putInt("child_limit", this.childLimit);

        super.writeNbt(tag);
    }

    @Override
    public void readNbt(NbtCompound tag) {
        // Save the current value of the number to the tag
        String id = tag.getString("old_block");
        this.parent = BlockPos.fromLong(tag.getLong("parent_catalyst"));
        long[] children = tag.getLongArray("children");
        this.children = new ArrayList<>(Arrays.stream(children).boxed().collect(Collectors.toList()));
        this.childLimit = tag.getInt("child_limit");

        this.oldBlock = Identifier.tryParse(id);
        super.readNbt(tag);
    }
}
