import java.awt.Color;

public class ZigzagLeft extends GShape{

  /* This class represents the 'Z tetrimono' . It has a rotate() method that flips the
	 * tetrimono appropriately. It inherits the 'rotated' field from GShape to keep
	 * track of the current orientation.
	 * Again, all positions are relative to the origin (0,0) assumed to be at the top left corner. 
	 */	

		private Color color   = Color.GREEN;
		private Brick first   = new Brick(color); 
		private Brick second  = new Brick(color);
		private Brick third   = new Brick(color);
		private Brick fourth  = new Brick(color);
		
		public ZigzagLeft() {

			rotated = 1;
			add(first.brick(),0,0);
			add(second.brick(),SIDE,0);
			add(third.brick(),SIDE,SIDE);
			add(fourth.brick(),2*SIDE,SIDE);
		}
	
		public void Rotate() {
			
			
			if(rotated == 1) {
				
				add(first.brick(),SIDE,0);
				add(second.brick(),SIDE,SIDE);
				add(third.brick(),0,SIDE);
				add(fourth.brick(),0,2*SIDE);
				
				
				rotated = 2;
			}
			else {
	

				add(first.brick(),0,0);
				add(second.brick(),SIDE,0);
				add(third.brick(),SIDE,SIDE);
				add(fourth.brick(),2*SIDE,SIDE);
				
				rotated = 1;
			}
		}		
		
}
