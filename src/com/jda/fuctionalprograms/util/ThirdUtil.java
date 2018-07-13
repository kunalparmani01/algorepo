package com.jda.fuctionalprograms.util;

public class ThirdUtil {
	public static boolean yearCheck (int year){
		for(int i=0; i<3; i++){
			if(year/10 == 0)
				return false;
			year /= 10;
		}
		if(year/10 == 0)
			return true;
		else
			return false;
	}
	public static boolean isLeapYear(int year){
		if(year%400 == 0)
			return true;
		else if(year%4 == 0 && year%100 ==0)
			return false;
		else if(year%4 == 0)
			return true;
		else
			return false;
	}
}
