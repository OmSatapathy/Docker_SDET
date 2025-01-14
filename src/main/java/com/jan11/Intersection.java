package com.jan11;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {

		int[] a = { 2, 5, 7, 8, 9, 7, 3 };

		int[] a1 = { 8, 2, 9, 4, 7, 1 };

		Set<Integer> se = new HashSet<>();
		Set<Integer> se1 = new HashSet<>();

		for (int val : a) {
			se.add(val);
		}

		for (int val : a1) {
			se1.add(val);
		}

		Set<Integer> intersec = new HashSet<>(se);
		intersec.retainAll(se1);

		System.out.println(intersec);
	}

}
