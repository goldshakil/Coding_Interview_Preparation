class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];

		int limit = n;
		int j = 0;
		int i = 0;
		int direction = 1;
		int counter = 0;
		int number = 1;

		// simulation
		while (counter < n) {
			// move tthrough columns of a single row

			int looper = 0;

			// 2 irrevelant variablse
			while (looper < limit) {

				matrix[i][j] = number++;
				j += direction;
				looper++;

			}

			limit--;
			j -= direction;
			i += direction;

			looper = 0;

			while (looper < limit) {

				matrix[i][j] = number++;
				i += direction;
				looper++;

			}
			i -= direction;
			j -= direction;

			direction = direction * -1;

			counter++;
		}
        
        return matrix;
        
    }
}
