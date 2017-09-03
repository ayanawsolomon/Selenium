package exercise;

import java.util.Scanner;

public class ForLoopToSumOddNumbersUptoAGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num= sc.nextInt();
		int sum=0;
		for(int i =0; i<=num; i++){
			if(i%2 == 1)
				sum=sum+i;
		}
		System.out.println("Sum of Odd numbers upto " + num + " is " + sum);
		sc.close();
		//Use While loop to print sum of even numbers up to a given number 
	}

}
