package core.Dec20;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s = "GangaJamuma river";
		char[] ch = s.toLowerCase().toCharArray();
		
		
		Set<Character> original = new HashSet<>();
		Set<Character> dupliacte = new HashSet<>();
		
		for (char c : ch) {
			if(!original.add(c)) {
				dupliacte.add(c);
			}
		}
		
		System.out.println(dupliacte);
	}

}
