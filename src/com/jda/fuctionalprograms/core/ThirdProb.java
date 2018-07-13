package com.jda.fuctionalprograms.core;
import java.util.Scanner;

import com.jda.fuctionalprograms.util.ThirdUtil;

public class ThirdProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		if(ThirdUtil.yearCheck(year)){
			if(ThirdUtil.isLeapYear(year))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		else
			System.out.println("The value entered is not valid");
	}

}
