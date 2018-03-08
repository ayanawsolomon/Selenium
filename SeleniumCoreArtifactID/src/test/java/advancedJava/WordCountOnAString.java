package advancedJava;

import java.util.HashMap;
import java.util.Set;

public class WordCountOnAString {

	public static void main(String[] args) {
		// to count how many times each word is duplicated in java
		String parageraph="In 2004, Kohsuke Kawaguchi was a Java developer"
				+ " at Sun. Kawaguchi became tired of breaking builds in his"
				+ " development work and wanted to find a way to know, before"
				+ " committing code to the repository, whether the code was going"
				+ " to work. So Kawaguchi built an automation server in and for "
				+ "Java to make that possible, called Hudson. Hudson became popular"
				+ " at Sun, and spread to other companies as open source";
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
