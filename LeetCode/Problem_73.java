class Solution {

    // not the best complexity but a very good performance 96%
    
    // 2 sets sloution is also great but slow (lower complexity though)
    // marking its row and column is also fine
    public void setter(int matrix[][], int i, int j) {

		// set the row to zero
		for (int c = 0; c < matrix[0].length; c++) {
			matrix[i][c] = 0;
		}

		// set the column to zero
		for (int c = 0; c < matrix.length; c++) {
			matrix[c][j] = 0;
		}

	}

	public void setZeroes(int[][] matrix) {
		// printer(matrix);

		ArrayList<int[]> list = new ArrayList<int[]>();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
                    // you can simply change the row and column here
					int pair[] = { i, j };
					list.add(pair);
				}
			}
		}

		// System.out.println();
		for (int i = 0; i < list.size(); i++) {

			setter(matrix, list.get(i)[0], list.get(i)[1]);

		}

	}
}
