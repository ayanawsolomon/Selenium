package labratory;

import java.util.Scanner;

public class CodeCoverageTicketing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ticketProcess("Neges");
		ticketProcess("Danat");
		ticketProcess("Kidist");

	}
public static void ticketProcess(String name){
	/* Ask: “What type of ticket do you require, single or return?”
			IF the customer wants ‘return’
			Ask: “What rate, Standard or Cheap-day?”
			IF the customer replies ‘Cheap-day’
			Say: “That will be £11:20”
			ELSE
			Say: “That will be £19:50”
			ENDIF
			ELSE
			Say: “That will be £9:75”
			ENDIF
			*/
	int a =10;
	int  b=0;
	int c =a/b;
	System.out.println(c);
	System.out.print("Hi " + name + ", What type of ticket do you require, single or return?");
	Scanner sc = new Scanner(System.in);
	String trip = sc.nextLine();
	if(trip.contains("return")){
		System.out.print("What rate, Standard or Cheap-day?");
		String rate = sc.nextLine();
		if(rate.contains("Cheap-day")){
			System.out.println("That will be £11:20");
		}else{
			System.out.println("That will be £19:50");
		}
		
	}else{
		System.out.println("That will be £9:75");
	}
}
	
}
