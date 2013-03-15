
package edu.ycp.cs320.memory;

import java.util.ArrayList;
import java.util.Random;


/**
 * 
 * @author jfiddle, choward
 *
 */
public class MemGame {
	
	public static final double WIDTH = 640;
	public static final double HEIGHT = 480;
	
	private int[][] memcards;
	private int time;
	private Random rand;
	private int scoring;
	private boolean gameover;
	private double x;
	private double y;
	private Image img;
	
	// constructor
	public MemGame(){
		memcards = new int[5][4];
		gameover = false;
		scoring = 0;
		time = 0;
		rand = new Random();
	}
	}
	
}

