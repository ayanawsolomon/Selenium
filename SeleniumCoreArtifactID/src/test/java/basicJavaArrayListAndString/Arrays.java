package basicJavaArrayListAndString;

public class Arrays {

	public static void main(String[] args) {
		// comments
//		String name1="Solomon";
//		String name2="John";
//		String name3="Sara";
//		// 1000 variables for 1000 studetns 
//		System.out.println(name1);
//		System.out.println(name2);
//		System.out.println(name3);
		String[] name = {"Solomon", "John", "Sara"};
		int[] age = new int[3];
		age[1]= 34;
		age[0]= 23;
		age[2]= 25;
		age[1]=50;
//		System.out.println(name[0]);
//		System.out.println(name[1]);
//		System.out.println(name[2]);
		String[][] st = new String[3][2];
		st[0][0]="solomon";
		st[0][1]="Habtu";
		st[1][0]="John";
			
		st[1][1]= "Piter";

		for(int i=0; i <=2; i++){
			System.out.println(name[i] + " ---- "  + age[i]);

		}



		for(int i=0; i <=2; i++){
			for(int j=0; j<=1; j++){
				System.out.print(st[i][j] + "----");

			}
			System.out.println("");

		}
	}

}
