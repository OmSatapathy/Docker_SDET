package core.Dec20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ChacterOccurence {

	public static void main(String[] args) {
		String s= "Automation";
		char[] ch = s.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (char c : ch) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		

		for(Map.Entry<Character, Integer> map : hm.entrySet()) {
			if(map.getValue()>1) {
				System.out.println(map.getKey() +" "+ map.getValue());
				
			}
			else {
				System.out.println(map.getKey() +" "+ map.getValue());
			}
		}
	}

}
