package TDDminiCalculatorJunitTestCases;

public class Cal123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// define two numbers num1 and num2
		String[] name = {"Solomon ", "Rony ", "Jay ", "Sara "};
		int[] regularsalary={1000, 1200, 1650,2000};
		int[] overtimesalary={1000, 800, 600, 200};
		
		for(int i=0; i<=3; i=i+1 ){
			addition(regularsalary[i],overtimesalary[i]);
			System.out.println(name[i]);

		}
	
		// using while loop
		int j=0;
		while(j<=3){
			
			addition(regularsalary[j],overtimesalary[j]);
			System.out.println(name[j]);
			if(name[j].contains("Jay")){
				//System.exit(0);
				j=4;
			}
			j++;

			
		}
		
		// mul two npo
		
		// divi two no
		// rem of two no

	}
	
	public static void addition(int a, int b){
		int sum = a + b;
		System.out.print(a + "+"+ b +"=" + sum);
	}

}
