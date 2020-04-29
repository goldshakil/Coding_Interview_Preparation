
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
