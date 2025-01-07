package core.Dec20;

import java.util.Arrays;

public class BuubleSort {

	public static void main(String[] args) {
		int[] numbers = {5, 3, 8, 1, 9, 2};
		int temp;
		for(int i =0; i<numbers.length; i++) {
			for(int j =i; j<numbers.length;j++) {
				if(numbers[i]>numbers[j]) {
					 temp = numbers[i];
					 numbers[i]=numbers[j];
					 numbers[j]=temp;
				}
			}
		}

		System.out.println(Arrays.toString(numbers));
	}

}
