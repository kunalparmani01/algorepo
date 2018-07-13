package com.jda.algorithmic.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CScanner {
	
	public static String getString(){	
		Scanner sc = new Scanner (System.in);
		String name = sc.nextLine();
		return name;
		
	
	}
	
	public static int getint(){
		
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		return num;	

}
	
	public static void printstring(String str)
	{
		
		System.out.println(str);
	}
	
	public static boolean primeChecker(int val) {
		if (val == 0 || val == 1)
			return false;
		for (int i = 2; i * i <= val; i++) {
			if (val % i == 0)
				return false;
		}
		return true;
	}
	
	public static List<Integer> primeSeries(int strt, int end) {
		List<Integer> series = new ArrayList<>();
		for (int i = strt; i <= end; i++) {
			if (primeChecker(i))
				series.add(i);
		}
		return series;
	}
	
	public static boolean palindrom(String ch) {
		int len = ch.length(), i, j;
		for (i = 0, j = len - 1; i <= j; i++, j--)
			if (ch.charAt(i) != ch.charAt(j))
				return false;
		return true;
	}
	
	
	
	public static boolean checkAnagram(String first, String second) {
		int len1 = first.length(), len2 = second.length();
		boolean digit = false;
		int[] cnt1 = new int[26];
		int[] cnt2 = new int[26];
		int[] cnt3 = new int[10];
		int[] cnt4 = new int[10];
		for (int i = 0; i < len1; i++) {
			if (first.charAt(i) - 'a' >= 0)
				cnt1[first.charAt(i) - 'a']++;
			else {
				cnt3[first.charAt(i) - '0']++;
				digit = true;
			}
		}
		for (int i = 0; i < len2; i++) {
			if ((second.charAt(i) - 'a') >= 0)
				cnt2[second.charAt(i) - 'a']++;
			else
				cnt4[second.charAt(i) - '0']++;
		}
		if (!digit) {
			for (int i = 0; i < 26; i++) {
				if (cnt1[i] != cnt2[i])
					return false;
			}
		} else {
			for (int i = 0; i < 10; i++) {
				if (cnt3[i] != cnt4[i])
					return false;
			}
		}
		return true;
	}
	
	
	public static boolean binarySearchForInteger(List<Integer> arr, int key, int len) {
		int low = 0, high = len - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr.get(mid) > key)
				high = mid - 1;
			else if (arr.get(mid) < key)
				low = mid + 1;
			else
				return true;
		}
		return false;
	}
	
	
	public static List<Integer> bubbleSortForInteger(List<Integer> arr, int len) {
		
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (arr.get(j) > arr.get(j + 1)) {
					int tmp = arr.get(j);
					arr.set(j, arr.get(j + 1));
					arr.set(j + 1, tmp);
				}
			}
		}
		return arr;
	}
	
	
	public static List<Integer> insertionSortForInterger(List<Integer> arr, int len) {
		
		for (int i = 1; i < len; i++) {
			int key = arr.get(i), j;
			for (j = i - 1; j >= 0 && arr.get(j) > key; j--)
				arr.set(j + 1, arr.get(j));
			arr.set(j + 1, key);
		}
		return arr;
	}
	
	
	
	public static List<String> bubbleSortForString(List<String> arr, int len) {
		
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (arr.get(j).compareToIgnoreCase(arr.get(j + 1)) > 0) {
					String tmp = arr.get(j);
					arr.set(j, arr.get(j + 1));
					arr.set(j + 1, tmp);
				}
			}
		}
		return arr;
	}
	
	
	
	public static boolean binarySearchForString(List<String> arr, String key, int len) {
		int low = 0, high = len - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			String tmpstr = arr.get(mid);
			if (tmpstr.compareToIgnoreCase(key) > 0)
				high = mid - 1;
			else if (tmpstr.compareToIgnoreCase(key) < 0)
				low = mid + 1;
			else
				return true;
		}
		return false;
	}
	

}
