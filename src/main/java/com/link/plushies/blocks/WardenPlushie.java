package com.link.plushies.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;


public class WardenPlushie extends Plushie {
    public WardenPlushie() {
        super(Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.6F));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        switch (dir) {
            case NORTH:
                return VoxelShapes.box(0.15f, 0f, 0.25f, 0.85f, 1.15f, 0.6f);
            case SOUTH:
                return VoxelShapes.box(0.15f, 0f, 0.45f, 0.95f, 1.15f, 0.7f);
            case EAST:
                return VoxelShapes.box(0.35f, 0f, 0.25f, 0.65f, 1.151f, 0.85f);
            case WEST:
                return VoxelShapes.box(0.25f, 0f, 0.1f, 0.65f, 1.15f, 0.85f);
            default:
                return VoxelShapes.block();
        }
    }
}
