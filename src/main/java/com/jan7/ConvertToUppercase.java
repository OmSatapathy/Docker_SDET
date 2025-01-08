package com.jan7;

public class ConvertToUppercase {

	public static void main(String[] args) {

		String s = "we are working as engineer";
		// 2nd letter convert to upper case

		String[] sp = s.split(" ");
		StringBuilder result = new StringBuilder();

		for (String val : sp) {
			StringBuilder rev = new StringBuilder(val).reverse().append(" ");
			result.append(rev).append(" ");
		}

		System.out.println(result);

		
		// String reverse
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println(rev);
		
		
		// swap 2 string
		
		String s1= "Boby";
		String s2 = "Suman";
		
		s1= s1+s2; 
		s2= s1.substring(0, s1.length()-s2.length());
		s1= s1.substring(s2.length());
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
