package mediumJavaClassObject;

import java.util.Scanner;

public class ReadWriteToConsoleUsingScanner {

	public static void main(String[] args) {
		// Reading from console using scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome!!");
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Enter your age : ");
		int age= Integer.parseInt(scanner.nextLine());
		System.out.println("Your name is : " + name + " and your age is " + age);

	}

}
