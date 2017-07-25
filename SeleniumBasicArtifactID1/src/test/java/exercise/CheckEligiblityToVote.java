package exercise;

import java.util.Scanner;

public class CheckEligiblityToVote {

	public static void main(String[] args) {
// any one who is 18 and above age can participate on this election 
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.print("What is your age?");
		age=sc.nextInt();
		if(age>=18)
			System.out.println("You are eligible to vote.");
		else
			System.out.println("You are not eligible to vote.");
		sc.close();
	}
	// Write a java program to give grade report: "A" if >85, "B" if >75, "C" if > 55, "D" if >= 45, "F" if <45

}
