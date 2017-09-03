package exercise;

import java.util.Scanner;

public class FahrenheitToCelSius{
	public static void main(String[] Args){
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = sn.nextDouble();
		
		double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
		System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " in Celsius");
		sn.close();
	}

}
