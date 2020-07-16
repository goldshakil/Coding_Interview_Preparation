
import java.util.*;

class Main {

	static int arr[][];

	static int added = Integer.MAX_VALUE;

	 static boolean check() {

		int j = 0;
		int tempJ = 0;

		for (j = 0; j < arr[0].length; j += 2) {
			// for each column start (i,j)
			int i = 0;
			tempJ = j;

			while (i < arr.length) {

				if (tempJ == 0) {
					if (arr[i][tempJ + 1] == 2) {
						tempJ = tempJ + 2;
						i++;

					} else {
						i++;
					}

				} // end of case 1

				else if (tempJ == arr[0].length - 1) {

					if (arr[i][tempJ - 1] == 2) {
						tempJ = tempJ - 2;
						i++;

					} else {
						i++;
					}

				} // end of case 2

				else {

					if (arr[i][tempJ + 1] == 2) {
						tempJ = tempJ + 2;
						i++;

					} else if (arr[i][tempJ - 1] == 2) {
						tempJ = tempJ - 2;
						i++;

					} else {
						i++;
					}

				}

			}

			if (tempJ != j) {

				return false;
			}

		}

		return true; // all of columns reach to their original
	}

//	static Scanner b = new Scanner(System.in);

	 static void DFS(int placed, int total, int x, int y) {

		if (placed > total) {
			return; // no more places to put (only 3 are allowed)
		}

		else {
			// placed some and there are some locations left;
			boolean found = check();
			if (found == true) {

				added = Math.min(added, placed);
				return; // least number of this combination found so no need to try more
			}

			// try next locations
			for (int i = x; i < arr.length; i++) {
				for (int j = 1; j < arr[0].length; j += 2) {

					if (j == 1) // first space
					{
						if (j + 2 >= arr[0].length) // only one space -> don't check touching
						{
							if (arr[i][j] == 0) {
								arr[i][j] = 2;
								DFS(placed + 1, total, i, j);
								arr[i][j] = 0;
							}

						} else // multiple spaces
						{
							if (arr[i][j + 2] != 2) {
								if (arr[i][j] == 0) {
									arr[i][j] = 2;
									DFS(placed + 1, total, i, j);

									arr[i][j] = 0;

								}

							}

						}

					} // end of case 1

					else if (j == arr[0].length - 2) // last space
					{
						if (arr[i][j - 2] != 2) { // there should be multiple spaces
							if (arr[i][j] == 0) {
								arr[i][j] = 2;

								DFS(placed + 1, total, i, j);
								arr[i][j] = 0;

							}

						}

					} // end of case 2

					else {
						if (arr[i][j - 2] != 2 && arr[i][j + 2] != 2) {
							if (arr[i][j] == 0) {
								arr[i][j] = 2;
								DFS(placed + 1, total, i, j);

								arr[i][j] = 0;

							}
						}
					} // end of case 3

				}
			}

		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int columns = sc.nextInt();
		int lines = sc.nextInt();
		int rows = sc.nextInt();

		arr = new int[rows][2 * columns - 1];

		for (int j = 0; j < arr[0].length; j += 2) {
			for (int i = 0; i < arr.length; i += 1) {
				arr[i][j] = 1;
			}
		}

		int placed = 0;
		for (int i = 0; i < lines; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a - 1][b * 2 - 1] = 2;
			placed++;
		}

		DFS(placed, (placed + 3), 0, 1);

		if (added == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(added - placed);

		sc.close();

	}

}
