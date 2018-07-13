package com.jda.fuctionalprograms.util;
import java.util.Scanner;

public class FirstUtil {
	public static String getString(){
		System.out.println("type string");
	Scanner input = new Scanner(System.in);
	String userName = input.nextLine();
	String s = "Hello <<UserName>>, How are you?";
	s = s.replaceAll("<<UserName>>", userName);

	return s;
}
}