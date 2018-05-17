
public class TernaryOperators {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		
		int min;
		
		/*
		if(a < b) {
			
			min = a;
			
		}else {
			
			min = b;
			
		}
		*/
		
		min = a < b ? a : b;
		
		System.out.println(min);
		
	}

}
