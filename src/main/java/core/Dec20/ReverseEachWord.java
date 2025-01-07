package core.Dec20;

public class ReverseEachWord {

	public static void main(String[] args) {

		String s = "We are learning selenium";
		String[] sp = s.split(" ");
		String smallest = sp[0];
		String largest = sp[0];

		for (String word : sp) {
			if (word.length() < smallest.length()) {
				smallest = word;
			}
			if (word.length() > largest.length()) {
				largest = word;
			}
		}

		System.out.println("Smallest word: " + smallest);
		System.out.println("Largest word: " + largest);

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < sp.length; i++) {
			StringBuilder bs = new StringBuilder(sp[i]);
			String revese = bs.reverse().toString();
			result.append(revese).append(" ");
		}

		System.out.println(result);
	}

}
