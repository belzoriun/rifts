package com.florian.rifts.entity.block;

import com.florian.rifts.Rifts;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class CorruptedBlockEntity extends BlockEntity {

    private Identifier oldBlock;

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

    @Override
    public void writeNbt(NbtCompound tag) {
        // Save the current value of the number to the tag
        tag.putString("old_block", oldBlock.toString());

        super.writeNbt(tag);
    }

    @Override
    public void readNbt(NbtCompound tag) {
        // Save the current value of the number to the tag
        String id = tag.getString("old_block");
        System.out.println(id);
        this.oldBlock = Identifier.tryParse(id);
        super.readNbt(tag);
    }
}
