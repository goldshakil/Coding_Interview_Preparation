
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {

	// 0 right
	// 1 up
	// 2 left
	// 3 down

	static List<Integer> list = new ArrayList<Integer>();
	static int board[][] = new int[105][105];

	static void counting() {
		int counter = 0;
		for (int i = 0; i < board.length - 1; i++) {
			for (int j = 0; j < board[0].length - 1; j++) {
//				System.out.print(board[i][j] + " ");
				if (board[i][j] == 1 && board[i + 1][j] == 1 && board[i][j + 1] == 1 && board[i + 1][j + 1] == 1) {
					counter++;
				}

			}
//			System.out.println();

		}

		System.out.println(counter);
	}

	static void filler(int x, int y) {
		board[y][x] = 1;
		for (int i = 0; i < list.size(); i++) {
			int dir = list.get(i);

			if (dir == 0) // right
			{
				x++;
				board[y][x] = 1;

			} else if (dir == 1) // up
			{
				y--;
				board[y][x] = 1;

			} else if (dir == 2) // left
			{
				x--;
				board[y][x] = 1;
			} else if (dir == 3)// down
			{
				y++;
				board[y][x] = 1;

			}

		}

	}

	static void generator(int d, int g) {
		list.clear();
		list.add(d);

		for (int i = 0; i < g; i++) {

			List<Integer> tempList = new ArrayList<Integer>();
			for (int j = list.size() - 1; j >= 0; j--) { // flip newest
				int temp = list.get(j);

				temp = (temp + 1) % 4;
				tempList.add(temp);

			}

			for (int c = 0; c < tempList.size(); c++) {
				list.add(tempList.get(c));
			}
		}

//		System.out.println(list);

	}

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int d = sc.nextInt();
			int g = sc.nextInt();

			generator(d, g);
			filler(x, y);
//			System.out.println();
		}

		counting();

		sc.close();
	}
}
