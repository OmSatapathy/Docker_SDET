package core.JavaSprint;

public class UpperCaseToLowerCase {

	public static void main(String[] args) {
   // Without inbuild function
		
		String str = "sumitgoyal";
		char[]c = str.toCharArray();
		
		for(int i=0;i<c.length;++i)
		{
			c[i] =  (char)(c[i]-32);
		}
		
		System.out.println(String.valueOf(c));
		
		String s= "AshokDash";
		String s1 =s.toLowerCase();
		char[] ch= s1.toCharArray();
		
		for(int i=0; i< ch.length; i++) {
			
			if(ch[i]>= 'a' && ch[i] <='z' ) {
				ch[i]= (char) (ch[i]+32);
			}
		}

		System.out.println(String.valueOf(ch));
	}

}
