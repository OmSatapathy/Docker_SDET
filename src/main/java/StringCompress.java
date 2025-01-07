import java.util.Arrays;

public class StringCompress {

	public static void main(String[] args) {
		
		String s ="aaabbbacfwww";
		char[] ch = s.toCharArray();
		int counter=1;
		Arrays.sort(ch);
		
		StringBuilder bs = new StringBuilder();
		
		for(int i=1; i< ch.length; i++) {
			
			if(ch[i]==ch[i-1]) {
				counter++;
				
			}
			else if(ch[i]==1) {
				bs.append(ch[i-1]).append(counter);
				counter=1;
			}
		}
		bs.append(ch.length-1).append(counter);
		System.out.println(bs.toString());
	}

}
