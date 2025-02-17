package com.feb11;

import java.util.Arrays;

public class ArrayRev {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int first = 0;
		int last = arr.length - 1;
		while (first < last) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;

			first++;
			last--;

		}

		System.out.println(Arrays.toString(arr));

		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int i = 0, j = 0;
		while (arr1[i] % 2 != 0) {
			int temp = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp;

			j--;
		}

		System.out.println(Arrays.toString(arr1));

	}

}
