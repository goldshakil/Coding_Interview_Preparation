class Solution {
    public int lengthOfLongestSubstring(String s) {
     StringBuilder temp = new StringBuilder(); // temp
        if(s.equals("")) return 0;
	

		int max = 1;

		for (int i = 0; i < s.length(); i++) {
            if((s.length()-1-i)<max) break;
			temp .append(s.charAt(i));

			for (int j = i + 1; j < s.length(); j++) {
				
				if (temp.toString().indexOf(s.charAt(j)) != -1) // the element has been repeated
				{
					if (max < temp.length())
						max = temp.length();
					
					
					temp.setLength(0);
					break;
				}
				else
				{
				
					temp .append(s.charAt(j));
				}
				
				if(j==s.length()-1)
				{
					if (max < temp.length())
						max = temp.length();
					

					temp.setLength(0);
					break;
					
				}
			}

		}
        return max;
        
        
    }
}
