package Jan3;

public class StringCompress {

	public static void main(String[] args) {
		String s= "aaabbccd";
		StringBuilder bs = new StringBuilder();
		int count=1;
		for(int i =1; i<s.length();i++) {
			
			if(s.charAt(i)==s.charAt(i-1)) {
				count++;
				
			}
			else {
				bs.append(s.charAt(i-1)).append(count).toString();
				count=1;
			}
		}
		bs.append(s.charAt(s.length()-1)).append(count);
		System.out.println(bs);

	}

}
