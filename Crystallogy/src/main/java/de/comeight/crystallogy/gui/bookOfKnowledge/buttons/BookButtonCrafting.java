package de.comeight.crystallogy.gui.bookOfKnowledge.buttons;

import java.util.List;

import de.comeight.crystallogy.gui.bookOfKnowledge.GuiBookPage;
import de.comeight.crystallogy.gui.bookOfKnowledge.GuiBookUtilities;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.client.config.GuiUtils;

public class BookButtonCrafting extends BookButtonCategory {
	//-----------------------------------------------Variabeln:---------------------------------------------
	private boolean drawFrame;
	
	public static final BookButtonCrafting EMPTY = new BookButtonCrafting(GuiBookUtilities.getNextButtonId(), null, null);
	
	//-----------------------------------------------Constructor:-------------------------------------------
	public BookButtonCrafting(int buttonId, ItemStack item, GuiBookPage page) {
		super(buttonId, 0, 0, null, item, page);
		hoverEnabled = false;
		drawFrame = true;
	}

	public BookButtonCrafting(int buttonId, ItemStack[] items, int frameDuration, GuiBookPage page) {
		super(buttonId, 0, 0, null, items, frameDuration, page);
		hoverEnabled = false;
		drawFrame = true;
	}
	
	//-----------------------------------------------Set-, Get-Methoden:------------------------------------
	public void enableFrame(){
		drawFrame = true;
	}
	
	public void disableFrame(){
		drawFrame = false;
	}
	
	//-----------------------------------------------Sonstige Methoden:-------------------------------------
	@Override
	protected void drawDescription(int x, int y) {
	}
	
	@Override
	public void drawButton(int mouseX, int mouseY, int x, int y) {
		super.drawButton(mouseX, mouseY, x, y);
		if(getHoverState(hovered) == 2){
			drawToolTip(mouseX, mouseY, x, y);
		}
	}
	
	private void drawToolTip(int mouseX, int mouseY, int x, int y){
		if(items[frame] != null){
			List<String> tooltip = items[frame].getTooltip(mc.thePlayer, false);
			GuiUtils.drawHoveringText(tooltip, x + 10, y + 15, 200, 200, 200, mc.fontRendererObj);
		}
	}
	
	@Override
	protected void drawFrame(int x, int y, boolean hover) {
		if(drawFrame){
			super.drawFrame(x, y, hover);
		}
	}
	
}