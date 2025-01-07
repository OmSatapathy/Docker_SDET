package com.jan7;

public class BreakAndSum {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = { 23, 4, 2, 5, 65, 8, 5, 9, 19, 7, 5 };
		boolean fivefound = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 5) {
				{
					fivefound = !fivefound;
					continue;
				}
			}
			if (fivefound!=true) {
				sum = sum + arr[i];
			}
		}

		System.out.println(sum);
	}

}
