package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupliacteArraylIst {

	public static void main(String[] args) {
		List<Integer> ele = new ArrayList<>();
		ele.add(23);
		ele.add(33);
		ele.add(43);

		ele.add(53);
		ele.add(23);

		ele.add(23);
		ele.add(43);
		
		System.out.println(ele);
		
		Set<Integer> set = new HashSet<>();
		set.addAll(ele);
		
		System.out.println(set);
		
		Collections.sort(ele);

		for(int i =0; i< ele.size(); i++) {
			if(ele.get(i)==43) {
				System.out.println(43);
			}
		}

		

	}

}
