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
	private Memloc loc;
	private boolean fliped;
	private MemDeck deck;
	private ArrayList<ImageElement> image;
	public static int height = 480;
	public static int width = 640;
	
	
	public MemView() {
		image = new ArrayList<ImageElement>();
		
		fliped = false;
		deck = new MemDeck();
		
		loc = new Memloc();
		
		deck.make();
		
		// drawing the picture
		for(int i= 0; i< deck.getNumCards(); i++){
			image.add(Draw(i));
		}

	}
	
	public ImageElement Draw(int i){
		ImageElement img = (ImageElement) new Image(deck.getCard(i).getImg().update()).getElement().cast();
		
		return img;
	}
	
	public void render(Context2d context){
		for(double x = 0; x < width; x+=30){
			for(double y = 0; y< height; y+=50){
				int i = 0;
				context.drawImage(Draw(i), x, y);
				i++;
			}
		}	
	}
	
	
	
	
}
