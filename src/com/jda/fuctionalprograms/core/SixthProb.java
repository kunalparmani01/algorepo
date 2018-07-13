package com.jda.fuctionalprograms.core;
import java.util.Scanner;

import com.jda.fuctionalprograms.util.SixthUtil;

public class SixthProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = input.nextInt();
		while(N != 1){
			int num = isPrime(N);
			System.out.print(num + " ");
			N /= num;
			}
		}
	
	public static int isPrime(int N){
		for(int i=2; i<=Math.sqrt(N); i++){
			if(N%i == 0)
				return i;
		}
		return N;
	}
	}
