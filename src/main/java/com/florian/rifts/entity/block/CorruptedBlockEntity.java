package com.florian.rifts.entity.block;

import com.florian.rifts.Rifts;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class CorruptedBlockEntity extends BlockEntity {

    private Identifier oldBlock;
    private int eyeId;
    private List<BlockPos> blockGroup;

    public CorruptedBlockEntity(BlockPos pos, BlockState state) {
        super(Rifts.Entities.CORRUPTED_BLOCK, pos, state);
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

    @Override
    public void writeNbt(NbtCompound tag) {
        // Save the current value of the number to the tag
        tag.putString("old_block", oldBlock.toString());
        tag.putInt("eye_id", eyeId);

        super.writeNbt(tag);
    }

    @Override
    public void readNbt(NbtCompound tag) {
        // Save the current value of the number to the tag
        String id = tag.getString("old_block");
        this.eyeId = tag.getInt("eye_id");

        this.oldBlock = Identifier.tryParse(id);
        super.readNbt(tag);
    }
}
