
public class Arrays {

	public static void main(String[] args) {
		
		int [] x = new int[4];
		
		for(int j=0;j<x.length;j++) {
			
			switch (j) {
				case 0:x[j] = 4;
					break;
				case 1:x[j] = 3;
					break;
				case 2:x[j] = 6;
					break;
				case 3:x[j] = 2;
					break;
				default:
					break;
			}
			
		}
		
		/*
		
		x[0] = 1;
		x[1] = 2;
		x[2] = 1;
		x[3] = 2;
		
		*/
		
		for(int i = 0; i < x.length;i++) {
			
			System.out.println(x[i]);

		}
		
		int [] y = {3,5,8,1};

		for(int k = 0; k < y.length;k++) {
			
			if(k == 0) {
				
				System.out.print("\n");
				
			}
			
			System.out.println(y[k]);

		}

	}

}
