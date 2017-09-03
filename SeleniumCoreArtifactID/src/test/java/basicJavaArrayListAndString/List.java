package basicJavaArrayListAndString;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		// is used to store unknown size of array;
		ArrayList name = new ArrayList();
		name.add("Solomon");
		name.add("Sara");
		name.add("John");
		name.add("Piter");
		name.add("Daniel");
		name.add("Dawit");
		name.add("Solomon");
		name.add("Sara");
		name.add("John");
		name.add("Piter");
		name.add("Daniel");
		name.add("Dawit");
//		for(int i=0; i<name.size(); i++){
//		System.out.println(name.get(i));
//		}
		Iterator itr = name.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		

	}

}
