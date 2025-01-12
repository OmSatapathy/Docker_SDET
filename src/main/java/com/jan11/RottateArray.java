package com.jan11;

import java.util.Arrays;

public class RottateArray {

	public static void main(String[] args) {
		
		int[] arr= {41,52,23,44,55,62,74,18,92};
		int n=3;
		int j;
		for(int i =0; i<n;i++) {
			int first= arr[0];
			for( j =0 ; j< arr.length-1;j++) {
				arr[j]= arr[j+1];
			}
			arr[j]=first;
		}

		System.out.println(Arrays.toString(arr));
		
		
	}
	


}
