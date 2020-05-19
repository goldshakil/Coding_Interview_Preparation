class Solution {
	 int N = 0;
	 int counter = 0;

	public boolean isSafe(int board[][], int row, int clm) {

		// there is nothing on its righ

		// check on its left
		for (int i = clm; i >= 0; i--) {
			if (board[row][i] == 1)
				return false;
		}
		// check left up
		int i = row;
		int j = clm;
		while (i >= 0 && j >= 0) {
			if (board[i][j] == 1)
				return false;

			i--;
			j--;
		}

		// check left down
		i = row;
		j = clm;
		while (i < N && j >= 0) {
			if (board[i][j] == 1)
				return false;

			i++;
			j--;
		}

		return true; // passed all tests
	}

	public void DFS(int board[][], int clm) {
		if (clm >= N) {
			// printSolution(board);
			counter++;
			// leet code format helping function
			// System.out.println();
			return;
		} else {
			// visit children board[i][clm]
			for (int i = 0; i < N; i++) {
				if (isSafe(board, i, clm)) // visit child if possible
				{
					board[i][clm] = 1;

					DFS(board, clm + 1);// found solution just return

					board[i][clm] = 0; // backtrack

				}
			}
		}

		return;

	}

	public int totalNQueens(int n) {

		N = n;
		int board[][] = new int[N][N];

		if (n == 2 || n == 3)
			return 0;
		if (n == 1)
			return n;

		DFS(board, 0);
		return counter;

	}
}
