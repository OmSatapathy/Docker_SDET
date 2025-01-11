package com.corejava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringManupalation {

	public static void main(String[] args) {
		String s = "co56re&*@java com.ea##$&syapply docker567_sdet";
		
		String removeDigit= s.replaceAll("[0-97!@#$%^&*()]", "");
		System.out.println(removeDigit);
		
	char[] sp = removeDigit.toCharArray();
	Set<Character> set = new HashSet<Character>();
	
	for(char c : sp) {
		set.add(c);
	}
	System.out.println(set.size());
	
		// second Approch
		
	//	char[] ch = s.toCharArray();
		
		
	Set<String> set1 = new HashSet<>();
		
	set1.add("aa");
	set1.add("bb");
	set1.add("cc");
	set1.add("dd");
	set1.add("ee");
	set1.add("aa");set1.add("bb");
	
	System.out.println(set1);
	

	}

}
