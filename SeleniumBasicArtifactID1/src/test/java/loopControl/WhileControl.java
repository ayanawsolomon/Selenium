package loopControl;

public class WhileControl {
	public static void main(String[] Args){
		// printing from 0 up to 10;
		int i=0;
		int sum=0;
		while(i>=10){
			// System.out.println("sum of nu morning " + i + "times" );
			sum= sum + i;
			System.out.println("sum of nubmes from 0 to " + i + " is " + sum);
			i=i+1; //i++;
			
		}
		System.out.println("sum of nubmers up to 10 is " + sum);
		
	}

}
