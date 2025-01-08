package com.jan7;

public class ConvertToUppercase {

	public static void main(String[] args) {
		
		String s = "we are working as engineer";
		// 2nd letter convert to upper case 
		
		String[] sp = s.split(" ");
		StringBuilder result = new StringBuilder();
		
		
		for(String val : sp) {
			StringBuilder rev = new StringBuilder(val).reverse().append(" ");
			result.append(rev).append(" ");
		}
	
	//	System.out.println(result);
		
		
		StringBuilder bs = new StringBuilder();
		char[] ch = s.toCharArray();
		
		for(char c : ch) {
			if(c=='a' ||  c=='e' || c=='i' ||  c=='o' ||  c=='u') {
				char upper = Character.toUpperCase(c);
				bs.append(upper);
			}
			else {
				bs.append(ch);
			}
		}
		
		System.out.println(bs);
		
	}

}
