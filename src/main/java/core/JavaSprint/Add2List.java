package core.JavaSprint;

import java.util.ArrayList;
import java.util.List;

public class Add2List {

	public static void main(String[] args) {
	
		List<Integer> lst1= new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(23);
		lst1.add(12);
		lst1.add(22);
		lst1.add(2);
		
		
		
		List<Integer> lst2= new ArrayList<Integer>();
		lst1.add(42);
		lst1.add(33);
		lst1.add(12);
		lst1.add(20);
		lst1.add(24);
		
		lst1.addAll(lst2);
		
		System.out.println(lst1);
		
		
	}

}
