package exercise;

import java.util.Scanner;

public class CheckAnumberIsEvenOrOdd {

	public static void main(String[] args) {
		int num=0;
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter a number:");
		num=sc.nextInt();
		if(num%2==0)
		System.out.println(num + " is an even number.");
		else System.out.println(num + " is an odd number.");
		sc.close();
	}

}
