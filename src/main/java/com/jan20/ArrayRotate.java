package com.jan20;

import java.util.Arrays;

public class ArrayRotate {

	public static void main(String[] args) {

		int[] arr = { 8, 9, 53, 62, 19, 23, 18, 34 };
		int num = 3;
		int j;
		for (int i = 0; i < num; i++) {
			int first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];

			}
			arr[j] = first;
		}

		System.out.println(Arrays.toString(arr));

		int[] arr1 = { 8, 9, 53, 62, 19, 23, 18, 34 };
		int first = 0;
		int last = arr1.length - 1;

		while (first < last) {
			int temp = arr1[first];
			arr1[first] = arr1[last];
			arr1[last] = temp;

			first++;
			last--;

		}

		System.out.println(Arrays.toString(arr1));

		int[] arr2 = { 8, 9, 53, 62, 19, 23, 18, 34 };
		int k = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {
				
					int temp = arr2[i];
					arr2[i] = arr2[k];
					arr2[k] = temp;
			

				++k;
			}
		}

		System.out.println(Arrays.toString(arr2));
	}

}
