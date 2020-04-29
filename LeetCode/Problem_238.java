
/*
//using division
class Solution {
	public int[] productExceptSelf(int[] nums) {
		int product = 1;
		int zero_flag = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0)
				product *= nums[i];
			else
				zero_flag++;
		}

		for (int i = 0; i < nums.length; i++) {
			if (zero_flag == 0)
				nums[i] = product / nums[i];
			else if (zero_flag > 1) // moore than one zero
				nums[i] = 0;
			else if (zero_flag == 1) {
				if (nums[i] != 0)
					nums[i] = 0;
				else
					nums[i] = product;

			}
		}

		return nums;
	}
}

*/

class Solution {
	public int[] productExceptSelf(int[] nums) {
		int product = 1;
		int zero_flag = 0;
		int left[] = new int[nums.length]; // store the prdouct to the left of index i
		int right[] = new int[nums.length]; // store the product to the right of index i

		left[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			left[i] = left[i - 1] * nums[i - 1];
		}

		right[nums.length - 1] = 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			right[i] = right[i + 1] * nums[i + 1];
		}

		for (int i = 0; i < nums.length; i++) {
			left[i] = left[i] * right[i];
		}

		return left;

	}
}
