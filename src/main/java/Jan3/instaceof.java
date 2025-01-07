package Jan3;

interface Animal{
	
	public void bark();
}

class Dog implements Animal{

	@Override
	public void bark() {
		
		
	}
	
}
public class instaceof {

	public static void main(String[] args) {
	
		Dog dg = new Dog();
		boolean result = dg instanceof Animal; 
		System.out.println(result);

	}

}
