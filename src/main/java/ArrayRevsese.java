import java.util.Arrays;

public class ArrayRevsese {

	public static void main(String[] args) {
	   int[] arr ={2,0,3,0,4,5,0,77,88,0,99,0,603,607};
	   int start=0;
	   int end= arr.length-1;
	   
	   int temp;
	   for(int i=0; i<end;i++) {
		   if(start< end) {
			   temp= arr[start];
			   arr[start]= arr[end];
			   arr[end]=temp;
			   
			   start++;
			   end--;
		   }
	   }

	   System.out.println(Arrays.toString(arr));
	}

}
