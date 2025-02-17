package com.feb11;

public class SumofDigit {

	public static void main(String[] args) {
		String s = "aa11b83";
		char[] ch = s.toCharArray();
		int sum = 0;

		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				sum = sum + Character.getNumericValue(ch[i]);
			}
		}
		System.out.println(sum);

		String[] arr = { "rakesh", "sam", "laxman", "arjun", "ganga" };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (String str : arr) {
			System.out.print(str + " ");
		}
	}

}
