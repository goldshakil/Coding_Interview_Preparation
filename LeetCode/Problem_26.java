class Solution {
	public int removeDuplicates(int[] nums) {
		int new_array[] = new int[nums.length];

		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return 1;

		int k = 0;
		for (int i = 0; i < nums.length - 1; i += 1) {

			if (nums[i] != nums[i + 1]) {
				nums[k] = nums[i];
				k++;
			}

		}
		nums[k] = nums[nums.length - 1]; //add the last element regardless
		k++;

		return k;
	}
}
