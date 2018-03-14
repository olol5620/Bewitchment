package com.bewitchment.common.brew.brews;

import javax.annotation.Nullable;

import com.bewitchment.common.brew.BlockHitBrew;

import net.minecraft.block.BlockSnow;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * This class was created by Arekkuusu on 13/06/2017.
 * It's distributed as part of Bewitchment under
 * the MIT license.
 */
public class SnowTrailBrew extends BlockHitBrew {

	@Override
	public void apply(World world, BlockPos pos, EntityLivingBase entity, int amplifier, int tick) {
		for (int l = 0; l < 4; ++l) {
			int i = MathHelper.floor(entity.posX + (l % 2 * 2 - 1) * 0.25F);
			int j = MathHelper.floor(entity.posY);
			int k = MathHelper.floor(entity.posZ + (l / 2 % 2 * 2 - 1) * 0.25F);
			BlockPos blockpos = new BlockPos(i, j, k);

			if (world.getBlockState(blockpos).getMaterial() == Material.AIR && Blocks.SNOW_LAYER.canPlaceBlockAt(world, blockpos)) {
				world.setBlockState(blockpos, Blocks.SNOW_LAYER.getDefaultState());
			}
		}
	}

	@Override
	public boolean isInstant() {
		return false;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void renderHUD(int x, int y, Minecraft mc, int amplifier) {
		render(x, y, mc, 8);
	}

	@Override
	public void safeImpact(BlockPos pos, @Nullable EnumFacing side, World world, int amplifier) {
		int box = 1 + (int) (amplifier / 2F);

		BlockPos posI = pos.add(box, box, box);
		BlockPos posF = pos.add(-box, -box, -box);

		Iterable<BlockPos> spots = BlockPos.getAllInBox(posI, posF);
		for (BlockPos spot : spots) {
			IBlockState state = world.getBlockState(spot);
			boolean place = amplifier > 2 || world.rand.nextInt(3) == 0;
			if (place && Blocks.SNOW_LAYER.canPlaceBlockAt(world, spot) && state.getBlock().isReplaceable(world, spot)) {
				world.setBlockState(spot, Blocks.SNOW_LAYER.getDefaultState()
						.withProperty(BlockSnow.LAYERS, 1 + world.rand.nextInt(7)), 3);
			}
		}
	}

	@Override
	public int getColor() {
		return 0xFFFFFF;
	}

	@Override
	public String getName() {
		return "snow_trail";
	}
}