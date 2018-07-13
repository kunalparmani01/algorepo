package com.jda.algorithmic.core;

import java.util.Scanner;

import com.jda.algorithmic.util.CScanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = CScanner.getint();
		int arr[] = new int[N];
		for(int i=0; i<N; i++)
			arr[i] = CScanner.getint();
		long now = System.currentTimeMillis();
		arr = bubble(arr, N);
		for(int i=0; i<N; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println("The time elasped is " + (System.currentTimeMillis()-now)/1000.0);

	}
	public static int[] bubble(int arr[], int N){
		for(int i=0; i<N; i++){
			for(int j=0; j<N-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
