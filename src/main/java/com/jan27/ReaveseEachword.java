package com.jan27;

public class ReaveseEachword {
	public static void main(String[] args) {
		String str = "bhubaneswar is the holy city";
		String[] sp = str.split(" ");
		StringBuilder result = new StringBuilder();

		for (String s : sp) {
			StringBuilder rev = new StringBuilder(s).reverse().append(" ");
			result.append(rev).append(" ");
		}

		System.out.println(result);
		String str1 = "bhubaneswar is the holy city";
		String[] sp1 = str1.split(" ");

		StringBuilder result1 = new StringBuilder();
		for (String s1 : sp1) {
			s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
			result1.append(s1).append(" ");
			
		}
		
		System.out.println(result1);
	}

}
