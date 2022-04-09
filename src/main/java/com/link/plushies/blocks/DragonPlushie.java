package com.link.plushies.blocks;


import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFaceBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;


public class DragonPlushie extends Plushie {
    public DragonPlushie() {
        super(Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.7f));

    }


    @Override
    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        switch(dir) {
            case NORTH:
                return VoxelShapes.box(0.1f, 0f, 0f, 0.9f, 1f, 1f);
            case SOUTH:
                return VoxelShapes.box(0.1f, 0f, 0f, 0.9f, 1f, 1f);
            case EAST:
                return VoxelShapes.box(0f, 0f, 0.1f, 1f, 1f, 0.9f);
            case WEST:
                return VoxelShapes.box(0f, 0f, 0.1f, 1f, 1f, 0.9f);
            default:
                return VoxelShapes.block();
        }
    }


}
