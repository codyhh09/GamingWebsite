package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Image;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GamingWebUi implements EntryPoint, MouseDownHandler, MouseUpHandler {
	
	private Context2d context;
	
	private Timer timer;
	
	private MemDeckView view;

	private boolean mouseDown;
	
	private final static int width = 600;
	private final static int height = 400;
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		final Canvas canvas = Canvas.createIfSupported();
		view = new MemDeckView();
		
		RootPanel rootPanel = RootPanel.get();
		rootPanel.add(canvas, 0, 0);
		
		canvas.setSize("448px", "298px");
		canvas.setCoordinateSpaceHeight(height);
		canvas.setCoordinateSpaceWidth(width);
		
//		for(int x = 0; x < width; x+=30){
//			for(int y = 0; y< height; y+=50){
				Image image = new Image(view.getDeck().getCard(0).);
				rootPanel.add(image, 50, 0);
				image.setSize("100px", "100px");
		
		canvas.addMouseDownHandler(this);
		canvas.addMouseUpHandler(this);
		
		context = canvas.getContext2d();
		
		timer = new Timer() {
			@Override
			public void run(){
				update();
			}
		};
	}
	
	public void update(){
		
	}
	
	public void onMouseMove(MouseMoveEvent event) {
	
	}
	
	@Override
	public void onMouseUp(MouseUpEvent event) {
		mouseDown = false;
		
	}

	@Override
	public void onMouseDown(MouseDownEvent event) {
		mouseDown = true;
		
	}
}
