package com.jda.algorithmic.core;

import java.util.List;

import com.jda.algorithmic.util.CScanner;


public class AnagramPalindrome {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the start and end limit (should be in 0-1000 range)");
		int strt = CScanner.getint();
		int end = CScanner.getint();
		List<Integer> series = CScanner.primeSeries(strt, end);
		int len = series.size();
		for (int i = 0; i < len; i++) 
		{
			String first = String.valueOf(series.get(i));
			if (CScanner.palindrom(first)) 
			{
				for (int j = i + 1; j < len; j++) 
				{
					String second = String.valueOf(series.get(j));
					// System.out.println(second.charAt(0));
					if (CScanner.checkAnagram(first, second)) 
					{
						System.out.println(series.get(i) + " " + series.get(j));
					}
				}
			}
		}
	}

}
