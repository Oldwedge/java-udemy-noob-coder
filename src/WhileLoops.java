
public class WhileLoops {
	
	public static void main(String[] args) {
		
		
		// Use for loop when you know "where to end", and while loop when it depends on something unknown (like number of entries in a database)
		
		
		/*
		for(int i = 0; i < 5; i++) {
			System.out.println("i has the value of " + i);
		}
		*/
		
		int i = 0;
		
		while(i < 5) {
			
			System.out.println("i has the value of " + i);
			
			i++;
		}
		
	}

}
