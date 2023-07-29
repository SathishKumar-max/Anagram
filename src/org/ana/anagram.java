package org.ana;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "peek";


		// check if length is same

			// convert strings to char array
			char[] Array1 = s1.toCharArray();
			char[] Array2 = s2.toCharArray();

			// sort the char array
			Arrays.sort(Array1);
			Arrays.sort(Array2);

			// if sorted char arrays are same
			// then the string is anagram
			boolean result = Arrays.equals(Array1, Array2);

			if (result) {
				System.out.println(s1 + " and " + s2 + " are anagram.");
			} else {
				System.out.println(s1 + " and " + s2 + " are not anagram.");
			}
		}
	}
