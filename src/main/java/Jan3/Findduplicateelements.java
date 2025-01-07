package Jan3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Findduplicateelements {

	public static void main(String[] args) {

		
		int[] arr = { 23, 4, 6, 9, 32, 4, 2, 4, 45, 2, 23 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

		// using set

		Set<Integer> original = new HashSet<Integer>();
		Set<Integer> duplacte = new HashSet<Integer>();
		for ( int val : arr) {
			if (!original.add(val)) {
				duplacte.add(val);
			}

		}
    
		for(int val : arr) {
			original.add(val);
		}
		System.out.println("original value: "+ original);
        System.out.println("duplicate using set: "+ duplacte);
        
        
        // using HashMap
        
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : arr) {
        	map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> value : map.entrySet()) {
        	if(value.getValue()>1) {
        		System.out.println(value.getKey() +" ->"+ value.getValue());
        	}
        }
	}

}
