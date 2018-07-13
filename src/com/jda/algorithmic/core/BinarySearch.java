package com.jda.algorithmic.core;

import java.util.Scanner;

import com.jda.algorithmic.util.CScanner;
import com.jda.fuctionalprograms.util.scanner;

public class BinarySearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CScanner.printstring("Enter Array Size");
		int N = scanner.getint();
		int arr[] = new int[N];
		CScanner.printstring("Enter Array Numbers");
		for(int i=0; i<N; i++)
			arr[i] = scanner.getint();
		CScanner.printstring("Enter Key to be searched");
		int key = scanner.getint();
		long now = System.currentTimeMillis();
		int ans = index(arr, key , 0, N-1);
		if(ans != -1)
			System.out.println(ans+1);
		else
			System.out.println("Not found");
		System.out.println("The time elasped is " + (System.currentTimeMillis() - now)/1000.0);
	}
	public static int index(int [] arr, int num, int i,int j){
		int min = i;
		int max = j;
		while(min <= max){
			if(arr[(max+min)/2] == num){
				return (max+min)/2;
			}else if(arr[(max+min)/2] > num){
				
				return index(arr, num, i, (max+min)/2);
			}else{
				return index(arr, num, (max+min)/2+1, j);
			}
		}
		return -1;
	}
}
