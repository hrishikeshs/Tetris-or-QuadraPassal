import java.awt.Color;


public class Bar extends GShape {

  
	/* This class implements the Shape 'I'. It is a compound object consisting of 'Bricks'.
	 * The positions of the brick could have been named better. But since it rotates and the  
	 * bricks shift their position, I couldn't think of a name that is better than
	 * 'first', 'second','third','fourth'.
	 * The variable 'rotated' inherited from GShape keeps track of the Bar's current orientation. 
	 */
	
	
	/*Private instance variables */
	
		private Color color   = Color.cyan; 
		private Brick first   = new Brick(color);
		private Brick second  = new Brick(color); 
		private Brick third   = new Brick(color); 
		private Brick fourth  = new Brick(color); 
		
		
	/* The positions of the bricks are all relative to an imaginary point - Origin. Assumed to be
	 * at the top Left corner. 
	 */
		
		public Bar() {
			rotated  = 1;
			
			add(first.brick(),0,0);
			add(second.brick(),0,SIDE);
			add(third.brick(),0,2*SIDE);
			add(fourth.brick(),0,3*SIDE);
		}

		
	/* This function flips the bar and sets the rotated variable appropriately */
		
		public void Rotate() {
			
			if(rotated == 1) {
				add(first.brick(),0,0);
				add(second.brick(),SIDE,0);
				add(third.brick(),2*SIDE,0);
				add(fourth.brick(),3*SIDE,0);
				
				rotated = 2;
			}
			else {
				add(first.brick(),0,0);
				add(second.brick(),0,SIDE);
				add(third.brick(),0,2*SIDE);
				add(fourth.brick(),0,3*SIDE);
				
				rotated = 1;
			}
		}	
}
