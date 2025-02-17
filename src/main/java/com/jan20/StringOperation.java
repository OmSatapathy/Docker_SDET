package com.jan20;

public class StringOperation {

	public static void main(String[] args) {
		String str = "programming is fun";

		String str1 = str.replaceAll("[aeiou]", "");
		String[] sp = str1.split(" ");
		StringBuilder bs = new StringBuilder();
	
		for (String s : sp) {
			s = s.substring(0, 1).toUpperCase() + s.substring(1);
			bs.append(" ").append(s);
			    
		}
		System.out.println(bs);
		
	}

}
