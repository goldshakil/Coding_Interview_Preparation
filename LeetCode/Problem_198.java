class Solution {
	public int rob(int[] nums) {

		if (nums == null || nums.length == 0)
			return 0;

		if (nums.length == 1)
			return nums[0];

		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);

		int dp[] = new int[nums.length]; // ,axi,um amount of money until i

		// Single House
		dp[0] = nums[0];

		// 2 houses
		dp[1] = Math.max(nums[0], nums[1]);

		// for every length >=3
		for (int i = 2; i < nums.length; i++) {
			// in case of 3 or more house
			// choice 1: maximum until last last house+ current house
			// Choice 2: maximum until last house
			// e.g. 1 2 4 -> 1(last last house maximum) , 4 (current)
			// e.g. 1 8 4 -> 8 (last hosur maximum)
			dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
		}

		return dp[nums.length - 1];

	}
}
