package com.jan7;

import java.util.Arrays;

public class ZeroToRight {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 0, 7, 3, 7, 0, 33, 0, 9 };
		int[] arr1 = { 4, 2, 5, 0, 7, 3, 7, 0, 33, 0, 9 };
		int j = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				++j;
			}

		}

		System.out.println(Arrays.toString(arr));

		// move to left

		int j2 = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 0) {
				int temp = arr1[i];
				arr1[i] = arr1[j2];
				arr1[j2] = temp;

				++j2;
			}

		}

		System.out.println(Arrays.toString(arr1));
	}
}
