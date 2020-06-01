class Solution {
	public void sortColors(int[] nums) {

		// you can use any sorting function

		int zeros = 0;
		int ones = 0;
		int twos = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				zeros++;
			} else if (nums[i] == 1) {
				ones++;
			}

			else {
				twos++;
			}
		}
		int i = 0;
		int counter = 0;
		while (i < zeros) {
			nums[counter] = 0;

			counter++;
			i++;
		}
		i = 0;
		while (i < ones) {
			nums[counter] = 1;

			counter++;
			i++;
		}
		i = 0;
		while (i < twos) {
			nums[counter] = 2;

			counter++;
			i++;
		}
	}
}
