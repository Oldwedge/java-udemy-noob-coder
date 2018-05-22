
public class PracticeProblems3 {

	public static void main(String[] args) {
		
		printFrame();
		System.out.println();
		printTriangleOne();
		System.out.println();
		printTriangleTwo();

	}
	
	
	public static void printFrame() {
		
		for(int i = 0;i < 5;i++) {
									
			for(int y = 0;y < 5;y++) {
						
				if((i == 0 || i == 4) && y != 4) {
					
					System.out.print("*");
					
				}else if((i == 0 || i == 4) && y == 4){
					
					System.out.println("*");
					
				}else if(y == 0) {
					
					System.out.print("*");
					
				}else if(y == 4) {
					
					System.out.println("*");
					
					
				}else if((i != 0 && i != 4) && (y != 0 && y != 4)) {
					
					System.out.print(" ");
					
				}
				
			}
			
		}
		
	}
	
	public static void printTriangleOne() {
		
		for(int i = 0;i < 5;i++) {
			
			for(int y = 0;y < 5;y++) {
				
				if(y == i) {
					
					System.out.println("*");
					
				}else if(y < i) {
					
					System.out.print("*");		
					
				}
				
			}
		
		}
			
	}
	
	public static void printTriangleTwo() {
		
		for(int i = 0;i < 5;i++) {
			
			for(int y = 0;y < 5;y++) {
		
				if(y < 4 && i <= y) {
					
					System.out.print("*");
					
				}else if(i > y) {
					
					System.out.print(" ");		
					
				}else{
					
					System.out.println("*");
					
				}
				
				
			}
			
		}
		
	}
		
	
}
