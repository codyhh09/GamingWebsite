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
	    private boolean fliped = false;
	    public String update(Image img) {
			if(fliped){
				if(img.equals(Image.Arrow)){
					card = "CardImage/arrow.jpg";
				}else if(img.equals(Image.Circle)){
					card = "CardImage/circle.jpg";
				}else if(img.equals(Image.fourPStar)){
					card = "CardImage/fourpstar.jpg";
				}else if(img.equals(Image.Heart)){
					card = "CardImage/heart.jpg";
				}else if(img.equals(Image.Hexagon)){
					card = "CardImage/hexagon.jpg";
				}else if(img.equals(Image.Light)){
					card = "CardImage/light.jpg";
				}else if(img.equals(Image.Speech)){
					card = "CardImage/speech.jpg";
				}else if(img.equals(Image.Square)){
					card = "CardImage/square1.jpg";
				}else if(img.equals(Image.Triangle)){
					card = "CardImage/triangle.jpg";
				}else if(img.equals(Image.Star)){
					card = "CardImage/star1.jpg";
				}
			}
			else{
				card = "CardImage/Backcard.jpg";
			}
			
			return card;
	    }
	    	
	  
	}
