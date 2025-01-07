package core.JavaSprint;

import java.util.Arrays;

public class RotateByTwo {

	public static void main(String[] args) {

		int[] p = { 3, 5, 6, 9, 8,4 };

		int sum = 0;

		for (int i = 0; i < p.length; i++) {
			sum = sum + p[i];
		}
		System.out.println(sum);
		
		Arrays.sort(p);
		
		for (int i : p) {
			System.out.print(i);
		}
		

		
	}

}
