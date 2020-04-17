class Solution {
	// dynamic programming
	// first construct a simple recursive solutin
	// in how many ways -> key word for dynamic programming
	int array[];
	int flag = 0;

	public int climbStairs(int n) {
		// dynamic programming
		if (flag == 0) {
			array = new int[n + 1];
			flag = 1;
		}
		int answer1 = 0;
		int answer2 = 0;

		if (n < 0)
			return 0;
		else if (n == 0)
			return 1;

		if (array[n] != 0)
			return array[n];
		else {
			answer1 = climbStairs(n - 1); // in how many ways I can represent it using 1
			answer2 = climbStairs(n - 2); // in how many ways I can represent it using 1
		}
		array[n] = answer1 + answer2; // in how many ways I can repeset using both
		return answer1 + answer2;
	}
}
