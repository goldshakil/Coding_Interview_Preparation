class Solution {
	public int lengthOfLastWord(String s) {
	
//keep track of the right and left
		int flag = 0; // when this flag is turned on then this means we have encountered a letter
		int starting = 0;
		for (int i = s.length() - 1; i >= 0; i--) {

			if (s.charAt(i) != ' ' && flag == 0) {
				flag = 1;
				starting = i;
			}
		
				if (s.charAt(i) == ' '&&flag==1) {
					// found the beginning of the word;
					return starting - i;

				
			}
		}

		if (flag == 1)
			return starting + 1;
		else
			return 0;
	}

}
