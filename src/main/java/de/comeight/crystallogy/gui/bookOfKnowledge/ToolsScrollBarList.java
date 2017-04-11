package de.comeight.crystallogy.gui.bookOfKnowledge;

import java.util.LinkedList;

import de.comeight.crystallogy.gui.bookOfKnowledge.buttons.BookButtonCategory;
import de.comeight.crystallogy.gui.bookOfKnowledge.pages.GuiBookPage;
import de.comeight.crystallogy.handler.ConfigHandler;
import de.comeight.crystallogy.handler.ItemHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ToolsScrollBarList extends ScrollBarList {
	//-----------------------------------------------Variabeln:---------------------------------------------

	
	//-----------------------------------------------Constructor:-------------------------------------------
	public ToolsScrollBarList(int width, int height, int posX, int posY, GuiBookPage page) {
		super(width, height, posX, posY, page);
		
		list.addAll(getEntrys());
	}
	
	//-----------------------------------------------Set-, Get-Methoden:------------------------------------
	public static LinkedList<BookButtonCategory> getEntrys(){
		LinkedList<BookButtonCategory> list = new LinkedList<BookButtonCategory>();
		
		list.add(new BookButtonCategory(GuiBookPage.getNextButtonId(), 0, 0, null, new ItemStack(ItemHandler.areaPicker), PageRegistry.AREA_PICKER_PAGE));
		list.add(new BookButtonCategory(GuiBookPage.getNextButtonId(), 0, 0, null, new ItemStack(ItemHandler.entityCrystalKnife), PageRegistry.ENTITY_CRYSTAL_KNIFE_PAGE_1));
		list.add(new BookButtonCategory(GuiBookPage.getNextButtonId(), 0, 0, null, new ItemStack(ItemHandler.entityGrabber), PageRegistry.ENTITY_GRABBER_PAGE));
		
		list.add(new BookButtonCategory(GuiBookPage.getNextButtonId(), 0, 0, null, new ItemStack[]{	new ItemStack(ItemHandler.crystallHammer_red), 
																									new ItemStack(ItemHandler.crystallHammer_blue), 
																									new ItemStack(ItemHandler.crystallHammer_green), 
																									new ItemStack(ItemHandler.crystallHammer_yellow)}, 1000, PageRegistry.CRYSTAL_HAMMER_PAGE_1));
		
		list.add(new BookButtonCategory(GuiBookPage.getNextButtonId(), 0, 0, null, new ItemStack[]{	new ItemStack(ItemHandler.crystalPickaxe_red), 
																									new ItemStack(ItemHandler.crystalPickaxe_blue), 
																									new ItemStack(ItemHandler.crystalPickaxe_green), 
																									new ItemStack(ItemHandler.crystalPickaxe_yellow)}, 1000, PageRegistry.CRYSTAL_PICKAXE_PAGE_1));
		
		list.add(new BookButtonCategory(GuiBookPage.getNextButtonId(), 0, 0, null, new ItemStack[]{	new ItemStack(ItemHandler.crystalSword_red), 
																									new ItemStack(ItemHandler.crystalSword_blue), 
																									new ItemStack(ItemHandler.crystalSword_green), 
																									new ItemStack(ItemHandler.crystalSword_yellow)}, 1000, PageRegistry.CRYSTAL_SWORD_PAGE_1));
		
		if(ConfigHandler.enableDebugTool){
			list.add(new BookButtonCategory(GuiBookPage.getNextButtonId(), 0, 0, null, new ItemStack(ItemHandler.debugTool), PageRegistry.DEBUG_TOOL_PAGE));
		}
		list.add(new BookButtonCategory(GuiBookPage.getNextButtonId(), 0, 0, null, new ItemStack(ItemHandler.playerCrystalKnife), PageRegistry.PLAYER_CRYSTAL_KNIFE_PAGE_1));
		list.add(new BookButtonCategory(GuiBookPage.getNextButtonId(), 0, 0, null, new ItemStack(ItemHandler.spotPicker), PageRegistry.SPOT_PICKER_PAGE));
		list.add(new BookButtonCategory(GuiBookPage.getNextButtonId(), 0, 0, null, new ItemStack(ItemHandler.vaporizer), null));
		list.add(new BookButtonCategory(GuiBookPage.getNextButtonId(), 0, 0, null, new ItemStack(ItemHandler.vaporizerDirection), null));
		
		return list;
	}
	
	//-----------------------------------------------Sonstige Methoden:-------------------------------------

	
}
