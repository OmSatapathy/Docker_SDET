package Jan3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupingBylength {

	public static void main(String[] args) {
	String[] animal = {"owl","cat","mongoes","peagion","elephent","tiger","lio","zebra","pi","elephent","tiger","lio","pi"};
	
	//group by length
	
	     List<String> animals  =Arrays.asList(animal);
	     Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
	     
	     for(String str: animals) {
	    	 int len= str.length();
	    	 hm.put(len, hm.getOrDefault(len, 0)+1);
	     }
	     
	     for(Map.Entry<Integer, Integer> mp: hm.entrySet()) {
	    	 System.out.println("animal by length"+ mp.getKey()+" ->" + mp.getValue());
	     }
	     
	     
	     Map<String, Integer> hm1 = new HashMap<String, Integer>();
	     
	     for(String sp: animals) {
	    	 hm1.put(sp, hm1.getOrDefault(sp, 0)+1);
	    	 
	     }
	     
	     for(Map.Entry<String, Integer> mp1 : hm1.entrySet()) {
	    	 System.out.println(mp1.getKey() +" ->" + mp1.getValue());
	     }
	}

}
