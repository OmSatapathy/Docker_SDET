package core.dec24;

public class VowelPresent {

	public static void main(String[] args) {

		String str = "bmgvdrty";
		if (str.toLowerCase().matches(".*[aeiou].*")) {
			System.out.println("have vowel");
		}else {
			System.out.println("no vowels");
		}
		
		printFibonacciSequence(7);
		

		
		
	}
	public static void printFibonacciSequence(int count) {
		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 1; i <= count; i++) {
			System.out.print(a + ", ");

            a = b;
			b = c;
			c = a + b;
		}
	}

}
