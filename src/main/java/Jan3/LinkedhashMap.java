package Jan3;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashMap {

	
// Linkedhasgmap maintain oder of interstion and retrival
// don't accept duplicate key
	
	public static void main(String[] args) {
		
		Map<Integer, String> hm =new LinkedHashMap<Integer, String>();
		hm.put(1, "komal");
		hm.put(3, "sunny");
		hm.put(3, "munny");
		hm.put(2, "paban");
		hm.put(8, "manav");
		
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			int key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println(key  + val );
			
			
			
		}
		

	}

}
