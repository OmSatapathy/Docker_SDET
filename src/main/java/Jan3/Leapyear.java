package Jan3;

public class Leapyear {

	public static void main(String[] args) {
		int n = 1990;
		if (n % 4 == 0) {
			if (n % 100 == 0) {
				if (n % 400 == 0) {
					System.out.println("leap year");

				} else {
					System.out.println("not leap year");
				}
			}
		}

	}

}
