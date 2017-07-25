package basicJavaDecitionMaking;

public class IFElseConditon {

	public static void main(String[] args) {
		// using if else statement to give grade report 
		// >=80 score A, who scores >=99, A+ 
		// 80 > x >= 70 , then score B
		// 70 > x >= 60 , then score C
		// 60 > x > 50 , then core D
		// 50> x >=0, then score F
		int grade =100;//81==>A,65==>c, 76==>B, 54==> D, 45==> F, 101==>out, 99==>A+ -4
		if(grade > 100){
			System.out.println("result is out of range");
			
		}else if(grade >= 80){
			if(grade >= 99){
				System.out.println("you score A+");
			}else{
			System.out.println("you score A");
			}
		}else if(grade >70){
			System.out.println("you score B");
			// any cpode 
		}else if(grade > 60){
			System.out.println("you score C");
		}else if(grade > 50 ){
			System.out.println("you score D");
		}else if(grade > 0){
			System.out.println("You score F");
		}else if(grade < 0){
			System.out.println("out of range");
		}
	
	}

}
