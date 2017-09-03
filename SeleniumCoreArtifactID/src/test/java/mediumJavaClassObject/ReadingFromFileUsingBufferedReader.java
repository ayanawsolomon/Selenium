package mediumJavaClassObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFileUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// Reading from file using buffered reader java class
		// get file path 
		String filePath = System.getProperty("user.dir")+ "\\src\\test\\java\\mediumJavaClassObject\\usersFile";
		// Open the file
		// store into buffer
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line;
		while((line=br.readLine()) !=null){
						
			System.out.println(line);
		}
		

	}

}
