package com.jda.fuctionalprograms.core;
import java.util.Random;
import java.util.Scanner;

public class CouponGenerator {
	public static void main(String[] args) {
		int arr[] = new int[1000000];
		for(int i=0; i<1000000; i++){
			arr[i] = 0;
		}
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int num = 0; int count = 0;
		while(num < N){
			int temp =  r.nextInt(1000000);
			if(arr[temp] == 0){
				arr[temp] = 1;
				count++;
				num++;
			}else
				count++;
		}
		for(int i=0; i<1000000; i++){
			if(arr[i] == 1)
				System.out.println(i + 1);
		}
		System.out.println(count);
	}

}
