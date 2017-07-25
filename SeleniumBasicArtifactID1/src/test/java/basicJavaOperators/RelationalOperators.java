package basicJavaOperators;

public class RelationalOperators {

	public static void main(String[] args) {
		// Relational Operators
		// ==, !=, >, <, >=, <=
		int seven = 7;
		int ten = 10;
		
		//(firstValue R-Operator secondValue)
		System.out.println("is " + seven + " == " + ten + "?" +  (seven == ten)    );
		System.out.println("is " + seven + " != " + ten + "?" +  (seven != ten)    );
		System.out.println("is " + seven + " >" + ten + "?" +  (seven > ten)    );
		System.out.println("is " + seven + " >= " + ten + "?" +  (seven >= ten)    );
		System.out.println("is " + seven + " < " + ten + "?" +  (seven < ten)    );
		System.out.println("is " + 10 + " <= " + ten + "?" +  (10 <= ten)    );
		
		// is (a > b and b> c), we need for such type logical operators 
		// && for and operator, and || or Operator 
		//( is (a> b a|| a <c)
		
	}

}
