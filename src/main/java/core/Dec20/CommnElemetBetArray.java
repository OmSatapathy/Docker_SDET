package core.Dec20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommnElemetBetArray {

	public static void main(String[] args) {
		int[] arr = { 12, 35, 1, 10, 24, 17 };
		int[] arr1 = {5,8,20,10,12,35,39,10,16};
		
      Arrays.sort(arr);
 System.out.println(Arrays.toString(arr));
     

		

		for(int i =0; i< arr.length; i++) {
			for(int j =0; j<arr1.length;j++) {
				if(arr[i]==arr1[j]) {
					System.out.println(arr1[j]);
				}
			}
		}
	}

}
