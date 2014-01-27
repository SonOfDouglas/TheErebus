package erebus;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class ModMaterials {

	public static EnumArmorMaterial armorEXOSKELETON = EnumHelper.addArmorMaterial("EXOSKELETON", 11, new int[] { 2, 4, 3, 2 }, 15);
	public static EnumArmorMaterial armorREINEXOSKELETON = EnumHelper.addArmorMaterial("REINEXOSKELETON", 11, new int[] { 3, 8, 6, 3 }, 2);
	public static EnumArmorMaterial armorREINEXOSPECIAL = EnumHelper.addArmorMaterial("REINEXOSPECIAL", 11, new int[] { 2, 7, 5, 2 }, 2);
	public static EnumArmorMaterial armorJADE = EnumHelper.addArmorMaterial("JADE", 24, new int[] { 3, 7, 5, 2 }, 15);
	public static EnumToolMaterial toolJADE = EnumHelper.addToolMaterial("JADE", 2, 863, 10.0F, 2.0F, 18);
	public static EnumToolMaterial toolJADEPAXEL = EnumHelper.addToolMaterial("JADEPAXEL", 2, 1079, 8.0F, 4.0F, 14);
	public static EnumToolMaterial toolCAVEMANCLUB = EnumHelper.addToolMaterial("CAVEMANCLUB", 0, 131, 4.0F, 2.0F, 12);
	public static EnumToolMaterial weaponWaspDagger = EnumHelper.addToolMaterial("WASPDAGGER", 0, 1, 1.0F, 0.0F, 12);
	public static EnumToolMaterial weaponWaspSword = EnumHelper.addToolMaterial("WASPSWORD", 0, 863, 1.0F, 6.0F, 18);
	public static EnumToolMaterial weaponScorpionPincer = EnumHelper.addToolMaterial("SCORPIONPINCER", 0, 863, 1.0F, 4.0F, 2);

}