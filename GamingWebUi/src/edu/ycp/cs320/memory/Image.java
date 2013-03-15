package edu.ycp.cs320.memory;

import com.google.gwt.core.client.JavaScriptObject;



/**
 * 
 * @author jfiddle, shamor1
 *
 * Contains the different types of images that will be used to compare and contrast.
 * Each image will be used twice.
 */
public enum Image {
	    Star, Circle, Square, Triangle, Arrow, Speech, Hexagon, Light, Heart, fourPStar;
		
	    private String card;
	    public String update() {
				if(this == Arrow){
					card = "CardImage/arrow.jpg";
				}else if(this == Circle){
					card = "CardImage/circle.jpg";
				}else if(this == fourPStar){
					card = "CardImage/fourpstar.jpg";
				}else if(this == Heart){
					card = "CardImage/heart.jpg";
				}else if(this == Hexagon){
					card = "CardImage/hexagon.jpg";
				}else if(this == Light){
					card = "CardImage/light.jpg";
				}else if(this == Speech){
					card = "CardImage/speech.jpg";
				}else if(this == Square){
					card = "CardImage/square1.jpg";
				}else if(this == Triangle){
					card = "CardImage/triangle.jpg";
				}else if(this == Star){
					card = "CardImage/star1.jpg";
				}

			return card;
	    }
	    	
	  
	}
