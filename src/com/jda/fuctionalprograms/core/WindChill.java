package com.jda.fuctionalprograms.core;
import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double t = in.nextDouble(); double v = in.nextDouble();
		System.out.println(wc(t, v));

	}
	public static double wc(double t, double v){
		double ans = 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);
		return ans;
	}
}
