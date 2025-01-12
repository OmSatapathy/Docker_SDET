package com.jan11;

import java.util.StringJoiner;

public class RevserseAltenateWord {

	public static void main(String[] args) {

			String str = "selenium cypress playwright webdriverio";
			String[] sp = str.split(" ");
			
			StringBuilder result = new StringBuilder();
			
			
			for(int i =0; i<sp.length; i++) {
			
					 String rev = new StringBuilder(sp[i]).reverse().append(" ").toString();
					 result.append(rev).toString();
		
			}
			
			System.out.println(result);
		
		}

	

}
