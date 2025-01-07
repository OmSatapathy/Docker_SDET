package core.dec24;

import java.util.HashSet;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		int[] nums = { 3, 1, 3, 4, 2 };

		HashSet<Integer> result = new HashSet<>();
		HashSet<Integer> duplicate = new HashSet<>();

		for (int i : nums) {
			if (!result.add(i)) {
				duplicate.add(i);
			}
		}

		System.out.print(duplicate);

	}

}
