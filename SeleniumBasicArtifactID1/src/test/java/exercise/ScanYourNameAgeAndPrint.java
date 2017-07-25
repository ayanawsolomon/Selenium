package exercise;

import java.util.Scanner;

public class ScanYourNameAgeAndPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   
		  System.out.print("Enter your Name: ");
		  String name = sc.nextLine();
		   
		  System.out.print("Enter your age: ");
		  int age = sc.nextInt();
		   
		  System.out.println("My name is " + name +  " and I am " + age  + " years old" );
		 sc.close();
		 //Write a program to read two numbers from keyboard and print their addition, multiplication, and reminder.
	}

}
