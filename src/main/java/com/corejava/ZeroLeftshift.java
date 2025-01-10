package com.corejava;

import java.util.Arrays;

public class ZeroLeftshift {

	public static void main(String[] args) {

		int[] a = { 3, 5, 0, 1, 2, 5, 0, 6, 7, 0, 45 };
		int j = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] != 0) {
				if (i > j) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

					++j;
				}
			}
		}

		System.out.println(Arrays.toString(a));
	}

}
