class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {

		List<List<Integer>> final_list = new ArrayList<List<Integer>>(); // final returned list

		List<Integer> temp = new ArrayList<Integer>(); // current sum answer

		Arrays.sort(nums); // we can fix two

		for (int a = 0; a < nums.length - 3; a++) {
			if (a > 0 && nums[a] == nums[a - 1]) { // skip same a
				continue;
			}

			for (int b = a + 1; b < nums.length - 2; b++) {
				if (b > a + 1 && nums[b] == nums[b - 1]) { // skip same b
					continue;
				}
				int c = b + 1;
				int d = nums.length - 1;
				// while(nums[b]==nums[b+1])b++;

				while (c < d) {
					if (nums[a] + nums[b] + nums[c] + nums[d] == target) {
						temp.add(nums[a]);
						temp.add(nums[b]);
						temp.add(nums[c]);
						temp.add(nums[d]);

						final_list.add(temp);
						temp = new ArrayList<Integer>();

						c++;
						d--;

						while (c < d && nums[c] == nums[c - 1]) // skip same c
							c++; 
						while (c < d && nums[d] == nums[d + 1]) // skip same d
							d--; 
					}

					else if (nums[a] + nums[b] + nums[c] + nums[d] < target) // increase lower bound skip same c
					{
						c++;
					} else if (nums[a] + nums[b] + nums[c] + nums[d] > target) // decrease the upper bound skip same d
					{
						d--;
					}

				}

			}
		}

		return final_list;

	}
}
