package core.JavaSprint;

public class FindVowel {

	public static void main(String[] args) {
		String sp = "Hello";
		int count = 0;
		char[] ch = sp.toCharArray();

		for (char c : ch) {
			if (Character.isAlphabetic(c)) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
