package com.corejava;

public class BreakContinue {

	public static void main(String[] args) {
		
		int[] a = {23,4,6,98,5,79,65,5,43,1};
		boolean flag = false;
		int sum=0;
		for(int i =0 ; i< a.length; i++) {
			
			if(a[i]==5) {
				flag=true;
				continue;
			}
			if(!flag) {
				sum =sum+a[i];
			}
		}
		
		System.out.println(sum);
		

	}

}
