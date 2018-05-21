
public class AreaCalculator implements IAreaCalculator{
	
	public float calculateArea(float sideOneLength, float sideTwoLength) {
				
		return sideOneLength * sideTwoLength;
	
	}
	
	public float calculateArea(float sideLength) {
		
		return (float)Math.pow(sideLength, 2);
	
	}

}
