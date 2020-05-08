class Solution {
    public String convertToTitle(int n) {
        
      	HashMap<Integer, Character> map = new HashMap<Integer, Character>();

		char temp = 'A';
		for (int i = 1; i <= 26; i++) {

			map.put(i, temp);
			temp++;
		}

		StringBuilder a = new StringBuilder();
	

		while (n != 0) {
			int remainder = n % 26;
			n /= 26;
            // Z issue
			if (remainder == 0) {
				n--;
				a.append(map.get(26));

			}

			else
				a.append(map.get(remainder));

		}

		return a.reverse().toString();

        
    }
}
