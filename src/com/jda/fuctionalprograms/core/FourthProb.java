package com.jda.fuctionalprograms.core;
import java.util.Scanner;

public class FourthProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int k = 2;
		for(int i=0;i<N;i++){
			System.out.print(k + " ");
			k *= 2;
		}
		System.out.println();
	}

}
