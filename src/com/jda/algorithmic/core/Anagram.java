package com.jda.algorithmic.core;

import java.util.Arrays;

import com.jda.algorithmic.util.CScanner;;

public class Anagram {

	public static void main(String[] args) {

		System.out.println("Enter strings to be checked:");
		String string1 = CScanner.getString();
		String string2 = CScanner.getString();
		char str1[] = string1.toCharArray();
		char str2[] = string2.toCharArray();

		if (areAnagram(str1, str2))
			System.out.println("The two strings are" + " anagram of each other");
		else
			System.out.println("The two strings are not" + " anagram of each other");

	}

	static boolean areAnagram(char str1[], char str2[]) {
		// Create 2 count arrays and initialize
		// all values as 0
		if (str1.length != str2.length)
			return false;
		
		int count1[] = new int[200];
		Arrays.fill(count1, 0);
		int count2[] = new int[200];
		Arrays.fill(count2, 0);
		int i;

		// For each character in input strings,
		// increment count in the corresponding
		// count array
		for (i = 0; i < str1.length && i < str2.length; i++) {
			count1[str1[i]]++;
			count2[str2[i]]++;
		}

		

		// Compare count arrays
		for (i = 0; i < 200; i++)
			if (count1[i] != count2[i])
				return false;

		return true;
	}

}
