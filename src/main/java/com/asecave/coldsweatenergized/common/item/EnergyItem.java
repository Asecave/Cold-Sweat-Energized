package com.asecave.coldsweatenergized.common.item;

import java.util.List;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.INBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.energy.IEnergyStorage;
import net.momostudios.coldsweat.core.itemgroup.ColdSweatGroup;

public class EnergyItem extends Item implements IEnergyStorage, INBTSerializable<INBT> {

	public EnergyItem() {

		super(new Properties().group(ColdSweatGroup.COLD_SWEAT).maxStackSize(1));
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {

		if (!worldIn.isRemote()) {
			
		}
	}

	public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {

		list.add(new StringTextComponent(TextFormatting.DARK_AQUA + "Combine this with your armor."));
		if (Screen.hasShiftDown()) {
			list.add(new StringTextComponent(TextFormatting.GRAY + "Stored: " + TextFormatting.DARK_GRAY + getEnergyStored() + "/" + getMaxEnergyStored() + " FE"));
		} else {
			list.add(new StringTextComponent(TextFormatting.GRAY + "" + TextFormatting.ITALIC + "<shift>"));
		}
	}

	@Override
	public int receiveEnergy(int maxReceive, boolean simulate) {

		return 100;
	}

	@Override
	public int extractEnergy(int maxExtract, boolean simulate) {

		return 200;
	}

	@Override
	public int getEnergyStored() {

		return 2000;
	}

	@Override
	public int getMaxEnergyStored() {

		return 10000;
	}

	@Override
	public boolean canExtract() {

		return true;
	}

	@Override
	public boolean canReceive() {

		return true;
	}

	@Override
	public INBT serializeNBT() {

		return null;
	}

	@Override
	public void deserializeNBT(INBT nbt) {

	}

}
