package mediumJavaClassObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterToWriteInToTextFile {

	public static void main(String[] args) throws IOException {
		// using FileWriter to write to text file
		// file path
		String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\mediumJavaClassObject\\usersFile";
		Writer wr = new FileWriter(filePath);
		String[] name = {"AAAAA", "BBBBBB", "CCCCCCCCC", "DDDDDDD"};
		wr.write("Student Name\n");
		for(int i=0; i < name.length; i++){
			wr.write(name[i]);
			wr.write("\n");
		}
		wr.flush();
		wr.close();

	}

}
