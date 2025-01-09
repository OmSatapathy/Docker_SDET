package com.jan7;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {

		String s = "string concept";
		char[] ch = s.toCharArray();

		Arrays.sort(ch);
		System.out.println(ch);

		// remove leading zero

		String sp = "000012356090";

		String m = sp.replaceFirst("^0+", "");
		System.out.println(m);

	}

}
