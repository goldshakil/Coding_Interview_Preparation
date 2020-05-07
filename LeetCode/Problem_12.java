class Solution {
	public String intToRoman(int num) {

		StringBuilder a = new StringBuilder();

		while (num > 0) {

			// I BLOCK
			if (num >= 1 && num < 5) {
				if (num >= 4) {
					a.append("IV");
					num -= 4;
				} else {
					a.append('I');
					num -= 1;
				}
			}

			// V Block
			else if (num >= 5 && num < 10) {
				if (num >= 9) {
					a.append("IX");
					num -= 9;
				} else {
					a.append('V');
					num -= 5;
				}

			}
			// X Block
			else if (num >= 10 && num < 50) {
				if (num >= 40) {
					a.append("XL");
					num -= 40;
				} else {
					a.append('X');
					num -= 10;
				}
			}
			// L Block
			else if (num >= 50 && num < 100) {
				if (num >= 90) {
					a.append("XC");
					num -= 90;
				} else {
					a.append('L');
					num -= 50;
				}

			}
			// C Block
			else if (num >= 100 && num < 500) {
				if (num >= 400) {
					a.append("CD");
					num -= 400;
				} else {
					a.append('C');
					num -= 100;
				}

			}
			// D Block
			else if (num >= 500 && num < 1000) {

				if (num >= 900) {
					a.append("CM");
					num -= 900;
				} else {
					a.append('D');
					num -= 500;
				}

			} else if (num >= 1000) {

				a.append('M');
				num -= 1000;

			}

		}
		return a.toString();

	}
}
