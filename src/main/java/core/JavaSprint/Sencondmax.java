package core.JavaSprint;

public class Sencondmax {

	public static void main(String[] args) {
		
		int[] a = {23,5,67,89,12,40,33};
		
		int max = a[0];
		
		for(int i =0; i< a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
	
		System.out.println(max);

	}

}
