package Jan3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] a = { 1, 4, 5, 3, 7, 8, 6, 5, 3,4,5,6 };

		// array reverse

		int start = 0;
		int end = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			while (start < end) {

				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;

				start++;
				end--;
			}
		}
		System.out.println(Arrays.toString(a));
		
		// remove duplicate
		
		Set<Integer> set = new HashSet<Integer>();
		for (int val : a) {
			set.add(val);
	
		}
		System.out.println("duplicates: "+ set);
	}

}
