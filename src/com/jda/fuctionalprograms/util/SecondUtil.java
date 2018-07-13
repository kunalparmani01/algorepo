package com.jda.fuctionalprograms.util;
import java.util.Random;

public class SecondUtil {
	public static boolean flipCoin(){
	Random r = new Random();
	int i = r.nextInt(100);
	if(i > 50)
		return true;
	
	return false;
}
}
