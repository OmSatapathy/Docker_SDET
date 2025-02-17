package com.jan11;

import java.util.Arrays;

public class UpperTolower {

	public static void main(String[] args) {
		char[] s1 = { 'A', 'B', 'C' };
		char[] s2 = { 'd', 'e', 'f' };

		// Result array to hold the merged and transformed characters
		char[] result = new char[s1.length + s2.length];
		

		// Populate the result array with alternating and transformed characters
		for (int i = 0; i < s1.length; i++) {
			result[i * 2] = Character.toLowerCase(s1[i]); // Lowercase from s1
			result[i * 2 + 1] = Character.toUpperCase(s2[i]); // Uppercase from s2
		}

		// Print the result array
		System.out.println(Arrays.toString(result)); // Output: [a, D, b, E, c, F]
	}

}
