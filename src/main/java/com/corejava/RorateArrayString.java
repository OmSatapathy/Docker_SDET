package com.corejava;

import java.util.Arrays;
import java.util.Collections;

public class RorateArrayString {

	public static void main(String[] args) {
		
		// string rotate on kth element
		String s = "AutomationTesting";
		
		int k =4;
		
		String s1= s.substring(0,k);
		String s2= s.substring(k, s.length());
		
		String s3 = s2+s1;
		
		System.out.println(s3);
		
		// Array rotate
		
		Integer[] arr = {0,1,2,3,4};
		Collections.rotate(Arrays.asList(arr), 2);
//		System.out.println(Arrays.toString(arr)); //[3, 4, 0, 1, 2]
		
		int[] arr1 = {3,5,9,0,32,4};
		int temp;
		
		for(int i =0; i<arr1.length; i++) {
			temp=arr[0];
			for(int j =0; j<arr1.length-1;j++) {
				arr1[j]=arr[j+1];
			}
			arr1[arr1.length-1]= temp;
		}
	System.out.println(Arrays.toString(arr1));
	}

}
