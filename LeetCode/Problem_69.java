class Solution {
	public int mySqrt(int x) {
		// brute force implementation
		/*
		 * long value=x; long number=1;
		 * 
		 * while((number*number)<=value) { number++; } return (int)(number-1);
		 * 
		 */

		// More optimized implementation -> binary search

		if (x == 1)
			return 1;

		long low = 1;
		long high = x;
		long value = x;

		while (low <= high) {
			long mid = (low + high) / 2;
			long answer = mid * mid;

			if (answer == value)
				return (int) mid;
			else if (answer > value) {
				high = mid - 1;

			} else if (answer < value) {
				low = mid + 1;

			}

		}
		return (int) high;
	}
}
