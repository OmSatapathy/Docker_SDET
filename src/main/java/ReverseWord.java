
public class ReverseWord {

	public static void main(String[] args) {
		String s = "Test Automation";

		String[] sp = s.split(" ");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < sp.length; i++) {
			String word = new StringBuilder(sp[i]).reverse().toString();
			result.append(word).append(" ");

		}

		System.out.println(result);
	}

}
