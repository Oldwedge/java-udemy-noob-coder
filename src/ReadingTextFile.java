import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingTextFile {

	public static void main(String[] args) {
		
		File file = new File("C:/eclipse/workspace/Udemy-noobcoder/src/ReadTextFile.txt");
		
		Scanner input;
		
		try {
			input = new Scanner(file);
			
			while (input.hasNextLine()) {
				
				System.out.println(input.nextLine());
				
			}
			
			
		} catch (FileNotFoundException e) {

			System.out.println("Unable to locate file specified: " + file.getAbsolutePath());
			
			e.printStackTrace();
		}
		
		

	}

}
