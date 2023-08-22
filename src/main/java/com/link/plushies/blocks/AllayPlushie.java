package com.link.plushies.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class AllayPlushie extends Plushie {
    public AllayPlushie() {
        super();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_220053_2_, BlockPos p_220053_3_, CollisionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        switch (dir) {
            case NORTH, SOUTH:
                return Shapes.box(0.18f, 0f, 0.25f, 0.82f, 0.6f, 0.75f);
            case EAST, WEST:
                return Shapes.box(0.25f, 0f, 0.18f, 0.75f, 0.6f, 0.82f);
            default:
                return Shapes.block();
        }
    }
}
