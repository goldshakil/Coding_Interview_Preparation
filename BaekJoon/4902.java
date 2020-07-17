import java.util.*;

class Main {

	static int maxTriangle = Integer.MIN_VALUE;

	static int arr[][];
	static int allSum[][];
	static int N = 0;

	static void solve(int r, int cleft, int cright, int sum) {

		// think of a triangle is expanding -> add one row expansion at a time
		// left, right are the limits
		// r indicates -> the straight line side of the triangle (base)

		if (r > N || r < 1 || cleft < 1 || cright > (r * 2) - 1) // if the limits are beyond the range or the base is
																	// outside
			return;

		sum += allSum[r][cright] - allSum[r][cleft - 1]; // expanded base sum
		maxTriangle = Math.max(maxTriangle, sum);

		if (cleft % 2 == 1) // normal triangle
			solve(r + 1, cleft, cright + 2, sum); // expand to bottom and update right limit

		else // inverted triangle
			solve(r - 1, cleft - 2, cright, sum); // expand to up and update left limit

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int T = 0;
		while (true) {
			T++;
			N = sc.nextInt();
			if (N == 0)
				break;

			// represent the triangle as a right hand triangle
			maxTriangle = Integer.MIN_VALUE;
			arr = new int[N + 1][(2 * N - 1) + 1];
			allSum = new int[N + 1][(2 * N - 1) + 1];

			for (int r = 1; r <= N; ++r) {

				for (int c = 1; c <= (r * 2) - 1; ++c) {

					arr[r][c] = sc.nextInt();

					// get the sum from starting of the row until that point
					allSum[r][c] = allSum[r][c - 1] + arr[r][c];

				}
			}

			for (int i = 1; i <= N; i++) {

				for (int j = 1; j <= 2 * N - 1; j++) // how many number to scan
				{
					solve(i, j, j, 0); // for every point do DFS

				}

			}
			System.out.println(T + ". " + maxTriangle);
		}

		sc.close();

	}

}
