package com.grismarpickles.lozitemsmobs.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;
import net.minecraft.util.math.BlockPos;

public class LzOreBlock extends OreBlock
{
    public LzOreBlock()
    {
        super(Properties.of(Material.STONE)
                .strength(8.0f, 22.0f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .requiresCorrectToolForDrops());
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch)
    {
        return 2;
    }
}
