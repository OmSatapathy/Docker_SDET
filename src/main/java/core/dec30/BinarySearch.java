package core.dec30;

public class BinarySearch {

	public static void main(String[] args) {
		 int arr[] = {10,20,30,40,50};  
	        int key = 30;  
	        int last=arr.length-1;  
	        binarySearch(arr,0,last,key);     

	}

	
	public static void binarySearch(int[] a, int first, int last, int key) {
		int mid = (first+last)/2;
		while(first<=last) {
			if(a[mid]<key) {
				first=mid+1;
			}
			else if(a[mid]==key) {
				System.out.println("mid found: "+ mid);
				break;
			}
			else {
				last= mid-1;
			}
			mid= first+last/2;
		}
		if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
	}
}
