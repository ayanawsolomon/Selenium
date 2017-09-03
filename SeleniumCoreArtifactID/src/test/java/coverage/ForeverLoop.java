package coverage;

import java.util.Scanner;

public class ForeverLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		compare(3,4);
		compare(40,3);
	
	}
	public static void compare(int a, int b){
		if(a>=20 ){
			System.out.println(a + " is greater than 20");
		}else{
			System.out.println(a + " is less than 20");
		}
	}
}
