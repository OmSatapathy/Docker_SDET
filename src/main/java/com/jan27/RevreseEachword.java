package com.jan27;

public class RevreseEachword {

	public static void main(String[] args) {
		String s = "ganGa holLy riVer";

		int count=0;
		StringBuilder bs = new StringBuilder();
		
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if(Character.isUpperCase(ch[i])) {
				bs.append(ch[i]);
			}
		}
		
		System.out.println(bs);
		
		String rev = "";
		
		for(int i= s.length()-1; i>=0;i--) {
			while(s.contains(" ")) {
				rev=rev+s.charAt(i);
				break;
			}
		}
		
		System.out.println(rev);
	}

}
