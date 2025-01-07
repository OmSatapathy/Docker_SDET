package Jan3;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		int[] arr = { 45, 51, 28, 75, 49, 42 };
		int[] arr1 = { 75, 28, 51, 46, 45, 49 };

		if(arr.length==arr1.length) {
			Arrays.sort(arr);
			Arrays.sort(arr1);
			
		  boolean val=	Arrays.equals(arr, arr1);
		  if(val==true) {
			  System.out.println("both arrays equals");
		  }
		  else {
			  System.out.println("not equals");
		  }
		}
	}

}
