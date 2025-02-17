package com.jan27;

public class ReveseNumber {

	public static void main(String[] args) {
		int sum = 0;
		int num = 25414;
		while (num > 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;

		}

		System.out.println(sum);
		
		String[] arr = {"ravi","bikash","eti","manish","akash","ganga"};
		for(int i =0; i< arr.length; i++) {
			for(int j =i+1; j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
					
				}
			}
		}

		for(String s : arr) {
			System.out.println(s);
		}
	}

}
