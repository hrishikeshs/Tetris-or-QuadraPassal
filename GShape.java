import java.awt.Color;

import acm.graphics.*;

/* This class represents the basic shape of the pieces. Since all the tetrimonos 
 * need to share the values of SIDE and the variable 'rotated' to keep 
 * track of their current orientation, this class is made a superclass from which
 * all other tetrimono classes are derived. Whenever a row is completed, to access and
 * remove parts of the compound shapes, this class also provides the 'removeBrick()' method.
 */

public class GShape extends GCompound{
	
	
	/*The SIDE static variable (constant :) ) holds the measure of the side of a rectangle used in Brick. 
	  SIDE = 20 specifies in pixels, the length of the rectangle's side. */
	 
	public static final double  SIDE  = 20;
	
	
	
	/* The variable orientation holds a number between 1 to 4. 1 is the initial state in
	 * which the tetrimono appears. When the user rotates, the variable changes its value. Depending on the 
	 * value of 'rotated', the Rotate() method flips the tetrimono.
	 * In case of zigzagright, zigzagleft and bar, rotated takes the value only 1 or 2
	 */
	
	protected int orientation  = 0;
	
	public int type = -1;
	
	protected GRect first;
	protected GRect second;
	protected GRect third;
	protected GRect fourth;
	
	public GShape(Color color) {
		
		first  = new GRect(SIDE,SIDE);
		second = new GRect(SIDE,SIDE);
		third  = new GRect(SIDE,SIDE);
		fourth = new GRect(SIDE,SIDE);
		
		
		first.setFillColor(color);
		second.setFillColor(color);
		third.setFillColor(color);
		fourth.setFillColor(color);
		
		
		first.setFilled(true);
		second.setFilled(true);
		third.setFilled(true);
		fourth.setFilled(true);		
		
	}	
	
	/*default implementation of Rotate() does nothing.The  subclasses need to override this method. */
	
	public GShape() {	}
	
	
	
	
	public void rotateShape() { }

	
	public GRect[] getBricks() {
		
		GRect array[] = new GRect[4];
		array[0] = first;
		array[1] = second;
		array[2] = third;
		array[3] = fourth;
		
		
		return array;
	}
	
}
