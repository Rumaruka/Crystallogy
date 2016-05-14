package de.comeight.crystallogy.handler;

import de.comeight.crystallogy.CrystallogyBase;
import de.comeight.crystallogy.util.Utilities;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemRenderHandler {
	//-----------------------------------------------Variabeln:---------------------------------------------


	//-----------------------------------------------Constructor:-------------------------------------------


	//-----------------------------------------------Set-, Get-Methoden:------------------------------------


	//-----------------------------------------------Sonstige Methoden:-------------------------------------
	public static void registerItemRenderer() {
		registerBasicItemRender(ItemHandler.crystallDust_blue);
		registerBasicItemRender(ItemHandler.crystallDust_green);
		registerBasicItemRender(ItemHandler.crystallDust_red);
		registerBasicItemRender(ItemHandler.crystallDust_yellow);
		registerBasicItemRender(ItemHandler.pureCrystallDust);
		registerBasicItemRender(ItemHandler.vaporizer);
		registerBasicItemRender(ItemHandler.vaporizerDirection);
		registerBasicItemRender(ItemHandler.playerCrystalKnife);
		registerBasicItemRender(ItemHandler.entityCrystalKnife);
		registerBasicItemRender(ItemHandler.damDust);
		registerBasicItemRender(ItemHandler.drowDust);
		registerBasicItemRender(ItemHandler.fireDust);
		registerBasicItemRender(ItemHandler.poisDust);
		registerBasicItemRender(ItemHandler.hungDust);
		registerBasicItemRender(ItemHandler.crystallHammer_blue);
		registerBasicItemRender(ItemHandler.crystallHammer_green);
		registerBasicItemRender(ItemHandler.crystallHammer_red);
		registerBasicItemRender(ItemHandler.crystallHammer_yellow);
		registerBasicItemRender(ItemHandler.crystalSword_blue);
		registerBasicItemRender(ItemHandler.crystalSword_green);
		registerBasicItemRender(ItemHandler.crystalSword_red);
		registerBasicItemRender(ItemHandler.crystalSword_yellow);
		registerBasicItemRender(ItemHandler.toolRod);
		registerBasicItemRender(ItemHandler.crystalKnifeBlade);
		registerBasicItemRender(ItemHandler.armorHelmet_red);
		registerBasicItemRender(ItemHandler.armorChestplate_red);
		registerBasicItemRender(ItemHandler.armorLeggins_red);
		registerBasicItemRender(ItemHandler.armorBoots_red);
		registerBasicItemRender(ItemHandler.armorHelmet_blue);
		registerBasicItemRender(ItemHandler.armorChestplate_blue);
		registerBasicItemRender(ItemHandler.armorLeggins_blue);
		registerBasicItemRender(ItemHandler.armorBoots_blue);
		registerBasicItemRender(ItemHandler.armorHelmet_green);
		registerBasicItemRender(ItemHandler.armorChestplate_green);
		registerBasicItemRender(ItemHandler.armorLeggins_green);
		registerBasicItemRender(ItemHandler.armorBoots_green);
		registerBasicItemRender(ItemHandler.armorHelmet_yellow);
		registerBasicItemRender(ItemHandler.armorChestplate_yellow);
		registerBasicItemRender(ItemHandler.armorLeggins_yellow);
		registerBasicItemRender(ItemHandler.armorBoots_yellow);
		registerBasicItemRender(ItemHandler.armorHelmet_combined);
		registerBasicItemRender(ItemHandler.armorChestplate_combined);
		registerBasicItemRender(ItemHandler.armorLeggins_combined);
		registerBasicItemRender(ItemHandler.armorBoots_combined);
		registerBasicItemRender(ItemHandler.energyCrystal);
		registerBasicItemRender(ItemHandler.energyDust);
		
		registerItemVariantsRenderer(ItemHandler.crystallHammerHead, 0, "crystallHammerHead_red");
		registerItemVariantsRenderer(ItemHandler.crystallHammerHead, 1, "crystallHammerHead_blue");
		registerItemVariantsRenderer(ItemHandler.crystallHammerHead, 2, "crystallHammerHead_green");
		registerItemVariantsRenderer(ItemHandler.crystallHammerHead, 3, "crystallHammerHead_yellow");
		registerItemVariantsRenderer(ItemHandler.crystallSwordBlade, 0, "crystallSwordBlade_red");
		registerItemVariantsRenderer(ItemHandler.crystallSwordBlade, 1, "crystallSwordBlade_blue");
		registerItemVariantsRenderer(ItemHandler.crystallSwordBlade, 2, "crystallSwordBlade_green");
		registerItemVariantsRenderer(ItemHandler.crystallSwordBlade, 3, "crystallSwordBlade_yellow");
		registerItemVariantsRenderer(ItemHandler.armorPlate, 0, "armorPlate_red");
		registerItemVariantsRenderer(ItemHandler.armorPlate, 1, "armorPlate_blue");
		registerItemVariantsRenderer(ItemHandler.armorPlate, 2, "armorPlate_green");
		registerItemVariantsRenderer(ItemHandler.armorPlate, 3, "armorPlate_yellow");
		registerItemVariantsRenderer(ItemHandler.armorPlate, 4, "armorPlate_gray");
		registerItemVariantsRenderer(Item.getItemFromBlock(BlockHandler.farmersGreen), 0, "farmersGreen_closed_empty");
		registerItemVariantsRenderer(Item.getItemFromBlock(BlockHandler.farmersGreen), 1, "farmersGreen_closed_full");
		registerItemVariantsRenderer(Item.getItemFromBlock(BlockHandler.crystalGlas), 0, "crystalGlas_red");
		registerItemVariantsRenderer(Item.getItemFromBlock(BlockHandler.crystalGlas), 1, "crystalGlas_blue");
		registerItemVariantsRenderer(Item.getItemFromBlock(BlockHandler.crystalGlas), 2, "crystalGlas_green");
		registerItemVariantsRenderer(Item.getItemFromBlock(BlockHandler.crystalGlas), 3, "crystalGlas_yellow");
		
		Utilities.addConsoleText("All itemrenderer are registered.");
    }
	
	public static void registerBasicItemRender(Item item) {
		registerBasicItemRender(item, 0 , item.getUnlocalizedName().substring(5));
	}
	
	private static void registerBasicItemRender(Item item, int meta, String filePath){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(CrystallogyBase.MODID + ":" + filePath, "inventory"));
	}
	
	private static void registerItemVariantsRenderer(Item item, int meta, String filePath){
		registerBasicItemRender(item, meta, filePath);
		ModelBakery.registerItemVariants(item, new ResourceLocation(CrystallogyBase.MODID + ":" + filePath));
	}

}