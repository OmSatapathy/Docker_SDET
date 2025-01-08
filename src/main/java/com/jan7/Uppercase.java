package com.jan7;

public class Uppercase {

	public static void main(String[] args) {
		String s = "we are learing automation";
        StringBuilder result = new StringBuilder();

        String[] words = s.split(" "); // Split the string into words

        for (String word : words) {
            StringBuilder bs = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                // Convert the second character to uppercase
                if (i == 1) {
                    bs.append(Character.toUpperCase(c));
                } else {
                    bs.append(c);
                }
            }

            // Add the transformed word to result with a space
            result.append(bs).append(" ");
        }

        // Trim trailing space and print the result
        System.out.println(result);
	}

}
