class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> list = new ArrayList<Integer>();
		if (matrix.length == 0)
			return list; // empty
		// one wor
		if (matrix.length == 1) {
			for (int j = 0; j < matrix[0].length; j++) {
				list.add(matrix[0][j]);
			}
			return list;
		}

		if (matrix[0].length == 1) {
			for (int j = 0; j < matrix.length; j++) {
				list.add(matrix[j][0]);
			}
			return list;
		}

		int counter = 0;
		int stepper = 1;
		int limit = matrix[0].length; // columns
		int j = 0;
		int i = 0;
		int limit2 = matrix.length;

		int numbers = matrix.length * matrix[0].length;
		while (counter < numbers) {
			// traverse columns(j
			int c = 0;
			while (c < limit) {

				// System.out.println(matrix[i][j]);
				list.add(matrix[i][j]);
				counter++;
				j += stepper;
				c++;
			}

			j -= stepper;

			limit--;

			limit2--;
			i += stepper;
			// traverse rows (i)
			c = 0;
			while (c < limit2) {
				list.add(matrix[i][j]);
				counter++;
				i += stepper;
				c++;
			}
			j -= stepper;
			i -= stepper;

			stepper = stepper * -1;

		}

		return (list);
	}
}
