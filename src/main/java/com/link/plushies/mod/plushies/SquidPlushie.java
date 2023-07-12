package com.link.plushies.mod.plushies;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class SquidPlushie extends HorizontalFacingBlock {
    public SquidPlushie() {
        super(FabricBlockSettings.create().nonOpaque().sounds(BlockSoundGroup.WOOL).strength(0.7f));
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH:
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 0.6f, 1f);
            case SOUTH:
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 0.6f, 1f);
            case EAST:
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 0.6f, 1f);
            case WEST:
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 0.6f, 1f);
            default:
                return VoxelShapes.fullCube();
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }
}
