
public class IncrementDecrement {
	
	public static void main(String[] args) {
		
		// Pre / Post increment and decrement
		
		int x = 5;
		
		// post increment / decrement (execute statement, then change value)
		
		System.out.println("org x" + " = " + x);
		
		System.out.println("during x++" + " = " + x++);
		
		System.out.println("after x++" + " = " + x);
		
		x = 5;
		
		System.out.println("org x" + " = " + x);
		
		System.out.println("during x--" + " = " + x--);
		
		System.out.println("after x--" + " = " + x);
		
		// pre increment / decrement (change value, then execute statement)
		
		x = 5;
		
		System.out.println("\norg x" + " = " + x);
		
		System.out.println("during ++x" + " = " + ++x);
		
		System.out.println("after ++x" + " = " + x);
		
		x = 5;
		
		System.out.println("org x" + " = " + x);
		
		System.out.println("during --x" + " = " + --x);
		
		System.out.println("after --x" + " = " + x);
		
	}

}
