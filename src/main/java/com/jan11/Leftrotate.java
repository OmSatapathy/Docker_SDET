package com.jan11;

import java.util.Arrays;

public class Leftrotate {

	public static void main(String[] args) {
		int j;
		int[] arr = { 6, 7, 34, 7, 12, 9, 70 };
		int n = 4;

		for (int i = 0; i < n; i++) {
			int first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = first;
		}

		System.out.println(Arrays.toString(arr));

		String str = "There are many jobs";
		String[] sp = str.split(" ");
		for (int i = 0; i < sp.length; i++) {
			if (sp[i].length() > 0) {
				sp[i] = sp[i].substring(0, 1).toUpperCase() + sp[i].substring(1);
			}
		}

		String value =String.join(" ", sp);
		System.out.println(value);
		
		
		for (int i = 0; i < sp.length; i++) {
			if (sp[i].length() > 0) {
				sp[i] = sp[i].substring(0, 1)
						+Character.toUpperCase(sp[i].charAt(1))
						+sp[i].substring(2);
			}
		}

		String value1 =String.join(" ", sp);
		System.out.println(value1);
	}

}
