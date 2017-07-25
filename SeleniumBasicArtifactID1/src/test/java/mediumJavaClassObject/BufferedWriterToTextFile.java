package mediumJavaClassObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterToTextFile {

	public static void main(String[] args) throws IOException {
		// Writing to text file using bufferedWriter java class
		// Open file 
		String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\mediumJavaClassObject\\usersFile";
		BufferedWriter br = new BufferedWriter(new FileWriter(filePath));
		String[] name = {"solomon", "John", "Dawit"};
		br.write("Student Name");
		br.write("\n");
		for(int i = 0; i < name.length; i++){
			br.write(name[i]);
			br.write("\n");
		}
		br.close();

	}

}
