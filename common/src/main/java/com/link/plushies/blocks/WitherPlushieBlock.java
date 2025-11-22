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

public class WitherPlushieBlock extends PlushieBlock {
    public WitherPlushieBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter p_220053_2_, BlockPos p_220053_3_, CollisionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        return switch (dir) {
            case EAST, WEST -> Shapes.box(0.3f, 0f, 0f, 0.7f, 0.75f, 1f);
            case NORTH, SOUTH -> Shapes.box(0f, 0f, 0.3f, 1f, 0.75f, 0.7f);
            default -> Shapes.block();
        };
    }
}
