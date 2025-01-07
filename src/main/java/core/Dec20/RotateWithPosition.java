package core.Dec20;

public class RotateWithPosition {

	public static void main(String[] args) {
		
		String s ="Omprakash";
		int k=6;
		k= k%s.length();
		
		// split array into 2 parts
		
		String s1=s.substring(0, k);
		String s2= s.substring(k);
		
		String result= s2+s1;
		
		System.out.println(result);
		
		String sp= "aaaabbcccdddd";
		StringBuilder bs= new StringBuilder();
		int count=1;
		for (int i = 1; i < sp.length(); i++) {
			if(sp.charAt(i)==sp.charAt(i-1)) {
				count++;
			}
			else {
				bs.append(sp.charAt(i-1)).append(count);
				count=1;
			}
			
			
		}
		bs.append(sp.charAt(sp.length()-1)).append(count);
		System.out.println(bs);
	}

}
