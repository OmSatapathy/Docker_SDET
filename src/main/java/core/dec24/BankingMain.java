package core.dec24;

import java.util.LinkedHashSet;

public class BankingMain extends Banking{

	public static void main(String[] args) {
	
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("ramesh");
		set.add("suresh");
		set.add("rupemesh");
		set.add("manish");
		set.add("karan");
		
		System.out.println(set);
		
	}

	@Override
	public void currentAccount() {
		System.out.println("i am saving");
		
	}
	


}
