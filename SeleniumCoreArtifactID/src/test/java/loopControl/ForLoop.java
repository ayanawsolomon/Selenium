package loopControl;

public class ForLoop {

	public static void main(String[] args) {
		// using for loop to print 1 up to 100
		int sum=0;
		for(int i=0; i<=100; i++){ // i++ same to as i=i+1
			//System.out.println(i);
			sum = sum + i;
			
			if(i==5){
				System.out.println("I am in the middle of iteration");
				continue;
			}
			System.out.println("sum of nubmers from 0 up to " + i + " is " + sum);
			// System.exit(0);

		}
		System.out.println("sum of numbers form 1 up to 100 is " + sum);

	}

}
