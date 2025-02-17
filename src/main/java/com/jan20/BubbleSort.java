package com.jan20;

import java.util.HashMap;
import java.util.Map;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		
		String str1[] = { "Ajeet", "Steve", "Rick", "Becky", "Mohan","Becky", "Mohan" };
		
		Map<String,Integer> hm = new HashMap<>();
		hm.put("Ajeet", 10);
		System.out.println(hm.getOrDefault("Steve", null));
		
		for(String s : str1) {
			hm.put(s, hm.getOrDefault(s, 0)+1);
			
		}
		
		System.out.println(hm);
		
		
		
		String str[] = { "Ajeet", "Steve", "Rick", "Becky", "Mohan" };
		sortArray(str);

		for(String s : str) {
			System.out.println(s);
		}
	}
	
	
	
	public static void sortArray(String[] str) {
		
		for(int i =0; i< str.length-1; i++) {
			for(int j=i+1 ; j<str.length-1;j++) {
				if(str[i].compareTo(str[j])>0) {
					
					String temp =str[i];
					str[i]= str[j];
					str[j]= temp;
				}
			}
		}
	}

	
	
	
}


