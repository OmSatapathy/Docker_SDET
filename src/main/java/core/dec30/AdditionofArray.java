package core.dec30;

public class AdditionofArray {

	public static void main(String[] args) {

		int sum = 0;
		boolean flag =false;

		int[] input = { 2, 3, 4, 7, 14, 21, 7, 7, 21, 23 };

		for (int i = 0; i < input.length; i++) {

		
			if(input[i]==7) {
				flag=true;
				continue;
			}
			if(flag==true) {
				sum= sum+input[i];
			}
		

		}

		System.out.println(sum);
	}

}
