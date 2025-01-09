package com.jan7;

public class StringReplacement {

	public static void main(String[] args) {

		String s = "go ibibo gone";
		String vou = "aeiou";
		
		String rep =s.replaceAll("[aeiou]", "");
		System.out.println(rep);
		
		StringBuilder bs = new StringBuilder();
		
		for(int i =0 ; i< s.length(); i++) {
			if(s.charAt(i)== 'o') {
			
				
			}
		}
	
	    System.out.println(bs);

	}

}
