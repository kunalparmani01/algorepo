package com.jda.fuctionalprograms.core;
import java.util.Scanner;

public class FifthProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		float sum = 0;
		if(N != 0){
			for(int i=1; i<=N; i++){
				sum += (float)1/i;
			}
			System.out.println(sum);
		}
		else
			System.out.println("invalid number");
		
	}

}
