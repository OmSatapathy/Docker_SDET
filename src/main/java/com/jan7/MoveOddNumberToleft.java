package com.jan7;

import java.util.Arrays;

public class MoveOddNumberToleft {

	public static void main(String[] args) {

		int[] arr = { 3, 84, 5, 7, 9, 90, 45, 1, 6, 43, 91 };
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 2) == 0) {

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				++j;
			}
		}

		System.out.println(Arrays.toString(arr));
		
		for(int i =0; i<arr.length; i++) {
			for(int k =i+1; k<arr.length; k++) {
				if(arr[i]> arr[k]) {
					int temp = arr[i];
					arr[i]= arr[k];
					arr[k]= temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		int sencond =arr[arr.length-2];
		System.out.println(sencond);
	}

}
