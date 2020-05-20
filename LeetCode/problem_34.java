class Solution {

	public void binary_search(int nums[], int left, int right, int k, int answer[]) {
		if (left > right)
			return;

		int mid = left + (right - left) / 2;

		if (left == right && nums[left] != k)
			return;
		if (answer[0] != -1 && answer[1] != -1)
			return;

		// base conditions
		if (nums[mid] == k) {
			if (mid == 0) // first instance and it is first element
			{
				answer[0] = mid;
			}
			if (mid > 0 && nums[mid - 1] != k) // first instance
			{
				answer[0] = mid;

			}
			if (mid == nums.length - 1) // last instance and last element
			{
				answer[1] = mid;

			}
			if (mid < nums.length - 1 && nums[mid + 1] != k) // last instance
			{
				answer[1] = mid;

			}

		}

		// at least one half should be consecutive
		// e.g. 5 6 7 0 1 2 4

		if (nums[mid] <= k) // there is need to go ritgh
			binary_search(nums, mid + 1, right, k, answer);

		if (nums[mid] >= k) // there is need to go left
			binary_search(nums, left, mid - 1, k, answer);


	}

	public int[] searchRange(int[] nums, int target) {
		int answer[] = { -1, -1 };

		binary_search(nums, 0, nums.length - 1, target, answer);

		return answer;

	}
}
