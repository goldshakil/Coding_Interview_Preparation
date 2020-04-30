class Solution {
	public String longestPalindrome(String s) {

		String max = ""; // store the maximum palindrome

		// Finding Basic Relation
		// dp(i,j) is true if the subtring from i to j is palindrom
		boolean dp[][] = new boolean[s.length()][s.length()];

		// that is: (Breaking down to subproblems
		// dp(i+1,j-1) is true and s[i]==s[j]

		// base case: 1 element -> palindrome
		for (int i = 0; i < s.length(); i++) {
			dp[i][i] = true;
			max = String.valueOf(s.charAt(i));
		}
		// base case: two elements: if same palindrome
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				dp[i][i + 1] = true;
				max = s.substring(i, i + 2);
			}
		}

		// general case length>2
		for (int k = 2; k < s.length(); k++) { // for every length
			for (int i = 0; i < s.length() - k; i++) { // for every starting point
				int j = i + k;
				if (dp[i + 1][j - 1] == true && s.charAt(i) == s.charAt(j)) {
					String temp = s.substring(i, j + 1);
					if (temp.length() > max.length()) {
						max = temp;

					}

					dp[i][j] = true;

				}

			}

		}

		return max;
	}
}


/*
// O(N^3) -> too slow -> remember that reversing a string takes O(N)
class Solution {
    public String longestPalindrome(String s) {
        //works but 
		StringBuilder temp = new StringBuilder(); // temp
        if(s.equals("")) return "";

		
		String max ="";
        max+=s.charAt(0);
        boolean same=false;
		for (int i = 0; i < s.length(); i++) {
				for (int j = i + 1; j < s.length(); j++) {
                    
				if (s.charAt(j) == s.charAt(i)) {
                    
					String sub = s.substring(i, j + 1);
					StringBuilder sub_rev = new StringBuilder(sub);
					if (sub_rev.reverse().toString().equals(sub))// palindrome found
					{
				
						if (max.length() < sub.length())
							max = sub;

					}
				}
                   

			}
		}

		return max;
    }
}
*/
