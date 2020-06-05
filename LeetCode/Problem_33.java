// CLEANER SOLUTION
class Solution {
	public int search(int[] nums, int k) {

		if (nums.length == 0)
			return -1;

		int left = 0;
		int right = nums.length - 1;
        
		while (left < right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] > nums[right]) // weird part
				left = mid + 1;

			else
				right = mid;

		}
		// now we have the lowest element
		// decide to search from that point to right or its left?

		int smallest = left;

		if (nums[smallest] == k)
			return smallest; // optimization

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
				return mid;

			if (nums[mid] < k) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;

		// perform normal binary search

	}
}


/*

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
*/
