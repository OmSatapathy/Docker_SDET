package core.Dec20;

import java.util.Iterator;

public class RemoveVowel {

	public static void main(String[] args) {

		String s = "OM prakash satapathy";
		String p = s.replaceAll("[aeiouAEIOU]", "");
		int count=0;

	//	System.out.println(p);

		
		// find vowel and consonat
		
		char[] ch = s.toLowerCase().toCharArray();
		StringBuilder bs = new StringBuilder();
		
		for ( char c : ch) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				count++;
				bs.append(c);
				
			}
			
		}
		
		
		System.out.println(bs +" "+ count);
	}

}
