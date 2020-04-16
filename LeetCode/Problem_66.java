class Solution {
	public int[] plusOne(int[] digits) {

		int extra_array[] = new int[digits.length + 1];

		for (int i = digits.length - 1; i >= 0; i--) {
			if ((digits[i] + 1) > 9 && i == 0)// reached the first one
			{
				extra_array[0] = 1;
				digits[i] = 0;
				for (int k = 0; k < digits.length; k++) {
					extra_array[k + 1] = digits[k];
				}
				return extra_array;
			}

			if (digits[i] + 1 > 9) {
				digits[i] = 0; // carry and continue
			} else {
				digits[i] += 1;
				break;
			}
		}
		return digits;

	}
}
