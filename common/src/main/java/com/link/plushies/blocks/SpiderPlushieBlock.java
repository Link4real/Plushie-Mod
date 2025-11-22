package com.link.plushies.blocks;

import com.link.plushies.PlushieBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class SpiderPlushieBlock extends PlushieBlock {
    public SpiderPlushieBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter p_220053_2_, BlockPos p_220053_3_, CollisionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        return switch (dir) {
            case NORTH, SOUTH -> Shapes.box(0.15f, 0f, 0.05f, 0.85f, 0.3f, 0.95f);
            case EAST, WEST -> Shapes.box(0.05f, 0f, 0.15f, 0.95f, 0.3f, 0.85f);
            default -> Shapes.block();
        };
    }
}
