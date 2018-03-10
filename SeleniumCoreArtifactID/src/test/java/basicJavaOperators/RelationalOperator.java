package basicJavaOperators;

import cucumber.api.java.cs.A;

public class RelationalOperator {

	public static void main(String[] args) {
		// Logical Operator, is combining two relational operations <, >, <=, >=, 
		// && , [true/false] && [true/false]
		// ||, [true/false] || [true/false]
		// is (a > b and b> c), we need for such type logical operators 
				// && for and operator, and || or Operator 
				//( is (a> b a|| a <c)
		
		int one =1;
		int seven = 7;
		int ten = 10;
		boolean t1= (one == seven); // false
		boolean t2 = (one < ten); // true 
		boolean t3 = t1 && t2; // is one == seven? and one < ten?
		System.out.println(t3);
		t3 = t1 || t2; // is one == seven? or one < ten?
		System.out.println(t3);
	
			
		}

	}


