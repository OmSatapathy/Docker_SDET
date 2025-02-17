package com.jan20;

public class ReveseEachword {
	public static void main(String[] args) {

		String s = "tomorrow is tusday";
		String[] sp = s.split(" ");
		StringBuilder result = new StringBuilder();

		for (String sn : sp) {
			String rev = new StringBuilder(sn).reverse().toString();
			result.append(rev).append(" ");

		}

		System.out.println(result);

		char[] ch = s.toCharArray();
		int count = 0;
		for (char i : ch) {
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
				count++;
			}
		}

		System.out.println(count);

		String str = "aaabbbbcccddeee";
		StringBuilder bs = new StringBuilder();

		int count1 = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count1++;
			} else {
				bs.append(str.charAt(i - 1)).append(count1);
				count1 = 1;
			}
		}
		bs.append(str.charAt(str.length() - 1)).append(count1);
		System.out.println(bs);

		int[] arr = { 8, 9, 53, 62, 19, 23, 18, 34 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		int second = arr[arr.length - 1];
		System.out.println("second number is:" +second);
	}

}
