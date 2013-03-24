import java.awt.Color;

public class ZigzagRight extends GShape{

  /* This class represents the 'S tetrimono' . It has a rotate() method that flips the
	 * tetrimono appropriately. It inherits the 'rotated' field from GShape to keep
	 * track of the current orientation.
	 * Again, all positions are relative to the origin (0,0) assumed to be at the top left corner. 
	 */
	
	
	/*Private instance variables */
	
		private Color  color  = Color.orange;
		private Brick first   = new Brick(color);
		private Brick second  = new Brick(color);
		private Brick third   = new Brick(color);
		private Brick fourth  = new Brick(color);
				 
		
		public ZigzagRight() {
		
			rotated  = 1;
			add(first.brick(),0,SIDE);
			add(second.brick(),SIDE,SIDE);
			add(third.brick(),SIDE,0);
			add(fourth.brick(),2*SIDE,0);
		}
	
	
		public void Rotate() {
			
			if(rotated == 1) {

				add(first.brick(),0,0);
				add(second.brick(),0,SIDE);
				add(third.brick(),SIDE,SIDE);
				add(fourth.brick(),SIDE,2*SIDE);
		
				rotated = 2;
			}		
			else {
				add(first.brick(),0,SIDE);
				add(second.brick(),SIDE,SIDE);
				add(third.brick(),SIDE,0);
				add(fourth.brick(),2*SIDE,0);
						
				rotated = 1;
			}
	}		
		

}	
