package inheritanceAndAbstracts;

public class Cat extends Animal {
	
	public Cat(boolean isMammal, boolean isCarnivorus){
		super(isMammal, isCarnivorus);
	}
	public String getGreeting(){
		return "Mew";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat(true, true);
		c.printAnimal("littleCat");

	}

}
