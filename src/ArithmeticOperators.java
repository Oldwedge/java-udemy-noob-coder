
public class ArithmeticOperators {

	public static void main(String[] args) {
		
		/*
		int num1 = 5;
		int num2 = 7;
		int result = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		result = num1 - num2;
		
		System.out.println(num1 + " - " + num2 + " = " + result);
		
		result = num1 * num2;
		
		System.out.println(num1 + " * " + num2 + " = " + result);
		
		double result2 = (double)num1 / (double)num2;
		
		System.out.println(num1 + " / " + num2 + " = " + result2);
		
		result = num2 % num1;
		
		System.out.println(num2 + " % " + num1 + " = " + result);
		*/
		String totalHours;
		String totalMinutes;
		String totalSeconds;
		
		
		int timestamp = 3834399;
		
		int timestampSeconds = timestamp / 1000;
		
		int fullHours1 = timestampSeconds / 3600;
		
		int remainder1 = timestampSeconds % 3600;
		
		int fullMinutes1 = remainder1 / 60;
		
		int seconds1 = remainder1 % 60;
		
		if(fullHours1 < 10) {
			
			totalHours = "0" + fullHours1;
			
		}else {
			
			totalHours = "" + fullHours1;
			
		}
		
		if(fullMinutes1 < 10) {
			
			totalMinutes = "0" + fullMinutes1;
			
		}else {
			
			totalMinutes = "" + fullMinutes1;
			
		}
		
		if(seconds1 < 10) {
			
			totalSeconds = "0" + seconds1;
			
		}else {
			
			totalSeconds = "" + seconds1;
			
		}
		
		System.out.println(totalHours + "h " + totalMinutes + "m " + totalSeconds + "s");
		//Testa
		
	}
	
}
