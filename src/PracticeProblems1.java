
public class PracticeProblems1 {
	
	public static void main(String[] args) {
		
		float kiloMeters = 50f;
		
		float yards = 300f;
		
		float celsius = 30f;
		
		float fahrenheit = 70f;
		
		float sideOneLength = 2f;
		
		float sideLength = 2f;
		
		float sideTwoLength = 4f;
		
		
		System.out.println("50 km =  " + kilometersToMiles(kiloMeters) + " miles.");
		
		System.out.println("300 yards =  " + yardsToMiles(yards) + " miles.");
		
		System.out.println("30 degrees C =  " + celsiusToFahrenheit(celsius) + " degrees F.");
		
		System.out.println("70 degrees F =  " + fahrenheitToCelsius(fahrenheit) + " degrees C.");
		
		System.out.println("The area of a rectanlge with one side length " + sideOneLength + " and one side length " + sideTwoLength + " = " + rectangleArea(sideOneLength, sideTwoLength) + " units.");
		
		System.out.println("The area of a square with side length " + sideLength + " = " + squareArea(sideLength) + " units.");
		
	}
	
	public static float celsiusToFahrenheit(float degrees) {
		
		float result = 0.0f;
		
			result = degrees * (9/5) + 32;
		
		return result;
		
	}
	
	public static float fahrenheitToCelsius(float degrees) {
		
		float result = 0.0f;
		
			result = (degrees - 32) * (9/5);
		
		return result;
		
	}
	
	public static float kilometersToMiles(float value) {
		
		float result = 0.0f;
		
			result = value * 0.62137f;
		
		return result;
		
	}
	
	public static float yardsToMiles(float value) {
		
		float result = 0.0f;
		
			result = value * 0.00056818f;
		
		return result;
		
	}
	
	
	public static float rectangleArea(float sideOneLength, float sideTwoLength) {
		
		float result = 0.0f;
		
			result = sideOneLength * sideTwoLength;
		
		return result;
		
	}
	
	
	public static float squareArea(float sideLength) {
		
		float result = 0.0f;
		
			result = (float) Math.pow(sideLength, 2);
		
		return result;
		
	}
	
	

}
