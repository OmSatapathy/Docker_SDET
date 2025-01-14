package com.jan11;

public class StringCompress {

	public static void main(String[] args) {
		String str = "aabbbccccddddd" ;
		int count=1;
		StringBuilder bs = new StringBuilder();
		
		for(int i =1; i< str.length(); i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				count++;
			}
			else {
				bs.append(str.charAt(i-1)).append(count);
				count=1;
			}
		}
		
		bs.append(str.charAt(str.length()-1)).append(count);
		System.out.println(bs);

	}

}
