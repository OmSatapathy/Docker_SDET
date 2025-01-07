package core.Dec20;

public class CheckIfNumber {

	public static void main(String[] args) {

		String s = "74731";

		try {
			Integer.parseInt(s);

			System.out.println("is number");

		} catch (Exception e) {

			System.out.println("not an number");
		}

	}
}
