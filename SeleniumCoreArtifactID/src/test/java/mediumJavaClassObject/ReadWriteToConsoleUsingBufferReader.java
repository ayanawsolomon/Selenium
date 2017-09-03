package mediumJavaClassObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteToConsoleUsingBufferReader {

	public static void main(String[] args) throws IOException {
		// Reading from Console
		// system.in is standard input ( that is keyboard)
		// streamReader is a pipe that used to pass data from input to your destination 
		// Buffer is a collector
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome!!");
		System.out.print("Enter your name: ");
		String name = br.readLine(); // reads untill you press inter, move to next line
		System.out.print("Enter your age: ");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Your name is : " + name + " and your age is : " + age);

	}

}
