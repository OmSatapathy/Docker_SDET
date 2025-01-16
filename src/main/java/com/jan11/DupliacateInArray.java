package com.jan11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DupliacateInArray {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 8, 7, 3, 5 };

		Set<Integer> original = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();

		for (int i : arr) {
			if (!original.add(i)) {
				duplicate.add(i);
			}
		}
		System.out.println(duplicate);

		original.removeAll(duplicate);
		System.out.println(original);
		
		
		int[] arr1 = { 2, 3, 4, 5, 6, 8};
		int[] arr2 = { 2, 5, 8,20,70};
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		
		for(int i : arr1) {
			set1.add(i);
		}
		
		for(int i: arr2) {
			set2.add(i);
		}
		
		set1.retainAll(set2);
		System.out.println(set1);
		
		
	}

}
