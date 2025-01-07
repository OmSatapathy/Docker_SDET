package core.dec30;

import java.util.HashSet;
import java.util.Set;

public class IntersectionArray {

	public static void main(String[] args) {
	// intersection of 2 array
		
		int[] arr= {23,4,63,89,73,9,15,7};
		int[] arr1= {89,3,41,3,73,91,9};
		
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> duplicate = new HashSet<Integer>();
		
		for(int val : arr) {
			set.add(val);
		}
		
		for(int val: arr1) {
			if(set.contains(val)) {
				duplicate.add(val);
			}
		}
		

		System.out.println();
		System.out.println("intersection :" + duplicate);
	}

}
