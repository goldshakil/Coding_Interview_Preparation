class Solution {
	public String addBinary(String a, String b) {
		StringBuilder c = new StringBuilder();
		if (a.length() > b.length()) // we have to append b and some zeros
		{
			for (int i = 0; i < a.length() - b.length(); i++) {
				c.append('0');
			}
			c.append(b);
			b = c.toString();
		} else if (a.length() < b.length()) // we have to append b and some zeros
		{
			for (int i = 0; i < b.length() - a.length(); i++) {
				c.append('0');
			}
			c.append(a);
			a = c.toString();
		}

		// they are the same length
		c.setLength(0);
		int carry = 0; // initially there is no carry
		for (int i = a.length() - 1; i >= 0; i--) {
			int sum = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + carry;
			if (sum == 0) {
				c.append('0');
				carry = 0;
			} else if (sum == 1) {
				c.append('1');
				carry = 0;
			} else if (sum == 2) {
				c.append('0');
				carry = 1;
			} else if (sum == 3) {
				c.append('1');
				carry = 1;
			}
		}
		// check the last carry
		if (carry == 1)
			c.append('1');

		return c.reverse().toString();
	}
}
