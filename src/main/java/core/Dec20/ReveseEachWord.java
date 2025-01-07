package core.Dec20;

public class ReveseEachWord {

	public static void main(String[] args) {
		
		String s = "Just selenium progamm";
		String[] sp = s.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		
		for(int i = sp.length-1;i>=0; i--) {
			StringBuilder rev = new StringBuilder(sp[i]);
			String reveseword =rev.reverse().toString();
			
			result.append(reveseword).append(" ");
		}
		
		System.out.println(result.toString());

	}

}
