import java.util.HashMap;
import java.util.Map;

public class CharcterOccurance {

	public static void main(String[] args) {
		
		String s= "auttommattiooooonin";
		
		char[] ch = s.toCharArray();
		
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char c : ch) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}

		for(Map.Entry<Character, Integer> map : hm.entrySet()) {
			if(map.getValue()>1) {
				System.out.println(map.getKey() + " " + map.getValue());
			}
			if(map.getValue()==1) {
				System.out.println(map.getKey() + " " + map.getValue());
			}
		}
	}

}
