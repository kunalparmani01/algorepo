package com.jda.fuctionalprograms.util;

public class FourthUtil {
	public static int[] powerArray(int N){
		int a[] = new int[N];
		a[0] = 2;
		for (int i=1; i<=N; i++){
			a[i] = a[i-1]*2;
		}
		return a;
	}
}
