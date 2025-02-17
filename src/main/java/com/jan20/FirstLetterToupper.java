package com.jan20;

public class FirstLetterToupper {

	public static void main(String[] args) {
		String str = "They are driving";
		String[] sp = str.split(" ");
		StringBuilder bs = new StringBuilder();

		for(String s : sp) {
			 s =  s.substring(0, 1).toUpperCase()+s.substring(1);
			 bs.append(s).append(" ");
		}

		System.out.println(bs);
	}

}
