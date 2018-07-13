package com.jda.fuctionalprograms.core;
import java.util.Scanner;

import com.jda.fuctionalprograms.util.SecondUtil;

public class SecondProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int tails = 0;
		int heads = 0;
		for (int j=0; j<i; j++){
			if (SecondUtil.flipCoin())
				tails++;
			else
				heads++;
		}
		System.out.println("Percentage of tails " + (float)tails*100/i);
		System.out.println("Percentage of heads " + (float)heads*100/i);
	}

}
