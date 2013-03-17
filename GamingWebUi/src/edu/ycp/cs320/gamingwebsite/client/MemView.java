package edu.ycp.cs320.gamingwebsite.client;

import java.util.ArrayList;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.canvas.dom.client.ImageData;
import com.google.gwt.dom.client.CanvasElement;
import com.google.gwt.dom.client.ImageElement;
import edu.ycp.cs320.memory.*;
import edu.ycp.cs320.location.Memloc;
import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.event.dom.client.LoadEvent;
import com.google.gwt.event.dom.client.LoadHandler;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.dom.client.Style.Unit;

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
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("697px", "542px");
		canvas = Canvas.createIfSupported();
		context = canvas.getContext2d();

		makeCanvas(canvas, context);
		update();
		
		
		layoutPanel.add(canvas);
		layoutPanel.setWidgetLeftWidth(canvas, 0.0, Unit.PX, 642.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(canvas, 0.0, Unit.PX, 526.0, Unit.PX);
	}
	
	public void makeCanvas(Canvas canvas, Context2d context){
		canvas.setHeight("480px");
		canvas.setWidth("640px");
		canvas.setCoordinateSpaceHeight(1000);
		canvas.setCoordinateSpaceWidth(1000);
		
		Image img = new Image("CardImage/arrow.jpg");
		
		context.putImageData(imagedata, x, y);
	}
	
	public void update(){
		
	}
}
//		image = new ArrayList<ImageElement>();
//		deck = new MemDeck();
//		deck.make();
		

		// drawing the picture
//		for(int i= 0; i< deck.getNumCards(); i++){
//			image.add(Draw(i));
//		}
		//context.drawImage(image.get(1), 0, 0);
		//canvas.getContext(deck.getCard(1).getImg().update());
//		context.drawImage(image.get(0), 0, 0);
//		context.fillRect(25, 25, 50, 50);
//		canvas.setVisible(true);
//http://code.google.com/p/gwt-examples/wiki/gwt_hmtl5