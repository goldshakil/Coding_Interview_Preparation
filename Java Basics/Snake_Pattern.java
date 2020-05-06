package tester;

public class arrayFunction {

	public static void main(String[] args) {

		int a[][] = new int[10][10];

		int limit = 10;

		int j = 0;
		int i = 0;
		int number = 1;
		int negative = 1;

		for (int repeat = 0; repeat < 10; repeat++) {

			int counter = 0;

			while (counter < limit) {
				a[i][j] = number++;
				j += negative;
				counter++;
			}

			j -= negative;

			i += negative;

			limit--;
			counter = 0;
			while (counter < limit) {
				a[i][j] = number++;
				i += negative;
				counter++;
			}

			i -= negative;
			j -= negative;

			negative *= -1;

		}

		for (int k = 0; k < 10; k++) {
			for (int c = 0; c < 10; c++) {
				System.out.printf("%5d", a[k][c]);

			}
			System.out.println();
		}

	}

}
