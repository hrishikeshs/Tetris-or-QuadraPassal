import java.awt.Color;

public class Block extends GShape {
		
	/* This class is a compound object that represents a 'square tetrimono'. Also called 'o'.
	 * Since a square doesn't rotate, no rotation information is needed and it need not override the default 
	 * implementation of rotateShape() inherited by the GShape.
	 */
	
	/*Private instance variables */ 
	
		private static final Color color   = Color.YELLOW; 
		
		
		public Block() {
				
			super(color);
			type = 0;
			add(first,0,0);
			add(second,SIDE,0);
			add(third,0,SIDE);
			add(fourth,SIDE,SIDE);
		}	
		
}
