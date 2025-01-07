package Jan3;

public class Child extends Parent{
	
	Child(){
		super();
		System.out.println("dog is created"); 
	}
	
	public void write() {
	
		System.out.println("child write");
	}
	
	public void read() {
		super.read();
		//System.out.println("child read");
	}

	public static void main(String[] args) {
		Child pt = new Child();
		

	}

}
