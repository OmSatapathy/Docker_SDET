package com.jan11;

import java.util.Arrays;

public class Angarm {

	public static void main(String[] args) {

		String s1 = "Silent";
		String s2 = "listen";
		if (s1.length() == s2.length()) {
			
			char[] ch1 = s1.toLowerCase().toCharArray();
			char[] ch2=  s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
	      boolean val=		Arrays.equals(ch1, ch2);
			
			if(val==true) {
				System.out.println("anagarm");
			}
			else {
				System.out.println("not anagram");
			}

		}

	}

}
