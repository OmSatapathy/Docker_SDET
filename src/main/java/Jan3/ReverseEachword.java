package Jan3;

public class ReverseEachword {

	public static void main(String[] args) {
		
		String s = "They are swiming here";
		String[] sp = s.split(" ");
		
		StringBuilder result = new StringBuilder();

		
		for(int i =0; i< sp.length; i++) {
			StringBuilder rev =new StringBuilder(sp[i]).reverse().append(" ");
			result.append(rev);
		}
		
		System.out.println(result);
		
	}

}
