package basicJavaOperators;

public class ConditonalOperators {

	public static void main(String[] args) {
		// Applying conditional operator
		//Syntax is 
		// (expression) ? value if expression is true : Value if expression is false;
		int one = 1;
		 int seven = 7;
		 int ten = 10;
		 boolean t1  = (one > seven);  // false
		 boolean t2 = (one <ten); // true
		 System.out.println((one > seven)) ;
		 System.out.println((one + 10 > seven* 2)? "that is true" : "that is false");
	}

}
