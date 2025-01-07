package com.jan7;

public class Secondmax {

	public static void main(String[] args) {
		int temp;
		int[] arr = { 23, 4, 45, 65, 8, 9, 19, 77,5 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		System.out.println(arr[arr.length-2]);
		
		int val =arr[1];
		System.out.println(val);
	}

}
