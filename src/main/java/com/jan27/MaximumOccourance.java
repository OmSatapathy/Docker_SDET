package com.jan27;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumOccourance {

	public static void main(String[] args) {
		
		String s = "this is automation job";
		char[] ch = s.toCharArray();
		
		Map<Character,Integer> mp = new HashMap<>();
		
		for(char c: ch) {
			if(c !=' ') {
				mp.put(c, mp.getOrDefault(c,0)+1);
			}
			
		}
		
		for(Map.Entry<Character,Integer> hm: mp.entrySet()) {
			if(hm.getValue()>1){
				System.out.println(hm.getKey() +"=>"+ hm.getValue());
			}
		}
		
	}

}
