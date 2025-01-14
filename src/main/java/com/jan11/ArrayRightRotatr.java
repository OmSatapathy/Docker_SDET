package com.jan11;

import java.util.Arrays;

public class ArrayRightRotatr {

	public static void main(String[] args) {
		int[] arr1 = { 41, 52, 23, 44, 55, 62, 74, 18, 92 };
		int n = 3;
		int j = 0;

		for (int i = 0; i < n; i++) {
			int last = arr1[arr1.length - 1];
			for (j = arr1.length - 1; j > 0; j--) {
				arr1[j] = arr1[j - 1];
			}
			arr1[0] = last;
		}

		System.out.println(Arrays.toString(arr1));

		String str = "same hello dame";
		String[] sp = str.split(" ");

		for (int i = 0; i < sp.length; i++) {
			if (sp[i].length() > 0) {
				sp[i] = sp[i].substring(0, 1).toUpperCase() + sp[i].substring(1);
			}
		}

		String result = String.join(" ", sp);
		System.out.println(result);

		for (int i = 0; i < sp.length; i++) {
			if (sp[i].length() > 1) {
				sp[i] = sp[i].substring(0, 1) +
						Character.toUpperCase(sp[i].charAt(1)) 
				        + sp[i].substring(2);

			}
		}
		String secondCapital = String.join(" ", sp);
		System.out.println(secondCapital);
	}

}
