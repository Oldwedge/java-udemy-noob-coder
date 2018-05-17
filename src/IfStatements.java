
public class IfStatements {

	public static void main(String[] args) {
		
		int number1 = -4;
		
		if(number1 > 4) 
		{
			
			System.out.println("The number " + number1 + " is greater than 4" );
			
		} 
		else if(number1 < 4)
		{
			
			System.out.println("The number " + number1 + " is less than 4" );
						
		}
		else if(number1 == 4)
		{
			System.out.println("The number " + number1 + " equals 4" );
			
		}
		else
		{
			
			System.out.println("Not sure what you did there" );
						
		}
		
	}
	
}
