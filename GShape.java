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
	 
	public static final double SIDE            = 20;
	
	
	
	/* The variable rotated holds a number between 1 to 4. 1 is the initial state in
	 * which the tetrimono appears. When the user rotates, the variable changes its value. Depending on the 
	 * value of 'rotated', the Rotate() method flips the tetrimono.
	 * In case of zigzagright, zigzagleft and bar, rotated takes the value only 1 or 2
	 */
	
	protected 	int rotated      = 0;
	

	
	/*default implementation of Rotate() does nothing.The  subclasses need to override this method. */
	
	public void Rotate() { }

	
	
	public void removeBrick(Brick b) {
			
			remove(b);
			b = null;
		}



	
	
}
