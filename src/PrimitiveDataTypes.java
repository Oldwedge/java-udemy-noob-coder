
public class PrimitiveDataTypes {

	public static void main(String[] args) {


		// Whole Numbers
		// byte 2^8 -128 -> 127
		// short 2^16 -32768 -> 32767
		// int -2^31 -> 2^31 -1
		// long -2^63 -> 2^63 -1 
	
		byte number1 = 10;
		short seconds1 = 3510;
		int miles1 = 1233192;
				
		System.out.println(number1);
		System.out.println(seconds1);
		System.out.println(miles1);
		
		miles1+=number1+seconds1;
		
		System.out.println(miles1);
	
		// Decimals
		// float 32-bit IEEE
		// double 64-bit IEEE
		
	
		byte y = 12;
		float x = 3.14f;
		short z = (short) (x+y);
		System.out.println(z);
		
		double d1 = 0.1;
		System.out.println("d1 = " + d1);
		double d2 = d1 + x;
		System.out.println("d2 = " + d2);
		x = (float) d1 + x;
		System.out.println("x = " + x);
	
		
		// boolean
		// char
		
		boolean trueOrFalse = false;
		System.out.println(trueOrFalse);
		
		char someCharacter = 'e';
		System.out.println(someCharacter);		
				
		
	}

} 
