package Jan3;

import java.util.Arrays;

public class SeparateZero {

	public static void main(String[] args) {
		// Write a Java program to separate zeros from non-zeros in an integer array

		int[] arr = { 12, 0, 7, 0, 8, 0, 3 };

		int temp;
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 0) {

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
