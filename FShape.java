import java.awt.Color;

public class FShape extends GShape {
  
	/* This class represents the 'F tetrimono' . It has a rotate() method that flips the
	 * tetrimono appropriately. It inherits the 'rotated' field from GShape to keep
	 * track of the current orientation.
	 * Again, all positions are relative to the origin (0,0) assumed to be at the top left corner. 
	 */
	
	
	
	/*Private instance variables */
	
		private Color color    = Color.BLUE;
		private Brick first    = new Brick(color);
		private Brick second   = new Brick(color);
		private Brick third    = new Brick(color);
		private Brick fourth   = new Brick(color);
		
		
		public FShape() {
			add(first.brick(),0,0);
			add(second.brick(),0,SIDE);
			add(third.brick(),0,2*SIDE);
			add(fourth.brick(),SIDE,0);
	
			rotated  = 1;
		}
		
				
		public void Rotate() {
			
			if(rotated == 1) {
				
				add(first.brick(),0,0);
				add(second.brick(),SIDE,0);
				add(third.brick(),2*SIDE,0);
				add(fourth.brick(),2*SIDE,SIDE);
		
				rotated = 2;
			}
			else if(rotated == 2) {
				
				add(first.brick(),SIDE,0);
				add(second.brick(),SIDE,SIDE);
				add(third.brick(),SIDE,2*SIDE);
				add(fourth.brick(),0,2*SIDE);
						
				
				rotated = 3;
			}
			else if(rotated == 3) {
				
				add(first.brick(),0,0);
				add(second.brick(),0,SIDE);
				add(third.brick(),SIDE,SIDE);
				add(fourth.brick(),2*SIDE,SIDE);
				
				rotated = 4;
			}
			
			else {
				
				add(first.brick(),0,0);
				add(second.brick(),0,SIDE);
				add(third.brick(),0,2*SIDE);
				add(fourth.brick(),SIDE,0);				
				
				rotated = 1;
			}
		}
		
		
	
}
			
