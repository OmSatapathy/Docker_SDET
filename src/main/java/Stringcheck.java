import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Stringcheck {

	public static void main(String[] args) {

		int[] arr = { 23, 4, 5, 67, 8, 4, 5 };

		Set<Integer> set = new HashSet();

		for (int val : arr) {
			set.add(val);
		}

	
		List<Integer> ltd = new ArrayList<>(set);
		Collections.sort(ltd);
		System.out.println(Arrays.asList(ltd));
		
		String s = "om prakash satapathu";
		char[] ch = s.toCharArray();
		StringBuilder bs = new StringBuilder();
		StringBuilder bs1 = new StringBuilder();
		int count =1;
		
		
		for(char c : ch) {
			
			if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u' ) {
			
				bs.append(c);
				count++;
				
			}
			else {
				bs1.append(c);
				count++;
			}
			
			
		}
		
		System.out.println(bs);
		System.out.println(bs1);
		
		
		
		String s2 = "om%% prakash## satapathy";
		
		

	}

}
