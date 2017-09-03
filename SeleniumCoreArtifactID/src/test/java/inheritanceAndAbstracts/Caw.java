package inheritanceAndAbstracts;

public class Caw extends Animal{
	public Caw(boolean isMammal, boolean isCarnivorus){
		super(isMammal, isCarnivorus);
	}
public String getGreeting(){
	return "MUhahahahahha";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caw c = new Caw(true, false);
		c.printAnimal("buraburie");

	}

}
