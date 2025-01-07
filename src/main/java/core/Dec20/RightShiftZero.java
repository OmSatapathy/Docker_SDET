package core.Dec20;

import java.util.Arrays;
import java.util.List;

public class RightShiftZero {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 8, 3, 0, 23, 0, 7, 0 };
		int j = 0, temp ;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				if(i!=j) {
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				++j;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
