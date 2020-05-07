class Solution {
	public List<List<Integer>> threeSum(int[] nums) {

		// worst case is O(n^3)-> brute force

		// this solution runs in O(n^2)
		Arrays.sort(nums); // O nlgn

		List<List<Integer>> list = new ArrayList<List<Integer>>();

		List<Integer> temp = new ArrayList<Integer>();

		for (int a = 0; a < nums.length - 2; a++) {
			if (a > 0 && nums[a] == nums[a - 1]) { // skip same a
				continue;
			}

			int b = a + 1; // directly after 1
			int c = nums.length - 1; // last one

			while (b < c) {
				if (nums[a] + nums[b] + nums[c] == 0) {
					temp.add(nums[a]);
					temp.add(nums[b]);
					temp.add(nums[c]);
					list.add(temp);
					temp = new ArrayList<Integer>();
					c--;
					b++;
					while (b < c && nums[b] == nums[b - 1])
						b++; // skip same b
					while (b < c && nums[c] == nums[c + 1])
						c--; // skip same c
				}
                else if (nums[a] + nums[b] + nums[c] > 0) {
					c--;
				}
                else if (nums[a] + nums[b] + nums[c] < 0) {
					b++;
				}
			}
		}
		return list;

	}
}
