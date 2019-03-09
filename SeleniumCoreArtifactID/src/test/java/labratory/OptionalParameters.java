package labratory;

import java.util.Optional;

public class OptionalParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printMyname(Optional.ofNullable("solomon"));
printMyname(null);
	}
	
	public static void printMyname(Optional<String> name) {
		if(name.isPresent()) {
			System.out.println("a is present " +name.get());
		}else {
			System.out.println("not present");
		}
		
	}

}
