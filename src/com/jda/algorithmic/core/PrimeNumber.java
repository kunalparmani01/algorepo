package com.jda.algorithmic.core;

import com.jda.algorithmic.util.CScanner;

public class PrimeNumber {

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println("Enter N");
		int num = CScanner.getint();

		if (num < 2) {
			System.out.println("Please enter greater than 2");

		}
		
		if(num>1000)
		{
			System.out.println("Out of Range");
		}

		for (int i = 3; i <= num; i++) {
			if (isPrime(i)) {
				System.out.print("  " + i);
			}

		}

	}
}
