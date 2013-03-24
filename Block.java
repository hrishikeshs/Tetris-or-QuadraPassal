import java.awt.Color;

public class Block extends GShape {
  	
	/* This class is a compound object that represents a 'square tetrimono'. Also called 'o'.
	 * Since a square doesn't rotate, no rotation information is needed and it need not override the default 
	 * implementation of Rotate() inherited by the GShape.
	 */
	
	/*Private instance variables */ 
	
		private Color color   = Color.YELLOW; 
		private Brick first   = new Brick(color);
		private Brick second  = new Brick(color); 
		private Brick third   = new Brick(color); 
		private Brick fourth  = new Brick(color);
		
			   
		
		public Block() {
				
			add(first.brick(),0,0);
			add(second.brick(),SIDE,0);
			add(third.brick(),0,SIDE);
			add(fourth.brick(),SIDE,SIDE);
		}	
}
