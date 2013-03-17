package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.canvas.dom.client.CssColor;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;





public class GamingWebUi implements EntryPoint{
 static final String canvasHolderId = "canvasholder";
 static final String unsupportedBrowser = "Your browser does not support the HTML5 Canvas";
 static final int height = 400;
 static final int width = 500;
 final CssColor colorRed = CssColor.make("red");
 final CssColor colorGreen = CssColor.make("green");
 final CssColor colorBlue = CssColor.make("blue");
 Canvas canvas;
 Context2d context;

 public void onModuleLoad() {
  canvas = Canvas.createIfSupported();
  if (canvas == null) {
	  	RootPanel.get(canvasHolderId).add(new Label(unsupportedBrowser));
        return;
  }
  createCanvas();
 }

 private void createCanvas(){
     canvas.setWidth(width + "px");
     canvas.setHeight(height + "px");
     canvas.setCoordinateSpaceWidth(width);
	 canvas.setCoordinateSpaceHeight(height);
     RootPanel.get(canvasHolderId).add(canvas);
     context = canvas.getContext2d();
     context.beginPath();
     context.setFillStyle(colorRed);
     context.fillRect(100, 50, 100, 100);
     context.setFillStyle(colorGreen);
     context.fillRect(200, 150, 100, 100);
     context.setFillStyle(colorBlue);
     context.fillRect(300, 250, 100, 100);
     context.closePath();
 }

}

