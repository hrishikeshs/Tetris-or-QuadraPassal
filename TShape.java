import java.awt.Color;

public class TShape extends GShape {
  
	/* This class represents the 'T tetrimono' . It has a rotate() method that flips the
	 * tetrimono appropriately. It inherits the 'rotated' field from GShape to keep
	 * track of the current orientation.
	 * Again, all positions are relative to the origin (0,0) assumed to be at the top left corner. 
	 */
	
	
	/*private instance variables */
		private Color color    = Color.magenta;
		private Brick first    = new Brick(color);
		private Brick second   = new Brick(color);
		private Brick third    = new Brick(color);
		private Brick fourth   = new Brick(color);
	
		
		public TShape() {
		
			rotated  = 1;
			add(first.brick(),0,0);
			add(second.brick(),SIDE,0);
			add(third.brick(),2*SIDE,0);
			add(fourth.brick(),SIDE,SIDE);
			
		}
		
		public void Rotate() {
			
			
			if(rotated == 1) {				
				
				add(first.brick(),SIDE,0);
				add(second.brick(),SIDE,SIDE);
				add(third.brick(),SIDE,2*SIDE);
				add(fourth.brick(),0,SIDE);
				rotated = 2;
			}
			else if(rotated == 2) {
				
				add(first.brick(),0,SIDE);
				add(second.brick(),SIDE,SIDE);
				add(third.brick(),2*SIDE,SIDE);
				add(fourth.brick(),SIDE,0);
				
				rotated = 3;
			}
		   else if(rotated == 3) {
				
			   add(first.brick(),0,0);
			   add(second.brick(),0,SIDE);
			   add(third.brick(),0,2*SIDE);
			   add(fourth.brick(),SIDE,SIDE);
			   
				
			   
				rotated = 4;
			}
			
		   else {
			   	add(first.brick(),0,0);
				add(second.brick(),SIDE,0);
				add(third.brick(),2*SIDE,0);
				add(fourth.brick(),SIDE,SIDE);
				
			    	    rotated = 1;
		   }
		}	
			
		
}
			
