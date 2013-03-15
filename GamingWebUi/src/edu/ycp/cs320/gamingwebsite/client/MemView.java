package edu.ycp.cs320.gamingwebsite.client;

import java.util.ArrayList;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Button;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import edu.ycp.cs320.memory.*;
import edu.ycp.cs320.location.Memloc;

public class MemView extends Composite {
	
	private String card;
	private boolean fliped;
	private MemDeck deck;
	private ArrayList<ImageElement> image;
	
	
	public MemView(Image img) {
		image = new ArrayList<ImageElement>();
		
		fliped = false;
		deck = new MemDeck();
		
		for(int i = 0; i< deck.getNumCards(); i++){
			image = (ImageElement) new Image
		}
	}
	
	public String getCard() {
		return card;
	}
	
	
	
	
}
