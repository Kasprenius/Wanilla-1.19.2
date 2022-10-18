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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public final class GlassSlabBlock extends SlabBlock
{
    public GlassSlabBlock(Settings block$Settings_1) {
        super(block$Settings_1);
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

        if(blockState_2.getBlock() == this)
            if(isInvisibleToGlassSlab(blockState_1, blockState_2, direction_1))
                return true;

        if(blockState_2.getBlock() == GlassBlocks.BLACK_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.BLUE_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.BROWN_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.CYAN_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.GRAY_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.GREEN_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.LIME_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.MAGENTA_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.ORANGE_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.PINK_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.PURPLE_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.RED_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        /* if(blockState_2.getBlock() == GlassBlocks.TINTED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;

         */
        if(blockState_2.getBlock() == GlassBlocks.WHITE_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.YELLOW_STAINED_GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;
        if(blockState_2.getBlock() == GlassBlocks.GLASS_STAIRS)
            if(isInvisibleToGlassStairs(blockState_1, blockState_2, direction_1))
                return true;

        return super.isSideInvisible(blockState_1, blockState_2, direction_1);
    }

    private boolean isInvisibleToGlassSlab(BlockState blockState_1,
                                           BlockState blockState_2, Direction direction_1)
    {
        SlabType type1 = blockState_1.get(SlabBlock.TYPE);
        SlabType type2 = blockState_2.get(SlabBlock.TYPE);

        if(type2 == SlabType.DOUBLE)
            return true;

        switch(direction_1)
        {
            case UP:
            case DOWN:
                if(type1 != type2)
                    return true;
                break;

            case NORTH:
            case EAST:
            case SOUTH:
            case WEST:
                if(type1 == type2)
                    return true;
                break;
        }

        return false;
    }

    private boolean isInvisibleToGlassStairs(BlockState blockState_1,
                                             BlockState blockState_2, Direction direction_1)
    {
        SlabType type1 = blockState_1.get(SlabBlock.TYPE);
        BlockHalf half2 = blockState_2.get(StairsBlock.HALF);
        Direction facing2 = blockState_2.get(StairsBlock.FACING);

        // up
        if(direction_1 == Direction.UP)
            if(half2 == BlockHalf.BOTTOM)
                return true;

        // down
        if(direction_1 == Direction.DOWN)
            if(half2 == BlockHalf.TOP)
                return true;

        // other stairs rear
        if(facing2 == direction_1.getOpposite())
            return true;

        // sides
        if(direction_1.getHorizontal() != -1)
        {
            if(type1 == SlabType.BOTTOM && half2 == BlockHalf.BOTTOM)
                return true;

            if(type1 == SlabType.TOP && half2 == BlockHalf.TOP)
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

    public boolean isSimpleFullBlock(BlockState blockState_1,
                                     BlockView blockView_1, BlockPos blockPos_1)
    {
        return false;
    }
}