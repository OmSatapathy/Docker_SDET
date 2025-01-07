import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<String, Integer> mp = new HashMap<>();
		mp.put("raju", 1);
		mp.put("raju1", 13);
		mp.put("raju3", 14);
		mp.put("raj4u", 15);
		
		for (Map.Entry<String, Integer> entry : mp.entrySet()) {
			String key = entry.getKey();
			int val = entry.getValue();
			
			System.out.println(key +"  " +val);
		
			
		}

		
		
		String s = "automation";
		boolean val=     s.matches(".*[xyz].*");
		System.out.println(val);
		
		String p = "good";
		String p1=  "ogod";
		
		char[] ch = p.toCharArray();
		char[] ch1= p1.toCharArray();
		
		if(ch.length==ch1.length) {
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
		 boolean value=	Arrays.equals(ch, ch1);
		 
		 if(value== true) {
			 System.out.println("are angram");
		 }
		 else {
			 System.out.println("not angaram");
		 }
		}
		
	}

}
