public class Methods {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		
		
		report(a, b);
		System.out.println("The sum of num1 and num2 is: " + add(a, b));
		
	}
	
	public static void report(int num1, int num2) {
		
		System.out.println("num1 has the value of " + num1 + ", num2 has the value of " + num2);
			
	}
	
	public static int add(int num1, int num2) {
				
		return num1 + num2;
		
	}

}
