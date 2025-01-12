package com.jan11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class SumofString {

	public static void main(String[] args) {

		String s = "aa11b33";
		char[] ch = s.toCharArray();
		int sum = 0;

		for (int i = 0; i < ch.length; i++) {

			if (Character.isDigit(ch[i])) {

				sum = sum + Character.getNumericValue(ch[i]);
			}
		}

		System.out.println(sum);
		
		
		Iterator<Integer> itr = Arrays.asList(1,2,3,4).iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
		ListIterator<Integer> itr2 = Arrays.asList(12,34,5,6,8,99).listIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
