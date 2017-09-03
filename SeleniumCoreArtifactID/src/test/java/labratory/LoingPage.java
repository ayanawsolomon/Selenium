package labratory;

import java.util.Scanner;

public class LoingPage {

	public static void main(String[] args) throws InterruptedException {
		// this program is to let the customer login to the system 
		// if the customer fails for 4 times, he/she should be locked for 1min
		Scanner sc = new Scanner(System.in);
		int attempt=0;
		String name;
		while(attempt<=4){
			if(attempt ==0){
				System.out.println("Well come our customer!!!");
				System.out.print("Enter your name");
				name =sc.nextLine();

			}else{
			System.out.print("Error try agina round " + attempt);
			name =sc.nextLine();
			}
			if(name.equals("sol")){
				System.out.println("Wel come solomon");
				System.exit(0);
			}
			
			System.out.println();
			attempt++;
			if(attempt ==4){
				System.out.println("Sorry I am going to lock you for 1 min");
				Thread.sleep(10000);
				attempt =0;
			}

		}

	}

}
