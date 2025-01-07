import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class  LinklistRevese {

	public static void main(String[] args) {
		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.add(34);
		lst.add(7);
		lst.add(72);
		lst.add(91);
		
		LinkedList<Integer> lked= new LinkedList<Integer>();
		lked.descendingIterator().forEachRemaining(lked::add);
		
		System.out.println(lked);
		
		// angram
		
		String p= "raju";
		String p1= "aaaa";
		
		char[] ch = p.toCharArray();
		char[] ch1= p1.toCharArray();
		
		if(p.length()==p1.length()) {
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			Arrays.equals(ch, ch1);
			if(Arrays.equals(ch, ch1)==true) {
				System.out.println("anagram");
			}else {
				System.out.println("not");
			}
			
		}

		
	}

}
