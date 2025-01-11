package com.jan7;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		
		// left rotate
		int[] a = {4,5,6,89,78,31,9};
		int n =4;
		int j;
		for(int i =0; i< n; i++) {
			int first= a[0];
			for( j= 0; j<a.length-1; j++) {
				      a[j]=a[j+1];
			}
		
			a[j]=first;
		}
		
		System.out.println(Arrays.toString(a));
		
		
		// right rotate
		
		int[] arr = {4,5,6,89,78,31,9};
		
		
		for(int i =0 ; i<n; i++) {
			int last = arr[arr.length-1];
			for(int k= arr.length-1; k>0; k--) {
				arr[k]=arr[k-1];
			}
			arr[0]=last;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
