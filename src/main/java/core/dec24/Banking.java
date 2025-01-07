package core.dec24;

public abstract class Banking {

	public void loan() {
		System.out.println(" we are giving loan");
	}
	
	public void saving() {
		System.out.println(" we are saving account");
	}
	
	public void fixed() {
		System.out.println(" we are fixed");
	}
	
	public abstract void currentAccount();
	
}
