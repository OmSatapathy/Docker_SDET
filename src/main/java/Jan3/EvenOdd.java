package Jan3;

import java.util.Arrays;

public class EvenOdd {

	int evencount=0;
	
	public static void main(String[] args) {
		int evencount=0;
		int oddcount=0;
		int[] arr= {5,4,77,68,92,63,55};
		for(int i= 0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				evencount++;
			}
			else if(arr[i]%2!=0) {
				oddcount++;
			}
		}

		
		System.out.println(evencount);
		System.out.println(oddcount);
		
		
		// missing number in array
		
		int[] a= {3,5,6,7,1,4,8};
		int sum=0;
		for(int i=0; i< a.length; i++) {
			sum= sum+a[i];
		}
		
		int len= a.length+1;
		
		int total = len*(len+1)/2;
		
		int missing = total - sum;
		System.out.println(missing);
	// soring array	
		int temp;
		for(int i =0; i< a.length; i++) {
			for(int j =i+1; j< a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]= a[j];
					a[j]=temp;
					
				}
			}
		}
		
		
		System.out.println(Arrays.toString(a));
		
		// array reverse
		
		int start =0;
		int end= a.length-1;
		for(int i =0; i< a.length; i++) {
			
			while(start<end) {
				temp= a[start];
				a[start]=a[end];
				a[end]=temp;
				
				start++;
				end--;
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		

	}

}
