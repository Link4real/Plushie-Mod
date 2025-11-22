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


public class WolfPlushieBlock extends PlushieBlock {
    public WolfPlushieBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter p_220053_2_, BlockPos p_220053_3_, CollisionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        return switch (dir) {
            case NORTH, SOUTH -> Shapes.box(0.25f, 0f, 0f, 0.75f, 0.85f, 1f);
            case EAST, WEST -> Shapes.box(0f, 0f, 0.25f, 1f, 0.85f, 0.75f);
            default -> Shapes.block();
        };
    }
}
