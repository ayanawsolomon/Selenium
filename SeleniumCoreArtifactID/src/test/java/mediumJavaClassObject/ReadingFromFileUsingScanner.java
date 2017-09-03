package mediumJavaClassObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFileUsingScanner {

	public static void main(String[] args) throws FileNotFoundException {
		// reading from text file using scanner java class
		// get file path 
		String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\mediumJavaClassObject\\usersFile";
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		
	}

}
