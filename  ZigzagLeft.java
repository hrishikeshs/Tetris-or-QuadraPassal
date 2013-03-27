import java.awt.Color;

public class ZigzagLeft extends GShape{

	/* This class represents the 'Z tetrimono' . It has a rotateShape() method that flips the
	 * tetrimono appropriately. It inherits the 'orientation' field from GShape to keep
	 * track of the current orientation.
	 * Again, all positions are relative to the origin (0,0) assumed to be at the top left corner. 
	 */	

		private static final Color color   = Color.GREEN;
		
		
		public ZigzagLeft() {

			super(color);
			orientation = 1;
			type = 6;
			add(first,0,0);
			add(second,SIDE,0);
			add(third,SIDE,SIDE);
			add(fourth,2*SIDE,SIDE);
		}
	
		public void rotateShape() {
			
			
			if(orientation == 1) {
				
				add(first,SIDE,0);
				add(second,SIDE,SIDE);
				add(third,0,SIDE);
				add(fourth,0,2*SIDE);
				
				
				orientation = 2;
			}
			else {
	

				add(first,0,0);
				add(second,SIDE,0);
				add(third,SIDE,SIDE);
				add(fourth,2*SIDE,SIDE);
				
				orientation = 1;
			}
		}		
		
}
