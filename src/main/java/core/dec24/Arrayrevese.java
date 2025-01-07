package core.dec24;

import java.util.Arrays;

public class Arrayrevese {

	public static void main(String[] args) {
		int[] nums = { 3, 1, 3, 4, 2 };

		int start=0;
		int end = nums.length-1;
		int temp;
		
		while(start<end) {
			temp= nums[start];
			nums[start] = nums[end];
			nums[end]= temp;
			
			start++;
			end--;
			
		}
		
		System.out.println(Arrays.toString(nums));
	}

}
