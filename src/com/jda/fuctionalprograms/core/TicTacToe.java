package com.jda.fuctionalprograms.core;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static int[][] array = new int[3][3];

	public static boolean diagonalltrfull() {
		if (array[0][0] == 1 && array[1][1] == 1 && array[2][2] == 1) {
			return true;
		}
		if (array[0][0] == -1 && array[1][1] == -1 && array[2][2] == -1) {
			return true;
		}
		return false;
	}

	public static boolean diagonalrtffull() {
		if (array[0][2] == 1 && array[1][1] == 1 && array[2][0] == 1) {
			return true;
		}
		if (array[0][2] == -1 && array[1][1] == -1 && array[2][0] == -1) {
			return true;
		}
		return false;
	}

	public static boolean rowfull() {
		for (int i = 0; i < 3; i++) {
			if (array[i][0] == 1 && array[i][1] == 1 && array[i][2] == 1) {
				return true;
			}
			if (array[i][0] == -1 && array[i][1] == -1 && array[i][2] == -1) {
				return true;
			}
		}
		return false;
	}

	public static boolean columnfull() {
		for (int j = 0; j < 3; j++) {
			if (array[0][j] == 1 && array[1][j] == 1 && array[2][j] == 1) {
				return true;
			}
			if (array[0][j] == -1 && array[1][j] == -1 && array[2][j] == -1) {
				return true;
			}
		}
		return false;
	}

	public static boolean matrixfull() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void printMatrix() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j]);
				System.out.print("  ");
			}
			System.out.println("\n");
		}
	}

	public static void main(String args[]) {
		int n, m;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = 0;
			}
		}
		printMatrix();
		boolean player = false;
		while (diagonalltrfull() == false && diagonalrtffull() == false && rowfull() == false && columnfull() == false
				&& matrixfull() == false) {
			System.out.println("Row:");
			n = CScanner.getint();
			System.out.println("Column:");
			m = CScanner.getint();
			while (array[n][m] == -1 || array[n][m] == 1) {
				System.out.println("Already Marked");
				System.out.println("Row:");
				n = CScanner.getint();
				System.out.println("Column:");
				m = CScanner.getint();
			}
			array[n][m] = -1;
			player = true;
			printMatrix();
			if (diagonalltrfull() == true || diagonalrtffull() == true || rowfull() == true || columnfull() == true
					|| matrixfull() == true) {
				break;
			}
			Random rand = new Random();
			int nRand = rand.nextInt(3);
			int mRand = rand.nextInt(3);
			while (array[nRand][mRand] == -1 || array[nRand][mRand] == 1) {
				rand = new Random();
				nRand = rand.nextInt(3);
				mRand = rand.nextInt(3);
			}
			array[nRand][mRand] = 1;
			System.out.println("Player 2 has moved. Player1 turn:");
			player = false;
			printMatrix();
		}

		if (diagonalltrfull() == true || diagonalrtffull() == true || rowfull() == true || columnfull() == true
				|| matrixfull() == true) {
			if (player == true) {
				System.out.println("Player1 has won.");
			} else if (player == false) {
				System.out.println("Player2 has won.");
			}
		}

		else if (matrixfull() == true) {
			System.out.println("The game is a draw.");
		}

	}

}
