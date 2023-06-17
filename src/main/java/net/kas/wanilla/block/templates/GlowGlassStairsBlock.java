package net.kas.wanilla.block.templates;

/*
 * Copyright (c) 2019-2021 Wurst-Imperium and contributors.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.kas.wanilla.block.GlowGlassBlocks;
import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.block.enums.StairShape;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public final class GlowGlassStairsBlock extends AlignedStairsBlock
{
    public GlowGlassStairsBlock(Settings block$Settings_1) {
        super(Blocks.GLASS.getDefaultState(), block$Settings_1);
    }

    @SuppressWarnings("deprecation")
    @Override
    @Environment(EnvType.CLIENT)
    public boolean isSideInvisible(BlockState blockState_1, BlockState blockState_2, Direction direction_1) {
        if(blockState_2.getBlock() == GlowGlassBlocks.GLOW_GLASS)
            return true;

        if(blockState_2.getBlock() == GlowGlassBlocks.GLOW_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;

        if(blockState_2.getBlock() == this)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;

        return super.isSideInvisible(blockState_1, blockState_2, direction_1);
    }

    private boolean isInvisibleToGlassSlab(BlockState blockState_1,
                                           BlockState blockState_2, Direction direction_1)
    {
        BlockHalf half1 = blockState_1.get(AlignedStairsBlock.HALF);
        Direction facing1 = blockState_1.get(AlignedStairsBlock.FACING);
        StairShape shape1 = blockState_1.get(AlignedStairsBlock.SHAPE);
        SlabType type2 = blockState_2.get(SlabBlock.TYPE);

        if(direction_1 == Direction.UP)
            if(type2 != SlabType.TOP)
                return true;

        if(direction_1 == Direction.DOWN)
            if(type2 != SlabType.BOTTOM)
                return true;

        if(type2 == SlabType.DOUBLE)
            return true;

        // front
        if(direction_1 == facing1.getOpposite())
        {
            if(type2 == SlabType.BOTTOM && half1 == BlockHalf.BOTTOM)
                return true;

            if(type2 == SlabType.TOP && half1 == BlockHalf.TOP)
                return true;
        }

        // right
        if(direction_1 == facing1.rotateYClockwise()
                && shape1 == StairShape.OUTER_LEFT)
        {
            if(type2 == SlabType.BOTTOM && half1 == BlockHalf.BOTTOM)
                return true;

            if(type2 == SlabType.TOP && half1 == BlockHalf.TOP)
                return true;
        }

        // left
        if(direction_1 == facing1.rotateYCounterclockwise()
                && shape1 == StairShape.OUTER_RIGHT)
        {
            if(type2 == SlabType.BOTTOM && half1 == BlockHalf.BOTTOM)
                return true;

            if(type2 == SlabType.TOP && half1 == BlockHalf.TOP)
                return true;
        }

        return false;
    }

    private boolean isInvisibleToGlassStairs(BlockState blockState_1,
                                             BlockState blockState_2, Direction direction_1)
    {
        BlockHalf half1 = blockState_1.get(AlignedStairsBlock.HALF);
        BlockHalf half2 = blockState_2.get(AlignedStairsBlock.HALF);
        Direction facing1 = blockState_1.get(AlignedStairsBlock.FACING);
        Direction facing2 = blockState_2.get(AlignedStairsBlock.FACING);
        StairShape shape1 = blockState_1.get(AlignedStairsBlock.SHAPE);
        StairShape shape2 = blockState_2.get(AlignedStairsBlock.SHAPE);

        // up
        if(direction_1 == Direction.UP)
        {
            if(half2 == BlockHalf.BOTTOM)
                return true;

            if(half1 != half2)
            {
                if(facing1 == facing2 && shape1 == shape2)
                    return true;

                switch(shape1)
                {
                    case STRAIGHT:
                        if(shape2 == StairShape.INNER_LEFT && (facing2 == facing1
                                || facing2 == facing1.rotateYClockwise()))
                            return true;
                        if(shape2 == StairShape.INNER_RIGHT && (facing2 == facing1
                                || facing2 == facing1.rotateYCounterclockwise()))
                            return true;
                        break;

                    case INNER_LEFT:
                        if(shape2 == StairShape.INNER_RIGHT
                                && facing2 == facing1.rotateYCounterclockwise())
                            return true;
                        break;

                    case INNER_RIGHT:
                        if(shape2 == StairShape.INNER_LEFT
                                && facing2 == facing1.rotateYClockwise())
                            return true;
                        break;

                    case OUTER_LEFT:
                        if(shape2 == StairShape.OUTER_RIGHT
                                && facing2 == facing1.rotateYCounterclockwise())
                            return true;
                        if(shape2 == StairShape.STRAIGHT && (facing2 == facing1
                                || facing2 == facing1.rotateYCounterclockwise()))
                            return true;
                        break;

                    case OUTER_RIGHT:
                        if(shape2 == StairShape.OUTER_LEFT
                                && facing2 == facing1.rotateYClockwise())
                            return true;
                        if(shape2 == StairShape.STRAIGHT && (facing2 == facing1
                                || facing2 == facing1.rotateYClockwise()))
                            return true;
                        break;
                }
            }
        }

        // down
        if(direction_1 == Direction.DOWN)
        {
            if(half2 == BlockHalf.TOP)
                return true;

            switch(shape1)
            {
                case STRAIGHT:
                    if(shape2 == StairShape.INNER_LEFT && (facing2 == facing1
                            || facing2 == facing1.rotateYClockwise()))
                        return true;
                    if(shape2 == StairShape.INNER_RIGHT && (facing2 == facing1
                            || facing2 == facing1.rotateYCounterclockwise()))
                        return true;
                    break;

                case INNER_LEFT:
                    if(shape2 == StairShape.INNER_RIGHT
                            && facing2 == facing1.rotateYCounterclockwise())
                        return true;
                    break;

                case INNER_RIGHT:
                    if(shape2 == StairShape.INNER_LEFT
                            && facing2 == facing1.rotateYClockwise())
                        return true;
                    break;

                case OUTER_LEFT:
                    if(shape2 == StairShape.OUTER_RIGHT
                            && facing2 == facing1.rotateYCounterclockwise())
                        return true;
                    if(shape2 == StairShape.STRAIGHT && (facing2 == facing1
                            || facing2 == facing1.rotateYCounterclockwise()))
                        return true;
                    break;

                case OUTER_RIGHT:
                    if(shape2 == StairShape.OUTER_LEFT
                            && facing2 == facing1.rotateYClockwise())
                        return true;
                    if(shape2 == StairShape.STRAIGHT && (facing2 == facing1
                            || facing2 == facing1.rotateYClockwise()))
                        return true;
                    break;
            }
        }

        // other stairs rear
        if(facing2 == direction_1.getOpposite())
            return true;

        // rear
        if(direction_1 == facing1 && half1 == half2
                && shape1 != StairShape.STRAIGHT)
        {
            if(facing2 == facing1.rotateYCounterclockwise()
                    && shape2 != StairShape.OUTER_RIGHT)
                return true;

            if(facing2 == facing1.rotateYClockwise()
                    && shape2 != StairShape.OUTER_LEFT)
                return true;
        }

        // front
        if(direction_1 == facing1.getOpposite() && half1 == half2)
        {
            if(facing2 == facing1.rotateYCounterclockwise()
                    && shape2 != StairShape.OUTER_LEFT)
                return true;

            if(facing2 == facing1.rotateYClockwise()
                    && shape2 != StairShape.OUTER_RIGHT)
                return true;

            if(facing2 == facing1.getOpposite())
                return true;
        }

        // left
        if(direction_1 == facing1.rotateYCounterclockwise() && half1 == half2)
        {
            if(facing2 == direction_1 && shape1 != StairShape.INNER_LEFT
                    && shape2 == StairShape.INNER_RIGHT)
                return true;

            if(facing2 == facing1 && shape2 != StairShape.OUTER_LEFT)
                return true;

            if(facing2 == facing1.getOpposite()
                    && shape1 == StairShape.OUTER_RIGHT)
                return true;
        }

        // right
        if(direction_1 == facing1.rotateYClockwise() && half1 == half2)
        {
            if(facing2 == direction_1 && shape1 != StairShape.INNER_RIGHT
                    && shape2 == StairShape.INNER_LEFT)
                return true;

            if(facing2 == facing1 && shape2 != StairShape.OUTER_RIGHT)
                return true;

            if(facing2 == facing1.getOpposite()
                    && shape1 == StairShape.OUTER_LEFT)
                return true;
        }

        return false;
    }

    @Override
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world,
                                              BlockPos pos, ShapeContext context)
    {
        return VoxelShapes.empty();
    }

    @Override
    @Environment(EnvType.CLIENT)
    public float getAmbientOcclusionLightLevel(BlockState blockState_1,
                                               BlockView blockView_1, BlockPos blockPos_1)
    {
        return 1.0F;
    }

    public boolean isTranslucent(BlockState blockState_1, BlockView blockView_1,
                                 BlockPos blockPos_1)
    {
        return true;
    }
}