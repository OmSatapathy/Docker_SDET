package com.jan20;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		char[] s1 = { 'A', 'B', 'C' };
		char[] s2 = { 'd', 'e', 'f' };

		char[] s3 = new char[s1.length + s2.length];

		for (int i = 0; i < s1.length; i++) {
			s3[i * 2] = Character.toLowerCase(s1[i]);
			s3[i * 2 + 1] = Character.toUpperCase(s2[i]);

		}

		System.out.println(Arrays.toString(s3));
	}

}
