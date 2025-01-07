package core.Dec20;

import java.util.Arrays;

public class StringAngram {

	public static void main(String[] args) {
		String s1 = "gonomt";
		String s2 = "mongo";

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		if (s1.length() == s2.length()) {
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2)) {
				System.out.println("Angram");
			} else {
				System.out.println("not angarm");
			}

		}

		else {
			System.out.println("not equal length");
		}
	}

}
