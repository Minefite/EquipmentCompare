package com.anthonyhilyard.equipmentcompare.forge;

import com.anthonyhilyard.equipmentcompare.EquipmentCompare;

import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;

@Mod(EquipmentCompare.MODID)
public final class EquipmentCompareForge
{
	public EquipmentCompareForge(ModLoadingContext context)
	{
		context.registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> "ANY", (remote, isServer) -> true));
	}
}
