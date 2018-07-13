package com.jda.fuctionalprograms.core;
import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(); int b = in.nextInt(); int c = in.nextInt();
		roots(a, b, c);
	}
	public static void roots(int a, int b, int c){
		float num1 = (float)Math.sqrt((float)b*b-4*a*c);
		if(num1 >= 0){
		System.out.println((float)(-1*b+num1)/2*a);
		System.out.println((float)(-1*b-num1)/2*a);
	}else
		System.out.println("imaginary roots");
	}

}
