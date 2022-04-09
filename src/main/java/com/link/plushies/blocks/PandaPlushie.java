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


public class PandaPlushie extends Plushie {
    public PandaPlushie() {
        super(Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.7f));

    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_220053_2_, BlockPos p_220053_3_, CollisionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        switch (dir) {
            case NORTH:
                return Shapes.box(0.2f, 0f, 0.325f, 0.8f, 0.6f, 0.7f);
            case SOUTH:
                return Shapes.box(0.23f, 0f, 0.2f, 0.8f, 0.6f, 0.7f);
            case EAST:
                return Shapes.box(0.22f, 0f, 0.3f, 0.7f, 0.6f, 0.8f);
            case WEST:
                return Shapes.box(0.3f, 0f, 0.25f, 0.7f, 0.6f, 0.75f);
            default:
                return Shapes.block();
        }
    }


}
