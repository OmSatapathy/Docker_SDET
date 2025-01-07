package core.Dec20;

public class Uppercase {

	public static void main(String[] args) {
		String s2 = "mongo";

		StringBuilder bs = new StringBuilder();
		char[] ch = s2.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
                 ch[i] = (char) (ch[i]-32);
                 bs.append(ch[i]);
			}
		}
		
		System.out.println(bs.toString());

	}

}
