package com.feb11;

import java.util.HashMap;
import java.util.Map;

public class Repeated {

	public static void main(String[] args) {

		String s1 = "She sells seashells by the seashore. The shells she sells are surely seashells";
		
       String s= s1.toLowerCase();
		String[] sp = s.split(" ");

		Map<String, Integer> hm = new HashMap<>();

		for (String sn : sp) {
			hm.put(sn, hm.getOrDefault(sn, 0) + 1);
		}

		for (Map.Entry<String, Integer> map : hm.entrySet()) {
			System.out.println(map.getKey() + " ->" + map.getValue());
		}
		
		// revese each word
		
		StringBuilder result = new StringBuilder();
		
		for(String word: sp) {
			StringBuilder rev = new StringBuilder(word).reverse().append(" ");
			result.append(rev).append(" ");
		}
		
		System.out.println(result);
		
		for(String wd: sp) {
			wd =   wd.substring(0, 1).toUpperCase()+wd.substring(1);
			System.out.print(wd);
		}
		

	}

}
