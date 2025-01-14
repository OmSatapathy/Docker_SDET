package com.jan11;

import java.util.Arrays;

public class MoveZero {

	public static void main(String[] args) {
		
		int[] a = {23,4,0,1,3,0,7,0,1,3,1};
		
		int j=0; 
		int temp;
		for(int i =0; i<a.length;i++) {
			if(a[i]==0) {
				temp= a[i];
				a[i] =a[j];
				a[j] =temp;
				
				++j;
			}
		}
		
		System.out.println(Arrays.toString(a));

	}

}
