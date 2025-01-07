package Jan3;

public class MissingNum {

	public static void main(String[] args) {
		   int[] a = {1, 4, 5, 3, 7, 8, 6};
		   
		   int sum=0;
		   
		   for(int i=0; i<a.length; i++) {
			   sum= sum+a[i];
		   }

		   System.out.println(sum);
		   int len = a.length+1;
		  
		   
		   int originalSum= (len*(len+1))/2;
		   System.out.println(originalSum);
		   System.out.println(originalSum-sum);
	}

}
