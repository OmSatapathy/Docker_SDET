package core.dec30;

import java.util.HashSet;
import java.util.Set;

public class SumOfDistinctNumber {

	public static void main(String[] args) {
	
		int sum=0;
		int[] arr = {7,8,7,3,5,2,7,5,1};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (int val : arr) {
			set.add(val);
		}

		System.out.println(set);
		
		for (int integer : set) {
			sum = sum+ integer;
		}
		
		System.out.println(sum);
	}

}
