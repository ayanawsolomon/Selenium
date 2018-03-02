package advancedJava;

import java.util.HashMap;
import java.util.Set;

public class WordCountOnAString {

	public static void main(String[] args) {
		// to count how many times each word is duplicated in java
		String parageraph="is a is not a is no is a is a is";
		String words[]=parageraph.split("\\s+");
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
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
