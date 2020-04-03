package tester;

import java.util.*;
import java.io.*;

// Remember that backtracking definitely consists of recursion
// You keep calling the function and once you encounter a closed path you go back and back.
// Steps: 
/*
1) try a possible move (from all the possible moves -> use for loop)
2) if possible then apply it -> without updating any local variable (don't ruin the backtracking)
3) from this point call the function itself so it can test further steps
4) if 3 is okay (next step is okay return true)
5) else backtrack
6) return a false at the end
*/
class backTrackingKnight {

	static void printer(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
	}

	static int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
	static int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

	static boolean isSafe(int board[][], int x, int y) {
		if (x >= 0 && y >= 0 && x < 8 && y < 8 && board[x][y] == 0) {
			return true;
		}
		return false;
	}

	static boolean checkNextStep(int board[][], int ipos, int jpos, int step) {

		// from any poistion start with any position and keep continuing
		if (step == 64) {
			return true;
		}
		// test all possible cases
		for (int i = 0; i < 8; i++) {
			// Don't update any used local variable since it will ruin the backtracking
			if (isSafe(board, ipos + xMove[i], jpos + yMove[i])) {
				board[ipos + xMove[i]][jpos + yMove[i]] = step;

				if (checkNextStep(board, ipos + xMove[i], jpos + yMove[i], step + 1)) {
					return true;

				} else {
					board[ipos + xMove[i]][jpos + yMove[i]] = 0;
				}
			}

		}
		return false;
	}

	public static void main(String args[]) {

		int board[][] = new int[8][8];
		if (checkNextStep(board, 0, 0, 1)) {
			printer(board);

		}

	}

}
