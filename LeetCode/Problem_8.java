class Solution {
	public int myAtoi(String str) {

		if (str.equals(""))
			return 0;

		long number = 0;

		// add a skipping loop
		int j = 0;
		while (j < str.length() && !Character.isDigit(str.charAt(j))) {
			if ((str.charAt(j) != ' ') && (str.charAt(j) != '-') && (str.charAt(j) != '+')) {

				return 0; // strange starting character found
			}
			if (j + 1 < str.length() && (str.charAt(j) == '-' || str.charAt(j) == '+')
					&& !Character.isDigit(str.charAt(j + 1))) {
				return 0;
			}
			j++;
		}

		if (j >= str.length())
			return 0;

		int negative = 1;

		if (j != 0 && str.charAt(j - 1) == '-') {
			negative = -1;
		}

		for (int i = j; i < str.length(); i++) {

			// add a breaking condition for extra characters
			if (!Character.isDigit(str.charAt(i)))
				break;
			number = number * 10 + Character.getNumericValue(str.charAt(i));

			if ((number * negative) > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			if ((number * negative) < Integer.MIN_VALUE)
				return Integer.MIN_VALUE;

		}

		number *= negative;

		return (int) (number);
	}
}
