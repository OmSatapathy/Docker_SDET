import java.util.Arrays;

public class ArrayRotate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7,95,5,50 };
		int n = 3;
		
		int length= arr.length;
		n= n%length;

		int[] result = new int[length];
		
		System.arraycopy(arr, length-n, result, 0, n);
		System.arraycopy(arr, 0, result, n, length-n);
	
		System.out.println(Arrays.toString(result));
	

		String s = "Automation";
		int index = 3;
		int len = s.length() - 1;
		String s1 = s.substring(0, index);
		String s2 = s.substring(index, len);
		String s3 = s2 + s1;

		System.out.println(s3);

	}

}
