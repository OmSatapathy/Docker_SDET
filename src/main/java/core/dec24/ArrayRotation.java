package core.dec24;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		String s = "omprakash"; // rakashomp
		
		int[] num= {5,8,9,41,3,12}; // {41,3,12,5,8,9}
		
		int k=3;
		
		String s1= s.substring(0, k);
		String s2= s.substring(k, s.length());
		
		String s3= s2+s1;
		System.out.println(s3);
		
		
		int[] rotate = new int[num.length];
		int n = num.length;
		
		for(int i=0; i<n;i++) {
			rotate[i] = num[(n-k+i)%n];
		}

		System.out.println(Arrays.toString(rotate));
	}

}
