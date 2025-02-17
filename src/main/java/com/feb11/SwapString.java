package com.feb11;

import java.util.HashSet;
import java.util.Set;

public class SwapString {

	public static void main(String[] args) {

		// swap two number

		String s1 = "rami";
		String s2 = "scmt";

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println(s1);
		System.out.println(s2);

		// find dupliacte

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Set<Character> set = new HashSet<>();
		Set<Character> intersect = new HashSet<>();

		for (char c : ch1) {
			set.add(c);
		}

		for (char c : ch2) {
			if (set.contains(c)) {
				intersect.add(c);
			}
		}

		System.out.println(intersect);

		String s = "payal";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		int num = 45321;
		int rem;
		int revs = 0;
		while (num > 0) {
			rem = num % 10;
			revs = revs * 10 + rem;
			num = num / 10;

		}

		System.out.println(revs);

		// largestet word in given string

		String s3 = "payal is learing automaion and java";
		String[] sp1 = s3.split(" ");
		String largest = "";

		for (String sr : sp1) {
			if (sr.length() > largest.length()) {
				largest = sr;
			}
		}
		System.out.println(largest);

		// largest number;

		int[] arr = { 10, 12, 18, 11, 9, 7, 20 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

			}
		}

	}

}
