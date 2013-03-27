import java.awt.Color;

public class ZigzagRight extends GShape{

	/* This class represents the 'S tetrimono' . It has a rotateShape() method that flips the
	 * tetrimono appropriately. It inherits the 'orientation' field from GShape to keep
	 * track of the current orientation.
	 * Again, all positions are relative to the origin (0,0) assumed to be at the top left corner. 
	 */
	
	
	/*Private instance variables */
	
		private static final Color  color  = Color.orange;
		
				 
		
		public ZigzagRight() {
		
			super(color);
			orientation  = 1;
			type = 5;
			add(first,0,SIDE);
			add(second,SIDE,SIDE);
			add(third,SIDE,0);
			add(fourth,2*SIDE,0);
		}
	
	
		public void rotateShape() {
			
			if(orientation == 1) {

				add(first,0,0);
				add(second,0,SIDE);
				add(third,SIDE,SIDE);
				add(fourth,SIDE,2*SIDE);
		
				orientation = 2;
			}		
			else {
				add(first,0,SIDE);
				add(second,SIDE,SIDE);
				add(third,SIDE,0);
				add(fourth,2*SIDE,0);
						
				orientation = 1;
			}
	}		
		

}	
