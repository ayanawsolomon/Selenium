package basicJavaArrayListAndString;

public class StringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting = "Hellow world";
		System.out.println(greeting);
		// passing string from array
		char[] helloArray = {'h', 'e', 'l','l', 'o'};
		String helloString = new String(helloArray);
		System.out.println(helloString);
		int len= helloString.length();
		char charAt= helloString.charAt(1);
		String newString= helloString.concat(" World");
		System.out.println(newString);
		
		if(newString.contains("solomon")){
			System.out.println("variable contains my string");
		}else{
			System.out.println("Varialbe not contains Hello");
		}

	}

}
