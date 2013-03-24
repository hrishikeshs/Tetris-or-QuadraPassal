import java.awt.Color;

import acm.graphics.*;



/* This is a simple wrapper class around the GRectangle provided by the acm graphics.
 * Instead of calling the GRect() constructor each time in every class and 
 * setting the color and sides to the appropriate values, we can simply say Brick() and pass in the color.
 * The constructor creates a rectangle object of the color that was passed in.
 * to access the rectangle, just invoke the brick() accessor.
 */

public class Brick extends GShape {

  private GRect brick = null;
	
	public Brick(Color color) {
		brick = new GRect(SIDE,SIDE);
		brick.setFilled(true);
		brick.setFillColor(color);
		
	}
	
	public GRect brick() {
		return brick;
	}
		
}

