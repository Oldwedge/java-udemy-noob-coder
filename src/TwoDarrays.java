
public class TwoDarrays {

	public static void main(String[] args) {
		
		int [][] x = new int[2][4];
		x[0][2] = 5;
		x[1][3] = 7;
		
		System.out.println(x[0][1]);
		System.out.println(x[1][3]);
		
		int [][] y = {{0,0,5,0},{0,0,0,7}};
		
		System.out.println(y[0][1]);
		System.out.println(y[1][3]);
		

	}

}
