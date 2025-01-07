package Jan3;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {
		  String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		  
	        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
	        
	        Set<String> set = new HashSet<String>();
	        Set<String> set1 = new HashSet<String>();
	        Set<String> inter = new HashSet<String>();
	        
	        for(String val : s1) {
	        	set.add(val);
	        	
	        }
	        for(String val1 : s2) {
	        	set1.add(val1);
	        	
	        }
	        
	        
	        for(String val : set) {
	        	if(set1.contains(val)) {
	        		inter.add(val);
	        	}
	        }
	        
	        System.out.println(inter);
	
	        Set<String> intersection = new HashSet<>(set);
	        intersection.retainAll(set1);
	        
	        System.err.println(intersection);

	}

}
