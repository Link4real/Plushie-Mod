package com.link.plushies.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ParrotPlushie extends Plushie {
    public ParrotPlushie() {
        super();
    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_220053_2_, BlockPos p_220053_3_, CollisionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        switch (dir) {
            case NORTH:
                return Shapes.box(0.25f, 0f, 0.25f, 0.75f, 0.71f, 0.75f);
            case SOUTH:
                return Shapes.box(0.25f, 0f, 0.25f, 0.75f, 0.711f, 0.75f);
            case EAST:
                return Shapes.box(0.25f, 0f, 0.25f, 0.75f, 0.7f, 0.75f);
            case WEST:
                return Shapes.box(0.25f, 0f, 0.25f, 0.75f, 0.7111f, 0.75f);
            default:
                return Shapes.block();
        }
    }


}
