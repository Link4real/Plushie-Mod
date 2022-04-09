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


public class SnowGolemPlushie extends Plushie {
    public SnowGolemPlushie() {
        super(Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.6F));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        switch(dir) {
            case NORTH:
                return VoxelShapes.box(0.25f, 0f, 0.25f, 0.75f, 1.2f, 0.75f);
            case SOUTH:
                return VoxelShapes.box(0.25f, 0f, 0.25f, 0.75f, 1.211f, 0.75f);
            case EAST:
                return VoxelShapes.box(0.25f, 0f, 0.25f, 0.75f, 1.22f, 0.75f);
            case WEST:
                return VoxelShapes.box(0.25f, 0f, 0.25f, 0.75f, 1.21f, 0.75f);
            default:
                return VoxelShapes.block();
        }
    }
}
