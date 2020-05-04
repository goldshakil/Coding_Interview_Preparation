class Solution {
	public int maxProfit(int[] prices) {

		// siimilar to max sub array problem -> shall i start a new window or just
		// increase the window?
		if (prices.length == 0)
			return 0;

		int left = 0;
		int local = 0;
		int global = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] - prices[i] > prices[i] - prices[left]) // start a new window
			{
				left = i;
				local = 0;
			} else {
				local = prices[i] - prices[left];
			}
			global = Math.max(local, global); // best one so far (local keeps changing -> keep track of it)
		}

		return global;

	}
}
