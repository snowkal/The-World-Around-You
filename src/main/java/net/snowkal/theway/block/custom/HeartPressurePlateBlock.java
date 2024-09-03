package net.snowkal.theway.block.custom;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class HeartPressurePlateBlock extends PressurePlateBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public HeartPressurePlateBlock(BlockSetType type, Settings settings) {
        super(type, settings);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    protected BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Boolean powered = state.get(POWERED);
        return switch (state.get(FACING)) {
            case NORTH -> powered ? NORTH_SHAPE_POWERED : NORTH_SHAPE;
            case SOUTH -> powered ? SOUTH_SHAPE_POWERED : SOUTH_SHAPE;
            case EAST -> powered ? EAST_SHAPE_POWERED : EAST_SHAPE;
            case WEST -> powered ? WEST_SHAPE_POWERED : WEST_SHAPE;
            default -> NORTH_SHAPE;
        };
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
        builder.add(POWERED);
    }

    //these are copied from regular pressure plates, need changing when model is done
    public static VoxelShape NORTH_SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
    public static VoxelShape NORTH_SHAPE_POWERED = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
    public static VoxelShape EAST_SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
    public static VoxelShape EAST_SHAPE_POWERED = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
    public static VoxelShape SOUTH_SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
    public static VoxelShape SOUTH_SHAPE_POWERED = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
    public static VoxelShape WEST_SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
    public static VoxelShape WEST_SHAPE_POWERED = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
}
