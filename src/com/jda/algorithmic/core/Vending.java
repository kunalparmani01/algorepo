package com.jda.algorithmic.core;

import java.util.Scanner;

public class Vending {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 5, 10, 50, 100, 500, 1000};
		Scanner in = new Scanner(System.in);
		int arr2[] = minNotes(in.nextInt(), arr);
		int count = 0;
		for(int i=0; i<8; i++){
			if(arr2[i] != 0)
				System.out.println("Number of " + arr[i] + " notes " + arr2[i]);
			count += arr2[i];
		}
		System.out.println();
		System.out.println("number of notes: " + count);

	}
	public static int[] minNotes(int N, int arr[]){
		int arr2[] = new int[8];
		while(N > 0){
			for(int i=7; i>=0; i--){
				if(N >= arr[i]){
					arr2[i]++;
					N -= arr[i];
					break;
				}
			}
		}
		return arr2;
	}

}
