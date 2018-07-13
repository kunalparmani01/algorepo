package com.jda.fuctionalprograms.util;

public class SixthUtil {
	public static int isPrime(int N){
		for(int i=2; i<=Math.sqrt(N); i++){
			if(N%i == 0)
				return i;
		}
		return N;
	}
}
