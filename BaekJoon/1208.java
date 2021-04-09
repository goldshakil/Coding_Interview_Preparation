import java.util.*;

class Main {

	// generate all possible continupous and non continuous subsets
	 static void nonContinuousGenerator(int sum, int a[], int i, int end, List<Integer> list) {
		if (i >= end) {
			list.add(sum);
			return;
		}

		nonContinuousGenerator(sum, a, i + 1, end, list); // don't pick the current element

		nonContinuousGenerator(sum + a[i], a, i + 1, end, list); // pick the current element

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		List<Integer> leftList = new ArrayList<Integer>();
		List<Integer> rightList = new ArrayList<Integer>();

		// the whole idea is that we can pick any elements in contiguous and non
		// contiguous fashion
		// we can use the function below to achieve that (generate all possible ones)
		// there is one problem -> one list can hold at max 2^20 not 2^40
		// so we divide in half and we can try all left with all right(sum) (n^2)
		// faster way is using a modified binary search
		nonContinuousGenerator(0, a, 0, n / 2, leftList);
		nonContinuousGenerator(0, a, n / 2, n, rightList);
//		System.out.println(leftList);
//		System.out.println(rightList);

		Collections.sort(leftList);
		Collections.sort(rightList);

		int i = 0; // left list
		int j = rightList.size() - 1; // right list
		long count = 0;

		while (i < leftList.size() && j >= 0) {
			int leftElement = leftList.get(i);
			int rightElement = rightList.get(j);

			if (rightElement + leftElement == s) {
				long countA = 0;
				long countB = 0;
				while (i < leftList.size() && leftElement == leftList.get(i)) {
					i++;
					countA++;

				}
				while (j >= 0 && rightElement == rightList.get(j)) {
					j--;
					countB++;
				}

				count += countA * countB;

			}

			else if (rightElement + leftElement < s) {
				i++;
			}

			else if (rightElement + leftElement > s) {
				j--;
			}
		}
		
		if(s==0) count--; //there is an original 0 of not picking anything

		System.out.println(count);
		sc.close();
	}
}
