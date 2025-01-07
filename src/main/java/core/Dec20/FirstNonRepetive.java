package core.Dec20;

import java.util.HashMap;

public class FirstNonRepetive {

	public static void main(String[] args) {
		String s = "Automationt";
		char[] ch = s.toLowerCase().toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c : ch) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		
		for (char c : ch) {
			if(hm.get(c)==1) {
				System.out.println(c);
			}
		}

	}

}
