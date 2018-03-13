package MiniCalculatorTDDGroupID.MiniCalculatorTDDArtifactID;

public class Calculator {
	// take two numbers and  do + , -. * , /, % result 
int rslt;
	public int addition(int i, int j) {
		// adding two numbers 
		rslt = i + j ;
		return rslt;
		
	}
	public void printUpTo10(){
	for(int m=0; m<=10; m++)
		System.out.println("currnet number is " + m);
	}	
	public void thisIShacekersCode(){
		// bad code
	}

	public int subtruction(int i, int j) {
		// this program take tow numbers and give use subtraction result
		rslt = i - j;
		return rslt;
	}
	
	public int multipilication(int i, int j) {
		// Method to multiply tow numbers and return you result
 		rslt= i * j;
		return rslt;
	}

	public Object division(int i, int j) {
		// TODO Auto-generated method divide numbers
		// you need two test case for statement coverage 
		// to cover the branch you need to have two test case
		int result =0;
			if(j==0 || i==1.5){
				return "Error!!"; 
			}else{
				result= i/j;
				return result;
			}
		
		
}
	
	public int rem(int a, int b){
		// Reminder of nubmers
		rslt= a%b;
		return rslt;
	}
	public void vairus(){
		for(int m=0; m<=10; m++){
			// write your code here to make fun
			// this is a virus 
		}
	}
	
	

}
