import java.awt.Color;

public class LShape extends GShape {
	
	/* This class represents the 'L tetrimono' . It has a rotate() method that flips the
	 * tetrimono appropriately. It inherits the 'rotated' field from GShape to keep
	 * track of the current orientation.
	 * Again, all positions are relative to the origin (0,0) assumed to be at the top left corner. 
	 */
	
		
	
	
	/*Private instance variables */
	
		private static final Color color   = Color.white;		
		
		
	
		
		public LShape() {
			
			super(color);
			type = 3;
			orientation  = 1;
			add(first,0,0);
			add(second,0,SIDE);
			add(third,0,2*SIDE);
			add(fourth,SIDE,2*SIDE);
		}
		
		public void rotateShape() {
						
			if(orientation == 1) {
				
				add(first,0,0);
				add(second,0,SIDE);
				add(third,SIDE,0);
				add(fourth,2*SIDE,0);
		
				orientation = 2;
			}
			else if(orientation == 2) {
				
				add(first,0,0);
				add(second,SIDE,0);
				add(third,SIDE,SIDE);
				add(fourth,SIDE,2*SIDE);
				
		
				orientation = 3;
			}
			else if(orientation == 3) {
				
				add(first,0,SIDE);
				add(second,SIDE,SIDE);
				add(third,2*SIDE,SIDE);
				add(fourth,2*SIDE,0);
				
		
				orientation = 4;
			}
			else {
				
				add(first,0,0);
				add(second,0,SIDE);
				add(third,0,2*SIDE);
				add(fourth,SIDE,2*SIDE);
			
				
		
				orientation = 1;
				
			}
		}
		
	
		
	
}
