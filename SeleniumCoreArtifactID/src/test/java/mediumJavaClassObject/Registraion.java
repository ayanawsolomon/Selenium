package mediumJavaClassObject;

 class  Registraion {
	Registraion(){
		System.out.println("this is constructor");
	}
	   static String firstName;
	private static  String lName;
	 private static int age;
	private static  String department ="Computer Science";
	private static int year = 2017;
	 private static String  phoneNo;
	public static void registor(String fName, String lName, int age, String phone){
		firstName = fName;
		lName= lName;
		age = age;
		phoneNo =phone;
	}
	public static void  printStudentInformation(){
		System.out.println("My full name is :" + firstName  + " " + lName);
		System.out.println("I am "  + age + " years onld ");
		System.out.println("I would like to attend " + department + "  program in " + year);
		System.out.println("Please call me  :" + phoneNo);

	}

}
