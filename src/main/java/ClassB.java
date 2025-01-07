
public class ClassB  extends ClassA{
	
	public void add() {
		System.out.println("child add");
	}
	
	public void sub() {
		System.out.println("child sub");
	}
	public void div() {
		System.out.println("child div");
	}

	
	public static void main(String[] args) {
		
		ClassA obj = new ClassB();
		obj.add();
	}

}
