package com.feb11;

import java.util.Arrays;

public class ArrayEqual {

	public static void main(String[] args) {

		int[] arr = { 45, 51, 28, 75, 49, 42 };
		int[] arr1 = { 75, 28, 51, 42, 45, 49 };

		// check equal or not

		if (arr.length == arr1.length) {
			Arrays.sort(arr);
			Arrays.sort(arr1);

			boolean val = Arrays.equals(arr, arr1);

			if (val == true) {
				System.out.println("both are anagram");
			} else {
				System.out.println("not angram");
			}
		}

	}

}
