package core.dec30;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachWord {

	public static void main(String[] args) {
		
		String s = "we are here we decide to go here to there we";
		
		String[] sp = s.split(" ");
		
		Map<String, Integer> hm = new HashMap();
		
		for(String val : sp) {
			hm.put(val, hm.getOrDefault(val, 0)+1);
			
		}
		
		for(Map.Entry<String, Integer> hmp : hm.entrySet()) {
			System.out.println(hmp.getKey() +" " + hmp.getValue());
		}

		
		/*  challenges
		 *  1. flexy test
		 *  2. test data mangement for diffent enviroment
		 *  3. maainting testscipt update with new modifiaction
		 *  4. 3rd party integration
		 *  5. unstable build
		 *  
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
