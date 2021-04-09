
import java.util.*;

import java.util.Map.Entry;

 class Main {

	 static boolean isSafe(int number, char arr[][], int row, List<Integer> list) {
		// check the previous row

		if (row == 0) {
			return true;
		} else 
		{
			for (int i = 0; i < row; i++) // check one row condition (the previous rows)
			{
				int sum = 0;
				for (int j = i; j < row; j++) {
					sum = sum + list.get(j);

				}
				// check for each row
				sum+=number;
				if ((sum > 0 && arr[i][row] == '-') || (sum > 0 && arr[i][row] == '0')) {
					return false;
				} else if ((sum < 0 && arr[i][row] == '+') || (sum < 0 && arr[i][row] == '0')) {
					return false;
				} else if ((sum == 0 && arr[i][row] == '-') || (sum == 0 && arr[i][row] == '+')) {
					return false;
				}

			}
		}
		return true;
	}

	 static boolean DFS(int numberToBeChosen, char arr[][], int n, List<Integer> list) {

		if (numberToBeChosen >= n) // reached the end
		{
//			System.out.println(list);
			for(int i=0;i<list.size();i++)
			{
				System.out.printf("%d ",list.get(i));
			}
			System.out.println();
			
			return true;

		} else {
			// visit children
			if (arr[numberToBeChosen][numberToBeChosen] == '-') // negative
			{
				for (int i = -10; i <= -1; i++) {
					if (isSafe(i, arr, numberToBeChosen, list)) {
						list.add(i);
						if(DFS(numberToBeChosen + 1, arr, n, list))
							return true;
						list.remove(list.size() - 1);

					}

				}

			}

			else if (arr[numberToBeChosen][numberToBeChosen] == '+') // positive
			{
				for (int i = 1; i <= 10; i++) {
					if (isSafe(i, arr, numberToBeChosen, list)) {
						list.add(i);
						if(DFS(numberToBeChosen + 1, arr, n, list))
							return true;
						list.remove(list.size() - 1); //backtrack

					}

				}

			} else // zero
			{
				if (isSafe(0, arr, numberToBeChosen, list)) {
					list.add(0);
					if(DFS(numberToBeChosen + 1, arr, n, list))
						return true;
					list.remove(list.size() - 1);

				}

			}

		}
		
		return false;

//	

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char arr[][] = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = '*';
			}
		}

		String line = sc.next();

		int counter = n;
		int i = 0;
		int j = 0;

		for (int k = 0; k < line.length(); k++) {

			arr[i][j] = line.charAt(k);

//			System.out.println("hello");
			if (j == counter - 1) // finished one line
			{
//				System.out.println("change");
				i += 1;
				j = i;
			} else {
				j++;
			}

		}

//		for (int c = 0; c < n; c++) {
//			for (int k = 0; k < n; k++) {
////				System.out.printf("%c ", arr[c][k]);
//			}
//			System.out.println();
//		}

		// number to be chosen =0

		List<Integer> list = new ArrayList<Integer>();

		DFS(0, arr, n, list);

	}

}
