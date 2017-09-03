package inheritanceAndAbstracts;

public class Runner {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caw caw = new Caw(true, false);
		Cat cat = new Cat(true, true);
		Dog dog = new Dog(true, true);
		caw.printAnimal("LittleCaw");
		cat.printAnimal("LittleCat");
		dog.printAnimal("BigDog");
		

	}

}
