package com.jan27;

import java.util.Arrays;

public class RotateArrayIndex {

	public static void main(String[] args) {
		int[] arr = { 45, 9, 72, 4, 24, 6, 34 };
		int n = 4;
		int j;
		for (int i = 0; i < n; i++) {
			int first = arr[arr.length - 1];
			for (j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}

			arr[j] = first;
		}

		System.out.println(Arrays.toString(arr));
	}

}
