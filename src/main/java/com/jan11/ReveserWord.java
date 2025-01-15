package com.jan11;

public class ReveserWord {

	public static void main(String[] args) {
		String sp = "Today is Wednesdasy";
		String s = sp.trim();

	    char[] ch = sp.toCharArray();
	    
	    int rev = ' ';
	    
	    for(int i =ch.length-1; i>=0; i--) {
	    	if(i==' ') {
	    		rev= rev+i;
	    	}
	    }
     
	    System.out.println(rev);
	}

}
