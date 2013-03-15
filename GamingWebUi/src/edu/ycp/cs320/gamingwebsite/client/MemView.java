package edu.ycp.cs320.gamingwebsite.client;

import java.util.ArrayList;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.dom.client.ImageElement;
import edu.ycp.cs320.memory.*;
import edu.ycp.cs320.location.Memloc;
import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;

public class MemView extends Composite {
	
	private Memloc loc;
	private MemDeck deck;
	private ArrayList<ImageElement> image;
	public static int height = 480;
	public static int width = 640;
	private boolean down = false;
	private Canvas canvas;
	private Context2d context;
	
	
	public MemView() {
		
		canvas = Canvas.createIfSupported();
		canvas.addMouseUpHandler(new MouseUpHandler() {
			public void onMouseUp(MouseUpEvent event) {
				down = false;
			}
		});
		canvas.addMouseDownHandler(new MouseDownHandler() {
			public void onMouseDown(MouseDownEvent event) {
				down = true;
			}
		});
		
		
		initWidget(canvas);
		
		image = new ArrayList<ImageElement>();
		deck = new MemDeck();
		deck.make();
		
		// drawing the picture
		for(int i= 0; i< deck.getNumCards(); i++){
			image.add(Draw(i));
		}
		//context.drawImage(image.get(1), 0, 0);
		canvas.getContext(deck.getCard(1).getImg().update());
	}
	
	public ImageElement Draw(int i){
		ImageElement img = (ImageElement) new Image(deck.getCard(i).getImg().update()).getElement().cast();	
		return img;
	}
	
	public void render(Context2d context){
		for(double x = 0; x < width; x+=30){
			for(double y = 0; y< height; y+=50){
				int i = 0;
				context.drawImage(Draw(i), loc.getX(), loc.getY());
				i++;
			}
		}	
	}
	
	
	
	
	public Canvas getCanvas() {
		return canvas;
	}
}
