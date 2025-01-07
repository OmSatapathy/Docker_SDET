package core.JavaSprint;

public class StringCompress {

	public static void main(String[] args) {
		
		String s ="aaabbbccddd";
		char[] ch = s.toCharArray();
		StringBuilder bs = new StringBuilder();
		
		int count=0;
		
		for(int i =1; i< ch.length; i++) {
			if(ch[i]==ch[i-1]){
				count++;
				
			}
			else {
				bs.append(ch[i-1]).append(count);
				count=1;
			}
		}
		
		bs.append(ch.length-1).append(count);
     System.out.println(bs);
	}

}
