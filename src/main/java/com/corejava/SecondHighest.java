package com.corejava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SecondHighest {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		int[] a ={12,5,6,9,3,72,67,80,45,98,80,72,98};
		
		for(int i =0; i< a.length; i++) {
			for(int j=i+1; j< a.length; j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] =a[j];
					a[j]= temp;
				}
			}
		}

		
		for(int ele : a) {
			set.add(ele);
		}
		
		System.out.println(set);
		
		System.out.println(a[a.length-2]);
		
		// first occurance
		
		
		System.out.println("************");
		
		int[] ar ={12,5,6,9,3,72,67,80,45,98,80,72,98};
		
		Map<Integer, Integer> hm= new HashMap<>();
		
		for(int val : ar) {
			hm.put(val, hm.getOrDefault(val, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> map : hm.entrySet()) {
			if(map.getValue()>1) {
				System.out.println(map.getKey());
			}
			
		}
	}

}
