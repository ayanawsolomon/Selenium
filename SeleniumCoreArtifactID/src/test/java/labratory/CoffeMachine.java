package labratory;

public class CoffeMachine {

	public static void main(String[] args) {
		
		coffeMachine("solomon", "Milk", false, "Large");
		coffeMachine("Rkha", "Coffe", true, "Small");
		coffeMachine("Jay", "Tea", false, "Small");
//dfsd sdf


	}
	
	
	public static void coffeMachine(String name, String whatDoYouWant,Boolean suger,String size ){
		System.out.println("Boile water");
		System.out.println("mix with the input ");
		System.out.println("Drain the hot drink");
		System.out.println("HI " + name + "!!!");
		if(size =="Large" && suger==true ){
			System.out.println("Enjoy your large size" +  whatDoYouWant + " With  with suger ");

		}else{
			System.out.println("Enjoy your small size" +  whatDoYouWant + " With tithout suger ");

		}
		
		
	}

}
