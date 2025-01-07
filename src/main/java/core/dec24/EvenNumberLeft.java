package core.dec24;

import java.util.Arrays;

public class EvenNumberLeft {

	public static void main(String[] args) {

		int[] arr = { 7, 8, 9, 67, 4,10, 3, 9, 24,2 };
		int j = 0;
		int temp;
		for (int i = 1; i < arr.length; i++) {
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
