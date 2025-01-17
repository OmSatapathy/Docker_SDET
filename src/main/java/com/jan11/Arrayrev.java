package com.jan11;

import java.util.Arrays;

public class Arrayrev {

	public static void main(String[] args) {
		int[] arr1 = { 41, 52, 23, 92, 44, 55, 62, 74, 18, 5 };

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

		int[] arr2 = { 41, 52, 23, 92, 44, 55, 62, 74, 18, 5 };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {

				if (arr2[i] > arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;

				}

			}
		}
		System.out.println(Arrays.toString(arr2));
		int seond = arr2[arr2.length - 2];
		System.out.println(seond);
	}

}
