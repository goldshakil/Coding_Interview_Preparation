class Solution {
	public int majorityElement(int[] nums) {
		int n = nums.length; // actual length
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); // key: number //value: repetition
		// or sort and return the n/2 th element
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
				if (map.get(nums[i]) > (n / 2))
					return nums[i];
			} else {
				map.put(nums[i], (map.get(nums[i]) + 1));
				if (map.get(nums[i]) > (n / 2))
					return nums[i];

			}

		}

		// System.out.println(map);
		return 0;

	}
}
