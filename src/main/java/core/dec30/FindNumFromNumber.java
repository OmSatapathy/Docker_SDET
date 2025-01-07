package core.dec30;

public class FindNumFromNumber {

	public static void main(String[] args) {
		String s = "975456363357845";
		int count = 0;

		char[] ch = s.toCharArray();

		for (char i : ch) {
			int value = Character.getNumericValue(i);

			if (value == 5) {
				count++;
			}
		}

		System.out.println(count);
	}

}
