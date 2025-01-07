package core.JavaSprint;

import java.util.Arrays;

public class AllZeroToLeft {

	public static void main(String[] args) {

		int arr[] = new int[] { 24, 0, 14, 0, 0, 20, 0, 1, 0, 1, 0 };
		int j = 0, temp;
		for (int i = 0; i < arr.length; i++) {

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
