package core.Dec20;

public class StringPallindeom {

	public static void main(String[] args) {
		// reverse
		String s = "MOM";
		String rev = "";

		int num = 63773;

		// char[] ch = .toCharArray();

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev.trim());

		if (s.equalsIgnoreCase(rev)) {
			System.out.println("pallindeom");
		} else {
			System.out.println("not pallinderom");
		}

		int rem, sum = 0;
		while (num > 0) {

			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
