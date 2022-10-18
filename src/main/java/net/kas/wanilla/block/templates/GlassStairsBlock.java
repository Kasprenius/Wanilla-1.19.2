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
import net.kas.wanilla.block.GlassBlocks;
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

public final class GlassStairsBlock extends StairsBlock
{
    public GlassStairsBlock(Settings block$Settings_1) {
        super(Blocks.GLASS.getDefaultState(), block$Settings_1);
    }

    @SuppressWarnings("deprecation")
    @Override
    @Environment(EnvType.CLIENT)
    public boolean isSideInvisible(BlockState blockState_1, BlockState blockState_2, Direction direction_1) {
        if(blockState_2.getBlock() == Blocks.BLACK_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.BLUE_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.BROWN_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.CYAN_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.GRAY_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.GREEN_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.LIGHT_BLUE_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.LIGHT_GRAY_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.LIME_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.MAGENTA_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.ORANGE_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.PINK_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.PURPLE_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.RED_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.TINTED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.WHITE_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.YELLOW_STAINED_GLASS)
            return true;
        if(blockState_2.getBlock() == Blocks.GLASS)
            return true;

        if(blockState_2.getBlock() == GlassBlocks.BLACK_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.BLUE_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.BROWN_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.CYAN_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.GRAY_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.GREEN_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.LIME_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.MAGENTA_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.ORANGE_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.PINK_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.PURPLE_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.RED_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        /*
        if(blockState_2.getBlock() == GlassBlocks.TINTED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;

         */
        if(blockState_2.getBlock() == GlassBlocks.WHITE_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.YELLOW_STAINED_GLASS_SLAB)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.GLASS_SLAB)
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
        BlockHalf half1 = blockState_1.get(StairsBlock.HALF);
        Direction facing1 = blockState_1.get(StairsBlock.FACING);
        StairShape shape1 = blockState_1.get(StairsBlock.SHAPE);
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
        BlockHalf half1 = blockState_1.get(StairsBlock.HALF);
        BlockHalf half2 = blockState_2.get(StairsBlock.HALF);
        Direction facing1 = blockState_1.get(StairsBlock.FACING);
        Direction facing2 = blockState_2.get(StairsBlock.FACING);
        StairShape shape1 = blockState_1.get(StairsBlock.SHAPE);
        StairShape shape2 = blockState_2.get(StairsBlock.SHAPE);

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

    @Override
    public boolean isTranslucent(BlockState blockState_1, BlockView blockView_1,
                                 BlockPos blockPos_1)
    {
        return true;
    }
}