package com.link.plushies.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;


public class DragonPlushie extends Plushie {
    public DragonPlushie() {
        super(Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.7f));

    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_220053_2_, BlockPos p_220053_3_, CollisionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        switch (dir) {
            case NORTH:
                return Shapes.box(0f, 0f, 0f, 1f, 0.85f, 1f);
            case SOUTH:
                return Shapes.box(0f, 0f, 0f, 1f, 0.85111f, 1f);
            case EAST:
                return Shapes.box(0f, 0f, 0f, 1f, 0.8511f, 1f);
            case WEST:
                return Shapes.box(0f, 0f, 0f, 1f, 0.851f, 1f);
            default:
                return Shapes.block();
        }
    }


}
