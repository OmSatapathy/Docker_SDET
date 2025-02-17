package com.jan20;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String sp = "AABCCDda";
		String s = sp.toUpperCase();

		char[] ch = s.toCharArray();

		Set<Character> origianl = new HashSet<>();

		for (char c : ch) {
			origianl.add(c);
		}

	//	System.out.println(origianl);
		
		
		   String str[] = {"ram","sam", "kapil","ganga"}; 
		   
		   System.out.println("ram".compareTo("sam"));
		   
		

	}

}
