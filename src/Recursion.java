
public class Recursion {
	
	public static void main(String[] args) {
		
		int x = 4;
		
		System.out.println(factorial(x));
		
	}
	
	public static int factorial(int num1) {
		
		if(num1 <= 1) {
			return 1;
			
		}
		
		return num1 * factorial(num1 -1) ;
		
	}

}
