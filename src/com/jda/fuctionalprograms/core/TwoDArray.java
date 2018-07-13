package com.jda.fuctionalprograms.core;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int M = in.nextInt(),  N = in.nextInt();
		String arr[][] = new String[M][N];
		for(int i=0; i<M; i++){
			for(int j=0; j<N; j++){
				arr[i][j] = in.next();
			}
		}
		for(int i=0; i<M; i++){
			for(int j=0; j<N; j++)
				System.out.print(arr[i][j] );
			System.out.println();
		}
	}

}
