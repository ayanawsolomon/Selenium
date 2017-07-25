package exercise;

import java.util.Scanner;

public class ForLoopPrintUptoANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num= sc.nextInt();
		for(int i =0; i<=num; i++){
			System.out.println(i);
		}
		
		sc.close();
		//Change the program to print only even numbers
	}

}
