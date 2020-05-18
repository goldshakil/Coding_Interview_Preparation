class Solution {
    
	public int binary_search(int nums[], int left, int right, int k) {
		if (left > right)
			return -1;

		int mid = (left + right) / 2;

		if (nums[mid] == k) {
			return mid;
		}

        // at least one half should be consecutive
		// e.g. 5 6 7 0 1 2 4
		if (nums[mid] < nums[right]) {
			if (nums[mid] < k && k <= nums[right]) // suppose we are searching for in the previous example
				return binary_search(nums, mid + 1, right, k);
			else // suppose we are searching for 7 in the previous example
				return binary_search(nums, left, mid - 1, k);
		} else // e.g. 4 5 6 7 0 1 2

		{
			if (nums[left] <= k && k < nums[mid]) // suppose we are searching for 5
				return binary_search(nums, left, mid - 1, k);
			else
				return binary_search(nums, mid + 1, right, k);
		}


	}
    public int search(int[] nums, int target) {
        
        return binary_search(nums, 0, nums.length - 1, target);
        
      
    }
}
