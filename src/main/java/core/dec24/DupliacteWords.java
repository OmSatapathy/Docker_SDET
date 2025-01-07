package core.dec24;

import java.util.HashSet;
import java.util.Set;

public class DupliacteWords {

	public static void main(String[] args) {
		String[] arr = { "mango", "jak", "frut", "jak", "bana", "apple", "frut" };

		Set<String> original = new HashSet<String>();
		Set<String> dupliacte = new HashSet<String>();

		for (String val : arr) {
			if (!original.add(val)) {
				dupliacte.add(val);
			} else if (original.removeAll(dupliacte)) {

			}
		}

		System.out.println(dupliacte);
		System.out.println(original);
	}

}
