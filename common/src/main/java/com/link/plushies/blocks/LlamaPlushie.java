package com.link.plushies.blocks;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;


public class LlamaPlushie extends Plushie {
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_220053_2_, BlockPos p_220053_3_, CollisionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        switch (dir) {
            case NORTH, SOUTH:
                return Shapes.box(0.2f, 0f, 0f, 0.8f, 0.9f, 0.9f);
            case EAST, WEST:
                return Shapes.box(0.1f, 0f, 0.23f, 1f, 0.9f, 0.75f);
            default:
                return Shapes.block();
        }
    }
}
