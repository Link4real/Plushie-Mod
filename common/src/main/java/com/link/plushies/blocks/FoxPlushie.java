package com.link.plushies.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class FoxPlushie extends Plushie {
    public FoxPlushie(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter p_220053_2_, BlockPos p_220053_3_, CollisionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        return switch (dir) {
            case NORTH -> Shapes.box(0f, 0f, 0.1f, 1f, 0.45f, 0.82f);
            case SOUTH -> Shapes.box(0f, 0f, 0.18f, 1f, 0.45f, 0.9f);
            case EAST -> Shapes.box(0.18f, 0f, 0f, 0.9f, 0.45f, 1f);
            case WEST -> Shapes.box(0.1f, 0f, 0f, 0.82f, 0.45f, 1f);
            default -> Shapes.block();
        };
    }
}
