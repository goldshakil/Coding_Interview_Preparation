class Solution {
	public boolean isValidSudoku(char[][] board) {

		HashSet<Character> set = new HashSet<Character>();

		// Row checking
		for (int i = 0; i < board.length; i++) {
			set.clear();
			for (int j = 0; j < board[0].length; j++) {

				if (board[i][j] == '.')
					continue;
				if (set.contains(board[i][j])) {
					return false; // repeated
				}
				set.add(board[i][j]);

			}

		}

		// Column checking

		for (int j = 0; j < board[0].length; j++) {
			set.clear();
			for (int i = 0; i < board.length; i++) {
				if (board[i][j] == '.')
					continue;
				if (set.contains(board[i][j])) { // System.out.println("COLUMN");
					return false; // repeated
				}
				set.add(board[i][j]);
			}

		}

		int s_row = 0;
		int s_clm = 0;
		// checking each partition
		for (int counter = 1; counter <= 9; counter++) {
			// System.out.println(s_row);
			// System.out.println(s_clm);
			// System.out.println("-----------");
			// start checking a single partition
			set.clear();
			for (int i = s_row; i < s_row + 3; i++) {

				for (int j = s_clm; j < s_clm + 3; j++) {
					if (board[i][j] == '.')
						continue;
					if (set.contains(board[i][j]))
						return false; // repeated

					set.add(board[i][j]);

				}

			}

			if (counter % 3 == 0) {
				s_row += 3;
				s_clm = 0;
			} else {
				s_clm += 3;
			}

		}

		return true;

	}
}
