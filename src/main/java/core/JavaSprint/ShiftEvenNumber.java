package core.JavaSprint;

import java.util.Arrays;

public class ShiftEvenNumber {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int j = 0;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
				++j;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = arr.length-1;i>=0; i--) {
			if (arr[i] % 2 == 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
				++j;
			}
		}
		
		
		System.out.println(Arrays.toString(arr));
	}

}
