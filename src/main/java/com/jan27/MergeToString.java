package com.jan27;

import java.util.HashSet;
import java.util.Set;

public class MergeToString {
	public static void main(String[] args) {
		String s = "mayak";
		String s1 = "tapas";

		char[] ch1 = s.toCharArray();
		char[] ch2 = s1.toCharArray();

		Set<Character> set = new HashSet<>();
		Set<Character> set1 = new HashSet<>();
		Set<Character> set3 = new HashSet<>();

		for (char c : ch1) {
			set.add(c);
		}
		
		for(char c: ch2) {
			set1.add(c);
		}
		
		
	}

}
