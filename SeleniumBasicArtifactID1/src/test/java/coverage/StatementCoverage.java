package coverage;

public class StatementCoverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comparision(10,5);
		comparision(5,10);
		comparision(-1,5);
		// 100% brachn/ edege /decition coverage can cover 100% condition coverage , can cover 100% statement
	}
	public static void comparision(int a, int b){
		if(a > b || a>0){
			System.out.println("I am fine");
		}
		
	}

}
