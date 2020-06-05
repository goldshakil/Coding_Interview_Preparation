class Solution {

	public int find_min(int nums[]) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] > nums[right]) // weird part
				left = mid + 1;

			else if (nums[mid] < nums[left])
				right = mid;

			else {
                //a[mid]==a[right]
				if (right != 0 && nums[right] >= nums[right - 1])  //remove the duplicaets
					right--;
				else
					return right; //first element can't do right --

			}
		}

		return left;

	}

	public boolean search(int[] nums, int k) {

		if (nums.length == 0)
			return false;

		int left = 0;
		int right = 0;

		int smallest = find_min(nums);

		if (nums[smallest] == k)
			return true; // optimization

		if (nums[smallest] < k && k <= nums[nums.length - 1]) {

			left = smallest;
			right = nums.length - 1;
		} else {
			left = 0;
			right = smallest - 1;
		}

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == k)
				return true;

			if (nums[mid] < k) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return false;

	}
}
