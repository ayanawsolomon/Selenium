package mediumJavaClassObject;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registraion r = new Registraion ();
	
		Registraion.registor("Solomon","Habtua",34, "3017929864"  );
		r.printStudentInformation();
		
		Registraion r2 = new Registraion ();
		
		r2.registor("John","Alex",34, "22222222"  );
		r2.printStudentInformation();
		Registraion r3 = null;
		r3.registor("Piter", "Luwi", 32, "33435");
		r3.printStudentInformation();
	}

}
