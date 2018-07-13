package com.jda.fuctionalprograms.util;

import java.util.Scanner;

public class scanner {
	
	
	public static String getString(){	
		Scanner sc = new Scanner (System.in);
		String name = sc.nextLine();
		return name;
		
	
	}
	
	public static int getint(){
		
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		return num;	

}
}
