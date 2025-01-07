package core.dec30;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int len = arr.length;

		int k = 3;
		k = k % len;

		for (int i = 0; i < len; i++) {
			if (i < k) {
				System.out.println(arr[len + i - k]);
			} else {
				System.out.println(arr[i - k]);
			}
		}

	}

	
}
