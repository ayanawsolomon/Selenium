package inheritanceAndAbstracts;

public class Dog extends Animal{
	public Dog(boolean isMammal, boolean isCarnivorous) {
		super(isMammal, isCarnivorous);
		// TODO Auto-generated constructor stub
	}

	public String getGreeting(){
		return "Huff";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog(true, true);
		d.printAnimal("Dog");

	}

}
