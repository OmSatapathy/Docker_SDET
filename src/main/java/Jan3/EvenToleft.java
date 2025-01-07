package Jan3;

import java.util.Arrays;

public class EvenToleft {

	public static void main(String[] args) {
		int[] a = {3,34,54,7,12,45,90,9,61};
		int j=0,temp;
		for(int i =1; i<a.length; i++) {
			if(a[i]%2==0) {
				if(i!=j) {
					temp= a[i];
					a[i]= a[j];
					a[j]= temp;
					
					++j;
					
				}
			}
		}

		System.out.println(Arrays.toString(a));
	}

}
