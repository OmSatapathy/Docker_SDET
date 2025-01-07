package core.Dec20;

public class Secondlargest {

	public static void main(String[] args) {

		int[] arr = { 12, 35, 1, 10, 24, 1 };
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				second = largest;
				largest = arr[i];

			}
			else if(arr[i]>second && arr[i] !=largest) {
				second=arr[i];
			}

		}
		System.out.println(second);
	}

}
