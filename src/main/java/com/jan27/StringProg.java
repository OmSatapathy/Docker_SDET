package com.jan27;

public class StringProg {

	public static void main(String[] args) {

		String s = "om prakssh satapathy";
		String[] sp = s.split(" ");
		StringBuilder bs = new StringBuilder();

		for (String sn : sp) {
			String ps = sn.substring(0, 1).toUpperCase();
			System.out.println(ps);
		}

		for (String n : sp) {
			StringBuilder rev = new StringBuilder(n).reverse().append(" ");
			bs.append(rev).append(" ");
		}

		System.out.println(bs);

		int num = 54783;
		int rem;
		int rev = 0;
		int sum = 0;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}

		System.out.println(rev);

		while (num > 0) {
			rem = num%10;
			sum = sum + rem;
			num=num/10;

		}
		System.out.println(sum);
	}

}
