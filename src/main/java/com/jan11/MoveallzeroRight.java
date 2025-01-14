package com.jan11;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MoveallzeroRight {

	public static void main(String[] args) {
		int[] a = { 1, 0, 7, 0, 4, 0, 5, 0 };
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				int temp = a[i];

				a[i] = a[j];
				a[j] = temp;

				++j;
			}
		}

		System.out.println(Arrays.toString(a));
		
		
		
	}

	
	// odd even
	
	@Test
	public void oddEven() {
		int[] a1 = {1,2,3,4,5,6,7,8};
		int j=0;
		for(int i =0; i< a1.length; i++) {
			if(a1[i]%2!=0) {
				int temp = a1[i];
			
				a1[i] = a1[j];
				a1[j]= temp;
				
				j++;
			}
		}
		System.out.println(Arrays.toString(a1));
	}
	
	
	
}
