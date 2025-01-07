package core.JavaSprint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Drupliacte {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 3, 4, 5, 5, 5, 6, 6, 7, 8 };

		Set<Integer> original = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();

		for (int value : arr) {
			if (!original.add(value)) {
				duplicate.add(value);
			}
		}

		List<Integer> nonDuplicates = new ArrayList<>(original);
		nonDuplicates.removeAll(duplicate);

		System.out.println("Duplicate elements: " + duplicate);
		System.out.println("Non-duplicate elements: " + nonDuplicates);

	}

}
