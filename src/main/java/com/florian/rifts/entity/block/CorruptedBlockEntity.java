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

import java.util.ArrayList;
import java.util.List;

public class CorruptedBlockEntity extends BlockEntity {

    private static final int  MAX_GROUP_ID = 5000;
    private static List<Integer> attributedIds = new ArrayList<>();

    private Identifier oldBlock;
    private int eyeId;
    private int groupId;

    public CorruptedBlockEntity(BlockPos pos, BlockState state) {

        super(Rifts.Entities.CORRUPTED_BLOCK, pos, state);
        this.groupId = -1;
    }

    public static void freeId(int id)
    {
        if(attributedIds.contains(id))
        {
            attributedIds.remove(id);
        }
    }

    public void setOldBlock(Identifier id)
    {
        this.oldBlock = id;
    }

    public Identifier getOldBlock()
    {
        return oldBlock;
    }

    public void setEyeId(int id)
    {
        this.eyeId = id;
    }

    public int getEye()
    {
        return this.eyeId;
    }

    public int getGroupId()
    {
        return groupId;
    }
    public void setGroupId(int id)
    {
        this.groupId = id;
    }

    public int generateGroupId()
    {
        if(attributedIds.size()>=MAX_GROUP_ID)
        {
            return -1;
        }
        for(int i = 0; i<= MAX_GROUP_ID; i++) {
            if (!attributedIds.contains(i)) {
                attributedIds.add(i);
                this.groupId = i;
                break;
            }
        }
        System.out.println("attributed id "+groupId+" to group ("+(MAX_GROUP_ID-attributedIds.size())+" group ids left)");
        return groupId;
    }

    @Override
    public void writeNbt(NbtCompound tag) {
        // Save the current value of the number to the tag
        tag.putString("old_block", (oldBlock == null ? Registry.BLOCK.getId(Blocks.AIR) : oldBlock).toString());
        tag.putInt("eye_id", eyeId);
        tag.putInt("group_id", groupId);

        super.writeNbt(tag);
    }

    @Override
    public void readNbt(NbtCompound tag) {
        // Save the current value of the number to the tag
        String id = tag.getString("old_block");
        this.eyeId = tag.getInt("eye_id");
        this.groupId = tag.getInt("group_id");

        this.oldBlock = Identifier.tryParse(id);
        super.readNbt(tag);
    }
}
