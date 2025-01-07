package core.JavaSprint;

import java.util.Arrays;

import javax.sound.sampled.ReverbType;

public class LeftRotateArray {

	
	
	public static void reverse(int[] arr, int start, int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		
		
		
	}
	
	public static void leftRotate(int[] arr, int k) {
		int n= arr.length;
		k = k%n;
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
	}
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;  // Number of positions to rotate
        System.out.println("Original array: " + Arrays.toString(arr));

        leftRotate(arr, k);

        System.out.println("Array after " + k + " left rotations: " + Arrays.toString(arr));
	}

}
