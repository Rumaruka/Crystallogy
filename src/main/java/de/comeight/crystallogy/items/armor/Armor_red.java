package de.comeight.crystallogy.items.armor;

import de.comeight.crystallogy.blocks.materials.CustomArmorMaterials;
import de.comeight.crystallogy.handler.ItemHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Armor_red extends BaseArmor {
	//-----------------------------------------------Variabeln:---------------------------------------------
	private static final String ID = "armor_red_";
	
	//-----------------------------------------------Constructor:-------------------------------------------
	public Armor_red(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(CustomArmorMaterials.CRYSTALL_RED, renderIndexIn, equipmentSlotIn, ID + equipmentSlotIn.getName());
	}
	
	//-----------------------------------------------Set-, Get-Methoden:------------------------------------
	public String getID(){
		return ID + armorType.getName();
	}
	
	private boolean isPlayerWearingFullArmor(EntityPlayer player){
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ItemHandler.armorHelmet_red
		        && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == ItemHandler.armorChestplate_red
		        && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == ItemHandler.armorLeggins_red
		        && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == ItemHandler.armorBoots_red) {
		        return true;
		}
		return false;
	}
	
	//-----------------------------------------------Sonstige Methoden:-------------------------------------
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (isPlayerWearingFullArmor(player)) {
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 1, 0, true, false));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 1, 1, true, false));
			if(player.isBurning()){
				player.extinguish();
			}
		}
	}
	
}
