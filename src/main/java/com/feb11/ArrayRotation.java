package com.feb11;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int n = 3;
		int j;
		for (int i = 0; i < n; i++) {
			int first = arr[0];
			for (j = 0; j < arr.length-1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = first;
		}

		System.out.println(Arrays.toString(arr));
	}

}
