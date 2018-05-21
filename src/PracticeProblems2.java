
public class PracticeProblems2 {

	public static void main(String[] args) {
		
		int[] problemArray = {1,13,2,1,8,10,9,4,3};
		
		printArray(problemArray);
		System.out.println();
		printEvenArray(problemArray);
		System.out.println();
		printOddArray(problemArray);
		System.out.println();
		System.out.print(sumOfEvens(problemArray));
		System.out.println();
		System.out.print(sumOfOdds(problemArray));
		System.out.println();
		System.out.print(sumOfEvenIndecies(problemArray));
		System.out.println();
		System.out.print(sumOfOddIndecies(problemArray));
		
	}
	
	public static void printArray(int[] x) {
		
		for(int i = 0;i < x.length;i++) {
			
			System.out.println(x[i]);
			
		}
	
	}
	
	public static void printEvenArray(int[] x) {
		
		for(int i = 0;i < x.length;i++) {
			
			if(x[i] % 2 == 1) {
				
				System.out.println(x[i]);
				
			}
			
		}
	
	}
	
	public static void printOddArray(int[] x) {
		
		for(int i = 0;i < x.length;i++) {
			
			if(x[i] % 2 == 0) {
				
				System.out.println(x[i]);
				
			}
			
		}
	
	}
	
	
	public static int sumOfEvens(int[] x) {
		
		int evenSum = 0;
		
		for(int i = 0;i < x.length;i++) {
			
			if(x[i] % 2 == 0) {
				
				evenSum = evenSum + x[i];
				
			}
			
		}
		
		return evenSum;
	}
	
	public static int sumOfOdds(int[] x) {
		
		int oddSum = 0;
		
		for(int i = 0;i < x.length;i++) {
			
			if(x[i] % 2 == 1) {
				
				oddSum = oddSum + x[i];
				
			}
			
		}
		
		return oddSum;
	}
	
	public static int sumOfEvenIndecies(int[] x) {
		
		int evenSum = 0;
		
		for(int i = 0;i < x.length;i++) {
			
			if(i % 2 == 0) {
				
				evenSum = evenSum + x[i];
				
			}
			
		}
		
		return evenSum;
	}
	
	public static int sumOfOddIndecies(int[] x) {
		
		int oddSum = 0;
		
		for(int i = 0;i < x.length;i++) {
			
			if(i % 2 == 1) {
				
				oddSum = oddSum + x[i];
				
			}
			
		}
		
		return oddSum;
	}
	
	
	

}
