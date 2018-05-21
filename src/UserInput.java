
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		
		String name = input.nextLine();
		
		System.out.print("Hello " + name);
		
		input.close();
		*/
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int number = input2.nextInt();
		
		System.out.print("You entered " + number);
		
		input2.close();
		
	}
	
}


