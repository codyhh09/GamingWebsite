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

import edu.ycp.cs320.location.Memloc;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GamingWebUi implements EntryPoint, MouseDownHandler, MouseUpHandler {
	// context
	private Context2d context;
	// timer
	private Timer timer;
	private Memloc loc;
	private MemView view;
	// mouse press
	private boolean mouseDown;
	
	private final static int width = 600;
	private final static int height = 400;
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		final Canvas canvas = Canvas.createIfSupported();
		view = new MemView();
		
		// adding the canvas to the HTML file
		RootPanel.get().add(canvas, 0, 0);
		
		// setting the size of the canvas
		canvas.setSize("448px", "298px");
		canvas.setCoordinateSpaceHeight(height);
		canvas.setCoordinateSpaceWidth(width);
		
		// add init press on mouse button
		canvas.addMouseDownHandler(this);
		canvas.addMouseUpHandler(this);
		
		//init the context
		context = canvas.getContext2d();
		//init the loc
		loc = new Memloc();
		
		
		// Init the timer
		timer = new Timer() {
			@Override
			public void run(){
				update();
			}
		};
	}
	
	public void update(){
		view.render(context);
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
