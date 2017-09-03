package labratory;

import java.util.Scanner;

public class AllowAndProhobit {

	public static void main(String[] args) {
		// the following program restricts to buy bear based on your age
//   age=45, age =105, age =12,
		
		rules(45);
		rules(95);
		
		
	
//branch > conditon  > statement
	}
	public static void rules(int age){
		if(age >=18 && age < 90){
			System.out.println("You can drink bear");
		}else{
			System.out.println("plese come next day");
		}
		if(age ==45){
			System.out.println("your should ask your father");
		}
	}

}
