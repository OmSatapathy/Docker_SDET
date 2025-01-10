package com.corejava;

import java.util.Arrays;
import java.util.List;

public class ArrayRotate {

	public static void main(String[] args) {

		// left shift
		int[] a = { 3, 6, 8, 3, 9, 42, 4 };

		int n = 4;
		int j;
		for (int i = 0; i < n; i++) {
			int first = a[0];
			for (j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[j] = first;
		}

		System.out.println(Arrays.toString(a));

		// right shift

		int[] a1 = { 3, 6, 8, 3, 9, 42, 4 };

		for (int i = 0; i < n; i++) {
			int first = a1.length - 1;
			for (j = 0; j < a1.length - 1; j++) {
				a1[j + 1] = a1[j];
			}

			a1[j] = first;
		}

		System.out.println(Arrays.toString(a1));

		String s = "Om prakash satap";
		int len = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				break;
			} else {
				len++;
			}
		}
		System.out.println(len);
		
		
		String[] sp = s.split(" ");
		
		int middle = sp.length/2;
		
		String middleword = sp[middle];
		System.out.println(middleword.length());
		
		
		
		
	}

}
