import java.awt.Color;


public class Bar extends GShape {

	
	/* This class implements the Shape 'I'. It is a compound object consisting of 'Bricks'.
	 * The positions of the brick could have been named better. But since it rotates and the  
	 * bricks shift their position, I couldn't think of a name that is better than
	 * 'first', 'second','third','fourth'.
	 * The variable 'rotated' inherited from GShape keeps track of the Bar's current orientation. 
	 */
	
	
	/*Private instance variables */
	
		private static final Color color   = Color.cyan; 
		
		
	/* The positions of the bricks are all relative to an imaginary point - Origin. Assumed to be
	 * at the top Left corner. 
	 */
		
		public Bar() {
			
			super(color);
			
			orientation  = 1;
			type = 1;
			add(first,0,0);
			add(second,0,SIDE);
			add(third,0,2*SIDE);
			add(fourth,0,3*SIDE);
		}

		
	/* This function flips the bar and sets the rotated variable appropriately */
		
		public void rotateShape() {
			
			if(orientation == 1) {
				add(first,0,0);
				add(second,SIDE,0);
				add(third,2*SIDE,0);
				add(fourth,3*SIDE,0);
				
				orientation = 2;
			}
			else {
				add(first,0,0);
				add(second,0,SIDE);
				add(third,0,2*SIDE);
				add(fourth,0,3*SIDE);
				
				orientation = 1;
			}
		}	
}
