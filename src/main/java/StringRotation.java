
public class StringRotation {
	public static void main(String[] args) {

		String s = "GoogleSerch";
		String s4= "Serch";
		int k =4;
		
		String s1 = s.substring(0, k);
		String s2 = s.substring(k, s.length());
		
		String s3= s2+s1;
		
		System.out.println(s3);
		
		// reverse string without 3rd string
		
		s= s+s4;
		s4= s.substring(0, s.length()-s4.length());
		s= s.substring(s4.length());
		
		System.out.println(s);
		System.out.println(s4);
	}
}
