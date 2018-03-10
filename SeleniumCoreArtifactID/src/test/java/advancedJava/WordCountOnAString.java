package advancedJava;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WordCountOnAString {

	public static void main(String[] args) {
		// to count how many times each word is duplicated in java
		String parageraph="Writing in the Java programming language"
				+ " is the primary way to produce code that will be "
				+ "deployed as byte code in a Java virtual machine (JVM);"
				+ " byte code compilers are also available for other languages,"
				+ " including Ada, JavaScript, Python, and Ruby. In addition, several"
				+ " languages have been designed to run natively on the JVM, including Scala,"
				+ " Clojure and Apache Groovy. Java syntax borrows heavily from C and C++, "
				+ "but object-oriented features are modeled after Smalltalk and Objective-C.[10] "
				+ "Java eschews certain low-level is constructs such as pointers and has a very simple"
				+ " memory model where objects are allocated on the heap (while some implementations "
				+ "e.g. all currently supported by Oracle, may use escape analysis optimization to"
				+ " allocating on the stack instead) and all variables of object types are references."
				+ " Memory management is handled through integrated automatic garbage "
				+ "collection performed by the JVM.";
		
		
		
		String words[]=parageraph.split("\\s+");
		Map<String, Integer> hs = new TreeMap<String, Integer>(); // you may use HashMap if you do not need sorted keys
		for(int i=0; i <words.length; i++) {
			if(hs.get(words[i]) != null) {
			hs.put(words[i], hs.get(words[i]) +1);
			}else {
				hs.put(words[i],1);
			}
		}
		Set<String> s = hs.keySet();
		for(String m :s) {
			System.out.println(m + "-------" + hs.get(m));
		}
	}

}
