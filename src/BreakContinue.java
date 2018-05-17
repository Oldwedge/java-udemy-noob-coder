
public class BreakContinue {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			
			if(i == 2) {
				
				//break; //break out of the loop
				continue; //reset loop, increment i and go to next iteration
				
			}
			
			System.out.println("i has a value of " + i);
			
		}

	}

}
